import java.util.*;
public class StackTwo
{
    static class stack{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        void enqueue(int x){
            while(!s1.isEmpty())
            s2.push(s1.pop());
            s1.push(x);
            while(!s2.isEmpty())
            s1.push(s2.pop());
        }
        void dequeue(){
            if(s1.isEmpty())
            return ;
            s1.pop();
        }
            int  top()
            {
               if(s1.isEmpty())
            return 1;
            return s1.peek();
            }
            
            int size()
            {
                return s1.size();
            }
        }
	public static void main(String[] args) {
        stack s=new stack();
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        System.out.println(s.top());
        System.out.println(s.size());
        s.dequeue();
        System.out.println(s.top());
        System.out.println(s.size());
	}
}
