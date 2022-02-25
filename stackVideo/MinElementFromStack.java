package cp.stackVideo;
import java.util.Stack;

public class MinElementFromStack {
    Stack<Integer> ss = new Stack<>();
    Stack<Integer> s = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        if(ss.isEmpty()){
            return -1;
        }
        return ss.peek();
    }

    /*returns poped element from stack*/
    int pop()
    {
        if(s.isEmpty()){
            return -1;
        }
        int top = s.pop();
        if(top == ss.peek()){
            ss.pop();
        }
        return top;
    }

    /*push element x into the stack*/
    void push(int x)
    {

        s.push(x);
        if(ss.isEmpty()){
            ss.push(x);
        }
        else if(ss.peek() >= x){
            ss.push(x);
        }
    }
}
