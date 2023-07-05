# Hash table data Structure in Java

hash table data structure in Java. A hash table, also known as a hash map, is a data structure that allows you to store and retrieve key-value pairs efficiently.

In Java, you can implement a hash table using an array of linked lists. Here's an example of a basic hash table implementation:

```java
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
```

In this implementation, we create an array of linked lists called `table`. The `capacity` parameter determines the size of the hash table. Each linked list represents a bucket in the hash table.

The `put` method takes a key-value pair and stores it in the hash table. If a key already exists, it updates the corresponding value. The `get` method retrieves the value associated with a given key. The `remove` method removes a key-value pair from the hash table.

The `hash` method calculates the index in the array for a given key. In this example, we use the modulo operator (`%`) to ensure the index falls within the valid range of the array.

The `Entry` class represents a key-value pair stored in the hash table. It contains methods to access and modify the key and value.

Note that this is a simplified implementation for demonstration purposes. In practice, you may need to handle collisions (when two keys produce the same index) using techniques like separate chaining or open addressing.

 # An example that demonstrates the usage of the hash table implementation in Java:

```java
public class HashTableExample {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // Adding key-value pairs to the hash table
        hashTable.put(1, "John");
        hashTable.put(2, "Jane");
        hashTable.put(3, "Mike");
        hashTable.put(4, "Emily");

        // Retrieving values from the hash table
        System.out.println(hashTable.get(2));  // Output: Jane
        System.out.println(hashTable.get(4));  // Output: Emily

        // Updating a value in the hash table
        hashTable.put(4, "Emma");
        System.out.println(hashTable.get(4));  // Output: Emma

        // Removing a key-value pair from the hash table
        hashTable.remove(2);
        System.out.println(hashTable.get(2));  // Output: null
    }
}
```

In this example, we create a `HashTable` object with a capacity of 10. Then, we add some key-value pairs to the hash table using the `put` method. We can retrieve values from the hash table using the `get` method. We can also update the value associated with a key using the `put` method again. Finally, we remove a key-value pair using the `remove` method.

Note that this is a simplified example to demonstrate the usage of the hash table. In a real-world scenario, you might want to handle collisions and consider other factors like resizing the hash table when it becomes too full.
