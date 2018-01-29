public class Lab2t
{

    public static boolean isPrime(int n)
    {
	
        int stored[] = new int[9591];
	int x = 0;

        for (int i=2; i<=(n/2); i++)
	{
            if ((n%i) == 0)
	    {
                return false;
	    }
	}
        stored[x] = n;
	x++;
        return true;
    }

    public static void main(String args[])
    {
        int c=0;
	long start, end, mstime;

	final int LIMIT=100000; // 1M took ~800 secs. 100000 took 2.236, 1.169 secs

	start = System.currentTimeMillis();

	for (int i=2; i<LIMIT; i++)
	{
            if (isPrime(i))
	    {
                System.out.println(i);
		c++;
	    }
	}

	end = System.currentTimeMillis();

	mstime = end - start;

	System.out.println("#primes = " + c + ", mstime = " + mstime);
    }
}
