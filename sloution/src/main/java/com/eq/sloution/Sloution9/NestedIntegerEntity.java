package com.eq.sloution.Sloution9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListSelectionEvent;

public class NestedIntegerEntity implements NestedInteger
{
	private List<Object> list = new ArrayList<Object>(); 
	
	
	
	public List<Object> getList2() {
		return list;
	}
	
	public List<Object> add(Object obj) {
		if(obj instanceof Integer || obj instanceof NestedInteger) {
			list.add(obj);
		} else {
			try
			{
				throw new Exception("类型错误");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return list;
	}
	public static void main(String[] args)
	{
		NestedIntegerEntity ni = new NestedIntegerEntity();
		ni.add(1);
		ni.add(2);
		NestedIntegerEntity ni2 = new NestedIntegerEntity();
		ni2.add(3);
		ni2.add(ni);
		
	}

	public boolean isInteger() {
		// TODO Auto-generated method stub
		return false;
	}

	public Integer getInteger() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<NestedInteger> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
