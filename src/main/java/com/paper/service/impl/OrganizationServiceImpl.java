package com.paper.service.impl;

import com.paper.entity.Organization;
import com.paper.mapper.OrganizationMapper;
import com.paper.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements IOrganizationService {

    @Autowired
    OrganizationMapper organizationMapper;

    @Override
    public int creatOrg(Organization organization) {

        return 0;
    }

    @Override
    public List<Organization> getOrgListByParentId(Integer id) {
        organizationMapper.getOrgListByParentId(id);
        return null;
    }


}
