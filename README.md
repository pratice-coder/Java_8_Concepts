# JAVA 8 Concepts
Benefits of Lambda expression -
------------------------------------
1. To enable functional programming in Java
2. To write more readable, maintainable and clean concised code.
3. To use APIs very easily and effectively.
4. To enable parallel processing.
5. It also removed code complexity.

-How to write Lambda expression ?
--------------------------------------
 Lambda expression is an anonymous function.
 Anonymous function- It is a function, which does not have name, modifiers, return type.
 
 Syntax -
 without Lambda expression -
 public void m1() {
   System.out.println("Hello");
 }
 
 () -> { System.out.println("Hello");}
 
 Without Lambda expression -
 public void add(int a, int b) {
 	System.out.println(a+b);
 }
 
 (int a, int b) -> { System.out.println(a+b);}
 
 Without Lambda expression -
 public int getLangth(String s) {
    return s.length();
 } 
 
 (String s) -> { return s.length(); }
 
 
 - Optimizing Lambda expressions
 ---------------------------------------
 1. A lambda expression can take any no of parameters.
    () -> System.out.println("Hello");
    (s) -> System.out.println("Hello");
    (a,b) -> System.out.println(a+b);
 2. If the body of the Lambda expression contains only one statement then the curly braces {} are optional.
    But in case of multiple statements, it is mandatory to have {}.
 3. Based on the context, the compiler can automatically guess the types. This is called "Type Inference".
    Eg- (int a, int b) -> System.out.println(a+b);   can be written as (a,b) -> System.out.println(a+b);
 4. Compiler can automatically guess that lambda expression is going to return something and the return type.
    So, "return" keyword is not required.
    Eg - (s) -> return s.length();  can be written as (s) -> s.length();
 5. So, if in Lambda expression.. it contains only one parameter then it is not required to have parenthesis.
    Eg - (s) -> s.length; can be written as s -> s.length;



Functional Interface 
----------------------------------------
1. If the interface contains single abstract method(SAM), then that interface is called "Functional Interface".
   Example -
     Runnable - contains only one method. run()
     Callable - call()
     ActionListener - actionPerformed()
     Comparable - compareTo()
    
2. If programmer wants to explicitly mention an interface as an Functional interface, then he/she should define the interface with
   @FunctionalInterface annotation.
   Note - Irrespective of annotation, if an interface contains only one abstract method then it will be "Functional Interface".

Advantage of @FunctionalInterface annotation :-
----------------------------
So, by defining this we are making compiler aware that the interface should be a "Functional Interface". So, by chance if progammer
defines more then one abstract method then compiler will throw a "Compile time error".

Note - We can invoke lambda expression by using Functional Interface 

Functional Interface in glance -
----------------------------------
1. It should contain exactly one abstract method (SAM - Single Abstract Method)
2. It can contain any number of default and static methods.
3. It acts as a type for lambda expression.
   Ex- Interf i = () -> System.out.println("Hello");
       |-------|  |--------------------------------|
         Type       Lambda Expression
4. It can be used to invoke Lambda expression.
