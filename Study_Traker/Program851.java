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
class Program851
{
    public static void main(String A[]) throws Exception 
    {
        LocalDate lobj = LocalDate.now();

        StudyLog s1 = new StudyLog(lobj, "C Programming", 4.5, "REvision of Pointer");
        StudyLog s2 = new StudyLog(lobj, "C++ Programming", 4.5, "REvision of Pointer");
        StudyLog s3 = new StudyLog(lobj, "Java Programming", 4.5, "REvision of Pointer");
        StudyLog s4 = new StudyLog(lobj, "Java Programming", 4.5, "REvision of Pointer");

        ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

        Database.add(s1);
        Database.add(s2);
        Database.add(s3);
        Database.add(s4);


        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        Database.clear();
        Database = null;

        System.gc();
    } 

    
}
