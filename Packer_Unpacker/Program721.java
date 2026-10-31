class Program721
{
    public static void main(String A[]) 
     {
        String header = "A.txt 10";  

        System.out.println("Actual length of header : " + header.length());   // 8

        System.out.println("Number of whitespace we need : " + (100 - header.length()));

        int size = 100 - header.length();
        
        for(int i = 1; i <= size; i++)
        {
            header = header + " ";
            System.out.println(i);
        }
        System.out.println("Modified header length : " + header.length());   // 100
    }
}
