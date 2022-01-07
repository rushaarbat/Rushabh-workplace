package com.neova.test;

import java.security.PublicKey;
import java.util.ArrayList;

public class MaxElement
{
	public static int main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		
//		int max=arrayList.get(0);
		
//		int n=arrayList.size();
		
		
//		for (int i = 0; i < n; i++)
//		{
//			if(arrayList.get(i)>max)
//			{
//				max=arrayList.get(i);
//			}
//		}
//		System.out.println(max);
			
		int getMax(ArrayList list){
			int maxelement=Integer.MIN_VALUE;
			for (int i = 0; i < list.size(); i++) 
			{
				if(arrayList.get(i)>maxelement)
				{
					maxelement=list.get(i);
				}
			}
			return maxelement;
		}
		
	}
}
