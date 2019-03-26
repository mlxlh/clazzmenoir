package com.suse.hl.clazzmenoir.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.suse.hl.clazzmenoir.common.domain.Clazz;
import com.suse.hl.clazzmenoir.common.domain.ClazzExample;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;
import com.suse.hl.clazzmenoir.mapper.ClazzMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImp implements ClazzService {
    @Autowired
    ClazzMapper clazzMapper;
    @Override
    public CommRespone selectAll(CommRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        ClazzExample example = new ClazzExample();
        if (StringUtils.isNotBlank(request.getKeywordLike())) {
            example.createCriteria().andCNameLike(request.getKeywordLike());
        }
        List<Clazz> clazzes = clazzMapper.selectByExample(example);
        return new CommRespone(((Page)(clazzes)).getTotal(),clazzes);
    }

    @Override
    public int updateClazz(Clazz clazz) {
        if (StringUtils.isNotBlank(clazz.getcId())) {
            return clazzMapper.updateByPrimaryKey(clazz);
        } else {
            return clazzMapper.insert(clazz);
        }
    }

    @Override
    public Clazz getClazzById(String id) {
        return clazzMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(String getcId) {
        return clazzMapper.deleteByPrimaryKey(getcId);
    }

    @Override
    public List<Clazz> searchClazz() {
        return clazzMapper.selectByExample(new ClazzExample());
    }
}
