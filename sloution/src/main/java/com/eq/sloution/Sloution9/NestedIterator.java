package com.eq.sloution.Sloution9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.Lists;

public class NestedIterator implements Iterator<Integer>
{
	private List<Integer> list = new ArrayList<Integer>();
	private int index = 0;
	public NestedIterator(NestedIntegerEntity ni) {
		getList(list, ni);
    }
	
	public void getList(List<Integer> list,NestedIntegerEntity ni) {
		for(int i=0;i<ni.getList2().size();i++) {
			if(ni.getList2().get(i) instanceof Integer) {
				list.add((Integer)ni.getList2().get(i));
			} else {
				getList(list, (NestedIntegerEntity)ni.getList2().get(i));
			}
		}
		
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

}
