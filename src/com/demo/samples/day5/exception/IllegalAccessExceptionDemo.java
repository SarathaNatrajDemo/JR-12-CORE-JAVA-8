package com.demo.samples.day5.exception;

public class IllegalAccessExceptionDemo {
    public static void main(String[] args) throws InstantiationException, java.lang.IllegalAccessException {
        Class<?> classVar = ClassWithPrivateConstructor.class;
        ClassWithPrivateConstructor t = (ClassWithPrivateConstructor) classVar.newInstance();
        
        t.sampleMethod();
    }
}
 
class ClassWithPrivateConstructor {
	private int number;
    private ClassWithPrivateConstructor() {}
 
    public void sampleMethod() {
        System.out.println("Method 'sampleMethod' Called");
    }
}
