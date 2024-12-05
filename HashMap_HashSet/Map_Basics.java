package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class Map_Basics {
    public static void main(String[] args) {
        hashmapMethods();
    }

    public static void hashmapMethods(){
        //Create Hashmap
        Map<String,Integer>mp=new HashMap<>();

        //Add value to hashmap
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        //getting value
        System.out.println(mp.get("Yash"));

        //Update value
        mp.put("Akash",50);
        System.out.println(mp.get("Akash"));

        //Remove pair
        mp.remove("Akash");

        //Key exists or not
        System.out.println(mp.containsKey("Akash"));
        mp.putIfAbsent("Ram",100);
        System.out.println(mp.get("Ram"));

        //Get all key in hashmap
        System.out.println(mp.keySet());

        //Get all values in hashmap
        System.out.println(mp.values());

        //Get all entries in hashmap
        System.out.println(mp.entrySet());

        //Traversing All the entries of Hashmap
        for (String key:mp.keySet()){
            System.out.println(key+"->"+(mp.get(key)));
        }
        System.out.println();
        for (Map.Entry<String, Integer>e:mp.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
        System.out.println();
        for (var e:mp.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
}
