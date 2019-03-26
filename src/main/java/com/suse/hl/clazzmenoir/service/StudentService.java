package com.suse.hl.clazzmenoir.service;

import com.suse.hl.clazzmenoir.common.domain.Student;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;

public interface StudentService {
    CommRespone selectAll(CommRequest request);

    int updateClazz(Student student);

    Student getProductById(String id);

    int delete(String id);
}
