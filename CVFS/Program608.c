#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

#define ERR_OPEN -1
int CountSmall(char *FileName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0, iCount = 0, i = 0;


    fd = open(FileName, O_RDONLY);
    if(fd == -1)
    {
        return ERR_OPEN;
    }

    while ((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if((Buffer[i] >= 'a') && (Buffer[i] <= 'z'))
            {
                iCount++;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
     close(fd);
    return iCount;

}
int main()
{
    int iRet = 0;
    char Fname[30] = {'\0'};

    printf("Enter the file Name :\n");
    scanf("%[^'\n']s",Fname);

    iRet = CountSmall(Fname);
    if(iRet == ERR_OPEN)
    {
        printf("Unable to Open File\n");
    }
    else
    {
        printf("Number of Small letters are : %d\n", iRet);
    }

    return 0;
}