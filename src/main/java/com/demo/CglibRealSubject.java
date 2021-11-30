package com.demo;

public class CglibRealSubject extends RealSubject{

    private RealSubject realSubject;

    public CglibRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    String greet(String name) {
        return realSubject.greet(name) + " How're you doing?";
    }
}
