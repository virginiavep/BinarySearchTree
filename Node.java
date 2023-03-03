/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virginia_p.binarysearchtreeproject;

/**
 *
 * @author Penn
 */
public class Node {
private String word;
   private int frequency;
   private Node left, right;
  
   public Node(String word)
   {
       this.word = word;
       this.frequency = 1;
   }
  
   public void incrementFrequency()
   {
       frequency++;
   }
  
   public int getFrequency()
   {
       return frequency;
   }

   public String getWord() {
       return word;
   }

   public void setWord(String word) {
       this.word = word;
   }

   public Node getLeft() {
       return left;
   }

   public void setLeft(Node left) {
       this.left = left;
   }

   public Node getRight() {
       return right;
   }

   public void setRight(Node right) {
       this.right = right;
   }

   public void setFrequency(int frequency) {
       this.frequency = frequency;
   }
  
  
}