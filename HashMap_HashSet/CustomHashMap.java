package HashMap_HashSet;

import LinkedList.LinkedList;

public class CustomHashMap {
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key=key;
                this.value=value;
            }

            private LinkedList<Node>[] buckets;
            public int size(){

            }
            public void put(K key, V value){

            }
            public V get(K key){

            }
            public V remove(K key){

            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,Integer>mp=new MyHashMap<>();
        MyHashMap<String,String>mp2=new MyHashMap<>();
    }
}
