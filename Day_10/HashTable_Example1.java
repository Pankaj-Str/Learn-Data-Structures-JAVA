package Day_10;

import java.util.LinkedList;

// Define a class for the hash table
public class HashTable_Example1<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    // Define a class for the key-value pair (Entry)
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash table with default capacity
    public HashTable_Example1() {
        this(DEFAULT_CAPACITY);
    }

    // Constructor to initialize the hash table with a custom capacity
    public HashTable_Example1(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    // Hash function to convert the key into an index
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Put a key-value pair into the hash table
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;

        // Resize the hash table if the load factor exceeds a threshold (e.g., 0.75)
        if ((double) size / table.length > 0.75) {
            resize();
        }
    }

    // Get the value associated with a given key
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    // Remove the key-value pair from the hash table
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    // Check if the hash table contains the given key
    public boolean containsKey(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // Resize the hash table when the load factor exceeds the threshold
    private void resize() {
        int newCapacity = table.length * 2;
        LinkedList<Entry<K, V>>[] newTable = new LinkedList[newCapacity];

        for (int i = 0; i < newCapacity; i++) {
            newTable[i] = new LinkedList<>();
        }

        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                int newIndex = Math.abs(entry.key.hashCode()) % newCapacity;
                newTable[newIndex].add(entry);
            }
        }

        table = newTable;
    }

    // Get the current size of the hash table
    public int size() {
        return size;
    }

    // Check if the hash table is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Test the implementation of the hash table
    public static void main(String[] args) {
        HashTable_Example1<String, Integer> hashMap = new HashTable_Example1<>();

        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 28);
        hashMap.put("Eve", 35);

        System.out.println("Age of Alice: " + hashMap.get("Alice")); // Output: Age of Alice: 25
        System.out.println("Age of Charlie: " + hashMap.get("Charlie")); // Output: Age of Charlie: 22

        hashMap.put("Bob", 31); // Bob turned 31
        System.out.println("Updated age of Bob: " + hashMap.get("Bob")); // Output: Updated age of Bob: 31

        if (hashMap.containsKey("Eve")) {
            System.out.println("Eve exists in the hash table.");
        } else {
            System.out.println("Eve does not exist in the hash table.");
        }

        hashMap.remove("David");
        System.out.println("Size of the hash table after removing David: " + hashMap.size()); // Output: Size of the hash table after removing David: 4
    }
}

