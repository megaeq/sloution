/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title Sloution1.java
 * @package com.sloution
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-21 下午7:09:58
 * @version V1.0  
 */
package com.eq.sloution.Slloution1;

import java.util.ArrayList;
import java.util.List;

/**
 * @className Sloution1
 * @description Given an integer matrix, find the length of the longest increasing path. From each cell, you can either move to four directions: left, right, up or down. You may NOT move diagonally or
 *              move outside of the boundary (i.e. wrap-around is not allowed).
 * @author Mega.Yan
 * @date 2016-1-21 下午7:09:58
 */
public class Sloution1
{
	//
	public Integer[][] random(int x, int y,int max)
	{
		Integer[][] xy = new Integer[x][y];
		for (int i = 0; i < x; i++)
		{
			Integer[] xi = new Integer[y];
			for (int j = 0; j < y; j++)
			{
				xi[j] = (int) (Math.random() * max);
			}
			xy[i] = xi;
		}
		return xy;
	}

	public Integer[] sort(Integer[][] xy)
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < xy.length; i++)
		{
			for (int j = 0; j < xy[i].length; j++)
			{
				Integer[] is = new Integer[xy.length * xy[0].length];
				is[0] = xy[i][j];
				List<Integers> list2 = new ArrayList<Integers>();
				Integers integersInit = new Integers();
				List<Integer> intList = new ArrayList<Integer>();
				intList.add(xy[i][j]);
				integersInit.setIntList(intList);
				integersInit.setPaths("*" + i + "@" + j + "*");
				integersInit.setX(i);
				integersInit.setY(j);
				integersInit.setX0(i);
				integersInit.setY0(j);
				list2.add(integersInit);
				while (true)
				{
					List<Integers> list3 = new ArrayList<Integers>();
					for (int l = 0; l < list2.size(); l++)
					{
						Integers integers0 = list2.get(l);
						// 上1
						if(check(integers0, xy, integers0.getX(), integers0.getY() - 1))
						{
							Integers integers = new Integers();
							List<Integer> integerList = copyList(integers0.getIntList());
							integerList.add(xy[integers0.getX()][integers0.getY() - 1]);
							integers.setIntList(integerList);
							integers.setPaths(integers.getPaths() + "*" + integers0.getX() + "@" + (integers0.getY() - 1) + "*");
							integers.setX(integers0.getX());
							integers.setY(integers0.getY()-1);
							integers.setX0(integers0.getX0());
							integers.setY0(integers0.getY0());
							list3.add(integers);
						}
						// 下2
						if(check(integers0, xy, integers0.getX(), integers0.getY() + 1))
						{
							Integers integers = new Integers();
							List<Integer> integerList = copyList(integers0.getIntList());
							integerList.add(xy[integers0.getX()][integers0.getY() + 1]);
							integers.setIntList(integerList);
							integers.setPaths(integers.getPaths() + "*" + integers0.getX() + "@" + (integers0.getY() + 1) + "*");
							integers.setX(integers0.getX());
							integers.setY(integers0.getY()+1);
							integers.setX0(integers0.getX0());
							integers.setY0(integers0.getY0());
							list3.add(integers);
						}
						// 左3
						if(check(integers0, xy, integers0.getX() - 1, integers0.getY()))
						{
							Integers integers = new Integers();
							List<Integer> integerList = copyList(integers0.getIntList());
							integerList.add(xy[integers0.getX()-1][integers0.getY() ]);
							integers.setIntList(integerList);
							integers.setPaths(integers.getPaths() + "*" + (integers0.getX() - 1) + "@" + integers0.getY() + "*");
							integers.setX(integers0.getX()-1);
							integers.setY(integers0.getY());
							integers.setX0(integers0.getX0());
							integers.setY0(integers0.getY0());
							list3.add(integers);
						}
						// 右4
						if(check(integers0, xy, integers0.getX() + 1, integers0.getY()))
						{
							Integers integers = new Integers();
							List<Integer> integerList = copyList(integers0.getIntList());
							integerList.add(xy[integers0.getX()+1][integers0.getY()]);
							integers.setIntList(integerList);
							integers.setPaths(integers.getPaths() + "*" + (integers0.getX() + 1) + "@" + integers0.getY() + "*");
							integers.setX(integers0.getX()+1);
							integers.setY(integers0.getY());
							integers.setX0(integers0.getX0());
							integers.setY0(integers0.getY0());
							list3.add(integers);
						}
					}
					if(list3.isEmpty())
					{
						for (Integers integers : list2)
						{
							String integerStr = "";
							for (int m = 0; m < integers.getIntList().size(); m++)
							{
								integerStr += integers.getIntList().get(m) + " ";
							}
							System.out.println("**********start*********");
							System.out.println("起点:(" + integers.getX0()+","+integers.getY0()+")");
							System.out.println("终点:(" + integers.getX()+","+integers.getY()+")");
							System.out.println("长度：" + integers.getIntList().size());
							System.out.println("内容：" + integerStr);
						}
						break;
					}
					else
					{
						list2 = list3;
					}
				}
			}
		}
		return null;
	}
	
	private Boolean check(Integers is, Integer[][] xy, int x, int y)
	{
		// 超长
		if(x < 0 || x >= xy.length || y < 0 || y >= xy[0].length)
		{
			return false;
		}
		else
		{
			if(is.getPaths().contains("*" + x + "@" + y + "*"))
			{
				return false;
			}
			else
			{
				if(is.getIntList().get(is.getIntList().size() - 1) >= xy[x][y])
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
	}
	
	private List<Integer> copyList(List<Integer> list) {
		List<Integer> list0 = new ArrayList<Integer>();
		for(Integer i:list) {
			list0.add(i);
		}
		return list0;
	}

	public static void main(String[] args)
	{
		/*2 14 11 17 
		3 17 7 0 
		1 17 17 14 
		19 6 7 4*/ 
		//Integer[][] xy = new Integer[][]{{2, 3, 1, 19 },{14, 17, 17, 6 },{11, 7, 17 ,7 },{17, 0 ,14 ,4}};
		
		Integer[][] xy = new Sloution1().random(5, 4,20);
		for(int i=0;i<xy[0].length;i++) {
			String str = "";
			for(int j=0;j<xy.length;j++) {
				str+=xy[j][i]+" ";
			}
			System.out.println(str);
		}
		new Sloution1().sort(xy);
	}
}
