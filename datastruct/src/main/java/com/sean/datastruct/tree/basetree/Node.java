package com.sean.datastruct.tree.basetree;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by sean on 2017/12/19 11:37.
 *  一个最简单最原始的Java实现的树，只需要考虑父节点和当前节点的存储数据
 */
public class Node<T> {
	private T data;
	private int parent;

	public Node(T data){
		this.data = data;
	}

	public Node(T data,int parent){
		this.data = data;
		this.parent = parent;
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getParent(){
		return this.parent;
	}

}
