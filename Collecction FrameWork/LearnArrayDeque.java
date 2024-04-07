import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq =  new ArrayDeque<>();

        adq.offer(33);
        adq.offerFirst(12);
        adq.offerLast(55);
        adq.offer(66);
        adq.offer(100);

        System.out.println(adq);

        System.out.println("Peek: "+adq.peek());
        System.out.println("PeekFirst: "+adq.peekFirst());
        System.out.println("PeekLast: "+adq.peekLast());

        System.out.println(adq);
        System.out.println("Poll: "+adq.poll());
        System.out.println(adq);
        System.out.println("PollFirst: "+adq.pollFirst());
        System.out.println(adq);
        System.out.println("PollLast: "+adq.pollLast());
    }
}
