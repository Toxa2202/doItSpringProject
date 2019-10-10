package com.saint.anthony;

import org.springframework.stereotype.Component;

// Клас підтягує шаблон і зобов"язується реалізувати його методи
@Component
public class SimpleMessageProvider implements MessageProvider {
    // Реалізує метод з інтерфейсу
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
