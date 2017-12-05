Public clas ConsecutiveSum
{

static int  consecutive(long num)
{
    int start = 1, end = 1;
    int sum = 1;
 
    while (start <= N/2)
    {
        if (sum < N)
        {
            end += 1;
            sum += end;
        }
        else if (sum > N)
        {
            sum -= start;
            start += 1;
        }
        else if (sum == N)
        {
            for (int i = start; i <= end; ++i)
                System.out.println(i);
 
            System.out.println("\n");
            sum -= start;
            start += 1;
        }
    }
}
 

int main()
{
    consecutive(125);
    return 0;
}
}