import java.util.*;

class Program835
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        ArrayList <String> aobj = new ArrayList<String>();

        aobj.add("Pune");
        aobj.add("Mumbai");
        aobj.add("Nashik");
        aobj.add("Ahilyanagar");
        aobj.add("Mumbai");
        

        aobj.remove(4);

        for(String str : aobj)
        {
            System.out.println(str);
        }

        aobj.clear();

        System.out.println(aobj);
    }
}
