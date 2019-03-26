package com.suse.hl.clazzmenoir.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.suse.hl.clazzmenoir.common.domain.Student;
import com.suse.hl.clazzmenoir.common.domain.StudentExample;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;
import com.suse.hl.clazzmenoir.mapper.StudentMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSeviceImp implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Override
    public CommRespone selectAll(CommRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        StudentExample example = new StudentExample();
        if (StringUtils.isNotBlank(request.getKeywordLike())) {
            example.createCriteria().andNameLike(request.getKeywordLike());
        }
        List<Student> students = studentMapper.selectByExample(example);
        return new CommRespone(((Page)(students)).getTotal(),students);
    }

    @Override
    public int updateClazz(Student student) {
        if (StringUtils.isNotBlank(student.getId())) {
            return studentMapper.updateByPrimaryKey(student);
        } else {
            return studentMapper.insert(student);
        }
    }

    @Override
    public Student getProductById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(String id) {
        return studentMapper.deleteByPrimaryKey(id);
    }
}
