#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void Display(PNODE first)
{
    if(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
        Display(first);
    }
}

int Count(PNODE first)
{
    static int iCount = 0;

    if (first != 0)
    {
        iCount++;
        first = first ->next;
        Count(first);
    }
    
    return iCount;
}

void InsertFrist(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)   // LL is empty
    {
        *first = newn;
    }
    else                 // LL contains atleast 1 node
    {
        newn->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first, int iNo)
{}

void InsertAtPos(PPNODE first, int iNo, int Pos)
{}

void DeleteFrist(PPNODE first)
{}

void DeleteLast(PPNODE first)
{}

void DeleteAtPos(PPNODE first, int Pos)
{}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFrist(&head,101);
    InsertFrist(&head,51);
    InsertFrist(&head,21);
    InsertFrist(&head,11);

    Display(head);
    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);

    return 0;
}
