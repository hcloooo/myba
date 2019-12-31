package com.nacl.myba.service;

import com.nacl.myba.bean.Admin;
import com.nacl.myba.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;
    public Admin getAdminById(Long id){
        return adminMapper.getAdminById(id);
    }
}


