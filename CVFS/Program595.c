#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{
    write(1,"Jay Ganesh...\n",13);
    
    return 0;
}