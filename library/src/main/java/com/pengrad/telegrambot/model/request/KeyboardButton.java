package com.pengrad.telegrambot.model.request;

import java.io.Serializable;

import com.pengrad.telegrambot.model.WebAppInfo;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class KeyboardButton implements Serializable {
    private final static long serialVersionUID = 0L;

    private String text;
    private boolean request_contact;
    private boolean request_location;
    private KeyboardButtonPollType request_poll;
    private WebAppInfo web_app_info;

    public KeyboardButton(String text) {
        this.text = text;
    }

    public KeyboardButton requestLocation(boolean requestLocation) {
        request_location = requestLocation;
        return this;
    }

    public KeyboardButton requestContact(boolean requestContact) {
        request_contact = requestContact;
        return this;
    }

    public KeyboardButton requestPoll(KeyboardButtonPollType poll) {
        this.request_poll = poll;
        return this;
    }

    public KeyboardButton webAppInfo(WebAppInfo webAppInfo) {
        this.web_app_info = webAppInfo;
        return this;
    }
}
