# java_overview

## Introdunction
 - Java is one of Top 3 most popular language
 - it is Extermely flexible (business,web app, android app,games)
 - The JDK is the development platform for building Java applications.

### what is a JDK?
- Java development kit contians developers tools
- JDK incloding JRE(Java Runtime Envirment)
- JRE contains a library and toolkits 
- java virtual machine(jvm) (run java programs)
- jvm translate code to machine code
<img src="https://i1.wp.com/www.softwaretestingmaterial.com/wp-content/uploads/2018/03/JDK-JRE-JVM-Illustration.png?resize=461%2C440&ssl=1" style="display:block;text-align: center;" width="400" height="400"/>

### what is the difference between java and c++?
Before talking about difference between c++ and Java I will talk about plugin and embedded system
> 1. **embedded system:** 
>
> - An embedded system is a system in which the computer (generally a microcontroller or microprocessor) is included as an integral part of the system.<br>
> - Embedded system is controllers that is handled using real-time operating systems. it is  embedded in different devices such as smartphones, watches, cars, etc. to make them "smarter".<br>
> - embedded systems programming that is quite different than traditional programming as it requires low-level system access and as low usage of resources as possible.

> 2. **plugins system:** 
>-  is a software component that adds a specific feature to an existing computer program. When a program supports plug-ins, it enables customization.
>-  Applications may support plug-ins to:
>    - enable third-party developers to extend an application
>    - support easily adding new features
>    - reduce the size of an application by not loading unused features
>    - separate source code from an application because of incompatible software licenses.

> - C and C++ are a bit lower level and more complex to use, they are generally only popular in systems programming or anywhere where high levels of optimization are important.
> - When it comes to enterprise server-side software, Java is the most popular and widely used language by a wide margin. 
> - Most of Cisco's UC apps are built on Java and products that support plugins or embedded code (like UCCX or CVP) often use Java as the plugin or embeddedable language.
> - also there is  the java-based JTAPI library for low-level call control.

## java heap and stack
> ### Stack 
> - Stack Memory in Java is used for static memory allocation and the execution of a thread.
> - It contains primitive values that are specific to a method and references to objects referred from the method that are in a heap.
> - Access to this memory is in Last-In-First-Out (LIFO) order. 
> - Whenever we call a new method, a new block is created on top of the stack
> - When the method finishes execution, its corresponding stack frame is flushed

> ### key features
> - grows and shrinks as new methods are called and returned, respectively.
> - Variables inside the stack exist only as long as the method that created them is running.
> - t's automatically allocated and deallocated when the method finishes execution.
> - If this memory is full, Java throws java.lang.StackOverFlowError.
> - Access to this memory is fast when compared to heap memory.
> - This memory is threadsafe, as each thread operates in its own stack





 

