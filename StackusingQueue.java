import java.util.*;

public class StackusingQueue {

    static class queues {

        private Queue<Integer> q = new LinkedList<>();

        void push(int x) {
            q.add(x);

            int n = q.size() - 1;

            for (int i = 0; i < n; i++) {
                q.add(q.peek());
                q.poll();
            }
        }

        void pop() {
            if (q.isEmpty())
                return;

            q.poll();
        }

        int top() {
            if (q.isEmpty())
                return 1;   // Better to return -1 if stack is empty

            return q.peek();
        }

        int size() {
            return q.size();
        }
    }

    public static void main(String[] args) {

        queues s = new queues();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("top " + s.top());
        System.out.println("size " + s.size());

        s.pop();

        System.out.println("top " + s.top());
        System.out.println("size " + s.size());

        s.pop();

        System.out.println("top " + s.top());
        System.out.println("size " + s.size());
    }
}