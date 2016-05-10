package com.eq.sloution.Sloution14;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class Sloution14
{
	public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
       
        List<Map<String, String>> list = Lists.newArrayList();
        for(int i=0;i<c.length;i++) {
        	if("aeiou".contains(c[i]+"")) {
        		Map<String, String> map= Maps.newHashMap();
        		map.put("char", c[i]+"");
        		list.add(map);
        	}
        }
        int index = list.size();
        String s2="";
        for(int i=0;i<c.length;i++) {
        	if("aeiou".contains(c[i]+"")) {
        		s2+=list.get(index-1).get("char");
        		index--;
        	} else {
        		s2+=c[i];
        	}
        }
        return s2;
    }
	
	public static void main(String[] args)
	{
		System.out.println(reverseVowels("hello"));
	}
}
