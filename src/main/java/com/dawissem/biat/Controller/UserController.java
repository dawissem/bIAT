package com.dawissem.biat.Controller;

import com.dawissem.biat.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController {
    @Autowired //when y eve rwhen  call USer service methopod  dependecies indexation hiya
    private UserService userService;
    @GetMapping("user/{matricule}/{password}")
    public int UserLogin(@PathVariable("matricule") Integer matricule1, @PathVariable("password") String password1) {

        int flag = userService.loginValidation(matricule1, password1);
        if (flag == 0) {
            return 0;
        }
        return flag;
    }
}
