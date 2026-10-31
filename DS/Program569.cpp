#include<iostream>
using namespace std;

class Searching
{
    private:
        int Arr;
        int iSize;

    public:
        Searching(int iNo);
        ~Searching(); 
        
        void Accept();
        void Display();

        bool LinearSearch(int iNo);
        bool BiDirectionalSearch(int iNo);
};

Searching::Searching(int iNo)
{
    iSize = iNo;
    Arr = new int[iSize];
}

Searching::~Searching()
{
    delete []Arr;
}

void Searching::Accept()
{
    int i = 0;

    cout<<"Enter the element :\n";

    for(i = 0; i < iSize; i++)
    {
        cin>>Arr[i];
    }

}

void Searching::Accept()
{
    int i = 0;

    cout<<"Enter the element :\n";

    for(i = 0; i < iSize; i++)
    {
        cout<<Arr[i]<<"\n";
    }
}

bool Searching::LinearSearch(int iNo)
{
    bool bFlag = false;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] == iNo)
        {
            bFlag = true;
            break;
        }
    }
}

bool Searching::BiDirectionalSearch(int iNo)
{
    int iStart = 0, iEnd = 0;
    bool bFlag = false;

    iStart = 0;
    iEnd = iSize - 1;

    while (iStart <=  iEnd)   
    {
        if(Arr[iStart] == iNo || Arr[iEnd] == iNo)
        {

        }

        iStart++;
        iEnd--;
    }
    return iFlag;
    
}

int main()
{
  
    Searching sobj(5);

    sobj.Accept();
    sobj.Display();

    if(sobj.LinearSearch(30)== true)
    {
        cout<<"Element is Present\n";
    }
    else
    {
        cout<<""
    }
    

    return 0;
}