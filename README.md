Here's a **README** for your project:  

---

# **Priority Queue Linked List (`PQList`) - CSC329 Homework 1**

## ** Overview**
This project implements a **priority queue using a linked list** (`PQList`). It stores **Player** objects in a linked structure, ensuring that elements can be added, cloned, and managed efficiently.

---

## ** Project Structure**
```
org.example.csc329_hw1/
│── Player.java       # Represents a player with a name and score
│── Node.java         # Defines a linked list node containing a Player object
│── PQList.java       # Implements the priority queue using a linked list
│── PlayerADT.java    # Interface defining required priority queue operations
│── Main.java         # (Optional) Test class to demonstrate functionality
```

---

## ** Features**
**Custom Linked List** → Implements a priority queue without using Java collections.  
**Player Class** → Encapsulates player details (`name`, `score`) and supports cloning.  
**Deep Copy Support** → `PQList` and `Player` support **deep copying** through a `createClone()` method.  
**Efficient O(1) Insertions** → New nodes are added at the end in **constant time**.  
**Priority Queue Operations** → Methods to **add, clone, and manage** players dynamically.  

---

## **Class Details**
### **Player.java**
Defines a **player object** with the following attributes:
- `String name` → Player's name.
- `int score` → Player's score.

### **Methods:**
| Method | Description |
|--------|------------|
| `Player()` | Default constructor (name = `""`, score = `0`) |
| `Player(String name, int score)` | Parameterized constructor |
| `Player(Player other)` | **Copy constructor** (deep copy of another player) |
| `String getName()` | Returns the player's name |
| `int getScore()` | Returns the player's score |
| `void setName(String name)` | Updates the player's name |
| `void setScore(int score)` | Updates the player's score |
| `Player createClone()` | **Creates a deep copy** of the player |
| `boolean equals(Object obj)` | Compares players **by name** |
| `String toString()` | Returns a **formatted player string** |

---

### ** Node.java**
Represents a **single node** in the linked list, storing:
- `Player player` → Holds a player object.
- `Node next` → Pointer to the **next node**.

### ** Methods:**
| Method | Description |
|--------|------------|
| `Node(Player player)` | Constructor (creates a node for a given player) |
| `Node(Player newPlayer, Node newNext)` | Constructor with next node reference |
| `Player getPlayer()` | Returns the player object |
| `void setPlayer(Player player)` | Updates the player object |
| `Node getNext()` | Returns the next node |
| `void setNext(Node next)` | Updates the next node reference |

---

### **PQList.java**
Implements the **priority queue** using a **linked list**.

#### ** Attributes**
- `Node head` → Points to the **first node** in the queue.
- `Node tail` → Points to the **last node** in the queue.
- `int size` → Stores the number of players in the queue.

#### **Methods:**
| Method | Description |
|--------|------------|
| `PQList()` | **Default constructor** (initializes an empty queue) |
| `PQList(PQList other)` | **Copy constructor** (deep copies another queue) |
| `void add(Player a)` | Adds a **new player to the rear** of the queue **(O(1))** |
| `Player getHighestScorePlayer()` | **Removes and returns the player with the highest score** |
| `void clear()` | **Removes all players** from the queue |
| `int getSize()` | Returns the **number of players** in the queue |
| `boolean isEmpty()` | Returns **true** if the queue is **empty**, else `false` |
| `PQList<Player> createClone()` | Returns a **deep copy** of the queue |

---

## **How to Use**
### ** Create a Player**
```java
Player p1 = new Player("Alice", 100);
Player p2 = new Player("Bob", 200);
```

### ** Add Players to PQList**
```java
PQList<Player> playerQueue = new PQList<>();
playerQueue.add(p1);
playerQueue.add(p2);
```

### **Clone the Priority Queue**
```java
PQList<Player> clonedQueue = playerQueue.createClone();
```

### **Get the Highest Scoring Player**
```java
Player highest = playerQueue.getHighestScorePlayer();
System.out.println("Highest Scorer: " + highest.getName());
```

---
## ** Author**
 **Developed for CSC329 - Homework 1**  
 **Author:** *Cody Bandrowski* 

---
