package com.alex.sortAlgorithm;

/**
 * 
 * @author Alex
 *
 */
public class SortArray {
	
	/**
	 * ��������
	 * @param a
	 * @return
	 */
	public int[] sortInsert(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];//����Ų�Ĺ�����iλ�õ�ֵ�����ı䣬������Ҫ��a[i]��ֵ�ݴ�����
			int point = i;//�����
			for (int j = i-1; (j>=0)&&(a[j]>temp); j--) {
				a[j+1]=a[j];//�ȴ�����ֵ��Ϊ��Ųλ��
				point = j;
			}
			a[point]=temp;
		}
		return a;
		
	}
	
	/**
	 * ѡ������
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
		System.out.println("ԭʼ���飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		SortArray sa = new SortArray();
		//��������
		sa.sortInsert(a);
		System.out.println("�������������飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		//ѡ������
		sa.sortSelect(a);
		System.out.println("ѡ�����������飺");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
}
