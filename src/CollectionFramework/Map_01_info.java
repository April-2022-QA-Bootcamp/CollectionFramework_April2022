package CollectionFramework;
/*
Map ---> Interface
implemented class : HashMap   LinkedHashMap  TreeHashMap
A map contains values on the basis of key, i.e. key and value pair. 
Each key and value pair is known as an entry. 
A Map contains unique keys.
(A Map doesn't allow duplicate keys)
but you can have duplicate values 
A Map is useful if you have to search, update or delete elements on the basis of a key

HashMap
********
A HashMap --->store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). 
It can store different types: String keys and Integer values, or the same type, like: String keys and String values
No duplicate key 
HashMap allow null keys and values
Doesn't maintain any order.
initial capacity 16----based on threshold becomes double
Hash table implementation--elements put in buckets of table based on hash code

**How index is selected: Put(key,value) will call hasCode()----which is responsible to generate hashCode--->hascod/totalIndex--reminder is the index
 


LinkedHashMap 
************
 
---> LinkedHashMap maintains the insertion order.
It inherits HashMap class. 
It maintains insertion order
LinkedHashMap is a Hash table and linked list implementation of the Map interface, 
with predictable iteration order. This implementation differs from HashMap 
in that it maintains a doubly-linked list running through all of its entries. 
This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order). 
LinkedHashMap allow null keys and values
TreeMap //
***********
TreeMap class is a red-black tree based implementation. 
It provides an efficient means of storing key-value pairs in sorted order.
---->Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.
It maintains ascending order.
TreeMap doesn't allow any null key or value


*/

public class Map_01_info {

}
