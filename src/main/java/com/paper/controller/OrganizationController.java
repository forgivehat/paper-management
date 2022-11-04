package com.paper.controller;

import com.paper.entity.Organization;
import com.paper.service.IOrganizationService;
import com.paper.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    IOrganizationService organizationService;

    public Result CreateOrganization(@RequestBody Organization org) {

        return null;
    }
}
