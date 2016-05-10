package com.eq.sloution.Sloution8;

public class Sloution8
{
	public static int[] productExceptSelf(int[] nums)
	{
		int[] nums2 = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int res = 1;
			for(int k=0;k<nums.length;k++) {
				if(i!=k) {
					res*=nums[k];
				}
			}
			nums2[i] = res;
		}
		return nums2;

	}
	public static int[] productExceptSelf2(int[] nums)
	{
		int[] nums2 = new int[nums.length];
		int all = 1;
		for(int k=0;k<nums.length;k++) {
				all*=nums[k];
		}
		for(int i=0;i<nums.length;i++) {
			nums2[i] = all/nums[i];
		}
		return nums2;

	}
	
	public static void main(String[] args)
	{
		int[] nums = new int[]{1,2,3,4};
		int[] nums2 = productExceptSelf2(nums);
		for(int i=0;i<nums2.length;i++) {
			System.out.println(nums2[i]);
		}
	}

}
