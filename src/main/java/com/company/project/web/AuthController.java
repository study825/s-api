package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2021/06/30.
*/
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password) {
        userService.findByCondition()

        return ResultGenerator.genSuccessResult();
    }
}
