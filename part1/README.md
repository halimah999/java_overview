# Section 1

This section contains basic of coding in java which are variables, Variable Initialization, data types, output, input, Math Class , arithmetic and logic operator, and Conditional flows

### variables :
Variable in Java is a data container that stores the data values during Java program execution

### Variable Initialization
To initialize a variable, you must assign it a valid value.
### data types
Data Types in Java are defined as specifiers that allocate different sizes and types of values that can be stored in the variable or an identifier. Data types in Java can be divided into two parts :
- **Primitive Data Types** :- which include integer, character, boolean, and float
- **Reference Data Types** :- which include classes, arrays and interfaces.
The value and size of each type are shown in figure 1
<br>
<br>
<div align="center" >
    <img src="../../JavaCoding/3.png" style="display:block;text-align:center" width="600" height="300"/>
</div>
<br><br>
The comparing between 2 types is shown in figure 2
<br>
<br>
<div align="center" >
    <img src="../../JavaCoding/4.png" style="display:block;text-align:center" width="600" height="300"/>
</div>


### output
- `print()` - It prints string inside the quotes.
- `println()` - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
- `printf()` - It provides string formatting

### input
Java provides different ways to get input from the user. one of the is to get input from user using the object of `Scanner` class.

```
// create an object of Scanner
Scanner input = new Scanner(System.in);
// take input from the user
int number = input.nextInt();
```
### Math Class
ava Math class provides several methods to work on math calculations like min(), max(), avg(), sin(), cos(), tan(), round(), ceil(), floor(), abs() 
### Conditional flows
- if statement = performs a block of code  if it's condition evaluates to be true
- switch = statement that allows a variable to be tested for equality against a list of values

### logical operators 
used to connect two or more expressions
		
- && = (AND) both conditions must be true
- || = (OR) either condition must be true
- ! = (NOT) reverses boolean value of condition







