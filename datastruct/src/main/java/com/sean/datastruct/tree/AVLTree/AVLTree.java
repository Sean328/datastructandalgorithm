package com.sean.datastruct.tree.AVLTree;

/**
 * Created by sean on 2017/12/21 11:27.
 */
public class AVLTree<T extends Comparable<T>> {

	private AVLTreeNode<T> mRoot;    // 根结点

	// AVL树的节点(内部类)
	class AVLTreeNode<T extends Comparable<T>> {
		T key;                // 关键字(键值)
		int height;         // 高度
		AVLTreeNode<T> left;    // 左孩子
		AVLTreeNode<T> right;    // 右孩子

		public AVLTreeNode(T key, AVLTreeNode<T> left, AVLTreeNode<T> right) {
			this.key = key;
			this.left = left;
			this.right = right;
			this.height = 0;
		}
	}

	/*
 * 获取树的高度
 */
	private int height(AVLTreeNode<T> tree) {
		if (tree != null) {
			return tree.height;
		}

		return 0;
	}

	public int height() {
		return height(mRoot);
	}


	/*
	 * 比较两个值的大小
	 */
	private int max(int a, int b) {
		return a>b ? a : b;
	}


	/*
	 * LL：左左对应的情况(左单旋转)。
	 *
	 * 返回值：旋转后的根节点
	 */
	private AVLTreeNode<T> leftLeftRotation(AVLTreeNode<T> k2) {
		AVLTreeNode<T> k1;

		k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;

		k2.height = max( height(k2.left), height(k2.right)) + 1;
		k1.height = max( height(k1.left), k2.height) + 1;

		return k1;
	}

}
