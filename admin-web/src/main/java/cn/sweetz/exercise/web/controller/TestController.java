package cn.sweetz.exercise.web.controller;

import cn.sweetz.exercise.common.defined.JsonResult;
import cn.sweetz.exercise.service.test.TbUserService;
import cn.sweetz.exercise.service.test.vo.TbUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TbUserService tbUserService;

    @GetMapping("/select/{id}")
    public JsonResult<TbUserVo> selectById(@PathVariable("id")Integer id){
        return tbUserService.selectById(id);
    }
}
