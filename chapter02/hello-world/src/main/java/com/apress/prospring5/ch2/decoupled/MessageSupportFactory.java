package com.apress.prospring5.ch2.decoupled;

import java.util.Properties;

// Factory Method
public class MessageSupportFactory {

    private static MessageSupportFactory instance;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    // 생성자
    private MessageSupportFactory() {
        props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream("/msf.properties")); // resources 하위 data
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 초기화 블럭, instance 는 MessageSupportFactory 타입이다(클래스 자기 자신)
    static {
        instance = new MessageSupportFactory();
    }

    // FactoryClass instance 를 return 하는 method
    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() { return provider; }
}
