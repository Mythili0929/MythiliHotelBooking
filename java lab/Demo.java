import java.util.*;
class Demo {
    public static void main(String[] args) {
     Hashtable<Integer, String> ht = new Hashtable<>();
ht.put(1, "A");
ht.put(2, "B");
System.out.println(ht);
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);
System.out.println(pq.poll()); // 10
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(10);
dq.addLast(20);
System.out.println(dq);
    }
}