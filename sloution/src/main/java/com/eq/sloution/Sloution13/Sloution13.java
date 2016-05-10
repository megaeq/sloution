package com.eq.sloution.Sloution13;

public class Sloution13
{
	public static String reverseString(String s) {
        char[] c = s.toCharArray();
        String s2 = "";
        for(int i=0;i<c.length;i++) {
        	s2+=c[c.length-1-i];
        }
        return s2;
    }
	
	public static void main(String[] args)
	{
		System.out.println(reverseString("billionhealth"));
	}
}
