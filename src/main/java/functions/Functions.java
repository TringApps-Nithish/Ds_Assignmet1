package functions;

import assignvalue.AssignValue;

import java.util.*;
import java.util.logging.*;

public class Functions extends AssignValue
{
    ArrayList<Functions> studentList = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private final Logger l = Logger.getLogger("SwitchCall");

    public Functions(String name, int age, double gpa)
    {
        super(name,age,gpa);
    }

    public void run()
    {
        int choice;
        l.info(" ----- Student Details -----  \n Enter Name  : ");
        studentName = sc.next();
        l.info(" Enter Age  : ");
        studentAge = sc.nextInt();
        l.info(" Enter GPA :");
        studentGPA = sc.nextDouble();
        Functions newStudent = new Functions(studentName, studentAge, studentGPA);
        studentList.add(newStudent);
        l.info("\n 1 -> Add New Student\n 2 -> Display Students Details (Rank Wise)\n 3 -> Exit ");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> run();
            case 2 ->
            {
                l.log(Level.INFO,()->"Student Detail's in INSERTED order : "+studentList);
                studentList.sort((s1, s2) -> Double.compare(s2.returnGPA(), s1.returnGPA()));
                l.log(Level.INFO,()->"Student Detail's in SORTED order : "+studentList);
            }
            case 3 ->
            {
                l.info("Exiting.....");
                System.exit(0);
            }
            default -> l.info("Invalid Choice .....");
        }

    }

}
