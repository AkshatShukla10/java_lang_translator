package com.translation.translation.Model;

public class TranslationRequest {
    private String text;

    public void setText(String text){
        this.text=text;
    }

    public String getText(){
        return this.text;
    }
}