public class Teacher extends Person
{
    String school;
    String major;
    int yearsTaught;

    public Teacher()
    {
        this.name = "";
        this.height = 0;
        this.age = 0;
        this.yearsTaught = 0;
        this.school = "";
        this.major = "";
    }

    public Teacher(String name, String school, String major, int age, int height, int yearsTaught)
    {
        super(name, age, height);
        this.school = school;
        this.major = major;
        this.yearsTaught = yearsTaught;
    }

    public String getSchool()
    {
        return school;
    }

    public String getMajor()
    {
        return major;
    }

    public int getYearsTaught()
    {
        return yearsTaught;
    }
}
