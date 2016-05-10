package com.eq.sloution.Sloution15;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class Sloution15
{
	
	public int rob(TreeNode root) {
		List<Map<String, Object>> list = Lists.newArrayList();
		getList(list, root);
		int max = 0;
		for(Map<String, Object> map:list) {
			if((Integer)map.get("total")>max){
				max = (Integer)map.get("total");
			}
		}
		return max;
	}
	
	private void getList(List<Map<String, Object>> list,Map<String, Object> map,TreeNode treeNode) {
			if(list.isEmpty()) {
				list = Lists.newArrayList();
				Map<String, Object> param1 = Maps.newHashMap();
				param1.put("last", 0);
				param1.put("total",0);
				list.add(param1);
				Map<String, Object> param2 = Maps.newHashMap();
				param2.put("last", 1);
				param2.put("total",treeNode.val);
				list.add(param2);
				if(treeNode.left != null) {
					getList(list, treeNode.left);
				}
				if(treeNode.right != null) {
					getList(list, treeNode.right);
				}
				
			} else {
					if(map.get("last").toString().equals(0)) {
						Map<String, Object> param1 = Maps.newHashMap();
						param1.put("last", 0);
						param1.put("total",map.get("total"));
						list.add(param1);
						Map<String, Object> param2 = Maps.newHashMap();
						param2.put("last", 1);
						param2.put("total",treeNode.val+(Integer)map.get("total"));
						list.add(param2);
						if(treeNode.left != null) {
							getList(list, treeNode.left);
						}
						if(treeNode.right != null) {
							getList(list, treeNode.right);
						}
					} else {
						Map<String, Object> param1 = Maps.newHashMap();
						param1.put("last", 0);
						param1.put("total",map.get("total"));
						list.add(param1);
						if(treeNode.left != null) {
							getList(list, treeNode.left);
						}
						if(treeNode.right != null) {
							getList(list, treeNode.right);
						}
					}
			}
	}

	
	
	public static void main(String[] args)
	{
		Sloution15 sloution = new Sloution15();
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
		System.out.println(sloution.rob(node7));
		
		
	}
}
