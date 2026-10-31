import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Discription;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Discription = d;
    }

    // Override
    public String toString()
    {
        return Date + "|" + Subject+ "|" + Duration+ "|" + Discription;
    }
}
class Program843
{
    public static void main(String A[]) throws Exception 
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj, "C Programming", 3.5, "Pointer in C"); 

        StudyLog sobj2 = new StudyLog(lobj, "Java Programming", 4.5, "Inheritance in Java"); 

        System.out.println(sobj1);
        System.out.println(sobj2);

      
    }
}
