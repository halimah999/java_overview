

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
