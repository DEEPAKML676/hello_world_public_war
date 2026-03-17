package com.example;

/**

* This is a class.
  */
  public class Greeter {

/**

* This is a constructor.
  */
  public Greeter() {

}

//TODO: Add javadoc comment
public String greet(String someone) {
return String.format("Hello, %s!", someone);
}

// 🔁 DUPLICATION (method 1)
public void duplicateMethod1() {
int sum = 0;
for(int i = 0; i < 10; i++) {
sum += i;
}
System.out.println(sum);
}

// 🔁 DUPLICATION (method 2)
public void duplicateMethod2() {
int sum = 0;
for(int i = 0; i < 10; i++) {
sum += i;
}
System.out.println(sum);
}

// ⚠️ CODE SMELL
public void badMethod() {
int a = 10;
int b = 20;

int c = a + b;
int d = a + b;
int e = a + b;
int f = a + b;

}

// 🔴 VULNERABILITY
public void insecureMethod() {
String password = "123456";
System.out.println(password);
}

// 🐞 BUG
public void bugMethod() {
String s = null;
System.out.println(s.length());
}
}












// package com.example;

// /**
//  * This is a class.
//  */
// public class Greeter {

//   /**
//    * This is a constructor.
//    */
//   public Greeter() {

//   }

//   //TODO: Add javadoc comment
//   public String greet(String someone) {
//     return String.format("Hello, %s!", someone);
//   }
// }
