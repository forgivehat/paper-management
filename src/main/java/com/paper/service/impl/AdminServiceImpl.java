package com.paper.service.impl;

import com.paper.entity.Admin;
import com.paper.mapper.AdminMapper;
import com.paper.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getById(int id) {
        return adminMapper.selectById(id);
    }

    @Override
    public List<Admin> getAdminList() {
        return adminMapper.selectAll();
    }


}
