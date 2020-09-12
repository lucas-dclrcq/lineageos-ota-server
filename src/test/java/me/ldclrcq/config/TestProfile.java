package me.ldclrcq.config;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Map;

public class TestProfile implements QuarkusTestProfile {
    @Override
    public Map<String, String> getConfigOverrides() {
        return null;
    }
}
