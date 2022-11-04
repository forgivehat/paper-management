package com.paper.service;

import com.paper.entity.Organization;

import java.util.List;

public interface IOrganizationService {
   int creatOrg(Organization organization);

   List<Organization> getOrgListByParentId(Integer id);
}
