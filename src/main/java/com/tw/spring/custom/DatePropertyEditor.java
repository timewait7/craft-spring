package com.tw.spring.custom;

import java.beans.PropertyEditorSupport;
import java.time.format.DateTimeFormatter;

public class DatePropertyEditor extends PropertyEditorSupport {

    private String datePattern;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(getDatePattern());
        setValue(null);
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }
}
