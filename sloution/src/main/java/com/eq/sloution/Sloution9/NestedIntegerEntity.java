package com.eq.sloution.Sloution9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListSelectionEvent;

public class NestedIntegerEntity implements NestedInteger
{
	private List<Object> list = new ArrayList<Object>(); 
	
	
	@Override
	public boolean isInteger()
	{
		if(list.size()==1&&list.get(0) instanceof Integer) {
			return true;
		}
		return false;
	}

	@Override
	public Integer getInteger()
	{
		if(list.size()==1&&list.get(0) instanceof Integer) {
			return (Integer)list.get(0);
		}
		return null;
	}

	@Override
	public List<NestedInteger> getList()
	{
		for(Object obj:list) {
			
		}
		return null;
	}
	
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

}
