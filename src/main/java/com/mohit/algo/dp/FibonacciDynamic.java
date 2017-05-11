package com.mohit.algo.dp;

class FibonacciDynamic
{
   ///Linear Fibonacci
	int fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+1];
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
    
	
	///Dynamic fibonacci
	int fibonacci( int[] f , int n){
		
		if(f[n]<0)
		{ if(n==1||n==2)
			f[n]=1;
		else 
		 return f[n]=fibonacci(f,n-1)+fibonacci(f,n-2);
		}
	return f[n];
		
		
		
	}
    
    
      
    public static void main (String args[])
    {
    	FibonacciDynamic fd= new FibonacciDynamic();
        int n = 9;
        int f[]=new int[50];
        for(int i=0;i<50;i++)
        	f[i]=-1;
        
        System.out.println(fd.fibonacci(f,12));
        System.out.println(fd.fib(15));
    }
}
