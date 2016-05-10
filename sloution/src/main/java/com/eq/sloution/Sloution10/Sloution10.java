package com.eq.sloution.Sloution10;

public class Sloution10
{
	// 1:1 2:2 3:3 4:4 5:6 6:9 7:12 8:16 9:27 10:36  
	//a^b b=a
	public static long integerBreak(long n) {
        double mi = Math.sqrt(n);
        //System.out.println(mi);
        if(mi - (long)mi>0) {
        	long x1 = (long)mi;
        	long x2 = (long) mi+1;
        	long product = 0;
        	for(int i=0;i<n/x1;i++) {
        		//i*x1 +j*x2 = n ; j = (n-(i+1)*x1)/x2
        		double j = ((double)n-(i+1)*x1)/x2;
        		if(j-(int)j>0) {
        			continue;
        		} else {
        			long product2 = (long)(Math.pow(x1, (i+1))*Math.pow(x2, j));
        			if(product2> product) {
        				product = product2;
        			}
        		}
        		
        	}
        	return product;
        } else {
        	return (long)Math.pow(mi, mi);
        }
    }
	
	public static void main(String[] args)
	{
		double mi = 3.24;
		for(int i=2;i<100;i++) {
			System.out.println("i:"+i);
			System.out.println("product:"+integerBreak(i));
		}
	}
}
