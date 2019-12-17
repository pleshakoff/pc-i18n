package com.parcom.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;


public class LocalizationUtils {

    public static final String RU = "ru";
    public static final String EN = "en";


    static public String getLocalizedResource(MessageSource messageSource, String messName) {
        return messageSource.getMessage(messName, null, messName, LocaleContextHolder.getLocale());
    }


}
