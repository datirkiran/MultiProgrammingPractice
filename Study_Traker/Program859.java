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

    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("-------Enter The Details Of Your Study--------");
        System.out.println("---------------------------------------------");

        LocalDate lobj = LocalDate.now();

        System.out.println("We Are Entering the Date As : "+lobj);

        System.out.println("Enter the Subject like C/C++/JAva etc");
        String sub = sobj.nextLine();

        System.out.println(" Enter the Time period od Study");
        String dur = sobj.nextLine();

        //Issue Resulved
        sobj.nextLine();

        System.out.println(" Enter the Time period od Study");
        String dis = sobj.nextLine();

        StudyLog studyobj = new StudyLog(lobj, sub, 0, dur);

        Database.add(studyobj);

        System.out.println("Study log Get Inserted Succesfully");

        System.out.println("---------------------------------------------");
    }

    public void DisplauLog()
    {}

    public void ExportToCSV()
    {}

    public void SummaryByDate()
    {}

    public void SummaryBySubject()
    {}

}

class Program859
{
    public static void main(String A[])
    {
        int iChoice = 0;
        StudyTracker stobj = new StudyTracker();
        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("------Welcome To Marvellous Study Traker------");
        System.out.println("---------------------------------------------");

        do
        {
            System.out.println("---------------------------------------------");
            System.out.println("Please Select Appropriate Option : ");
            System.out.println("---------------------------------------------");

            System.out.println(" 1 : Insert New StudyLog");
            System.out.println(" 2 : View  All StudyLog");
            System.out.println(" 3 : Summary of Study Log by Date");
            System.out.println(" 4 : Exprot study log to CSV");
            System.out.println(" 5 : Summary of Study Log by Date");
            System.out.println(" 6 : Exit the Application");

            System.out.println("---------------------------------------------");

            iChoice =sobj.nextInt();

            switch (iChoice) 
            {
                // Insert New Log
                case 1:
                    stobj.InsertLog();
                    
                    break;
                // View all Study log
                case 2:
                    stobj.DisplauLog();
                    
                    break;
            
                // Export to CSV
                case 3:
                    stobj.ExportToCSV();
                    break;
            
                // Summary by date
                case 4:
                    stobj.SummaryByDate();
                    break;
            
                // Summary by Subject
                case 5:
                    stobj.SummaryBySubject();
                    break;
            
                // 
                case 6:
                    
                    break;
            
            
                default:
                    System.out.println("Please Enter Valid Option");
                    break;
            }
        

        }while(iChoice != 6);

        System.out.println("---------------------------------------------");
        System.out.println("--Thank You For Using Marvellous Study Traker--");
        System.out.println("---------------------------------------------");
    }  //End Of Main 
} // End Of Class
