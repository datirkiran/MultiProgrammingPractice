#include<stdio.h>

void Display(int iNo)
{

  if(iNo != 0)
  {
    printf("Jay Ganesh... %d \n",iNo);
    Display(--iNo); 
  }   
} 

int main()
{
  int iValue = 0;

  printf("Enter friquency : \n");
  scanf("%d",&iValue);

    Display(iValue);

    printf("End of Main \n");

    return 0;
}