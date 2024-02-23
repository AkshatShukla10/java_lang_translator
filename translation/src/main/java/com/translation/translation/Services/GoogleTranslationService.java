package com.translation.translation.Services;

import com.deepl.api.*;
import com.translation.translation.Model.DeepLConfig;
import org.springframework.stereotype.Service;

@Service
public class GoogleTranslationService implements TranslationService {

    private final String apiKey;

    public GoogleTranslationService(DeepLConfig deepLConfig) {
        this.apiKey = deepLConfig.getApiKey();
    }

    @Override
    public String translateEnglishToFrench(String text) throws DeepLException, InterruptedException {
        
        String textToTranslate = text;
        String targetLanguage = "fr";
        String authKey = this.apiKey;
        Translator translator = new Translator(authKey);
        TextResult result =
                translator.translateText(textToTranslate, null, targetLanguage);
       return result.getText();
    }
    
}