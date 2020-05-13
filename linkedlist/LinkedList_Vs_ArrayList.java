/* LINKEDLIST VS. ARRAYLIST */

package Java_CollectionFrameWork.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Vs_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> L1 = new LinkedList<Integer>();
		List<Integer> A1 = new ArrayList<Integer>();
		
		getTime_Difference(A1);
		getTime_Difference(L1);
		
		
	}
	
	public static void getTime_Difference(List<Integer> list) {
		
		long Start_Time = System.currentTimeMillis();
		
		for(int  i = 0 ; i < 10000 ; i++) {
			list.add(0, i);
		}
		
		long End_Time = System.currentTimeMillis();
		
		long Time_Difference = (End_Time - Start_Time);
		
		System.out.println(list.getClass().getName() + "--> " + Time_Difference);
	}

}
