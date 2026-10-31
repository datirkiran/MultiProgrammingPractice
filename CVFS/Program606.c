#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void FileCopy(char FileNameSrc[], char FileNameDest[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fdSrc = 0,fdDest = 0;


    fdSrc = open(FileNameSrc, O_RDONLY);
    if(fdSrc == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    fdDest = creat(FileNameDest,0777);
    if(fdSrc == -1)
    {
        printf("Unable to create Destination file\n");
        return;
    }
    

    while ((iRet = read(fdSrc,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i]>=)
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }

    close(fdDest);
}

int main()
{
    char FnameSrc[30] = {'\0'};
    char FnameDest[30] = {'\0'};

    printf("Enter the Source file Name :\n");
    scanf("%[^'\n']s",FnameSrc);

    printf("Enter the Destination file Name :\n");
    scanf(" %[^'\n']s",FnameDest);  

    FileCopy(FnameSrc,FnameDest);

    return 0;
}