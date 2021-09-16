# JAVA 8 Concepts
Benefits of Lambda expression -
------------------------------------
1. To enable functional programming in Java
2. To write more readable, maintainable and clean concised code.
3. To use APIs very easily and effectively.
4. To enable parallel processing.
5. It also removed code complexity.

Note - LISP is the first programming language which uses Lambda expression.
       Java is the last language that uses Lambda expression.\
-How to write Lambda expression ?
--------------------------------------
 Lambda expression is an anonymous function.
 Anonymous function- It is a function, which does not have name, modifiers and return type.
 
 Syntax -
 without Lambda expression -
 public void m1() {
   System.out.println("Hello");
 }
 
 with Lambda expression -
 () -> { System.out.println("Hello");}
 
 Without Lambda expression -
 public void add(int a, int b) {
 	System.out.println(a+b);
 }
 
 With Lambda expression -
 (int a, int b) -> { System.out.println(a+b);}
 
 Without Lambda expression -
 public int getLangth(String s) {
    return s.length();
 } 
 
 With lambda expression -
 (String s) -> { return s.length(); }
 
 
 - Optimizing Lambda expressions
 ---------------------------------------
 1. A lambda expression can take any no of parameters.
    () -> System.out.println("Hello");
    (s) -> System.out.println("Hello");
    (a,b) -> System.out.println(a+b);
 2. If the body of the Lambda expression contains only one statement then the curly braces {} are optional.
    But in case of multiple statements, it is mandatory to have {}.
    Eg - (int a, int b) -> {
                     System.out.println("Hello");
                     System.out.println("Bye");
                     }
 3. Based on the context, the compiler can automatically guess the types. This is called "Type Inference".
    Eg- (int a, int b) -> System.out.println(a+b);   can be written as (a,b) -> System.out.println(a+b);
 4. Compiler can automatically guess that lambda expression is going to return something and the return type.
    So, "return" keyword is not required.
    Eg - (s) -> return s.length();  can be written as (s) -> s.length();
 5. So, if in Lambda expression.. it contains only one parameter then it is not required to have parenthesis.
    Eg - (s) -> s.length; can be written as s -> s.length;
 6. If multiple parameters are present, then they should be separated with ','.



Functional Interface 
----------------------------------------
Once we write the Lambda expression, we need to invoke the lambda expression. This can be done by Functional Interface.
1. If the interface contains single abstract method(SAM)[only one abstract method], then that interface is called "Functional Interface".
   Example -
     Runnable - contains only one method. run()
     Callable - call()
     ActionListener - actionPerformed()
     Comparable - compareTo()
    
2. If programmer wants to explicitly mention an interface as an Functional interface, then he/she should define the interface with
   @FunctionalInterface annotation.
   Note - Irrespective of annotation, if an interface contains only one abstract method then it will be "Functional Interface".
   Eg - @FunctionalInterface
        interface Interf {
            public void m1();
            public void m2() {
            }
        }
        
        @FunctionalInterface
        interface Interf {
            public void m1();
            public void m2();
        }
        In this case, you will get a compile time error saying
               "Unexpected @FunctionalInterface annotation. Multiple non-overriding abstract method present in Interface Interf.
               
        @FunctionalInterface
        interface Interf {
        }
        In this case, you will get a compile time error saying
               "Unexpected @FunctionalInterface annotation. No abstract method found in interface Interf"
   
Note - Functional Interface can contain only one abstract method. But it can contain any number of default, static as well. But you cannot define any non-static
       or instance methods in them.

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

Why Functional Interface should contains only one abstarct method ?
--------------------------------------------------------------------
Ans - 
    interface Interf {
       public void m1(int a);
    }
    
    Interf i = a -> System.out.println(a*a);
    i.m1(10);
    i.m2(20);
    
    In the above case, Compiler will map the whole lambda expression to the m1() abstarct method.
    
    interface Interf {
       public void m1(int a);
       public void m2(int a);
    }
    
    Interf i = a -> System.out.println(a*a);
    i.m1(10);
    i.m2(20);
    
    In the above case, compiler will be confused as the lambda expression is going to be mapped whether m1() or m2().
    So, programmer gets a compile time error now.
    CE: Incompatible types: Interf is not a functional interface.
        Multiple None overriding abstract methods in interface Interf.
        
What is the advantage of @FunctionalInterface annotation ?
-----------------------------------------------------------------------
By putting this annotation, we are explicitly making an interface as Functional Interface and letting compiler know that.. you cannot add more than one abstract method.
If do so, then you will get compile time error.

@FunctionalInterface
interface Interf {
    public void m1();
}

Interf i = () -> System.out.println("Hello");




**Functional Interface wrt Inheritance** -
--------------------------------------------------
Case 1 -
   If an interface extends Functional Interface and child interface does not contain any abstract method, then child interface is always Functional Interface.
   @FunctionalInterface
   interface Parent {
       public void m1();
   }
   
   @FunctionalInterface
   interface Child extends Parent {
   }
   
Case 2 -
   In the child interface, we can define exactly same parent interface abstract method.
   @FunctionalInterface
   interface Parent {
       public void m1();
   }
   
   @FunctionalInterface
   interface Child extends Parent {
       public void m1();
   }
   
Case 3 -
   In the child interface, we can't define any new abstract methods otherwise we will get Compile Time Error.
   @FunctionalInterface
   interface Parent {
       public void m1();
   }
   
   @FunctionalInterface
   interface Child extends Parent {
       public void m2();
   }
   The compile Time Error is as follows,
      Unexpected @FunctionalInterface annotation, multiple non-overriding abstract methods found in interface Child
      
 Case 4 -
   @FunctionalInterface
   interface Parent {
       public void m1();
   }
   
   interface Child extends Parent {
       public void m2();
   }
   The above program is completely valid as the Child interface is not a functional interfac. So, it can contain n number of abstract methods.
   
**Invoking Lambda Expression by using Functional Interface** -
----------------------------------------------------------------
**Example 1 -**
   _Without Lambda Expression_ -
   interface Interf {
      public void m1();
   }
   
   class Demo implements Interf {
      public void m1() {
         System.out.println("m1() method implementation");
      }
   }
   
   class Test {
      public static void main(String[] args) {
          Interf i = new Demo();
          i.m1();
      }
   }
   O/P - m1() method implementation
   
   _With Lambda Expression_ -
   interface Interf {
      public void m1();
   }
   
   class Test {
      public static void main(String[] args) {
         Interf i = () -> {
            System.out.println("m1() method implementation");
         }
         i.m1();
      }
   }
   
 **Example 2 -**
   _Without Lambda Expression_ -
   interface  Interf {
      public void add(int a, int b);
   }
   
   class Demo implements Interf {
      public void add(int a, int b) {
         System.out.println("Sum of a and b = " + (a+b));
      }
   }
   
   class Test {
      public static void main(String[] args) {
         Interf i = new Demo();
         i.add(10,20);
         i.add(100,200);
      }
   }
   O/P - 30
         300
         
   _With Lambda Expression_ -
    interface  Interf {
      public void add(int a, int b);
   }
   
   class Test {
      public static void main(String[] args) {
          Interf i = (a,b) -> System.out.println("Sum of a & b = " + (a+b));
      }
   }
   O/P - 30
         300
         
 **Example 5 -**
 _Without Lambda Expression_ -
class MyRunnable implements Runnable {
   @Override
   public void run() {
     for(int i=0;i<10;i++) {
        System.out.println("Child Thread");
     }
   }
}

class Test {
   public static void main(String[] args) {
      Runnable r = new MyRunnable();
      Thread t = new Thread(r);
      t.start();
      for(int i=0;i<10;i++) {
         System.out.println("Main Thread");
      }
   }
}

_With Lambda Expression_ -
class Test {
   public static void main(String[] args) {
      Runnable r = () -> {
         for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
         }
      };
      Thread t = new Thread(r);
      t.start();
      for(int i=0;i<10;i++) {
         System.out.println("Main Thread");
      }
   }
}





Lambda Expressions with Collections -
_____________________________________________
1. Comparator interface has only one abstract method i.e compare().
2. Comparator is used to define our own sorting technique (means customized sorting).

Syntax -
   public int compare(Object obj1, Object obj2)
      |- return -ve value if Obj1 has to come before Obj2
      |- return +ve value if Obj1 has to come after Obj2
      |- return 0 if Obj1 and Obj2 are equal
      
   Eg - compare(10,20)
      
3. Default natural sorting order for numbers is "Ascending".
   Default natural sorting order for Strings is based on the alphabatical order.
   
   
   
   
_Anonymous Inner Classes and Lambda Expressions-_

What is Anonymous Inner class ?
Ans - A class with no name is known as Anonymous Inner class.

In some context only, anonymous inner class can be replaced with Lambda expression.
_With Anonymous Inner class _-

class ThreadDemo {
   public static void main(String[] args) {
       Runnable r = new Runnable()
       {
          public void run() {
             for(int i=0;i<10;i++) {
               System.out.println("Child Thread");
             }
          }
       };
       Thread t = new Thread(r);
       t.start();
   }
}

In the above example, we are creating an anonymous inner class and when we do "new Runnable()".. we are not creating the object of Runnable. It is the object creation
of the interface implemented Anonymous inner class and then the code inside { } is the body of that implemented inner class which contains the run() method.

_With Lambda Expression_ -

class ThreadDemo {
   public static void main(String[] args) {
       Runnable r = () -> {
          for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
          }
       };
       Thread t = new Thread(r);
       t.start();
   }
}

**Anonymous inner classes creation in different scenarios** -
Scenario 1 -  [Anonymous inner class the extends a concrete class]
class Test {
  public void m1() {}
}

Test t = new Test()
{
  public void m1() {}
};

Scenario 2 - [Anonymous inner class that extends an abstract class]
abstract class Test {
   public void m1();
}

Test t = new Test()
{
  @Override
  public void m1() {}
};

Scenario 3 - [Anonymous inner class that implements an interface which implements multiple abstract methods]
interface Test {
   public void m1();
   public void m2();
   public void m3();
   public void m4();
}

Test t = new Test()
{
   @Overide
   public void m1() {}
   @Override
   public void m2() {}
   @Override
   public void m3() {}
   @Overide
   public void m4() {}
};

Scenario 4 - [Anonymous inner class that implements an interface which implements an interface that contains only one abstract method (SAM)]
@FunctionalInterface
interface Test {
   public void m1();
}

Test t = new Test() 
{
  @Override
  public void m1() {}
};

_Note -_
From all the above 4 scenarios, we we see closely only scenario 4 anonymous inner class example can be replaced by Lambda expression.
So, this is the only case where an anonymous inner class can be replaced by Lambda expression.
So, Anonymous inner class is more powerful than Lambda expression.

_"this" keyword behavior in both Anonymous inner class and Lambda expression -_


_Difference between Anonymous inner class and Lambda expression -_




**Defaults methods and Static methods in interface :-**

- Upto Java 1.7 every method in interface is declared should be abstract method always.
- All variables should be declared as "public static final".
- Interface could not have any concrete methods defined in it. Thats why we often said "Interface is pure abstraction"

But post Java 1.7 (from Java 1.8), we can define Concrete methods as well in interface in the form of "default" methods.
- Default methods can be defined with "default" keyword.
- These methods are directly available to the implementation classes from interfaces. If the implementation class does not want to use the 
  interface's default method then it can also override the same.
interface Interf {
   default void m1() {
      System.out.println("Default method");
   }
}

class Test implements Interf {
   public static void main(String[] args) {
       Test t = new Test();
       t.m1();
   }
}

OR

class Test implements Interf {
   @Override
   public void m1() {
      System.out.println("My own implementation");
   }
   
   public static void main(String[] args) {
      Test t = new Test();
      t.m1();
   }
}

_Default methods wrt Inheritance_ -
Consider the following scenario.
interface Left {
   default void m1() {
     System.out.println("Left default implemenation");
   }
}

interface Right {
   default void m1() {
     System.out.println("Right default implementation");
   }
}

class Test implements Left,Right {
  /**
    When a class inherits multiple interfaces (case of a multiple inheritance) with same default method and
    if we don't provide any implementation for the default method then it is going to throw Compile Time Error because
    implemented child class does not know which interface default method to refer.
    Error: Class Test inherits unrelated defaults for Left and Right
    So there are 2 ways we can solve this.
      1. By providing default method implementation in the implemented class
      2. By using interface.super.default_method() i.e calling Parent interface default method
  **/
  
  @Override
  public void m1() {
     System.out.println("My own implementation");
     Left.super.m1(); // Will invoke default m1() of Left interface
  }
}

_Difference between Interface's default methods and Abstract classes -

                Interface with default method                                                            Abstract class
1. Inside interface every varirbale is always public static final.                      1. Inside Abstract class, we can declare instance variables, which are required
   We cannot declare instance variables.                                                   in the child class.
2. Interface never talks about the state of the object.                                 2. Abstract class can talk about state of object.
3. Inside interface we cannot declare constructors.                                     3. Inside abstract class we can declare constructors.
4. Inside interface we cannot delcare instance and static blocks.                       4. Inside abstract class we can declare instance and static blocks.
5. Functional Interface with default methods can refer to Lambda expression.            5. Abstract class cannot refer to Lambda expression.
6. Inside interface we cannot override object class methods.                            6. Inside abstract class we can override Object class methods.

_Static methods in interface_ -
- From Java 1.8 onwards, we can declare static methods inside Interface as well.
- The main purpose of static methods inside an interface to provide some general utility methods.
- Interface static methods are not directly available to the implemented class. You can call static methods only by Interface name
  inside implemented class.

Consider the following example-
interface Interf {
   public static void m1() {
       System.out.println("Interface static methods");
   }
}

class Test implements Interf {
   public static void main(String[] args) {
      Test t = new Test();
      t.m1(); [Incorrect]
      Test.m1(); [Incorrect]
      Interf.m1(); [This is correct]
   }
}


_Interface static methods wrt Overriding_ -
- We know that interface static methods are not directly available to the implemented child class. So, overriding concept does not fit here.
- We can declare a complete new implementation of the same method in the implemented child class and that is not overriding.

Conside the following 3 examples -

Example 1 [Valid declaration but its not overrding]
interface Interf {
   public static void m1() {} // This belongs to Interf
}

class Test implements Interf {
   public static void m1() {} // This belongs to Test
}

Example 2 [valid declaration but its not overding]
interface Interf {
   public static void m1() {} // This belongs to Interf
}

class Test implements Interf {
   public void m1() {} // This belongs to Test
}

Example 3 [Valid declaration but its not overiding]
interface Interf {
   public static void m1() {} // This belongs to Interf
}

class Test implements Interf {
   private static void m1() {} // This belongs to Test
}

Q> Can we declare main() method inside interface ?
Ans - YES. Upto Java 1.7 this facility was not available.
           But from Java 1.8 onwards we can declare main inside interface and run the interface directly from Command Line as well.
           
      Example -
      interface Interf {
         public static void main(String[] args) {
             System.out.println("Inside main method");
         }
      }


There are several predefined Functional Interfaces available from Java 1.8 onwards.
1. Predicate
2. Function
3. Consumer
4. Supplier
        etc etc
All these above Functional Interfaces are part of java.util.function package.

**Predicate (I) -**
- It is a boolean valued function in Mathematics. In Java also, it holds the same purpose (conditional checking).
- Available in java.util.function package.
- It contains only one abstract method. 
      boolean test(T t);

Lets take a example to understand the Predicate.
Check whether a given number is greater than 10 or not

_Without Predicate and Lambda expression_ -
public boolean test(Integer i) {
   if(i > 10)
     return true;
   else
     return false;
}

Now, replacing the same with Lambda expression as below.
   i -> i > 10;

As Predicate a Functional Interface it can refer to this Lambda expression as shown below.
   Predicate<Integer> p = i -> i > 10;
   p.test(100); // will return true
       
Q : Check if the length of a given string is greater than 5 or not ?
Ans : class Test {
          public static void main(String[] args) {
            String s = "abddef";
            Predicate<String> p = s -> s.length() > 5;
            System.out.println(p.test(s));
        }
      }
       
Q : Check if the collection object is empty or not ?
       

_Predicate Joining_ -
- Sometimes there might be scenarios where multiple predicates may need to joined.
- Consider the following scenario.
       We have 2 predicates. P1 and P2
       P1 = Checks whether a number is greater then 10 or not
       P2 = Checks wthether a number is an even number or not
- These are the following methods available as part of Predicate Joining.
       1. P1.negate() = This means that, Returns TRUE if a number is NOT greater than 10.
       2. P1.and(P2) = This means that, Returns only TRUE if the number is greater than 10 and even number also.
       3. P1.or(P2) = This means that, Returns TRUE if the number is greater than 10 OR even number.
       
Q : Write a program to display names starts with 'K' by using Predicate ?
       import java.util.function.Predicate;
       import java.util.stream.Stream;

       public class PredicateDemo {
              public static void main(String...args) {
                     String[] arr = {"Sunny", "Kajal", "Malika", "Katrina", "Kareena"};
                     Predicate<String> p = s -> s.startsWith("K");
                     Stream.of(arr).filter(p).forEach(System.out::println);
                     // Or you can do like this if you don't want to use Stream
                     for(String s : arr) {
                         if(p.test(s))
                           System.out.println(s);
                     }
              }
       }
       

Q : Predicate Example to remove null values and empty String from the given list ?
       String[] arr = {"Durga", "", null, "Ravi", "", "Shiva", null};
       
       
Q : Program for User Authentication by using Predicate ?
       
       
_Predicate Interface isEqual() method_ -
- Predicate interface has one static method defined in it.
       public static Predicate<T> isEqual(T t)
- This is used to check, whether the predicate is equal to or not.
       Example
         Predicate<String> p = Predicate.isEqual("Hello");
         System.out.println(p.test("Hello")); // returns true
         System.out.println(p.test("Hi"); // returns false
       
- Just remember, in case of working with custom Collection.. do override equals() method otherwise it will invoke Object class equals() method.
       
       
**Function (I) -**
- 
       
       
       
**Consumer (I) -**
- It is a functional interface.
- This interface consumes value and perform certain operation on it.
- As it is a functional interface, it has only one abstract method.
       void accept(T t)
- It does not return any type.
       
  Example -
       Consumer<String> c = s -> System.out.println(s);
       c.accept("Hello");
       c.accept("World");
   From the above example, we can see that.. the consumer is going to accept the string value and just print it. (This is the Consumer operation in this particular case).
       
 Q : Program to display Movie information by using Consumer ?
       
       
       
 Q : Program to display Student information by using Predicate, Function and Consumer ?
       Complete 3 requirements as mention below.
         1. Check if the Student marks is greater than or equal to 60 ?
         2. Find the grades of the student based on the marks (greater than or equal to 60)
         3. Show Student information
       
       
 _Consumer Chaining -_
 - When multiple consumers are going to be grouped together to form a complex consumer, then it is called Consumer chaining.
 - This can be acheived by a default method that is available in Consumer.
        public default andThen(C c);
 Consider the following scenario.
       c1.andThen(c2).andThen(c3).accept(m);
 In the above example, m is the movie object.
                       c1 notifies on any update of a newly released movie.
                       c2 provides the result of that movie i.e hit or flop.
                       c3 responsible to store the movie information in the database.
 So, first c1 will be eveluated then c2 and then c3.
       
       
       
 **Supplier (I) -**
 - When there is a requirement where user does not provide any input but gets a specific type of O/P then that can be achieved by Supplier.
 - This is a functional interface.
 - As it is a functional interface, it does have only one abstract method.
 - Supplier interface does not contain any default or static methods.
 - Supplier get() does not take any argument but it has return type.
       public R get();
          Where R is the return type.
       
   interface Supplier<R> {
        public R get();
   }
   Where R is the return type.
       
       
 Q : Program to get System Date by using Supplier ?
       
 
 Q : Program to get Random Name by using Supplier ?
       
       
 Q : Program to get Random OTP by using Supplier ?
       
       
 Q : Program to get Random password by using Supplier ?
       
       
       
       
 Difference between Predicate, Function, Consumer and Supplier ?
       
 Property                           Predicate                             Function                                Consumer                                     Supplier
Purpose          To take some input and perform some conditional    To take some input and perform      To consume some input and perform        To supply some value based on our 
                 checks.                                            required operation and return the   required operation. It won't return      requirement
                                                                    result.                             anything.
       
interface        interface Predicate<T>                             interface Function<T,R>             interface Consumer<T>                    interface Supplier<R>
declaration      {....}                                             {....}                              {....}                                   {....}
       
Single Abstract  public boolean test(T t);                          public R apply(T t);                public void accept(T t);                 public R get();
Method (SAM)       
       
Default Methods  and(), or() and negate()                           andThen() and compose()             andThen()                                NA       
                   (Predicate Joining)
       
static methods   isEqual()                                          identity()                          NA                                       NA
       













