import java.util.*;

class Program786
{
    public static void main(String A[]) 
    {
        // Jagged Array
        int Arr[][] ={{10,20,30},{40,50,60},{70,80,90,100},{11,21}};
        
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }
            System.out.println();
        }



    }
}