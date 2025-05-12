package Stack_and_Queue;

import java.util.Stack;
import java.util.*;

public class StockSpanner {
    ArrayList<Integer>li=new ArrayList<>();
    StockSpanner(){
        li.clear();
    }
    int next (int val){
        li.add(val);
        int count=1;
        for(int i=li.size()-2;i>=0;i--){
            if(li.get(i)<=val){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
