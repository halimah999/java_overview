# section 2

### while loop
executes a block of code as long as a it's condition remains true
### for loop
executes a block of code a limited amount of times
### array
- array used to store multiple value to single variable
- 2D array = an array of arrays such as following code

```
String[][] cars = 	{	
    {"Camaro","Corvette","Silverado"},
    {"Mustang","Ranger","F-150"},
    {"Ferrari","Lambo","Tesla"}
};
```



### String
- String = a reference data type that can store one or more characters
- reference data types have access to useful methods
- some string method:
    - The `length()`: Returns the length of a specified string
    - `equals()`: 
        - Compares two strings. Returns true if the strings are equal, and false if not
        - The String equals() method overrides the equals() method of the Object class.
    - `indexOf()`: Returns the position of the first found occurrence of specified characters in a string
    - `replace()`:	Searches a string for a specified value, and returns a new string where the specified values are replaced
    - `trim()`:	Removes whitespace from both ends of a string
### ArrayList 
- a resizable array. 
- Elements can be added and removed after compilation phase
- store reference data types



| Array                                                                                                                                        | ArrayList                                                                                                                                                       |
| ---------------------------------------------------------                                                                                    | ---------------------------------------------------------                                                                                                       |
|  Length of Array is static that means one cannot change its length that has been already defined                                             | ArrayList uses the size() method to compute the size of the elements. Also, it is dynamic,                                                                      |
|  the length of the elements in the array is static or  requires more memory to store the elements and less time to iterate the elements.     | ArrayList uses the size() method to compute the size of the elements. Also, it is dynamic,                                                                      |