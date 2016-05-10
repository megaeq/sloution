package com.eq.sloution.Sloution11;

public class Sloution11
{
	public int[] countBits(int num)
	{
		int[] ints = new int[num+1];
		for(int i=0;i<num+1;i++) {
			ints[i] = bitCount(i);
		}
		return ints;
	}
	
	
	public static int bitCount(int i) {
        // HD, Figure 5-2
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }
	
	public static void main(String[] args)
	{
		System.out.println(Integer.toBinaryString(6));
		System.out.println(bitCount(6));
		//6-(0110>>>1)&01010101010101010101010101010101=>6-0011&01010101010101010101010101010101=>6-0001=>5=>i
		//0101&00110011001100110011001100110011+(0101>>>2)&00110011001100110011001100110011
		//=>0001+0001&00110011001100110011001100110011
		//=>0001+0001=>2=>i
		//(2+(0010>>>4))&00001111000011110000111100001111
		//=>0010&&00001111000011110000111100001111
		//=>2=>i
		//2+(2>>>8)=>2=>i
		//2+(2>>>16)=>2=>i
		//2&00111111=>0010&00111111=>0010=>2=>i
		
		
	}
}
