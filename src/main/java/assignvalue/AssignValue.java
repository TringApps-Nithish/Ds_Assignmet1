package assignvalue;

public class AssignValue
{
    protected String studentName;
    protected int studentAge;
    protected double studentGPA;
    protected AssignValue(String name, int age , double gpa)
    {
        studentName = name;
        studentAge = age;
        studentGPA = gpa;
    }

    protected double returnGPA()
    {
        return studentGPA;
    }

    public String toString() {
        return  " Name : " + studentName + " Age : " + studentAge + " GPA : " + studentGPA ;
    }
}
