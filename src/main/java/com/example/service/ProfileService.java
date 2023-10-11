package com.example.service;

import com.example.config.AuthUserDetails;
import com.example.dto.ProfileDto;

public interface ProfileService {
    ProfileDto getProfile(final String username, final AuthUserDetails authUserDetails);
    ProfileDto getProfileByUserId(Long userId, AuthUserDetails authUserDetails);
    ProfileDto followUser(final String name, final AuthUserDetails authUserDetails);
    ProfileDto unfollowUser(final String name, final AuthUserDetails authUserDetails);
}