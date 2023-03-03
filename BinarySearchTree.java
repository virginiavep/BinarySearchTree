/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virginia_p.binarysearchtreeproject;

/**
 *
 * @author Penn
 */
public class BinarySearchTree {
    private Node root;
    public BinarySearchTree()
    {
        root = null;
    }
    public boolean isEmpty () 
    {      
        return root == null;
    }
    public void insert(String word)
    {
        //If the tree is empty, insert object at the root
        if ( isEmpty() ) {
            root = new Node(word);
        }
        else
        {
            Node temp = root;
            while(temp != null)
            {
                //update frequency
                if(temp.getWord().equals(word))
                {
                    temp.incrementFrequency();
                    break;
                }
                //Determine whether p should go left or right
                else if(temp.getWord().compareTo(word) > 0)
                {
                    //Is there a left child already
                    if(temp.getLeft() == null) 
                    {
                        temp.setLeft(new Node(word));
                        break;
                    }
                    else
                        temp = temp.getLeft();
                }
                else
                {
                   //Is there a right child already
                    if(temp.getRight() == null) 
                    {
                        temp.setRight(new Node(word));
                        break;
                    }
                    else
                        temp = temp.getRight();
                }
      
            }
        }
    }
  
   public void search(String word)
    {
        System.out.println("Searching " + word);
        Node temp = root;
        while(temp != null)
        {
            //Check for match
            if(temp.getWord().equals(word))
                break;
            //left child
            else if(temp.getWord().compareTo(word) > 0)
               temp = temp.getLeft();
            //right child
            else
               temp = temp.getRight();
        }
        //print whether the random string word is in the tree
        if(temp == null)
            System.out.println("Not found " + word);
        else
            System.out.println("Found " + word + ", Frequency = " 
                    + temp.getFrequency());
  
    }
    //Puts output in an ascending order (left to right)
    private void inorder(Node n)
    {
        if(n == null) return;
        inorder(n.getLeft());
        System.out.println(n.getWord() + "[" + n.getFrequency() + "]");
        inorder(n.getRight());
    }
    public void printInOrder()
    {
        System.out.println("Inorder traversal");
        inorder(root);
        System.out.println("------");
    }
    //Begins at the root, moves from left to right subtree
    private void preorder(Node n)
    {
        if(n == null) return;
        System.out.println(n.getWord() + "[" + n.getFrequency() + "]");
        preorder(n.getLeft());  
        preorder(n.getRight());
    }
    public void printPreOrder()
    {
        System.out.println("Preorder traversal");
        preorder(root);
        System.out.println("------");
    }
    //Traverse the left subtree, then right and last the root node
    private void postorder(Node n)
    {
        if(n == null) return;
      
        postorder(n.getLeft());  
        postorder(n.getRight());
        System.out.println(n.getWord() + "[" + n.getFrequency() + "]");
   }
   public void printPostOrder()
   {
        System.out.println("Postorder traversal");
        postorder(root);
        System.out.println("------");
   }  
}
