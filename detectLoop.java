package cp;

import java.util.HashMap;
import java.util.Map;

public class detectLoop {
    static class Node
    {
        int data;
        Node next;

        Node(int item)
        {
            data = item;
            next = null;
        }
    }

    public static boolean detectLoop(Node head){
        Map<Node, Integer> map = new HashMap();
        Node curr = head;
        while(curr.next != null){
            if(!map.containsKey(curr)){
                map.put(curr, 1);
                curr = curr.next;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

    }
}
