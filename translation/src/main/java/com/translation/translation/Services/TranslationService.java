package com.translation.translation.Services;

import com.deepl.api.DeepLException;

public interface TranslationService {
    String translateEnglishToFrench(String text) throws DeepLException, InterruptedException;
}