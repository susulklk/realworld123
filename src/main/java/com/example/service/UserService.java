package com.example.service;

import com.example.config.AuthUserDetails;
import com.example.dto.UserDto;

public interface UserService {
    UserDto registration(final UserDto.Registration registration);

    UserDto login(final UserDto.Login login);

    UserDto currentUser(final AuthUserDetails authUserDetails);

    UserDto update(final UserDto.Update update, final AuthUserDetails authUserDetails);

}