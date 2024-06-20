package skjetne.simendemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import skjetne.simendemo.model.Grade;

public class Main {

    public static void main(String[] args) throws IOException {

        // \n means new line
        System.out.println("Hello world!\nPlease enter your grade: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        //snipersmurf
        //Parsing: Transforming one format to another
        //Here someone has done the parsing for us. So we use the Integer.parseInt() method
        //But data parsing is a common task in programming
        int parsedInt = Integer.parseInt(line);


        //Casting and Object
        //The line 33 is a Type conversion
        //Object is the parent of all classes in Java
        //Therefore I can make an Integer and int to an Object
        //But to tell the compiler that it's an int we can cast.
        //But I would call this a last resort
        //If the casting fails, you won't be able to use the object as int.
        Object objectInteger = Integer.parseInt(line);
        int castedInt = (int) objectInteger;

        System.out.println("cast: " + castedInt);

        //Type conversion
        //Used to convert related data types
        float floatNumber = parsedInt;
        long longNumber = (long) floatNumber;
        Object objectNumber = longNumber;

        //You can also use var instead of the type
        //But the var will remember the type; you can't change it later
        var varNumber = parsedInt;


        //Using a class
        //Here we create an object
        //Creating and object == instantiating a class
        Grade grade = new Grade();

        //Changin the public variable
        grade.publicGrade = parsedInt;

        //Changing the private variable
        grade.setPrivateGrade(parsedInt);

        //Plan here is to check if our variables is what we expect
        if(parsedInt > 6 || parsedInt < 1){
            System.out.println("Not a real grade");
            System.exit(0);
        }

        //Now that we know it´s a number and is within the grade range 1-6,
        //we dont have to think about it in the code after the check.
        if(parsedInt > 3)
            System.out.println("You passed");
        else if(parsedInt <= 3)
            System.out.println("You ");

        System.exit(0);
    }
}

