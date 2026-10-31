class Program722
{
    public static void main(String A[]) 
     {
        String header = "Hello.txt 1078";  

        System.out.println("Actual length of header : " + header.length());   // 8

        System.out.println("Number of whitespace we need : " + (100 - header.length()));

        int size = 100 - header.length();
        
        for(int i = 1; i <= size; i++)
        {
            header = header + " ";
        }
        System.out.println("Modified header length : " + header.length());   // 100
        System.out.println("Modified header : " + header);
    }
}
