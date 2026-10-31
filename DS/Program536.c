// Imput: 5678
// 
#include<stdio.h>

int Summation(int iNo)
{
  int iDigit = 0;
  static int iSum = 0;

  if(iNo != 0)
  {
    iDigit = iNo % 10;
    iSum = iSum + iDigit;
    Summation(iNo/10);
    printf("%d \n",iDigit);
  } 

  return iSum;
}

int main()
{
  int iValue = 0, iRet = 0;

  printf("Enter Number : \n");
  scanf("%d",&iValue);

  iRet = Summation(iValue);

  printf(" Summation is : %d\n",iRet);

    return 0;
}
