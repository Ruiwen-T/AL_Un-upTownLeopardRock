/*
- add at index, set (invalidate methods)
- use .get() instead of [] for element at index
- use .add() to populate
- isSorted() should always return true no matter what order we populate the array in, because we write the OrderedArrayList
- built-in toString() for ArrayList returns String with elements in form "[_, _, _, _, ..., _]"
Note: ALTester.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
*/

import java.util.ArrayList;
public class ALTester{

	public static boolean isSorted(ArrayList<Integer> al){
		int prevVal = al.get(0);
		for(Integer i : al){
			if(i < prevVal){
				return false;
			}
			prevVal = i;
		}
		return true;
	}

	public static void main(String[] args){
		ArrayList<Integer> oal = new OrderedArrayList();
		for(int i = 0; i < 23; i++){
			oal.add((int)((Math.random()*2-1)*Math.pow(2, 31)));
		}
		System.out.println(oal);
		System.out.println("size: " + oal.size());
		System.out.println(isSorted(oal));
	}

}
