package com.paper.service;


import com.paper.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin getById(int id);
    List<Admin> getAdminList();
}
