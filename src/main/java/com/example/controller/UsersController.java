package com.example.controller;

import com.example.config.AuthUserDetails;
import com.example.dto.UserDto;
import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UserService userService;

    @PostMapping
    public UserDto registration(@RequestBody @Valid UserDto.Registration registration) {
        return userService.registration(registration);
    }
    @PostMapping("/login")
    public UserDto login(@RequestBody @Valid UserDto.Login login) {
        return userService.login(login);
    }
    @GetMapping
    public UserDto currentUser(
            @AuthenticationPrincipal AuthUserDetails authUserDetails
    ){
        return userService.currentUser(authUserDetails);
    }

    @PutMapping
    public UserDto update(
            @Valid @RequestBody UserDto.Update update,
            @AuthenticationPrincipal AuthUserDetails authUserDetails
    ){
        return userService.update(update, authUserDetails);
    }
}
