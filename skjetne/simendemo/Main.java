package skjetne.simendemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world! \n Please enter a number: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextLine()){
            String line = scanner.nextLine();

            //Parsing: Transforming one format to another
            //Here someone has done the parsing for us. So we use the Integer.parseInt() method
            //But data parsing is a common task in programming
            int parsedInt = Integer.parseInt(line);

            //Use the Scanner class to parse the data.
            //The difference from the previous example is that class has done all the parsing by itself.
            // But I think the Integer class is usually used if you don't have a parsing method.
            //I think this one just finds the first integer and returns it
            //You can also use the scanner.hasNextInt() to iterate over a string.
            int methodInt = scanner.nextInt();

            //Casting and Object
            //The line 36 is a Type conversion
            //Object is the parent of all classes in Java
            //Therefore I can make an Integer to an Object
            //But to tell the compiler that it's an int we can cast.
            //But I would call this a last resort
            //If the casting fails, you won't be able to use the object as int.
            Object objectInteger = Integer.parseInt(line);
            int castedInt = (int) objectInteger;

            //Type conversion
            //Used to convert related data types
            float floatNumber = parsedInt;
            long longNumber = (long) floatNumber;
            Object objectNumber = longNumber;

            //You can also use var instead of the type
            //But the var will remember the type; you can't change it later
            var varNumber = parsedInt;

/*
            //Using a class
            //Here we create an object
            //Creating and object == instantiating a class
            Grade grade = new Grade();

            //Changin the public variable
            grade.publicGrade = parsedInt;

            //Changing the private variable
            grade.setPrivateGrade(parsedInt);

*/

        }
    }
}

