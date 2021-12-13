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

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
	_data = new ArrayList<Integer>();
  }

  public String toString()
  {
      return _data.toString();
  }

  public Integer remove( int i )
  {
      
      return _data.remove(i);
  }

  public int size()
  {
      return _data.size();
  }

  public Integer get( int i )
  {
      return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
      if(this.size() == 0){
        _data.add(newVal);
      } 
      else {
        boolean found = false;
        for(int i = 0; i < this.size(); i++){
          if(newVal < this.get(i) && found == false){
            _data.add(i, newVal);
            found = true;
          }
        }
        if(found == false){
          _data.add(this.size(), newVal);
        }
      }

  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
      int low = 0;
      int high = this.size()-1;
      
      addBinaryHelper(newVal, low, high);
      
      
  } 
  
  public void addBinaryHelper(Integer newVal, int low, int high)
  {
    
      System.out.println(low);
      System.out.println(high);
      /*
      if (this.size() == 0){
      	_data.add(newVal);
      }
      else 
      if ((low+high)/2 == this.size()-1 && newVal < this.get((low+high)/2)){
      	_data.add(this.size()-1, newVal);
      } 
      else if (this.size() == 1){
        if (newVal < this.get(0)){
          _data.add(0, newVal);
        }
        else {
          _data.add(newVal);
        }
      }
      else if (newVal > this.get((low+high)/2) && newVal < this.get((low+high)/2)+1){
      	_data.add((low+high)/2+1, newVal);
      } 
      else if (newVal < this.get((low+high)/2)+1 ) {
      	high = (low+high)/2+1;
      	addBinaryHelper(newVal, low, high);
      }
      else {
      	low = (low+high)/2;
      	addBinaryHelper(newVal, low, high);
      }
      */

      // NEW REWRITTEN METHOD
      int mid = (low+high)/2;

      if(this.size() == 0){
        _data.add(newVal);
      }
      else{
          if(high-low == 1){
            if(newVal > this.get(mid) && newVal > this.get(mid+1)){
              _data.add(newVal);
            }
            else if(newVal > this.get(mid) && newVal < this.get(mid+1)){
              _data.add(mid+1, newVal);
            }
            else if (newVal < this.get(mid) && newVal < this.get(mid+1)){
              _data.add(mid, newVal);
            }
            else{
              _data.add(mid, newVal);
            }
          }
          else{
            if(newVal > this.get(mid)){
            low = mid+1;
            addBinaryHelper(newVal, low, high);
            }
            else if (newVal < this.get(mid)){
              high = mid-1;
              addBinaryHelper(newVal, low, high);
            }
          }
          
        
      }
  } 
/*=====^====================================^=========
    =====^====================================^=========*/

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();
  /*=====^====================================^=========
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
   =====^====================================^=========*/

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 2; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main()

}//end class OrderedArrayList
