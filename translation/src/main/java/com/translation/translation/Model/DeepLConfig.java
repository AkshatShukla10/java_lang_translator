package com.translation.translation.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DeepLConfig {

    @Value("${deepl.api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
