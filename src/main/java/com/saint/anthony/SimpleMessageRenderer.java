package com.saint.anthony;
// Реалізує рендер
public class SimpleMessageRenderer implements MessageRenderer {
    // створює об"єкт провайдера
    private final MessageProvider provider;
    // Конструктор присвоює зовнішнє значення своєму об"єкту
    public SimpleMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    // Реалізує рендер з інтерфейсу, а саме
    // виводить на екран дію провайдера, бо має до нього доступ
    // через створене поле і конструктор
    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
