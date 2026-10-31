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
class Program849
{
    public static void main(String A[]) throws Exception 
    {
        LocalDate lobj = LocalDate.now();

        ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

        StudyLog sobj1 = new StudyLog(lobj, "C Programming", 3.5, "Pointer in C"); 
        StudyLog sobj2 = new StudyLog(lobj, "C++ Programming", 3.5, "Pointer in C"); 
        StudyLog sobj3 = new StudyLog(lobj, "Java Programming", 3.5, "Pointer in C"); 

        Database.add(sobj3);
        Database.add(sobj2);
        Database.add(sobj1);

    
      
    }
}
