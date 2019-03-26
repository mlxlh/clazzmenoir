package com.suse.hl.clazzmenoir.service;

import com.suse.hl.clazzmenoir.common.domain.Clazz;
import com.suse.hl.clazzmenoir.common.utils.CommRequest;
import com.suse.hl.clazzmenoir.common.utils.CommRespone;

import java.util.List;

public interface ClazzService {
    CommRespone selectAll(CommRequest request);

    int updateClazz(Clazz clazz);

    Clazz getClazzById(String id);

    int delete(String getcId);

    List<Clazz> searchClazz();
}
