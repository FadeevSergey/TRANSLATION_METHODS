#include <stdio.h>
#include <stdbool.h>

int main()
{
    const int h = 10;
    const int w = 10;
    int i = 1;
    while(i <= h)
    {
        int j = 1;
        while(j <= w)
        {
            const int __temp_print_var1546908073 = (i - 1) * 10 + j;
            printf("%d\n", __temp_print_var1546908073);
            j = j + 1;
        }
        i = i + 1;
    }
}

