public class LargestSubsetSum
{
int maxSubsetSum(int N)
{
    int sum = 0;
    int LIM = sqrt(N);
 
    // find all divisors which divides 'N'
    for (int i = 1; i <= LIM; i++)
    {
        // if 'i' is divisor of 'N'
        if (N % i == 0)
        {
            // if both divisors are same then add
            // it only once else add both
            if (i == (N / i))
                sum += i;
            else
                sum += (i + N / i);
        }
    }
 
    return sum;
}
 
public static void main(String[] args) throws IOException()
{
      int N = 12;
     getMaximumSumWithLCMN(N);
}
}