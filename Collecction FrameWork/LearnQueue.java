import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue =  new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(87);

        System.out.println(queue.toString());
        System.out.println("Poll elem: "+queue.poll());

        System.out.println(queue.toString());
        System.out.println("Peek elem: "+queue.peek());

    }
}
