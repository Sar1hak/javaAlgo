/**
 * @author Sarthak Chauhan (https://github.com/Sar1hak)
 * @see Stacked Linked List algorithm
 */

class Node
{   int info;
    Node next;
}
public class StackLinkedList
{   Node top;
    StackLinkedList()
    {   top=null;
    }
    //************************
    void push(int n)
    {   Node temp=new Node();
        if(temp==null)
        {   System.out.println("Overflow");
            return;
        }
        temp.info=n;
        temp.next=null;
        if(top==null) top=temp;
        else
        {   temp.next=top;
            top=temp;
        }
    }//push
    //************************
    int pop()
    {   if(top==null)
        {   System.out.println("Underflow");
            return 0;
        }
        int temp=top.info;
        top=top.next;
        return temp;
    }//pop
    //************************
    int peek()
    {   return top.info;
    }
    //************************
    void lifo()//traverse
    {   Node ptr=top;
        while(ptr!=null)
        {   System.out.print(ptr.info+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }//lifo
    public static void main()
    {   StackLinked stack=new StackLinkedList();
        stack.push(10);
        stack.push(5);
        stack.push(1);
        stack.lifo();
        stack.pop();
        stack.pop();
        stack.push(0);
        stack.lifo();
    }
}//class StackLinkedList
