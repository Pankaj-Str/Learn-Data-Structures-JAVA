package Day_10;
//@p4n.in
//codeswithpankaj.com
import java.util.LinkedList;

public class HashTable {
    private LinkedList<Entry>[] table;
    private int capacity;
    
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }
    
    public void put(int key, String value) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];
        
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }
        
        list.add(new Entry(key, value));
    }
    
    public String get(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];
        
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        
        return null;
    }
    
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];
        
        for (Entry entry : list) {
            if (entry.getKey() == key) {
                list.remove(entry);
                return;
            }
        }
    }
    
    private int hash(int key) {
        return key % capacity;
    }
    
    private class Entry {
        private int key;
        private String value;
        
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
        
        public int getKey() {
            return key;
        }
        
        public String getValue() {
            return value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
    }
}
