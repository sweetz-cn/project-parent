package cn.sweetz.exercise.common.defined;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.sweetz.exercise.common.defined.constants.CommonConstants;
import cn.sweetz.exercise.common.defined.constants.CommonErrorConstant;
import cn.sweetz.exercise.common.defined.exception.BizException;
import javafx.util.Pair;

/**
 * 返回信息类
 * @author zhich
 *
 * @param <T>
 */

public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = -5546962763495505065L;

	private List<T> result = null;

    private Integer code = CommonConstants.SUCCESS_YES;

    private String msg;

    private String errorMsg;

    public JsonResult(){}

	public JsonResult(T data){
        this.result = new ArrayList<T>(1);
        this.result.add(data);
    }

    public JsonResult(List<T> list){
        this.result = list;
    }

    private JsonResult<T> setError(Integer code , String errorMsg){
        this.code = code;
        this.errorMsg = errorMsg;
        return this;
    }

    public JsonResult<T> setError(BizException e){
        return this.setError(e.getCode(),e.getErrorMsg());
    }

    public JsonResult<T> setError(Pair<Integer,String> errorPair){
        return this.setError(errorPair.getKey(),errorPair.getValue());
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return this.code;
    }
    public String getErrorMsg() {
        return errorMsg;
    }

    public List<T> getResult () {
        return this.result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public void setResult(T result){
        this.result = new ArrayList<T>(1);
        this.result.add(result);
    }

    public void setSuccess(Pair<Integer , String> pair){
        this.setMsg(pair.getValue());
    }

    public void setSuccess(){
        this.setMsg(CommonErrorConstant.ExecuteErrorCode.EXECUTE_SUCCESS.getValue());
    }
}
