package com.example.devapp.profile.impl;

import com.example.devapp.profile.SystemProfile;
import org.springframework.stereotype.Component;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is Production";
    }
}
