import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Discription;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Discription = d;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject+ " | " + Duration+ " | " + Discription;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuretion()
    {
        return this.Duration;
    }
    public String getDescription()
    {
       return this.Discription;
    }
}

class StudyTracker
{
    public ArrayList <StudyLog> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyLog>();
    }
}

class Program856
{
    public static void main(String A[])
    {
        int iChoice = 0;
        StudyTracker stobj = new StudyTracker();
        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("------Welcome To Marvellous Study Traker------");
        System.out.println("---------------------------------------------");

        // Shell to interact end user
        do
        {
            System.out.println("---------------------------------------------");
            System.out.println("Please Select Appropriate Option : ");
            System.out.println("---------------------------------------------");

            System.out.println(" 1 : Insert New StudyLog");
            System.out.println(" 2 : View  All StudyLog");
            System.out.println(" 3 : Summary of Study Log by Date");
            System.out.println(" 4 : Exprot study log to CSV");
            System.out.println(" 3 : Summary of Study Log by Date");
            System.out.println(" 2 : Exit the Application");

            System.out.println("---------------------------------------------");

            iChoice =sobj.nextInt();
        

        }while(iChoice != 6);

        System.out.println("---------------------------------------------");
        System.out.println("--Thank You For Using Marvellous Study Traker--");
        System.out.println("---------------------------------------------");
    }   
}
