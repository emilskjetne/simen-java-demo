package skjetne.simendemo;

public class Grade {

    //This is a public variable. You just need to type grade.publicGrade to access it.
    public int publicGrade;

    //This is a private variable. You need to use a getter to access it outside the class.
    //You need a setter to change it outside the class
    //These can be used to protect the data from being changed by accident
    //Or keep a variable for internal use only
    private int privateGrade;

    //This is a constructor
    //It's a method that is called when you create a new object of the class with values
    public Grade(int grade){
        publicGrade = grade;
        privateGrade = grade;
    }

    //This is an empty constructor
    //Often used to make an object you can modify later
    public Grade(){}

    //This is a getter
    public int getPrivateGrade(){
        return privateGrade;
    }

    //This is a setter
    public void setPrivateGrade(int grade){
        privateGrade = grade;
    }

}
