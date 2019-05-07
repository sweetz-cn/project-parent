package cn.sweetz.exercise.service.test;

import cn.sweetz.exercise.common.defined.JsonResult;
import cn.sweetz.exercise.service.test.vo.TbUserVo;

public interface TbUserService {

    JsonResult<TbUserVo> selectById(Integer id);
}
