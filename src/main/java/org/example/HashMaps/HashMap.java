package org.example.HashMaps;

public class HashMap {
    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    //hash method takes a String and uses it to generate an index
    //in the maps internal array
    //to generate an index for each key-value pair we have to calculate a number based on
    //the characters in the input String key
    public int hash(String key) {

        //hashCode variable can be changed within hash()
        //this variable keeps a running total of character codes
        int hashCode = 0;

        //loops over each character in key
        for (int i = 0; i < key.length(); i++) {
            //convert each character in key to an integer using codePointAt() java method
            hashCode = hashCode + Character.codePointAt(key, i);
            //returns the unicode point at the given index
            //this method only works on strings, converting a charcter at a specific index into an int between 0-65535
        }
        //compression handling so index is within bounds of hash maps array
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public static void main(String[] args) {
        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("c"));
        System.out.println(newHashMap.hash("ca"));
        System.out.println(newHashMap.hash("car"));
    }
}
