package cn.sweetz.exercise.common.defined.constants;

import javafx.util.Pair;

/**
 * 所有异常定义在这里
 * XXXX XX XX
 * 前四位表示系统  ，中间两位表示模块 ， 后两位表示具体错误
 */
@SuppressWarnings("restriction")
public interface CommonErrorConstant {

	Pair<Integer, String> UN_KNOWN_ERROR = new Pair<>(-1, "严重错误,请通知系统管理员!!!");

    /**
     * 请求错误
     */
    public interface RequestErrorCode {
        public Pair<Integer, String> PARAMS_IS_EMPTY = new Pair<>(10000001, "请求参数为空");
        public Pair<Integer, String> NO_PERMISSION = new Pair<>(10000002, "没有权限");
        public Pair<Integer, String> VERSION_OVERDUE = new Pair<>(10000003, "版本过期,请刷新页面");
        public Pair<Integer, String> REQUEST_ERROR = new Pair<>(10000004, "请求接口失败");
    }

    /**
     * 响应错误
     */
    public interface ResponseErrorCode {
        public Pair<Integer, String> NO_RESULT = new Pair<>(10000010, "没有结果");
    }

    /**
     * 参数错误
     */
    public interface ParamErrorCode {
        public Pair<Integer, String> IS_NULL = new Pair<>(10010001, "参数不允许为空");
        public Pair<Integer, String> ID_IS_NULL = new Pair<>(10010002, "id必须有值");
        public Pair<Integer, String> OBJECT_NOT_FIND = new Pair<>(10010003, "对象没找到");
        public Pair<Integer, String> PARAM_INVALID = new Pair<>(10010004, "参数格式非法");
        public Pair<Integer, String> DATE_PARAM_INVALID = new Pair<>(10010005, "日期非法");
    }

    /**
     * 登陆异常
     */
    public interface  LoginErrorCode{
        public Pair<Integer, String> ERROR_LOGIN = new Pair<>(10030000,"登陆失败");
        public Pair<Integer, String> USERNAME_OR_PASSWORD_INCORRECT = new Pair<>(10030001,"用户名或密码错误");
        public Pair<Integer, String> USERNAME_NULL = new Pair<>(10030002,"用户名为空");
        public Pair<Integer, String> PASSWORD_NULL = new Pair<>(10030003,"密码为空");
        public Pair<Integer, String> USERNAME_ILLEGAL = new Pair<>(10030005,"非法的用户名");
        public Pair<Integer, String> LOGOUT_FAILURE = new Pair<>(10030302,"用户登出失败");
    }

    public interface ExecuteErrorCode{
        public Pair<Integer,String> EXECUTE_SUCCESS = new Pair<>(10040000,"操作成功");
        public Pair<Integer,String> EXECUTE_ERROR_ADD = new Pair<>(10040001,"添加失败");
        public Pair<Integer,String> EXECUTE_ERROR_DELETED = new Pair<>(10040002,"删除失败");
        public Pair<Integer,String> EXECUTE_ERROR_UPDATE = new Pair<>(10040003,"修改失败");
        public Pair<Integer,String> EXECUTE_ERROR_QUERY = new Pair<>(10040004,"查询失败");
    }

}
