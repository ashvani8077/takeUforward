package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumGeneticMutation433 {
    public static void main(String[] args) {

    }

    public static int minMutation(String start, String end, String[]bank){
        HashSet<String>bankset=new HashSet<>();
        for(int i=0;i<bank.length;i++){
            bankset.add(bank[i]);
        }
        HashSet<String> visited=new HashSet<>();
        Queue<String>que=new LinkedList<>();
        int level=0;
        que.add(start);
        while (!que.isEmpty()){
            int n=que.size();
            while(n-->0){
                String curr=que.poll();
                if(curr.equals(end)){
                    return level;
                }
                for(int i=0;i<curr.length();i++){

                    for(char ch:new char[]{'A','C','G','T'}){
                        char []chars=curr.toCharArray();
                        chars[i]=ch;
                        String nbrs=new String(chars);
                        if(!(visited.contains(nbrs))&&(bankset.contains(nbrs))){
                            visited.add(nbrs);
                            que.add(nbrs);
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }


}
