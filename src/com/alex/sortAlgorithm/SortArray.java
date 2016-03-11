package com.alex.sortAlgorithm;

/**
 * 
 * @author Alex
 *
 */
public class SortArray {
	
	/**
	 * 插入排序
	 * @param a
	 * @return
	 */
	public int[] sortInsert(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];//往后挪的过程中i位置的值发生改变，所以需要将a[i]的值暂存起来
			int point = i;//插入点
			for (int j = i-1; (j>=0)&&(a[j]>temp); j--) {
				a[j+1]=a[j];//比待插入值大，为其挪位置
				point = j;
			}
			a[point]=temp;
		}
		return a;
		
	}
	
	/**
	 * 选择排序
	 * @param a
	 * @return
	 */
	public int[] sortSelect(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minipos = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[minipos]) {
					minipos = j;
				}	
			}
			int temp = a[i];
			a[i] = a[minipos];
			a[minipos] = temp;
		}
		return a;
		
	}
	
	

	public static void main(String[] args) {
		
		int a[] = {12,6,5,23,3,9,1,18};
		System.out.println("原始数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		SortArray sa = new SortArray();
		//插入排序
		sa.sortInsert(a);
		System.out.println("插入排序后的数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		//选择排序
		sa.sortSelect(a);
		System.out.println("选择排序后的数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
}
