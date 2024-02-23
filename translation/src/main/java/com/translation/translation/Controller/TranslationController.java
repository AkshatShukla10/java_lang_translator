package com.translation.translation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.translation.translation.Model.TranslationRequest;
import com.translation.translation.Model.TranslationResponse;
import com.translation.translation.Services.TranslationService;

@RestController
@RequestMapping("/api/translate")
public class TranslationController {
    
    @Autowired
    private TranslationService translationService;

    @PostMapping("/english-to-french")
    public ResponseEntity<TranslationResponse> translateEnglishToFrench(@RequestBody TranslationRequest request) {

        if (request.getText() == null || request.getText().isEmpty()) {
            return ResponseEntity.badRequest().body(new TranslationResponse("Request body is missing or empty"));
        }

        try{
        String translatedText = translationService.translateEnglishToFrench(request.getText());
        TranslationResponse response = new TranslationResponse(translatedText);
        return ResponseEntity.ok(response);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                    new TranslationResponse("Error translating text: " + e.getMessage()));
        }
    }

    }
    
