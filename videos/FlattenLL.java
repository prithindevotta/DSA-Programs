package cp.videos;

public class FlattenLL {
    static class Node {
        int data;
        Node next;
        Node child;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }
    public static Node flattenLinkedList(Node start) {
        if(start == null){
            return start;
        }
        Node temp = flattenLinkedList(start.next);
        Node ans, ansTemp;
        if(start != null && temp != null){
            if(start.data<temp.data){
                ans = start;
                start = start.child;
            }
            else{
                ans = temp;
                temp = temp.child;
            }
        }
        else {
            ans = start;
            start = start.child;
        }
        ansTemp = ans;
        while(start != null && temp != null){
            if(start.data<temp.data){
                ansTemp.child = start;
                start = start.child;
                ansTemp = ansTemp.child;
            }
            else{
                ansTemp.child = temp;
                temp = temp.child;
                ansTemp = ansTemp.child;
            }
        }
        while(temp != null){
            ansTemp.child = temp;
            ansTemp = ansTemp.child;
            temp = temp.child;
        }
        while(start != null){
            ansTemp.child = start;
            ansTemp = ansTemp.child;
            start = start.child;
        }
        return ans;
    }
}
