package cn.sweetz.exercise.service.test;

import cn.sweetz.exercise.common.defined.JsonResult;
import cn.sweetz.exercise.dao.entity.TbUser;
import cn.sweetz.exercise.dao.mapper.TbUserMapper;
import cn.sweetz.exercise.service.test.vo.TbUserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public JsonResult<TbUserVo> selectById(Integer id) {

        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
        TbUserVo vo = new TbUserVo();
        BeanUtils.copyProperties(tbUser , vo);
        return new JsonResult<TbUserVo>(vo);
    }
}
