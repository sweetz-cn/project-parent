package cn.sweetz.exercise.web.config;

import cn.sweetz.exercise.common.defined.JsonResult;
import cn.sweetz.exercise.common.defined.constants.CommonErrorConstant;
import cn.sweetz.exercise.common.defined.exception.BizException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BizException.class)
    public JsonResult handlerSellerException(BizException e){
        return new JsonResult().setError(e);
    }

    @ExceptionHandler(value = Exception.class)
    public JsonResult handlerSellerException(Exception e){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setError(CommonErrorConstant.UN_KNOWN_ERROR);
        return jsonResult;
    }

}
