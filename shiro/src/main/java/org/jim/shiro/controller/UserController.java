package org.jim.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("UserCtl")
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/admin")
    //@RequiresPermissions("admin:read")
    @RequiresRoles("admin")
    public String admin() {
        System.out.println("***** Enter admin");
        return "Jim";
    }

}
