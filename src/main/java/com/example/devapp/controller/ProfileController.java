package com.example.devapp.controller;

import com.example.devapp.profile.SystemProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProfileController {
    private final SystemProfile systemProfile;

    @GetMapping
    public String getProfile() {
        return systemProfile.getProfile();
    }
}
