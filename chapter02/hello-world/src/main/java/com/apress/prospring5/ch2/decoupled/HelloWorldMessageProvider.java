package com.apress.prospring5.ch2.decoupled;

// MessageProvider Interface 구현 클래스
public class HelloWorldMessageProvider implements MessageProvider {

    // HelloWorldMessageProvider 생성자
    public HelloWorldMessageProvider(){
        System.out.println(" --> HelloWorldMessageProvider: 생성자가 호출됨");
    }

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
