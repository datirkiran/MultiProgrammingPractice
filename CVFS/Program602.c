#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>
#include<sys/stat.h>

#define BUFFER_SIZE 1024

void DisplayFileInfromation(char FileName[])
{
    struct stat sobj;

    stat(FileName,&sobj);

    printf("File Name : %s\n",FileName);
    printf("Inode Number : %lu\n",sobj.st_ino);
    printf("File Size : %ld\n",sobj.st_size);
    printf("Block Alloctate : %ld\n",sobj.st_blocks);

}

int main()
{
    char Fname[30] = {'\0'};

    printf("Enter the file Name :\n");
    scanf("%[^'\n']s",Fname);

    DisplayFileInfromation(Fname);

    return 0;
}