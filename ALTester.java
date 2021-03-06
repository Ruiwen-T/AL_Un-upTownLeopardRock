// Un-upTown Leopard Rock: Lea Kwok, Raven (Ruiwen) Tang
// APCS pd7
// L02 -- Well Al B. Sorted
// 2021-12-12
// time spent: 02.0 hours

/*
DISCO:
- ENSURING COMPILABILITY AT EVERY STAGE IS CRUCIAL!!!!!! (enforced by TIPS/GUIDELINES) We confused ourselves a lot with the binary search add method, but once we commented everything out and then reworked each statement, we were able to pinpoint the source of error messages faster and have a better understanding of how the algorithm in our heads aligns with what the code is doing.
- We should always check if there is a skeleton in closet and if there is something in library.
- It's very helpful to use "this" because it allows us to use methods of the Object, like get(), set(), and size(). However, there are cases where _data should be used instead, because we are trying to manipulate _data as well.
- We used .get() instead of [] for retrieving an element at an index.
- built-in toString() for ArrayList returns String with elements in form "[_, _, _, _, ..., _]"
- Our method of adding (binary version) is different from binary search because we are checking if the element lies between the elements at index mid and index mid+1. However, binary search only compares the desired element to one element, the element at index mid. Moreover, another confusing aspect of adding using binary is that the size of the ArrayList is changing.

QCC:
- We received these notes when we compiled ALTester and we think it's from using Object type OrderedArrayList with variable type ArrayList. However, the code still runs with no errors. Is this something we should be concerned about? (We later changed the Object type to ArrayList as well.)
    Note: ALTester.java uses unchecked or unsafe operations.
    Note: Recompile with -Xlint:unchecked for details.
- What is the point of ALTester.java? It doesn't seem to have much connection with OrderedArrayList.java. We originally thought we were meant to extend ArrayList with OrderedArrayList and then initialize an object with variable type ArrayList and object type OrderedArrayList, but doing so would only be possible if OrderedArrayList was a subclass of ArrayList.
- In our binary version of add, we thought of many cases that would require their own if statements. For example, we considered cases in which _data was length 1 or 2. However, we're not sure if these cases were actually necessary?
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
		ArrayList<Integer> oal = new ArrayList<Integer>();
		for(int i = 0; i < 23; i++){
			oal.add((int)((Math.random()*2-1)*Math.pow(2, 31)));
		}
		System.out.println(oal);
		System.out.println("size: " + oal.size());
		System.out.println(isSorted(oal));
	}

}
