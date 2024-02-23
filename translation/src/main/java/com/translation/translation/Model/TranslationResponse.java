package com.translation.translation.Model;


public class TranslationResponse {
    
    private String translation;

    public TranslationResponse(String translation) {
        this.translation = translation;
    }

    public void setTranslation(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return this.translation;
    }
}