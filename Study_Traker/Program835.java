import java.util.*;

class Program835
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        ArrayList <Integer> aobj = new ArrayList<Integer>();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(111);
        aobj.add(51);

        aobj.remove(4);

        for(int no : aobj)
        {
            System.out.println(no);
        }

        aobj.clear();

        System.out.println(aobj);
    }
}
