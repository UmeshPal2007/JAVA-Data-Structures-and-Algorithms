# Java Hashing: `HashSet` and `HashMap`

## 1. Hashing

**Hashing** is a technique used by data structures to store and retrieve
data efficiently in a way that allows for quick access. Hashing involves Mapping Data to a Specific index in a hash table(an array of items) by using a hash function. Hash function maps a key to a hash value, which is used to help determine where the data should be stored in a hash table. Hashing uses mathiematical formulas known as hash Functions to do the transformation.

-   Hashing is commonly used for sets of unique elements and
    dictionaries/maps of key-value pairs.
-   Average-case search, insertion, and deletion are typically **O(1)**.
-   Worst-case performance can be slower when many keys collide.
-   A **hash table** is a data structure that uses hashing to organize
    entries into buckets.
    Hash Table is one of the Most widely used data structure after Arrays.

### Common Java collections that use hashing

-   **`HashSet`** --- stores unique elements.
-   **`HashMap`** --- stores key-value pairs; keys are unique, but
    values may be duplicated.

### Collision

A **collision** occurs when different keys map to the same bucket/index.

Java's `HashMap` handles collisions by storing multiple entries in a
bucket. 
 Chaining : colliding entries stored as a LinkedList in that bucket. 
 
 If Hash matches- If same key then- If Chain length > 8 and table capacity >= 64 then overwrite values; If different key then appends to chain.
 
 In modern Java implementations, a heavily populated bucket can
be converted from a linked structure into a balanced red-black tree when
implementation thresholds are met.


### Rehashing / resizing

When a hash table grows beyond its resize threshold, its capacity is
increased and entries are redistributed among buckets. This helps
maintain efficient performance.

Process of increasing the size of a hashmap and redistributing the elements into new buckets based on their new Hash Values.
It is done To improve the performance of the Hashmap and to prevent collisions caused by a high load factor.
Rehashing is needed to prevent collision and maintain efficiency.

> For standard `HashMap` and `HashSet`, the default initial capacity of a HashSet is
> 16 and the default load factor is 0.75. Resizing is triggered when the
> number of entries exceeds the threshold, the capacity automatically increases.

------------------------------------------------------------------------

## 2. `HashSet` in Java

### Key pointsg 

-   `HashSet` is part of the Java Collections Framework and implements
    the `Set` interface.
-   It stores **unique elements**; duplicates are not allowed.
-   It does **not guarantee insertion order** or sorted order.
-   It uses hashing internally (through a `HashMap` implementation).
-   It allows one `null` element.
-   It is **not thread-safe** by default.
-   Basic operations such as `add()`, `remove()`, and `contains()` are
    generally O(1) on average.

### Capacity and load factor

-   **Capacity** refers to the number of buckets in the underlying hash
    table.
-   **Load factor** determines how full the table can become before
    resizing.
-   Default initial capacity of a Hashset: **16**.
-   Default load factor: **0.75**.
-   When the threshold is exceeded, the table generally grows to about
    twice its previous capacity.

### Constructors of `HashSet`

  ----------------------------------------------------------------------------------------
  Constructor                                          Typical use
  ---------------------------------------------------- -----------------------------------
  `HashSet<>()`                                        General use with default settings

  `HashSet<>(int initialCapacity)`                     When an approximate element count
                                                       is known

  `HashSet<>(int initialCapacity, float loadFactor)`   When capacity and load factor need
                                                       to be specified

  `HashSet<>(Collection<? extends E> c)`               Best for Filtering Existing Data.
  ----------------------------------------------------------------------------------------

### Example: creating and using a `HashSet`

``` java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); //Creating an HashSet

        hs.add(1); //Adding Elements
        hs.add(2);

        System.out.println("HashSet size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
    }
}
```

**Explanation**

-   `import java.util.HashSet;` imports the `HashSet` class.
-   `HashSet<Integer> hs = new HashSet<>();` creates a set that stores
    `Integer` values.
-   `hs.add(1);` and `hs.add(2);` add elements to the set.
-   `hs.size()` returns the number of distinct elements.
-   Printing the set displays its elements, but their order is not
    guaranteed.

### Collision handling in a `HashSet`

Because `HashSet` is backed by a `HashMap`, hashing is used to choose a
bucket. If multiple elements map to the same bucket, the underlying map
handles the collision. Equality is checked to determine whether an
element is already present.

------------------------------------------------------------------------

## 3. `HashMap` in Java

### Key points

-   `HashMap` is part of the Java Collections Framework and implements
    the `Map` interface.
-   It stores data as **key-value pairs**.
-   Keys must be unique; values may be duplicated.
-   Adding the same key again replaces its previous value.
-   It allows **one `null` key** and multiple `null` values.
-   It does **not guarantee insertion order** or sorted order.
-   It is **not thread-safe** by default.
-   Average-case `put()`, `get()`, and `remove()` operations are
    generally O(1) Constant Time Complexity which is really good for a data structure. 

### Common methods

  -----------------------------------------------------------------------
  Method                              Purpose
  ----------------------------------- -----------------------------------
  `put(key, value)`                   Inserts a key-value pair or updates
                                      the value for an existing key

  `get(key)`                          Returns the value associated with a
                                      key, or `null` if no mapping is
                                      found

  `containsKey(key)`                  Checks whether a key exists;
                                      returns a boolean

  `remove(key)`                       Removes the mapping (Delete the Key-Value Pair) for a key

  `size()`                            Returns the number of key-value
                                      mappings

  `keySet()`                          Returns a `Set` containing all keys in Map

  `entrySet()`                        Returns a set of key-value entries,
                                      useful for iteration
  -----------------------------------------------------------------------

### Example: creating and using a `HashMap`

``` java
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("John", 25);
        hashMap.put("Jon", 35);

        // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

### Capacity and load factor

-   Default initial capacity: **16**.
-   Default load factor: **0.75**.
-   When 75% of the capacity is filled then the capacity is Doubled.
-   When the number of entries exceeds the threshold, the table resizes
    and entries are redistributed.

------------------------------------------------------------------------

## 4. How `HashMap` works internally

A `HashMap` uses an array of buckets. Each bucket can hold an entry, and
multiple entries can share a bucket when collisions occur.

A simplified entry/node contains:

-   `hash` --- a hash value derived from the key.
-   `key` --- the key object.
-   `value` --- the associated value.
-   `next` --- a reference to another node in the bucket's linked
    structure, when needed.

### Simplified insertion process

1.  Start with an initially empty table; the default initial capacity is
    16.
2.  Call `put(key, value)`.
3.  Java calculates a hash based on the key's `hashCode()`.
4.  The hash is used to determine the bucket index.
5.  If the bucket is empty, the entry is stored there.
6.  If the bucket already contains an entry, Java compares hashes and
    checks key equality:
    -   If the key matches an existing key, its value is replaced.
    -   If the key is different, the new entry is stored in the same
        bucket using the collision-handling structure.
7.  If the table exceeds its resize threshold, it grows and entries are
    redistributed.

> **Note:** The hash values and bucket indexes in the handwritten
> illustration are hypothetical. Actual Java hash calculations and
> bucket placement depend on the key, the implementation, and the
> table's current capacity. The initial table may be allocated lazily
> rather than immediately when a `HashMap` is constructed.

### Collision handling and tree bins

-   Traditionally, collisions in a bucket are handled with a linked
    list.
-   In Java 8 and later, a sufficiently long bucket can be converted
    into a red-black tree when the table is also large enough (commonly
    described by thresholds of 8 entries and capacity 64).
-   When the bucket becomes small enough, the tree may be converted back
    to a linked list.
-   Tree bins can improve heavily collided bucket operations from linear
    toward logarithmic time, though normal operations are usually
    expected to be faster.

------------------------------------------------------------------------

## 6. Quick revision

-   **Hashing:** maps keys to hash values to support efficient data
    access.
-   **Hash table:** stores entries in buckets.
-   **Collision:** different keys map to the same bucket.
-   **Load factor:** controls how full the table can become before
    resizing.
-   **Rehashing/resizing:** increases table capacity and redistributes
    entries.
-   **`HashSet`:** collection of unique elements.
-   **`HashMap`:** collection of unique keys mapped to values.
-   **Average-case complexity:** search, insertion, and deletion are
    generally O(1).
-   **Thread safety:** `HashSet` and `HashMap` are not synchronized by
    default.
