package com.saint.anthony;

public class Main {
    public static void main(String[] args) {
        // Створили два об"єкта інтерфейсів, але присвоїли їм
        // значення реалізуючих класів(поліморфізм)
        MessageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();
        // Запустили рендер
        renderer.render();
    }
}
