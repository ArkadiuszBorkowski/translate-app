package com.example.di.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String format(String originalText) {
        return null;
    }
}
