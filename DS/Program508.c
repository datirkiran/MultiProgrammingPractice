#include<stdio.h>

void Display()
{
  auto int i = 0;  // storage class auto

  i = 1;
  if(i <= 4)
  {
    printf("Jay Ganesh...\n");
    i++;
    Display();
  }  
} 

int main()
{
    Display();

    return 0;
}