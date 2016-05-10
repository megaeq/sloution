package com.eq.sloution.Sloution9;

public class Sloution9
{
	public static void main(String[] args)
	{
		NestedIntegerEntity ni = new NestedIntegerEntity();
		ni.add(1);
		ni.add(2);
		NestedIntegerEntity ni2 = new NestedIntegerEntity();
		ni2.add(3);
		ni2.add(ni);
		NestedIntegerEntity ni3 = new NestedIntegerEntity();
		ni3.add(4);
		ni3.add(ni2);
		ni3.add(5);
		NestedIterator iterator = new NestedIterator(ni3);
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	}
}
