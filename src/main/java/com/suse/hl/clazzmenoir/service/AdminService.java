package com.suse.hl.clazzmenoir.service;

import com.suse.hl.clazzmenoir.common.domain.Admin;

public interface AdminService {
    Admin selectByName(String adminName);
}
