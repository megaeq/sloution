/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title Sloution2.java
 * @package com.sloution.Sloution2
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-28 下午3:27:00
 * @version V1.0  
 */
package com.eq.sloution.Sloution2;

/**
 * @className Sloution2
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-28 下午3:27:00
 */
public class Sloution2
{
	//亿、兆、京、垓、秭、穰、沟、涧、正、载
	private String[] unit={"","万","亿","兆","京","垓","秭","穰","沟","涧","正","载","极","恒河沙","阿僧祗","那由他","不可思议","无量","大数"};
	private String[] baseUnit = {"","十","百","千"};
	private String[] baseWord = {"零","一","二","三","四","五","六","七","八","九"};
	private String toWord(String str) {
		int length = str.length();
		String[] strs = new String[length/4+1];
		String result = "";
		for(int i=0;i<(length%4==0?length/4:length/4+1);i++) {
			int interval = length%4==0?4:length%4;
			if(i==0) {
				strs[i]=str.substring(i*4, i*4+interval);
				result+=baseWord(strs[i],true)+unit[length/4-i];
			} else {
				strs[i]=str.substring((i-1)*4+interval, (i)*4+interval);
				result+=baseWord(strs[i],false)+unit[length/4-i];
			}
		}
		return result;
	}
	
	private String toInteger(String str) {
		return "";
	}
	
	private String baseWord(String str,Boolean isTop) {
		Integer i =Integer.parseInt(str);
		Integer[] is = splitInteger(i);
		String result = "";
		Boolean hasZero = false;
		if(is[3]!=0) {
			result+=baseWord[is[3]]+baseUnit[3];
		} else {
			hasZero = true;
		}
		if(is[2]!=0) {
			if(hasZero) {
				hasZero = false;
				if(!isTop) {
					isTop =false;
					result+=baseWord[0];
				}
			}
			result+=baseWord[is[2]]+baseUnit[2];
		} else {
			hasZero = true;
		}
		if(is[1]!=0) {
			if(hasZero) {
				hasZero = false;
				if(!isTop) {
					isTop =false;
					result+=baseWord[0];
				}
			}
			result+=baseWord[is[1]]+baseUnit[1];
		} else {
			hasZero = true;
		}
		if(is[0]!=0) {
			if(hasZero) {
				hasZero = false;
				if(!isTop) {
					isTop =false;
					result+=baseWord[0];
				}
			}
			result+=baseWord[is[0]]+baseUnit[0];
		} else {
			hasZero = true;
		}
		return result;
	}
	private Integer[] splitInteger(Integer i) {
		Integer[] is = new Integer[4];
		if(i/1000>0) {
			is[3]=i/1000;
		}else {
			is[3]=0;
		}
		i=i%1000;
		if(i/100>0) {
			is[2]=i/100;
		}else {
			is[2]=0;
		}
		i=i%100;
		if(i/10>0) {
			is[1]=i/10;
		}else {
			is[1]=0;
		}
		i=i%10;
		is[0]=i;
		return is;
	}
	public static void main(String[] args)
	{
		System.out.println(11);
		Integer length=8;
		System.out.println(length%4==0?length/4:length/4+1);
		System.out.println(new Sloution2().baseWord("1",true));
		System.out.println(new Sloution2().toWord("131123121677103456709"));
	}
}
