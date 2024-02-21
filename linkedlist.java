class Node{
     int data;
     Node next;
     Node(int data)
     {
       this.data=data;
       this.next=null;
     }
}
class Linkesdlist
{

   Node head;
   Linkesdlist()
   {
    this.head=null;
   }
   void addfirst(int data){
     Node newnode=new Node(data);
     newnode.next=head;
     head=newnode;
   }
   void addlast(int data){
    Node newnode=new Node(data);
    if(head==null)
    {
      head=newnode;
    }
    else{
      Node temp=head;
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=newnode;

    }
   }
   void delfirst()
   {
    if(head==null)
    {
      System.out.print("Linked list is empty");
    }
    else
    {
      head=head.next;
    }
   }
  void dellast()
  {
    if(head==null)
    {
      System.out.print("Linked list is empty");
    }
    else if(head.next==null)
    {
      head=null;
    }
    else{
      Node temp=head;
      while(temp.next.next!=null)
      {
        temp=temp.next;
      }
      temp.next=null;
    }
  }
   void print()
   {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
      
    }
   }
  }
   class linkedlist{
   public static void main(String[] args) {
       Linkesdlist l1=new Linkesdlist();
       l1.addfirst(50);
       l1.addfirst(90);
       l1.addfirst(100);
       l1.addfirst(200);
       l1.addlast(40);
       l1.print();

   }
   }
