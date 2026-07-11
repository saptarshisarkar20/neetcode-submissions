For **SDE-2**, interviewers expect more than just applying design patterns. They look for your ability to:

* identify entities and responsibilities,
* apply SOLID principles,
* write extensible code,
* handle evolving requirements,
* justify design trade-offs.

If I had to prepare someone in **6–8 weeks**, I'd use the following list.

---

# Tier 1 (Must Do) ⭐⭐⭐⭐⭐

These are the problems that appear most frequently in interviews.

| Problem            | Concepts                                    |
| ------------------ | ------------------------------------------- |
| Parking Lot        | Strategy, Factory, inheritance, composition |
| Splitwise          | Strategy, Observer, domain modeling         |
| BookMyShow         | Seat booking, concurrency discussion, state |
| Elevator System    | State pattern, scheduling strategies        |
| ATM Machine        | State pattern, Chain of Responsibility      |
| Tic Tac Toe        | OOP fundamentals, clean design              |
| Snake & Ladder     | OOP, board modeling                         |
| Library Management | CRUD, entities, relationships               |
| Chess              | OOP, polymorphism                           |
| Cricbuzz           | Observer, Strategy, score updates           |

---

# Tier 2 (Frequently Asked in Product Companies)

| Problem                       | Concepts                      |
| ----------------------------- | ----------------------------- |
| Cab Booking (Uber/Ola)        | Matching strategies, Strategy |
| Food Delivery (Swiggy/Zomato) | Order lifecycle, State        |
| Hotel Booking                 | Availability, pricing         |
| Movie Ticket Booking          | Concurrency discussion        |
| Amazon Locker                 | Allocation strategies         |
| Vending Machine               | State pattern                 |
| Inventory Management          | Composition                   |
| Restaurant Management         | Multiple entities             |
| Flight Booking                | Search + reservation          |
| Car Rental System             | Strategy + inheritance        |

---

# Tier 3 (Machine Coding Favorites)

| Problem                   | Concepts                      |
| ------------------------- | ----------------------------- |
| LRU Cache                 | HashMap + DLL                 |
| LFU Cache                 | Advanced data structures      |
| Logger Framework          | Chain of Responsibility       |
| Notification Service      | Observer                      |
| Rate Limiter              | Token Bucket / Sliding Window |
| URL Shortener             | Hashing                       |
| File System               | Composite pattern             |
| In-Memory Key Value Store | Maps + persistence ideas      |
| Task Scheduler            | Priority queues               |
| Job Scheduler             | Scheduling                    |

---

# Tier 4 (Advanced SDE-2)

| Problem            | Concepts          |
| ------------------ | ----------------- |
| Kafka (simplified) | Pub-Sub           |
| Pub/Sub System     | Observer          |
| Messaging Queue    | Producer-Consumer |
| Redis (simplified) | Data structures   |
| Search Engine      | Indexing          |
| Distributed Cache  | Design discussion |
| API Gateway        | Routing           |
| Payment Gateway    | Strategy          |
| Wallet System      | Transactions      |
| Banking System     | Domain modeling   |

---

# Design Patterns You Should Be Comfortable Using

Don't try to memorize all 23 GoF patterns. Focus on these:

* Factory
* Abstract Factory
* Builder
* Singleton (and its pitfalls)
* Strategy
* Observer
* State
* Command
* Decorator
* Adapter
* Facade
* Composite
* Chain of Responsibility
* Template Method

You'll naturally use most of these while solving the problems above.

---

# Interview Flow You Should Practice

For every problem:

1. Clarify requirements.
2. Identify entities.
3. Draw the class diagram.
4. Identify relationships (composition vs inheritance).
5. Decide where interfaces are needed.
6. Implement incrementally.
7. Discuss extensions (e.g., "How would you support electric vehicle parking?" or "How would you add a new payment method?").

---

# If You Can Solve Only 15 Problems

I'd recommend these:

1. Parking Lot
2. Splitwise
3. BookMyShow
4. Elevator
5. ATM
6. Tic Tac Toe
7. Snake & Ladder
8. Chess
9. Library Management
10. Cricbuzz
11. Uber/Ola
12. Swiggy/Zomato
13. LRU Cache
14. Logger Framework
15. Notification System

These cover the majority of concepts that recur in SDE-2 interviews.

---

## A note on machine coding

Many SDE-2 interviews include a **90–120 minute machine coding round**. In that time, interviewers usually expect:

* clean object-oriented design,
* working code,
* extensibility,
* basic unit-testable structure,
* clear explanation of design choices.

Practicing the problems above by implementing them from scratch (rather than just reading solutions) will prepare you much better than memorizing UML diagrams.

If your target companies are **Amazon, Walmart, Microsoft, Adobe, Atlassian, Uber, Flipkart, PhonePe, Razorpay, or similar product companies**, this list covers the vast majority of recurring LLD themes.
