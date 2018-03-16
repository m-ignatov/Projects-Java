using System;
using System.Numerics;

namespace c_sharp_
{
    class Program
    {
        const int MAXN = 10000000;
        static BigInteger[] memo = new BigInteger[MAXN];

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                Console.WriteLine(fibonacci(i).ToString("#,##0"));
            }
        }

        static BigInteger fibonacci(int n)
        {
            if (n == 0 || n == 1) return 1;
            if (memo[n] == 0) memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return memo[n];
        }
    }
}
