package com.parcom.i18n;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = I18nConfiguration.MESSAGES_PROPERTIES_PREFIX)
public class AdditionalI18nProperties {


    private List<String> messages = new ArrayList<String>();

    public List<String> getMessages() {
        return messages;
    }




    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
