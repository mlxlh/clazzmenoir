package com.suse.hl.clazzmenoir.mapper.extended;

import com.suse.hl.clazzmenoir.common.domain.Clazz;

import java.util.List;

public interface ClazzMapperExtend{
    List<Clazz> search(String keyword);
}
