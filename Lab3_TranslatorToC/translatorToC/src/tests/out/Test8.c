#include <stdio.h>
#include <stdbool.h>

int main()
{
    int number;
    do 
    {
        scanf("%d", &number);
    } while (number < 100);
    int numberOfDiv = 0;
    for(int i = 2; i < number; ++i)
    {
        if(number % i == 0)
        {
            numberOfDiv = numberOfDiv + 1;
        }
    }
    if(numberOfDiv == 0)
    {
        const int __temp_print_var373973695 = 1;
        printf("%d\n", __temp_print_var373973695);
    }
    else
    {
        const int __temp_print_var300659126 = -1;
        printf("%d\n", __temp_print_var300659126);
    }
}

