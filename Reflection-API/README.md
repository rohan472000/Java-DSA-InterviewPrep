Hello everyone! You might be familiar with the terms “setters” and “getters”. If you’ve ever used an IDE, it’s easy to generate these methods for a data member by simply right-clicking and selecting the “generate” option. However, have you ever wondered how this process actually works? What’s the magic behind the scenes that allows us to avoid writing repetitive code for each member’s setter and getter? In this document, we’ll create our own setter and getter generator using the Java programming language.


Note:- You will need to have prior knowledge of file handling in Java and a basic understanding of how to take input as command-line arguments.

You can ask the user whether they want to generate a constructor for the class or not.

We will use the power of reflection. Reflection is a mechanism in Java that allows you to inspect and manipulate classes, methods, fields, and other elements of the language’s type system at runtime.

# How to compile and run?

## For compilation:- 
`javac SetterGetterGenerator.java`

## For execution:-
`java SetterGetterGenerator class_name` OR `java SetterGetterGenerator class_name “constructor =true/false”`

For  detailed  explanation visit: https://medium.com/@rsssaket99/setter-getter-generator-f7bb2b8a67d2

Hope you liked it.