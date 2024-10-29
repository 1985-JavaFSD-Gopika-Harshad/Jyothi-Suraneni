package Revature;

import java.util.ArrayList;

public class MyMap<K,V> {
	private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();
    
    
    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);  
        } else {
            keys.add(key);
            values.add(value);         
        }
    }
    
    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null; 
    }
    public boolean containsKey(K key) {
        return keys.contains(key);
    }
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();

        map.put("Jyothi", 21);
        map.put("Jyothsna", 19);
        map.put("Sony", 26);
        map.put("Somya", 22);
        System.out.println(map.get("Sony")); 
        System.out.println("Map contains 'Somya': " + map.containsKey("Somya"));  
        
    }

}
