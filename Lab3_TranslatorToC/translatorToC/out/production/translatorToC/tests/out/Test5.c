#include <stdio.h>
#include <stdbool.h>

int main()
{
    int first;
    scanf("%d", &first);
    int second;
    scanf("%d", &second);
    int temp;
    while(second != 0)
    {
        first = first % second;
        temp = first;
        first = second;
        second = temp;
    }
    printf("%d\n", first);
}

