package com.apress.prospring5.ch2.decoupled;

// MessageRenderer 구현 클래스는 메시지를 가져오는 로직과 분리되어 있음
// 제공되는 MessageProvider 에게 메시지를 가져오는 책임을 위임 -> MessageProvider 는 MessageRenderer 와 의존성이 있음
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider); // Java Bean 스타일
    MessageProvider getMessageProvider();
}
