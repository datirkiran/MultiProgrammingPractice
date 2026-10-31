#include<stdio.h>

int CountCApital(char *str)
{
  int iCount = 0;

  while (*str != '\0')
  {
    if(*str >= 'A' && *str <= 'Z' )
    {
    iCount++;
    str++;
    }
  }

  return iCount;
  
}

int main()
{
  char Arr[20] = {'\0'};
  int iRet = 0;

  printf("Enter string : \n");
  scanf("%[^'\n']s",Arr);
  
  iRet = CountCApital(Arr);

  printf("%d\n", iRet);

  return 0;
}
