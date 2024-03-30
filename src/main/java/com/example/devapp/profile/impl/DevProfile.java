package com.example.devapp.profile.impl;

import com.example.devapp.profile.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
