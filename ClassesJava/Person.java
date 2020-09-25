import java.util.*;

public class Person
{
    //Instance Variables of the Class
    String name;
    int age;
    int height;

    //Default Constructor No Parameters
    public Person()
    {
        this.name = "";
        this.age = 0;
        this.height = 0;
    }

    //Constructor with Parameters
    public Person(String name, int age, int height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    
}
