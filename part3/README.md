

# section 3

## 1. Method

- method a block of code that is executed whenever it is called upon
- overloaded methods: a  methods that share the same name but have different parameters
- method name + parameters = method signature

### 1.1 overloaded methods in code

```
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
```
```
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
```
```
	static double add(double a, double b) {
		System.out.println("This is overloaded method #3");
		return a + b;
	}
```

## 2. final key word

- It is a keyword that can be used with entities in Java to restrict their use. 
- We can use it with class, methods, variables.
- If we initialize a variable with the final keyword, then we cannot modify its value.
- If we declare a method as final, then it cannot be overridden by any subclasses. 
- if we declare a class as final, we restrict the other classes to inherit or extend it.

### 2.1 Final Variable in Java
- Once we declare a variable with the final keyword, we can’t change its value again. 
- If we attempt to change the value of the final variable, then we will get a compilation error.
- The restriction with the final reference variable is that we cannot change “what the object is referring to” but we can modify the object itself.
- We must use the final variables only for the assigning values that we want to remain constant throughout the execution of the program.

### 2.2  Final Method in Java
- The Method with Final Keyword cannot be overridden in the subclasses.
- The purpose of creating the final methods is to restrict the unwanted and improper use of method definition while overriding the method.

### 2.3 Final Class in Java
- When we declare a class as final, then we restrict other classes to inherit or extend it.

- [read more](https://techvidvan.com/tutorials/java-final-keyword/)

## 3. Object 
- Instance of class that may contain attributes and methods.

## 4. toString
- toString():  A special method that all objects inherit, 
- that returns a string that "textually represents" an object.
- can be used both implicitly and explicitly

## 5. static
- static modifier. A single copy of a variable/method is created and shared.
- The class "owns" the static member
- If we declare any variable with the static keyword, then it is said to be a static variable.
- When we declare a method as static, we can call this method or access this method without creating an object or instance of the class.
- Declare a class as static; the condition being that the class should be a nested class.
- The nested static class does not require an object of its Outer class. 
- One more restriction with the nested static class is that it cannot access the non-static data members of the Outer class.
