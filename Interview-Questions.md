# Java Interview Questions
## 🎯1 - Linked in 
#### DSA (Data Structures & Algorithms)
1. Implement LRU/LFU Cache  
2. Find Median from Data Stream  
3. Word Ladder Problem  
4. Merge K Sorted Lists  
5. Detect Cycle in a Directed Graph  
6. Maximum Subarray Sum  
7. Kth Largest Element in a Stream  
8. Task Scheduler / Priority-Based Scheduling  
---
#### Java Backend
1. HashMap vs ConcurrentHashMap vs Hashtable  
2. JVM Memory Model: Heap, Stack, Garbage Collection  
3. ExecutorService, Callable, and Future  
4. Working of Dependency Injection in Spring Boot  
5. REST vs Kafka/RabbitMQ in Microservices Architecture  
6. Transaction Management in Spring Boot  
7. SQL vs NoSQL Databases  
8. Designing Scalable REST APIs  
---
#### System Design
1. Design a Chat Application  
2. Design a URL Shortener  
3. Design a Notification System  
4. Scaling a Video Streaming Platform  
5. Design a Payment System  
6. Design an API Rate Limiter  
7. Design an E-commerce Checkout System  
8. Design a Ride-Hailing Application

---
<details>
<summary>🗝️ ANS </summary>
  Got it — I’ll train you exactly like a professor preparing you for interviews.

For each topic, I’ll give you:

1. **Interview-ready answer (what you say)**
2. **Simple explanation (so you remember easily)**

---

# 🔹 DSA (Data Structures & Algorithms)

## 1. LRU Cache

### ✅ Interview Answer

“LRU Cache stands for Least Recently Used cache. It evicts the least recently accessed item when capacity is full.
To implement it efficiently in O(1), I use a combination of a HashMap and a Doubly Linked List.
HashMap provides fast access, and the Doubly Linked List maintains the order of usage.
Whenever a key is accessed, I move it to the front. If capacity is exceeded, I remove the node from the tail.”

### 🧠 Easy Way

* Think: **recent → front, old → back**
* Remove from back when full

---

## 2. LFU Cache

### ✅ Interview Answer

“LFU Cache removes the least frequently used item. If frequency ties, we remove the least recently used among them.
We maintain a HashMap for key-value and another structure mapping frequency to a list of nodes.”

### 🧠 Easy Way

* Remove item with **lowest usage count**

---

## 3. Median from Data Stream

### ✅ Interview Answer

“To find the median dynamically, I use two heaps:

* Max Heap for lower half
* Min Heap for upper half
  Balance both heaps so their size differs by at most 1.
  Median is either the top of one heap or average of both.”

### 🧠 Easy Way

* Left = smaller numbers
* Right = bigger numbers
* Median is in middle

---

## 4. Word Ladder

### ✅ Interview Answer

“This is a shortest transformation problem. I solve it using BFS.
Each step changes one letter, and I explore all valid transformations level by level until reaching the target word.”

### 🧠 Easy Way

* Think: **word → neighbors → BFS shortest path**

---

## 5. Merge K Sorted Lists

### ✅ Interview Answer

“I use a Min Heap to efficiently merge K sorted lists.
Insert the first element of each list into the heap, then repeatedly extract the minimum and insert the next element from that list.”

### 🧠 Easy Way

* Always pick smallest using heap

---

## 6. Detect Cycle in Directed Graph

### ✅ Interview Answer

“I use DFS with a recursion stack.
If a node is visited again while still in recursion stack, a cycle exists.”

### 🧠 Easy Way

* If you revisit a node in same path → cycle

---

## 7. Maximum Subarray Sum

### ✅ Interview Answer

“I use Kadane’s Algorithm.
At each step, I decide whether to extend the current subarray or start a new one.
Keep track of the maximum sum seen so far.”

### 🧠 Easy Way

* If sum becomes negative → reset

---

## 8. Kth Largest in Stream

### ✅ Interview Answer

“I maintain a Min Heap of size K.
If a new element is larger than the smallest in heap, I replace it.”

### 🧠 Easy Way

* Keep only top K elements

---

## 9. Task Scheduler

### ✅ Interview Answer

“I use a Max Heap to always pick the task with highest frequency and a queue for cooldown.
This ensures optimal scheduling with minimum idle time.”

### 🧠 Easy Way

* Do most frequent task first

---

# 🔹 Java Backend

## 10. HashMap vs ConcurrentHashMap vs Hashtable

### ✅ Interview Answer

“HashMap is not thread-safe.
Hashtable is thread-safe but uses full synchronization, making it slow.
ConcurrentHashMap provides thread safety with better performance using segment-level locking.”

### 🧠 Easy Way

* HashMap → fast, unsafe
* Hashtable → safe, slow
* ConcurrentHashMap → safe + fast

---

## 11. JVM Memory Model

### ✅ Interview Answer

“JVM memory is divided into Heap and Stack.
Heap stores objects, Stack stores method calls and local variables.
Garbage Collection automatically removes unused objects from heap.”

### 🧠 Easy Way

* Heap = objects
* Stack = function calls

---

## 12. ExecutorService, Callable, Future

### ✅ Interview Answer

“ExecutorService manages thread pools.
Callable is like Runnable but returns a result.
Future is used to retrieve the result asynchronously.”

### 🧠 Easy Way

* Callable → returns result
* Future → get result later

---

## 13. Dependency Injection (Spring Boot)

### ✅ Interview Answer

“Dependency Injection means objects are created and injected by the Spring container instead of manually creating them.
This reduces tight coupling and improves testability.”

### 🧠 Easy Way

* Spring creates objects for you

---

## 14. REST vs Kafka/RabbitMQ

### ✅ Interview Answer

“REST is synchronous communication.
Kafka/RabbitMQ are asynchronous message brokers used for event-driven architecture.”

### 🧠 Easy Way

* REST → request-response
* Kafka → event/message

---

## 15. Transaction Management

### ✅ Interview Answer

“Spring manages transactions using @Transactional.
It ensures ACID properties and automatically handles commit and rollback.”

### 🧠 Easy Way

* All success → commit
* Error → rollback

---

## 16. SQL vs NoSQL

### ✅ Interview Answer

“SQL databases are structured and support ACID transactions.
NoSQL databases are schema-less and designed for scalability and flexibility.”

### 🧠 Easy Way

* SQL → tables
* NoSQL → flexible

---

## 17. Scalable REST APIs

### ✅ Interview Answer

“To design scalable APIs, I use stateless services, caching, load balancing, pagination, and proper indexing.”

### 🧠 Easy Way

* Keep APIs stateless + cache

---

# 🔹 System Design

## 18. Chat Application

### ✅ Interview Answer

“I design it using WebSockets for real-time communication, message queues for scalability, and a database for storing messages.”

### 🧠 Easy Way

* Real-time → WebSocket

---

## 19. URL Shortener

### ✅ Interview Answer

“I generate a unique short key using hashing or base62 encoding and store mapping in database.”

### 🧠 Easy Way

* Long URL → short key

---

## 20. Notification System

### ✅ Interview Answer

“I use message queues like Kafka to handle asynchronous notifications and worker services to process them.”

### 🧠 Easy Way

* Queue → process → send

---

## 21. Video Streaming Platform

### ✅ Interview Answer

“I use CDN for fast delivery, chunked video streaming, and distributed storage.”

### 🧠 Easy Way

* CDN = fast video

---

## 22. Payment System

### ✅ Interview Answer

“I ensure idempotency, use secure APIs, handle retries, and maintain transaction logs.”

### 🧠 Easy Way

* Avoid duplicate payments

---

## 23. API Rate Limiter

### ✅ Interview Answer

“I use algorithms like Token Bucket or Leaky Bucket to limit requests per user.”

### 🧠 Easy Way

* Limit requests per second

---

## 24. E-commerce Checkout

### ✅ Interview Answer

“I ensure inventory consistency, payment integration, and order processing using transactions and queues.”

### 🧠 Easy Way

* Order → pay → confirm

---

## 25. Ride-Hailing App

### ✅ Interview Answer

“I use GPS tracking, matching algorithms, real-time updates via WebSockets, and scalable backend services.”

### 🧠 Easy Way

* Match rider with nearest driver

---

# 🚀 Final Tip (Very Important)

In interviews:

* Speak **structured**
* Use keywords: *“HashMap + DLL”, “BFS”, “Heap”, “ACID”, “Scalability”*
* Keep answers **30–60 seconds**

---

If you want, I can:
✅ Give **code for each question**
✅ Do a **mock interview with you**
✅ Provide **top follow-up questions + answers**

Just tell me 👍

</details>  

---

## 🎯2 - Linked In
1. How does the G1 Garbage Collector work? What are regions, and how does it decide what to collect? 🗑️🧠  
2. What is a memory leak in Java? Walk through how you’d detect and fix one in production. 🕵️‍♂️🔧  
3. How does ReentrantLock differ from synchronized? When would you prefer one over the other? 🔐🔄  
4. Explain happens-before in Java Memory Model. Why does it matter in multithreaded code? ⏱️🧵  
5. How does Spring’s @Transactional handle rollback internally? What are common pitfalls? 🔄⚠️  
6. What is the difference between REQUIRED, REQUIRES_NEW and NESTED propagation in transactions? 📜🔄  
7. How would you implement distributed locking across microservices? 🔒🌐  
8. How does Hibernate’s first-level vs second-level cache work? When does it hurt you? 💾🚫  
9. Explain the N+1 problem in JPA. How do you detect and fix it? 📉🛠️  
10. How would you design an idempotent REST API? Why does it matter? 📡✅  
11. How does database connection pooling work? How do you tune HikariCP for high throughput? 🏊‍♂️⚡  
12. What is eventual consistency? How would you handle it in a microservices architecture? ⏳🏗️  
13. How do you implement optimistic vs pessimistic locking? When would you use each? 🤔🔒  
14. How would you design a rate limiter for a public API? 🚦📉  
15. What is the Saga pattern? How does it compare to 2PC for distributed transactions? 🎭⚖️  
16. How would you secure inter-service communication in a microservices setup? 🛡️🔗  
17. How does Kafka ensure message ordering and exactly-once delivery? 📨🎯  
18. How would you design a system that processes 1 million requests per day without downtime? 🚀📈  
19. How do you do zero-downtime deployment for a Spring Boot service running in Kubernetes? 🔄🐳  
20. Your service’s p99 latency spiked from 80ms to 2s overnight. Walk me through your debugging process. 🚨🔍

---
<details>
<summary>🗝️ ANS </summary>
  Great—answer like you’re explaining to a senior interviewer: clear, structured, and confident. I’ll give you **exact speaking-style answers** you can say.
  
  ---
  
  ### 1. G1 Garbage Collector
  
  “G1 is a region-based, low-pause GC. Instead of one big heap, it divides memory into equal-sized regions. Some regions are Eden, Survivor, or Old.
  
  It tracks which regions have the most garbage using a cost-benefit model. During GC, it doesn’t scan the whole heap—it collects only the regions with the most reclaimable memory first, called *Garbage First*.
  
  It uses marking to find live objects, then evacuation to compact selected regions. This allows predictable pause times because it controls how many regions to collect in each cycle.”
  
  ---
  
  ### 2. Memory Leak in Java
  
  “A memory leak in Java is when objects are no longer needed but still referenced, so GC cannot reclaim them.
  
  In production, I’d detect it using heap dumps and tools like MAT or VisualVM. I’d look for growing retained heap or objects with long-lived references.
  
  Common causes are static collections, caches without eviction, or listeners not deregistered. Fix involves removing references, using weak references, or adding proper eviction policies.”
  
  ---
  
  ### 3. ReentrantLock vs synchronized
  
  “`synchronized` is simpler and JVM-managed. `ReentrantLock` is more flexible.
  
  ReentrantLock provides features like tryLock, timeout, fairness, and interruptible locking. It also allows finer control with multiple condition variables.
  
  I prefer `synchronized` for simple cases, but `ReentrantLock` when I need advanced control like avoiding deadlocks or implementing timed waits.”
  
  ---
  
  ### 4. Happens-Before (JMM)
  
  “Happens-before defines visibility and ordering guarantees between threads.
  
  If A happens-before B, then all changes in A are visible to B. For example, unlock happens-before lock, and write to a volatile happens-before read.
  
  It matters because without it, threads may see stale or inconsistent data due to CPU caching and reordering.”
  
  ---
  
  ### 5. @Transactional Rollback
  
  “Spring uses AOP proxies. When a transactional method is called, it starts a transaction before execution.
  
  If a runtime exception occurs, it marks the transaction for rollback. On method exit, it either commits or rolls back.
  
  Pitfalls include self-invocation (proxy not applied), checked exceptions not triggering rollback by default, and incorrect propagation settings.”
  
  ---
  
  ### 6. REQUIRED vs REQUIRES_NEW vs NESTED
  
  “REQUIRED joins an existing transaction or creates a new one.
  
  REQUIRES_NEW always suspends the current transaction and starts a new independent one.
  
  NESTED creates a savepoint within the existing transaction, allowing partial rollback.
  
  I use REQUIRED for normal flows, REQUIRES_NEW for audit/logging, and NESTED when partial rollback is needed.”
  
  ---
  
  ### 7. Distributed Locking
  
  “I’d use a centralized system like Redis or Zookeeper.
  
  For Redis, I’d implement a lock using SET NX with expiry, and ensure safety using the Redlock algorithm.
  
  Key concerns are avoiding deadlocks, handling lock expiry, and ensuring only the lock owner releases it.”
  
  ---
  
  ### 8. Hibernate First vs Second-Level Cache
  
  “First-level cache is session-scoped and always enabled. It ensures no duplicate queries within a session.
  
  Second-level cache is shared across sessions and must be configured.
  
  It can hurt when stale data is served or when cache invalidation becomes complex in high-write systems.”
  
  ---
  
  ### 9. N+1 Problem
  
  “N+1 happens when fetching a list of entities and then lazily loading related entities one-by-one.
  
  I detect it using SQL logs or profiling tools.
  
  Fixes include using JOIN FETCH, entity graphs, or batch fetching.”
  
  ---
  
  ### 10. Idempotent REST API
  
  “An idempotent API returns the same result for repeated requests.
  
  I implement it using idempotency keys stored in DB or cache. Before processing, I check if the request was already handled.
  
  It matters to prevent duplicate operations in retries, especially in payments or distributed systems.”
  
  ---
  
  ### 11. Connection Pooling / HikariCP
  
  “Connection pooling reuses DB connections instead of creating new ones.
  
  For HikariCP, I tune maxPoolSize based on CPU and DB capacity, set connectionTimeout, and monitor metrics.
  
  Too many connections can overwhelm DB; too few can cause latency.”
  
  ---
  
  ### 12. Eventual Consistency
  
  “It means the system becomes consistent over time, not immediately.
  
  In microservices, I handle it using retries, event-driven architecture, and compensating actions.
  
  I also design APIs to tolerate temporary inconsistency.”
  
  ---
  
  ### 13. Optimistic vs Pessimistic Locking
  
  “Optimistic uses versioning and fails on conflict. Good for low contention.
  
  Pessimistic locks rows upfront. Good for high contention.
  
  I prefer optimistic by default for scalability.”
  
  ---
  
  ### 14. Rate Limiter
  
  “I’d use algorithms like token bucket or sliding window.
  
  In distributed systems, I’d store counters in Redis.
  
  Important aspects are accuracy, performance, and preventing abuse.”
  
  ---
  
  ### 15. Saga Pattern vs 2PC
  
  “Saga breaks transactions into steps with compensating actions.
  
  2PC ensures strict consistency but is slow and blocking.
  
  Saga is preferred in microservices for scalability and fault tolerance.”
  
  ---
  
  ### 16. Securing Inter-Service Communication
  
  “I’d use mutual TLS, API gateways, and OAuth/JWT.
  
  Also enforce service-to-service authentication and network policies.”
  
  ---
  
  ### 17. Kafka Ordering & Exactly-Once
  
  “Ordering is guaranteed within a partition.
  
  Exactly-once is achieved using idempotent producers and transactional consumers.
  
  But it requires careful configuration and comes with overhead.”
  
  ---
  
  ### 18. 1M Requests/Day System
  
  “I’d design it with load balancing, horizontal scaling, caching, async processing, and database optimization.
  
  Also use monitoring, auto-scaling, and circuit breakers to ensure reliability.”
  
  ---
  
  ### 19. Zero-Downtime Deployment (Kubernetes)
  
  “I’d use rolling updates or blue-green deployment.
  
  Ensure readiness/liveness probes, backward-compatible changes, and gradual traffic shifting.”
  
  ---
  
  ### 20. p99 Latency Spike Debugging
  
  “I’d start with metrics—CPU, memory, GC, DB latency.
  
  Then check logs, recent deployments, and dependency health.
  
  Use tracing to identify slow components, and isolate whether it’s infra, code, or external services.
  
  Finally, mitigate quickly—rollback or scale—then do root cause analysis.”
  
  ---
  
  If you want, I can also turn this into a **mock interview drill** where I ask you and evaluate your answers.

  Alright — I’ll train you exactly like a professor preparing you for a **real interview**.

For each question:

1. **First → “Interview Answer” (say this confidently)**
2. **Then → “Simple Memory Trick” (so you never forget)**

---

## 1. G1 Garbage Collector

### ✅ Interview Answer

G1 (Garbage First) is a **region-based, low-pause garbage collector**. It divides the heap into fixed-size regions instead of contiguous generations.

It classifies regions as **Eden, Survivor, and Old**, but they are not physically separated.

G1 tracks **live data per region** and prioritizes collecting regions with the **most garbage first**, hence the name.

It uses:

* **Young GC** → collects Eden + Survivor
* **Mixed GC** → collects Young + some Old regions with high garbage

It uses a **pause-time goal** and selects regions to meet that target.

---

### 🧠 Easy Way

Think:
👉 Heap = Pizza slices
👉 G1 = Eats the slices with most leftover (garbage) first

---

## 2. Memory Leak in Java

### ✅ Interview Answer

A memory leak in Java occurs when objects are **no longer needed but still referenced**, preventing GC from reclaiming memory.

Detection:

* Monitor heap (JVM tools)
* Take heap dumps
* Analyze using tools like **Eclipse MAT**

Common causes:

* Static collections
* Listeners not removed
* Caches without eviction

Fix:

* Remove unnecessary references
* Use WeakReferences
* Fix lifecycle management

---

### 🧠 Easy Way

👉 “Object is dead… but reference is alive”

---

## 3. ReentrantLock vs synchronized

### ✅ Interview Answer

`synchronized` is JVM-level and automatically releases locks.

ReentrantLock is more flexible:

* Try lock (`tryLock`)
* Timeout support
* Fairness policy
* Interruptible

Use:

* `synchronized` → simple cases
* `ReentrantLock` → complex concurrency control

---

### 🧠 Easy Way

👉 synchronized = automatic car
👉 ReentrantLock = manual car (more control)

---

## 4. Happens-Before

### ✅ Interview Answer

Happens-before defines **visibility and ordering guarantees** in the Java Memory Model.

If A happens-before B:
👉 All changes in A are visible to B

Examples:

* Thread start
* Lock/unlock
* Volatile write/read

---

### 🧠 Easy Way

👉 “If A happens-before B → B sees A’s work”

---

## 5. @Transactional Rollback

### ✅ Interview Answer

In Spring Framework, `@Transactional` uses **AOP proxies**.

* Opens transaction before method
* Commits after success
* Rolls back on **unchecked exceptions (RuntimeException)**

Pitfalls:

* Self-invocation (proxy bypass)
* Checked exceptions don’t rollback by default
* Wrong propagation

---

### 🧠 Easy Way

👉 Proxy wraps method → commit if OK, rollback if crash

---

## 6. REQUIRED vs REQUIRES_NEW vs NESTED

### ✅ Interview Answer

* REQUIRED → joins existing or creates new
* REQUIRES_NEW → always new transaction (suspends old)
* NESTED → sub-transaction with savepoint

---

### 🧠 Easy Way

👉 REQUIRED = join
👉 REQUIRES_NEW = separate
👉 NESTED = child with undo option

---

## 7. Distributed Locking

### ✅ Interview Answer

Use external systems like:

* Redis (SETNX)
* Zookeeper

Ensure:

* Lock expiration
* Unique owner
* Retry logic

---

### 🧠 Easy Way

👉 “One key in Redis = one lock”

---

## 8. Hibernate Cache

### ✅ Interview Answer

In Hibernate:

* First-level → session scope (default)
* Second-level → shared across sessions

Problem:

* Stale data
* Memory overhead

---

### 🧠 Easy Way

👉 L1 = per request
👉 L2 = shared cache

---

## 9. N+1 Problem

### ✅ Interview Answer

Occurs when 1 query loads parent + N queries for children.

Fix:

* Fetch join
* EntityGraph
* Batch fetching

---

### 🧠 Easy Way

👉 1 query becomes N+1 queries = BAD

---

## 10. Idempotent REST API

### ✅ Interview Answer

Idempotency means **same request gives same result**.

Use:

* Idempotency keys
* PUT instead of POST
* Deduplication logic

---

### 🧠 Easy Way

👉 “Retry safe API”

---

## 11. Connection Pooling

### ✅ Interview Answer

Connection pooling reuses DB connections instead of creating new ones.

HikariCP tuning:

* maxPoolSize
* connectionTimeout
* leakDetectionThreshold

---

### 🧠 Easy Way

👉 Pool = reuse connections like reusable bottles

---

## 12. Eventual Consistency

### ✅ Interview Answer

System becomes consistent **after some time**.

Handled via:

* Async messaging
* Retries
* Compensation

---

### 🧠 Easy Way

👉 “Not now… but soon consistent”

---

## 13. Optimistic vs Pessimistic Locking

### ✅ Interview Answer

* Optimistic → version check
* Pessimistic → DB lock

Use:

* Optimistic → low conflict
* Pessimistic → high conflict

---

### 🧠 Easy Way

👉 Optimistic = trust
👉 Pessimistic = lock first

---

## 14. Rate Limiter

### ✅ Interview Answer

Use:

* Token Bucket
* Sliding Window
* Redis counter

---

### 🧠 Easy Way

👉 “X requests per second rule”

---

## 15. Saga Pattern

### ✅ Interview Answer

Saga = sequence of local transactions with compensations.

Compared to 2PC:

* Saga → scalable, eventual consistency
* 2PC → strong consistency but blocking

---

### 🧠 Easy Way

👉 Saga = steps + undo steps

---

## 16. Secure Microservices

### ✅ Interview Answer

* mTLS
* OAuth2 / JWT
* API Gateway

---

### 🧠 Easy Way

👉 “Service-to-service auth + encryption”

---

## 17. Kafka Ordering & Exactly Once

### ✅ Interview Answer

Apache Kafka:

* Ordering → per partition
* Exactly-once → idempotent producer + transactions

---

### 🧠 Easy Way

👉 Partition = ordered queue

---

## 18. 1M Requests System

### ✅ Interview Answer

* Load balancer
* Horizontal scaling
* Caching
* Async processing

---

### 🧠 Easy Way

👉 Scale out, not up

---

## 19. Zero Downtime Deployment

### ✅ Interview Answer

Use:

* Rolling updates
* Blue-green deployment
* Readiness probes in Kubernetes

---

### 🧠 Easy Way

👉 Replace servers gradually

---

## 20. Latency Spike Debugging

### ✅ Interview Answer

Steps:

1. Check metrics (CPU, memory)
2. Check logs
3. Trace requests
4. DB latency
5. External dependencies

---

### 🧠 Easy Way

👉 Metrics → Logs → Trace → DB → External

---

## 🔥 Final Tip

In interview:

* Speak **structured**
* Use keywords: *scalability, consistency, latency, fault tolerance*
* Give **1 real example if possible**

---

If you want, I can:
✅ Turn this into **mock interview Q&A (I’ll ask, you answer)**
✅ Or give **real company-level answers (Amazon/Google style)**


</details>

---
