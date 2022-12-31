import java.util.*;
public class Stacks{
    static boolean IsPalindrome(Node head){
        Node slow=head;
        boolean Ispalin=true;
        Stack<Integer> stack=new Stack<Integer>();
        
        while(slow!=null){
            stack.push(slow.data);
            slow=slow.ptr;
        }

        while(head!=null){
            int i= stack.pop();
            if(head.data==i){
                Ispalin=true;
            }else{
                Ispalin=false;
                break;
            }
            head=head.ptr;
        }
        return Ispalin;
    }
static class  Node{
    int data;
    Node ptr;
    Node(int d){
        data=d;
        ptr=null;
    }
}

    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(3);
        Node five=new Node(3);
        Node six=new Node(2);
        Node seven=new Node(0);
        one.ptr=two;
        two.ptr=three;
        three.ptr=four;
        four.ptr=five;
        five.ptr=six;
        six.ptr=seven;
        boolean condition=IsPalindrome(one);
        System.out.println("Palindrome : "+condition);
    }
}