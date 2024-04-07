import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
     
        // this forms min-heap priorityqueue.
        // PriorityQueue<Integer> pq =  new PriorityQueue<>(Comparator.naturalOrder());
        Queue<Integer> pq =  new PriorityQueue<>();

        // this forms max-heap priorityqueue.
        // PriorityQueue<Integer> pq =  new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(240);
        pq.offer(500);
        pq.offer(87);
        pq.offer(12);

        System.out.println(pq);

        System.out.println(pq.toString());
        System.out.println("Poll elem: "+pq.poll());

        System.out.println(pq.toString());
        System.out.println("Peek elem: "+pq.peek());


    }
}
