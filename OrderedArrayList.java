import java.util.ArrayList;
public class OrderedArrayList extends ArrayList{

  public OrderedArrayList(){
  }

  public boolean add(Object o){
    if(this.size() == 0){
      this.add(0, (int)o);
      return true;
    }
    for(int i = 0; i < this.size(); i++){
      if((int)o < (int)this.get(i)){
        this.add(i, (int)o);
        return true;
      }
    }
    this.add(this.size(), (int)o);
    return true;
  }
  
}
