#include<iostream>
using namespace std;

class Demo
{
    public:
    int x,y;
    
    Demo()
    {
        cout<<"Inside Demo constructor\n";
        x = 10;
        y = 20;
    }
    ~Demo()
    {
        cout<<"Inside Demo Destructor\n";
    }
    void Fun()
    {
        cout<<"Inside Fun of Demo\n";
    }
};

class Hello 
{
    public:
        int a,b,c;
        Hello()
        {
            cout<<"Inside Hello Constructor\n";
            a = 30;
            b = 40;
        }
        ~Hello()
        {
            cout<<"Inside Hello Destructor\n";
        }
        void gun()
        {
            cout<<"Inside gun of Hello\n";
        }
};

class Marvellous : public Hello, public Demo
{
    public:
        int p;
        
        Marvellous()
        {
            cout<<"Inside Constructor of Marvellous\n";
            p = 60;
        }
        ~Marvellous()
        {
            cout<<"Inside Destructor of Marvellous\n";
        }
        void sun()
        {
            cout<<"Inside sun of Marvellous\n";
        }
};

int main()
{
    Marvellous mobj;

    cout<<sizeof(mobj)<<"\n";

    mobj.Fun();
    mobj.gun();
    mobj.sun();


    return 0;
}