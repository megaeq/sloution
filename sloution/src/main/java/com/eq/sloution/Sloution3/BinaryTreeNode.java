/**
 * Copyright(C) 2011-2012 BillionHealth Software Technology LTD. All Rights Reserved.
 * @title TreeNode.java
 * @package com.sloution.Sloution3
 * @compiler JDK1.6
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-29 下午5:38:01
 * @version V1.0  
 */
package com.eq.sloution.Sloution3;

/**
 * @className BinaryTreeNode
 * @description TODO
 * @author Mega.Yan
 * @date 2016-1-29 下午5:38:01
 */
public class BinaryTreeNode<T>
{
	private T t;
	private BinaryTreeNode<T> parentNode;
	private BinaryTreeNode<T> leftChildNode;
	private BinaryTreeNode<T> rightChildNode;
	public T getT()
	{
		return t;
	}
	public void setT(T t)
	{
		this.t = t;
	}
	public BinaryTreeNode<T> getParentNode()
	{
		return parentNode;
	}
	public void setParentNode(BinaryTreeNode<T> parentNode)
	{
		this.parentNode = parentNode;
	}
	public BinaryTreeNode<T> getLeftChildNode()
	{
		return leftChildNode;
	}
	public void setLeftChildNode(BinaryTreeNode<T> leftChildNode)
	{
		this.leftChildNode = leftChildNode;
	}
	public BinaryTreeNode<T> getRightChildNode()
	{
		return rightChildNode;
	}
	public void setRightChildNode(BinaryTreeNode<T> rightChildNode)
	{
		this.rightChildNode = rightChildNode;
	}
	
	public void print() {
		
	}
}
