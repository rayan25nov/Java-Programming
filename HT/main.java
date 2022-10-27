package hashTable;

import java.util.Hashtable;

import hashTable.hashTable;

public class main {
    public static void main(String[] args) {
        hashTable ht = new hashTable();
        ht.set("paints", 100); 
        ht.set("bolts", 50); 
        ht.set("nails", 20); 
        ht.set("tile", 65); 
        ht.set("lumber", 71); 
        System.out.println(ht.get("speaker"));
        System.out.println(ht.keys());
        ht.printTable();
    }
}
