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



| Array                                                                                                                                     | ArrayList                                                                                                                                                       |
| ---------------------------------------------------------                                                                                 | ---------------------------------------------------------                                                                                                       |
|  Length of Array is static that means one cannot change its length that has been already defined                                          | ArrayList uses the size() method to compute the size of the elements. Also, it is dynamic,                                                                      |
|  The length of the elements in the array is static or  requires more memory to store the elements and less time to iterate the elements.  | ArrayList requires more memory to store the elements as well as more time to iterate.                                                                           |
|  Array does not allow generics, though multidimensional in nature.                                                                        | ArraList enables the use of generic and single dimensional in nature.                                                                                           |
|  In the array, giving references to objects or elements  depends upon the type of array such as primitive type or object type.            | In arrayList, we can convert the primitive int data type into an Integer object with the help of commands such as `arraylist.add(1)`                            |
|  Functions such as indexOf() and remove() are not supported by Arrays in Java                                                             | Operations such as indexOf(), remove() are supported by ArrayList in Java                                                                                       |
|                                                                                                                                           | In ArrayList, the actual objects or elements are never stored at contiguous locations whereas their References can be stored at contiguous locations.           |