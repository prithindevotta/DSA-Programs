package cp;

import cp.videos.*;
public class AddTwoNumbersLL {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node add(Node prev, int diff, Node first, Node second){
        if(diff == 0 && first.next == null && second.next == null){
            Node ans = new Node(0);
            ans.data = second.data + first.data;
            return ans;
        }
        Node carry;
        Node ans = new Node(0);
        if(diff == 0){
            carry = add(first, 0, first.next, second.next);
            if(carry.data >= 10){
                ans.data = first.data + second.data + 1;
                carry.data = carry.data - 10;
                ans.next = carry;
            }
            else{
                ans.data = first.data + second.data;
                ans.next = carry;
            }
        }
        else{
            carry = add(first, diff-1, first.next, second);
            if(carry.data >= 10){
                ans.data = first.data + 1;
                carry.data = carry.data - 10;
                ans.next = carry;
            }
            else{
                ans.data = first.data;
                ans.next = carry;
            }
        }

        if(prev == null){
            if(ans.data >= 10){
                Node temp = new Node(1);
                ans.data = ans.data-10;
                temp.next = ans;
                ans = temp;
            }
        }
        return ans;
    }
    static Node addTwoLists(Node first, Node second){
        if(first == null && second == null){
            return null;
        }
        else if(first == null){
            return second;
        }
        else if(second == null){
            return first;
        }
        Node tempf = first;
        Node temps = second;
        int countf = 0;
        int counts = 0;
        while(tempf != null){
            countf++;
            tempf = tempf.next;
        }
        while(temps != null){
            counts++;
            temps = temps.next;
        }
        if(counts >= countf){
            return add(null, counts-countf, second, first);

        }
        else{
            return add(null, countf-counts, first, second);
        }
    }
}
