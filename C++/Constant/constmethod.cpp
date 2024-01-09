#include<iostream>
using namespace std;

class Demo
{
    public:
        int i;
        int j;
        int k;

        Demo(int a, int b, int c) : j(b), k(c)
        {
            i = a;
            j = b;
            k = c;
        }
        void fun()
        {
            i++;
            j++;
            k++;
        }
        void gun(int x, const int y) const
        {
            int no1 = 10;
            const int no2 = 20;

            x++;
            //y++;
            //no1++;
            //no2++;
            //i++;
            //j++;
            //k++;
        }
};

int main()
{
    Demo obj(11,21,51);

    obj.fun();
    obj.gun(11,21);

    const Demo obj2(41,12,13);
    //obj2.fun();
    obj2.gun(61,101);

    return 0;
}