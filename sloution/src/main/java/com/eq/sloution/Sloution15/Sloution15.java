package com.eq.sloution.Sloution15;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;

public class Sloution15
{
	public static int rob(TreeNode root)
	{

		// 1
		List<TreeNode> list1 = Lists.newArrayList();
		getList(list1, root);
		int i1 = 0;
		for (TreeNode node : list1)
		{
			i1 += node.val;
		}
		// 2
		List<TreeNode> list2 = Lists.newArrayList();
		getList(list2, root.left);
		List<TreeNode> list3 = Lists.newArrayList();
		getList(list3, root.right);
		int i2 = 0;
		for (TreeNode node : list2)
		{
			i2 += node.val;
		}
		for (TreeNode node : list3)
		{
			i2 += node.val;
		}
		return i1 > i2 ? i1 : i2;
	}

	private static void getList(List<TreeNode> list, TreeNode treeNode)
	{
		if(null != treeNode)
		{
			TreeNode parentNode = null;
			for (int i = list.size() - 1; i > -1; i--)
			{
				TreeNode node = list.get(i);
				if(node.left == treeNode)
				{
					parentNode = node;
					break;
				}
				if(node.right == treeNode)
				{
					parentNode = node;
					break;
				}
			}
			if(parentNode != null)
			{
				if(!list.contains(parentNode))
				{
					list.add(treeNode);
				}
			}
			else
			{
				list.add(treeNode);
			}
			getList(list, treeNode.left);
			getList(list, treeNode.right);
		}

	}
	
	
	public static void main(String[] args)
	{
		
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(12);
		node3.left = node1;
		node3.right = node2;
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(11);
		node6.left = node4;
		node6.right = node5;
		TreeNode node7 = new TreeNode(4);
		node7.left = node3;
		node7.right = node6;
		System.out.println(Sloution15.rob(node7));
		
		
	}
}
