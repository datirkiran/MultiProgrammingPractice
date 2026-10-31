import java.util.*;

public class Matrix
{
    protected int Arr [][];
    protected int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol)
    {
        Arr = new int [iRow][iCol];
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
}
