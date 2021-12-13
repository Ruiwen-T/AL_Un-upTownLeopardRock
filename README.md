# Un-upTownLeopardRock: Lea Kwok, Raven (Ruiwen) Tang

## ALTester
* Create a new ArrayList<Integer>. 
* Use a for loop to populate the Array with random integers. 
* Print the ArrayList, its size, and its isSorted() return value. 

isSorted() stores the previous value in the ArrayList while iterating through ArrayList using a for-each loop. If at any point the current element is less than the previous element, the method returns false. Otherwise, the current element is stored as the previous element, and the for loop continues until the method returns true at the end of the ArrayList.

## OrderedArrayList
* public OrderedArrayList()
    * Intialize _data as a new Object ArrayList<Integer>
* public String toString()
    * Return the built-in toString() method of ArrayList for _data
* public Integer remove( int i )
    * Return the built-in remove() method of ArrayList for _data and parameter i
* public int size()
    * Return the built-in size() method of ArrayList for _data
* public Integer get( int i )
    * Return the built-in get() method of ArrayList for _data and parameter i
* public void addLinear(Integer newVal)
    * If the ArrayList is empty, use ArrayList's add at index method to add the element at index 0 of _data.
    * Intialize a boolean called found to false. This value will keep track of whether or not we've found the correct position for the value.
    * Iterate through the ArrayList using a for loop to check if the element being put in is less than the element at the current index. If true, add the element at that index and set found to true. 
    * If found is still false after the for loop, add the element using ArrayList's add at index method at the index of the size of the ArrayList. 
* public void addBinary(Integer newVal)
    * Initialize instance variables low and high for organization purposes
    * low takes the value of 0, high takes the value of this.size()-1
    * Call helper method addBinaryHelper with parameters newVal, low, and high
* public void addBinaryHelper(Integer newVal, int low, int high)
    * Intialize instance variable mid that takes the value of (low+high)/2
    * If the ArrayList is empty, use the built-in add() method of ArrayList to add newVal to _data
    * Otherwise, if the ArrayList has one element in it, check if newVal is greater than the existing element in _data, and in this case, use the built-in add() method of ArrayList to add newVal to _data. Else, use the built-in add at index method of ArrayList to add newVal to the beginning of _data
    * Otherwise, if low is the last index of _data, add newVal to the end of _data
    * Otherwise, if high is equal to 0, use the add at index method to add newVal at index 0 of _data
    * Otherwise, if newVal is greater than or equal to the value at index mid of _data, check if the size is equal to mid+1, or if newVal is less than or equal to the element at index mid+1, if true, add newVal to index mid+1. Else, set low to mid and call addBinaryHelper(newVal, low, high). Else, set high to mid and call addBinaryHelper(newVal, low, high)
    
