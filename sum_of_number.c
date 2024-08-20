// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int num=1235;
    int sum=0;
    while(num)
    {
        int ld=num%10;
        num=num/10;
        sum=sum+ld;
    }
    printf("%d",sum);

    return 0;
}