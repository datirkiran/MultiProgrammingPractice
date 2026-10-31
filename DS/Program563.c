#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)
struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

// L  D  R
void Inorder(PNODE first)
{
    if(first != NULL)
    {
        Inorder(first->lchild);
        printf("%d\n",first->data);
        Inorder(first->rchild);
    }
}

//  D  L  R
void Preorder(PNODE first)
{
    if(first != NULL)
    {
        printf("%d\n",first->data);
        Preorder(first->lchild);
        Preorder(first->rchild);
    }
}

//  L  R  D
void Postorder(PNODE first)
{
    if(first != NULL)
    {
        Postorder(first->lchild);
        Postorder(first->rchild);
        printf("%d\n",first->data);
    }
}

void Inesrt(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->lchild = NULL;
    newn->rchild = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while (1)
        {
            if(iNo > temp->data)
            {
                if(temp->rchild == NULL)
                {
                    temp->rchild = newn;
                    break;
                }
                temp = temp->rchild;
            }
            else if (iNo < temp->data)
            {
                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    break;
                }
                temp = temp->lchild;
            }
            else if(iNo == temp->data)
            {
                printf("Unable to insert data as element is duplicate \n");
                free(newn);
                break;
            }
            
        }
        
    }
}

int Count(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
        iCount++;
        Count(first->lchild);
        Count(first->rchild);
    }
    return iCount;
}

bool Search(PNODE first, int iNo)
{
    bool BFlag = false;

    while (first != NULL)
    {
        if(iNo == first->data)
        {
            BFlag = true;
            break;
        }
        else if (iNo > first->data)
        {
            first = first->rchild;    
        }
        else if (iNo < first->data)
        {
            first = first->lchild;
        }  
    }

    return BFlag;
    
}

int CountLeaf(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
        if(first->lchild == NULL && first->rchild == NULL)
        {
            iCount++;
        }
        CountLeaf(first->lchild);
        CountLeaf(first->rchild);
    }

    return iCount;
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    Inesrt(&head,11);
    Inesrt(&head,5);
    Inesrt(&head,17);
    Inesrt(&head,21);
    Inesrt(&head,4);
    Inesrt(&head,7);
    Inesrt(&head,15);
    
    printf("Inovdre Display \n");
    Inorder(head);

    iRet = Count(head);
    printf("Number of node are : %d\n",iRet);
    if(Search(head,25)== true)
    {
        printf("25 is present in BST\n");
    }
    else
    {
        printf("25 is  not present in BST\n");
    }

    iRet = CountLeaf(head);

    printf("Number of Leaf node is %d\n",iRet);


    return 0;
}
