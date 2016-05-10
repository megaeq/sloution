/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title Sloution7.java
 * @package com.sloution.Sloution7
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-4-18 上午8:45:52
 * @version V1.0  
 */
package com.eq.sloution.Sloution7;

/**
 * @className Sloution7
 * @description TODO
 * @author Mega.Yan
 * @date 2016-4-18 上午8:45:52
 */
public class Sloution7
{
	/**
	 * 
	 * @title isPowerOfFour
	 * @description 判断num是否为4的幂
	 * @param num
	 * @return
	 * @return boolean
	 * @throws
	 */
	public static boolean isPowerOfFour(int num) {
		int m = 4;
		boolean isPower = true;
		for(int i=0;;i++) {
			if(m==num) {
				break;
			} else if(m>num) {
				isPower = false;
				break;
			} else {
				m*=4;
			}
		}
        return isPower;
    }
	
	
	
	public static void main(String[] args)
	{
		System.out.println(isPowerOfFour(4));
		System.out.println(isPowerOfFour(8));
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(5));
		System.out.println(isPowerOfFour(32));
	}
}
