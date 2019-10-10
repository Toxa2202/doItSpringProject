package com.saint.anthony;

// Клас підтягує шаблон і зобов"язується реалізувати його методи
public class SimpleMessageProvider implements MessageProvider {
    // Реалізує метод з інтерфейсу
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
