package cn.sweetz.exercise.common.defined.exception;

import javafx.util.Pair;

@SuppressWarnings("restriction")
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 677408320061193541L;
	private Integer code;
    private String errorMsg;

    public BizException(Integer code ,String errorMsg){
        super("code:"+code+"\nmsg:"+errorMsg);
        this.code= code;
        this.errorMsg = errorMsg;
    }

    public BizException(Pair<Integer,String> pair){
        super("code:"+pair.getKey()+"\nmsg:"+pair.getValue());
        this.code= pair.getKey();
        this.errorMsg = pair.getValue();
    }

    public static BizException create(Integer code ,String errorMsg){
        return new BizException(code,errorMsg);
    }

    public static BizException create(Pair<Integer , String> pair){
        return new BizException(pair);
    }

    public Integer getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
