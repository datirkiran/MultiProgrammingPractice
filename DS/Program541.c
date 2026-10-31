#include<stdio.h>

void Display(int Arr[], int iSize)
{
   static int i = 0;

  while( i < iSize)
  {
    i++;
    Display(Arr, iSize);
    printf("%d\n",Arr[i]);   // Invalied Data
  }
}

int main()
{
  int Brr[] = {10,20,30,40,50};

  Display(Brr, 5);

  return 0;
}
