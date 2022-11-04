package com.paper.mapper;

import com.paper.entity.Organization;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapper {
    List<Organization> getOrgListByParentId(Integer id);

    Organization getOrgById(Integer id);

    int insertOrg(Organization org);

    int deleteOrgById(Integer id);
}
