package com.iambstha.base.resource;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.context.annotation.Role;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class TestResource {

    @GetMapping("/user/hello")
    public String helloUser(Authentication authentication) {
        return "Hello " + authentication.getName();
    }

    @GetMapping("/admin/hello")
    public String helloAdmin(Authentication authentication) {
        return "Hello " + authentication.getName();
    }

    @GetMapping("/any/hello")
    public String helloAny(Authentication authentication) {
        return "Hello " + authentication.getName();
    }

}
