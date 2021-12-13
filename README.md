# Un-upTownLeopardRock: Lea Kwok, Raven (Ruiwen) Tang

## ALTester
* Create Object type of OrderedArrayList and variable type ArrayList. 
* Use a for loop to populate the Array with random integers. 
* Print the ArrayList, its size, and its isSorted() return value (which should be true).

isSorted() stores the previous value in the ArrayList while iterating through ArrayList using a for-each loop. If at any point the current element is less than the previous element, the method returns false. Otherwise, the current element is stored as the previous element, and the for loop continues until the method returns true at the end of the ArrayList.

## OrderedArrayList
* Inherited methods from ArrayList
* public boolean add(Object o)
    * If the ArrayList is empty, use ArrayList's add at index method to add the element at index 0. Return true.
    * Iterate through the ArrayList using a for loop to check if the element being put in is less than the element at the current index. If true, add the element at that index and return true. 
    * After the for loop, add the element using ArrayList's add at index method at the index of the size of the ArrayList. Return true.