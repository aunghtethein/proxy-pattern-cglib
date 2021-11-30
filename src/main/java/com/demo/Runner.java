package com.demo;

public class Runner {
    public static void main(String[] args) {
        RealSubject realSubject = new CglibRealSubject(new RealSubject());
        System.out.println(realSubject.greet("Pyae"));
    }
}
