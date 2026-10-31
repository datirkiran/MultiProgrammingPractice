#include<stdio.h>

// Recursion
void Display()
{
  printf("Jay Ganesh...\n"); 

  Display();
}

int main()
{
  Display();

  return 0;
}