class Demo
{
   public int i, j;

   private Demo()
   {
       System.out.println("Object Cteated");
       this.i = 0;
       this.j = 0;
   }
}

class Program971
{
    public static void main(String A[]) 
    {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
    }
}