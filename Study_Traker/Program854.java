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

class Program854
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();
    }   
}
