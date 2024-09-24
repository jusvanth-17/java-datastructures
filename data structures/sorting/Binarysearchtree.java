import java.util.*;
class  Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
         this.left=null;
         this.right=null;
    }
}
class BST{
    Node root;
    BST()
    {
        this.root=null;
    }
    void insert(int data)
    {
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
        }
        else{
            Node temp=root;
            while(true){
            if(newnode.data<temp.data){
                if(temp.left==null)
                {
                  temp.left=newnode;
                  break;
                }
                else{
                    temp=temp.left;
                }
            }
            else  if(newnode.data>temp.data){
                if(temp.right==null)
                {
                  temp.right=newnode;
                  break;
                }
                else{
                    temp=temp.right;
                }
            }
            }
        }
    }
    void display()
    {
        displayinorder(this.root);
        System.out.println();
        displaypreorder(this.root);
        System.out.println();
        displaypostorder(this.root);

    }
    void displayinorder(Node root){
        {
            if(root==null)
              return;
           }
           displayinorder(root.left);
           System.out.print(root.data+" ");
           displayinorder(root.right);
           
    }
    void displaypreorder(Node root){
        {
            if(root==null)
              return;
           }
           System.out.print(root.data+" ");
           displayinorder(root.left);
           displayinorder(root.right);
           
    }
    void displaypostorder(Node root){
        {
            if(root==null)
              return;
           }
           displayinorder(root.left);
           displayinorder(root.right);
           System.out.print(root.data+" ");
    }
}
class Binarysearchtree{
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
        int n=j.nextInt();
        BST t1=new BST();
        for(int i=0;i<n;i++)
        {
            t1.insert(j.nextInt());
        }
        t1.display();
    }
}