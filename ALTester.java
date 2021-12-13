// Un-upTown Leopard Rock: Lea Kwok, Raven (Ruiwen) Tang
// APCS pd7
// L02 -- Well Al B. Sorted
// 2021-12-12
// time spent: 02.0 hours

/*
DISCO:
- We used .get() instead of [] for retrieving an element at an index.
- We used .add() to populate an ArrayList because that's the only way it can be populated, other than with add at index.
- isSorted() should always return true no matter what order we populate the array in, because we write the OrderedArrayList to maintain the invariant that its elements are sorted, so we use ALTester to check that we wrote OrderedArrayList correctly. 
- We made an ArrayList of variable type ArrayList but object type OrderedArrayList() to test OrderedArrayList. In addition, OrderedArrayList extends ArrayList so it inherits the methods of ArrayList and only needs to override a few that affect whether or not it's sorted.
- built-in toString() for ArrayList returns String with elements in form "[_, _, _, _, ..., _]"

QCC:
- We decided not to modify the methods add at index and set because we require the use of add at index in our modified OrderedArrayList add() method, however, if a user were to use add at index or set, the invariant of the elements always being sorted, will no longer be true. Should we modify those methods and how would we do that without using the ArrayList add at index in OrderedArrayList add at index?
- We received these notes when we compiled ALTester and we think it's from using Object type OrderedArrayList with variable type ArrayList. However, the code still runs with no errors. Is this something we should be concerned about? 
    Note: ALTester.java uses unchecked or unsafe operations.
    Note: Recompile with -Xlint:unchecked for details.
- In order to override the add() method of ArrayList in OrderedArrayList, we needed to make the return type boolean and parameter Object o, which we later typecasted into an int in the method body.
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
