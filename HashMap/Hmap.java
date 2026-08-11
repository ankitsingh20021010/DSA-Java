
import java.util.*;
//java.util.HashMap
//java.util.Map
public class Hmap {
    public static void main(String[] args) {
       HashMap <String,Integer> mapp=new HashMap<>();
       //insert value .put();
       mapp.put("Petrol",101);
       mapp.put("CNG", 80);
       mapp.put("diesel",90);
       mapp.put("Petrol",120);
      System.out.println(mapp);//ouput all
      //iteration in HashMap 
      for(Map.Entry<String,Integer> e: mapp.entrySet()){
        System.out.print(e.getKey()+ " ");
        System.out.println(e.getValue());
      }
      //using set itertion 
      Set<String> keys=mapp.keySet();
      for(String key:keys){
        System.out.println(key +" "+ mapp.get(key));
      }
     
    }
}
//importaint iteration 
//keySet(); only key
//enterySet; key,value both

