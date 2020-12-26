#include <stdio.h>
#include <stdbool.h>

int main()
{
    for(int i = 1; i < 3; ++i)
    {
        for(int j = 1; j < 3; ++j)
        {
            for(int k = 1; k < 3; ++k)
            {
                for(int x = 1; x < 3; ++x)
                {
                    for(int y = 1; y < 3; ++y)
                    {
                        const int res = i + j + k + x + y + i * j * k * x * y;
                        const bool fl = res == 6 || res == 8 || res == 11;
                        if(fl)
                        {
                            printf("%d\n", res);
                        }
                        else
                        {
                            const int __temp_print_var1552076111 = res * -1;
                            printf("%d\n", __temp_print_var1552076111);
                        }
                    }
                }
            }
        }
    }
}

