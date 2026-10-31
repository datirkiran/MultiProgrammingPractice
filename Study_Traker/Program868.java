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
    {
        System.out.println("---------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to Display - Database is Empty");
            System.out.println("---------------------------------------------");

            return;
        }

        System.out.println("---------------------------------------------");
        System.out.println("----Log Report of Marvellous Study Traker----");
        System.out.println("---------------------------------------------");
        for(StudyLog s : Database)
        {
            System.out.println(s);
        }
        
        System.out.println("---------------------------------------------");

    }

    public void ExportToCSV()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name that You Want to Create For Csv File");
        String FileName = sobj.nextLine();

        System.out.println("---------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to Export - Database is Empty");
            System.out.println("---------------------------------------------");

            return;
        }

        try(FileWriter fwobj = new FileWriter(FileName))
        {
            fwobj.write("Date,Subjet,Duretion, Description\n");

            for(StudyLog s : Database)
            {
                fwobj.write(s.getDate()+","+
                            s.getSubject()+","+
                            s.getDuretion()+","+
                            s.getDescription()+"\n");

                System.out.println("Data gets exported toCsv Succesfully");   
                System.out.println("---------------------------------------------");         
            }
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);     
        }

    }

    public void SummaryByDate()
    {
       System.out.println("---------------------------------------------");
       System.out.println("------Summary by Date form Study Traker-------");
       System.out.println("---------------------------------------------");

       TreeMap <LocalDate,Double> tobj = new TreeMap<LocalDate,Double>();

       LocalDate lobj = null;
       double d = 0.0, old = 0.0;
       
       for(StudyLog s : Database)
       {
          lobj = s.getDate();
          d = s.getDuretion();  
       }

       if(tobj.containsKey(lobj))
       {
          old = tobj.get(lobj);
          tobj.put(lobj, d+old); 
       }
       else
       {
          tobj.put(lobj, d);
       }

       // Display Detail as per date
       for(LocalDate l : tobj.keySet())
       {
          System.out.println("Data : "+l+"Total Syudy Duretion : "+tobj.get(l));
       }

       System.out.println("---------------------------------------------");

    }

    public void SummaryBySubject()
    {
       System.out.println("---------------------------------------------");
       System.out.println("----Summary by Subject form Study Traker-----");
       System.out.println("---------------------------------------------");

       TreeMap <String,String> tobj = new TreeMap<String,String>();

       String sobj = null;
       String d = "\0";
       String old = "\0";
       
       for(StudyLog s : Database)
       {
          sobj = s.getSubject();
          d = s.getDescription();  
       }

       if(tobj.containsKey(sobj))
       {
          old = tobj.get(sobj);
          tobj.put(sobj, d+old); 
       }
       else
       {
          tobj.put(sobj, d);
       }

       // Display Detail as per Subject
       for(String str : tobj.keySet())
       {
          System.out.println("Subject : "+str+"Total Syudy Duretion : "+tobj.get(str));
       }

       System.out.println("---------------------------------------------");

    }

}

class Program868
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
