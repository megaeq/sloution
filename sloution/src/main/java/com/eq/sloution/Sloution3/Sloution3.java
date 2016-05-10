/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title Sloution3.java
 * @package com.sloution.Sloution3
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-29 下午5:36:24
 * @version V1.0  
 */
package com.eq.sloution.Sloution3;

/**
 * @className Sloution3
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-29 下午5:36:24
 */
public class Sloution3
{
	public BinaryTreeNode<Integer> toTree(Integer[] is)
	{
		BinaryTreeNode<Integer> treeNode = new BinaryTreeNode<Integer>();
		for (int i = 0; i < is.length; i++)
		{
			if(null == treeNode.getT())
			{
				treeNode.setT(is[i]);
			}
			else
			{
				treeNode = insert(treeNode, is[i]);
			}
		}
		return treeNode;
	}

	public BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> treeNode, Integer i)
	{
		BinaryTreeNode<Integer> treeNode2 = treeNode;
		while (true)
		{
			if(i > treeNode2.getT())
			{
				if(null != treeNode.getRightChildNode())
				{
					treeNode2 = treeNode.getRightChildNode();
				}
				else
				{
					BinaryTreeNode<Integer> newTreeNode = new BinaryTreeNode<Integer>();
					newTreeNode.setT(i);
					newTreeNode.setParentNode(treeNode);
					treeNode2.setRightChildNode(newTreeNode);
					break;
				}
			}
			else
			{
				if(null != treeNode.getLeftChildNode())
				{
					treeNode2 = treeNode.getLeftChildNode();
				}
				else
				{
					BinaryTreeNode<Integer> newTreeNode = new BinaryTreeNode<Integer>();
					newTreeNode.setT(i);
					newTreeNode.setParentNode(treeNode);
					treeNode2.setLeftChildNode(newTreeNode);
					break;
				}
			}
		}
		return treeNode;
	}

	public void print(BinaryTreeNode<Integer> treeNode)
	{
		String[] strs = new String[100];

	}
	// 0代表左，1代表右
	public BinaryTreeNode<Integer> getElement(BinaryTreeNode<Integer> treeNode,int level,int index) {
		for(;;) {
			return null;
		}
	}

	public BinaryTreeNode<Integer> query(BinaryTreeNode<Integer> treeNode, int i)
	{
		return null;
	}

	public static void main(String[] args)
	{
	}
}
