/**
 * @author Sarthak Chauhan (https://github.com/Sar1hak)
 * @see Linked List algorithm
 */

class Node
{   public int info;
    public Node next;
}
public class LinkedList
{   Node start;
    LinkedList()
    { start=null;
    }
    //************************
    void create()
    {   Node ptr=null;
        for(int i=1; i<=5; i++)//creation
        {   if(i==1) start=ptr=new Node();
            else ptr=ptr.next;
            ptr.info=i;
            if(i==5) ptr.next=null;
            else ptr.next=new Node();
        }
    }//create\
    //************************
    void display()
    {    Node ptr=start;
        while(ptr!=null)
        {   System.out.print(ptr.info+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }//display
    //************************
    void displayFOR()
    {   for(Node ptr=start;ptr!=null;ptr=ptr.next)
        {   System.out.print(ptr.info+" ");
        }
    }//displayFOR
    //************************
    void insert(int value, int pos)
    {    Node ptr=null;
        //Insert as first node
        if(pos==1)
        {   Node temp=new Node();
            temp.info=value;
            temp.next=start;
            start=temp;
        }//if
        //Insert somewhere in between the list
        int ctr=0;        
        for(ptr=start;ptr!=null;ptr=ptr.next)//traversal
        {   ctr++;
            if(ctr==pos-1)
            {   Node temp=new Node();
                temp.info=value;
                temp.next=ptr.next;
                ptr.next=temp;
            }//if
        }//for
    }//insert
    //************************
    void delete(int pos)
    {   Node ptr=null;
        int ctr=0;        
        //Delete the first node
        if(pos==1)
        { start=start.next;
        }
        //delete somewhere in between the list
        for(ptr=start;ptr!=null;ptr=ptr.next)//traversal
        {   ctr++;
            if(ctr==pos-1)
            {   ptr.next=ptr.next.next;
            }
        }
    }//delete
    //************************
    void concat(LinkedList List2)
    {   Node ptr=null;
        for(ptr=start;ptr!=null;ptr=ptr.next)//traversal
        {   if(ptr.next==null)
            {   ptr.next=List2.start;
                break; //required
            }
        }
    }//concat
    //************************
    Node split(int splitPos)
    {   Node start2=null, ptr=null;
        int ctr=0;
        for(ptr=start;ptr!=null;ptr=ptr.next)//traversal
        {   ctr++;
            if(ctr==splitPos)
            {   start2=ptr.next;
                ptr.next=null;
                break;
            }//if
        }//for
        return start2;
    }//split
    //************************
    void reverse()
    {   Node ptr=null, pptr=start, nptr=start.next;
        start.next=null;
        while(nptr!=null)
        {   ptr=nptr;
            nptr=ptr.next;
            ptr.next=pptr;
            pptr=ptr;
        }//while
        start=ptr;
    }//reverse
    //************************
    void swapFirstLast()
    {   Node first, second, last, secondLast;
        first=second=last=secondLast=null;
        first=start;
        second=first.next;
        for(Node ptr=start; ptr.next!=null; ptr=ptr.next)//run till sec last node
        {   if(ptr.next.next==null) //if second last node
            {   secondLast=ptr;
                last=ptr.next;
            }
        }
        last.next=second;
        secondLast.next=first;
        first.next=null;
        start=last;
    }//swapFirstLast
    //************************
    void swap2nodes(int node1, int node2)
    {   int count=0;
        Node first, beforeFirst, second, beforeSecond, temp;
        first=beforeFirst=second=beforeSecond=temp=null;
        for(Node ptr=start; ptr!=null; ptr=ptr.next)
        {   count++;
            if(count==node1-1) beforeFirst=ptr;
            if(count==node1) first=ptr;
            if(count==node2-1) beforeSecond=ptr;
            if(count==node2) second=ptr;
        }
        beforeFirst.next=second;
        temp=first.next;
        first.next=second.next;
        second.next=temp;
        beforeSecond.next=first;
    }//swap2nodes
    //************************
    void sort()
    {   for(Node ptr1=start; ptr1!=null; ptr1=ptr1.next)
        {   for(Node ptr2=ptr1; ptr2.next!=null; ptr2=ptr2.next)
            {   if(ptr1.info<ptr2.info)
                { int t=ptr1.info; ptr1.info=ptr2.info; ptr2.info=t;
                }//if
            }//inner
        }//outer
    //Other methods can also be followed
    }//sort
    //************************
    void displayREC(Node ptr)
    {   System.out.print(ptr.info+" ");
        if(ptr.next!=null)
        {   displayREC(ptr.next);
        }
    }//display
    //************************
    int sum(Node ptr)
    {   if(ptr.next==null)
        {   return ptr.info;
        }
        else
        {   return ptr.info+sum(ptr.next);
        }
    }//sum
    //************************
    int count(Node ptr)
    {   if(ptr.next==null)
            return 1;
        else
            return 1+count(ptr.next);
   }//count    
    //************************   
   void createCIRCULAR()
   {   Node ptr=null;
       for(int i=1; i<=5; i++)//5 nodes
       {    if(i==1) {start=ptr=new Node(); }
            else { ptr=ptr.next; }
            ptr.info=i;//input if reqd
            if(i==5) ptr.next=start;
            else ptr.next=new Node();
        }
    }//create()
    //************************
    void displayCIRCULAR()
    {   Node ptr=start;
        do
        {   System.out.print(ptr.info+" ");
            ptr=ptr.next;
        }while(ptr!=start);
    }//display
    //************************
    public static void main(String agrs[])
    {   LinkedList obj=new LinkedList();
        LinkedList obj2=new LinkedList();
        obj.create();
        //just call the functions you want to
        obj.displayREC(obj.start);
        System.out.println();
        System.out.println("Sum = "+obj.sum(obj.start));
        System.out.println("Count = "+obj.count(obj.start));
    }//main
}//class lList

