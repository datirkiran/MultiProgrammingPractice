// 4
// 1 + 2 + 3 + 4 = 10

#include<stdio.h>

int Summation(int iNo)
{
  int iSum = 0;
  int i = 0;

  for(i= 1; i <= iNo; i++)
  {
    iSum = iSum + i;
  }

  return iSum;

}

int main()
{
  int iValue = 0, iRet = 0;

  printf("Enter friquency : \n");
  scanf("%d",&iValue);

    Summation(iValue);

    printf("Sammation is : %d \n",iRet);

    return 0;
}