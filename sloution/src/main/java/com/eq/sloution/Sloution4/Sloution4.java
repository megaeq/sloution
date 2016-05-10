/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title Sloution4.java
 * @package com.sloution.Sloution4
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-2-22 上午9:47:18
 * @version V1.0  
 */
package com.eq.sloution.Sloution4;

import java.util.ArrayList;
import java.util.List;

/**
 * @className Sloution4
 * @description TODO
 * @author Mega.Yan
 * @date 2016-2-22 上午9:47:18
 */
public class Sloution4
{
	public int rangeBitwiseAnd(int m,int n) {
		int result = m;
		for(int i=m+1;i<n+1;i++) {
			if(result==0) {
				break;
			}else {
				result = twoAnd(m,i);
			}
		}
		return result;
	}
	
	public int twoAnd(int m,int n) {
		
		return 0;
	}
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
	}
}
