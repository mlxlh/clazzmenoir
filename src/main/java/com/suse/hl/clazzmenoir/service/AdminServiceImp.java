package com.suse.hl.clazzmenoir.service;

import com.suse.hl.clazzmenoir.common.domain.Admin;
import com.suse.hl.clazzmenoir.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin selectByName(String adminName) {
        return adminMapper.selectByName(adminName);
    }
}
