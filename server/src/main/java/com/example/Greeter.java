package com.example;

/**

* This is a class.
  */
  public class Greeter {

public Greeter() {}

public String greet(String someone) {
return String.format("Hello, %s!", someone);
}

// ✅ FIXED: No duplication
public void printSum() {
int sum = 0;
for(int i = 0; i < 10; i++) {
sum += i;
}
System.out.println(sum);
}

// ✅ FIXED: Clean code
public void goodMethod() {
int a = 10;
int b = 20;
int sum = a + b;
System.out.println(sum);
}

// ✅ FIXED: No hardcoded secret
public void secureMethod() {
String password = System.getenv("APP_PASSWORD");
System.out.println(password);
}

// ✅ FIXED: No null bug
public void safeMethod() {
String s = "hello";
System.out.println(s.length());
}
}
