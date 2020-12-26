#include <stdio.h>
#include <stdbool.h>

int main()
{
    int __temp_var_number__;
    scanf("%d", &__temp_var_number__);
    const int number = __temp_var_number__;
    int countOfDiv = 0;
    int mulOfNonDiv = 1;
    for(int i = 1; i < number + 1; ++i)
    {
        if(number % i == 0)
        {
            printf("%d\n", i);
            countOfDiv = countOfDiv + 1;
        }
        else
        {
            mulOfNonDiv = (mulOfNonDiv * i) % 1000000 + 1;
        }
    }
    printf("%d\n", countOfDiv);
    printf("%d\n", mulOfNonDiv);
}

