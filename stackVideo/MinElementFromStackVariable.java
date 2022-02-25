package cp.stackVideo;

import java.util.Stack;

public class MinElementFromStackVariable {
    int minEle = -1;
    Stack<Integer> s = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
        return minEle;
    }

    /*returns poped element from stack*/
    int pop()
    {
        if(s.isEmpty()){
            return -1;
        }
        int top = s.pop();
        if(s.isEmpty()){
            minEle = -1;
        }
        if(top < minEle){
            int temp = minEle;
            minEle = 2*minEle - top;
            return temp;
        }
        return top;
    }

    /*push element x into the stack*/
    void push(int x)
    {
        if(s.isEmpty()){
            s.push(x);
            minEle = x;
        }
        else{
            if(x < minEle){
                s.push(2*x-minEle);
                minEle = x;
            }
            else{
                s.push(x);
            }
        }
    }
}
