import java.util.*;
class Matrix
{
    private int Arr [][];
    private int iRow;
    private int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("");

        this.iRow = iRow;
        this.iCol = iCol;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element of Matrix");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j< iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("element of Matrix are :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
               System.out.print(Arr[i][j]+"/t");

            }
            System.out.println();
        }
    }
}
class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int SummationAll()
    {
        int i = 0, j = 0, iSum = 0;


        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
               iSum = iSum + Arr[i][j];

            }
            
        }
        return iSum;
    }
}
class Program794
{
    public static void main(String A[]) 
    {
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter the Number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the Number of coluns : ");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();

        System.out.println();

        mobj = null;
        System.gc();
    }
}