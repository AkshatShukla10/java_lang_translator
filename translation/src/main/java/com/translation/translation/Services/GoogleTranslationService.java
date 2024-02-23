package com.translation.translation.Services;
import com.deepl.api.*;
import org.springframework.stereotype.Service;

@Service
public class GoogleTranslationService implements TranslationService {

    @Override
    public String translateEnglishToFrench(String text) throws DeepLException, InterruptedException {
        
        String textToTranslate = text;
        String targetLanguage = "fr";
        String authKey = "391815db-e8d1-443a-8c5b-9353aa799b0d:fx";
        Translator translator = new Translator(authKey);
        TextResult result =
                translator.translateText(textToTranslate, null, targetLanguage);
       return result.getText();
    }
    
}