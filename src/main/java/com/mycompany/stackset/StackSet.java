/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackset;

/**
 *
 * @author ekaterina
 */
public class StackSet {

    public static void main(String[] args) throws EmptyElementException {
        
        Stack<Integer> stack = new Stack<Integer>(10);
        for (int i = 0; i < 10; ++i) {
            stack.push(i);
        }
        
        System.out.println(stack.pop());
        
        System.out.println(stack.size);
        
        Set<Integer> set = new Set<Integer>(10);
        for (int i = 0; i < 10; ++i) {
            set.add(i);
        }
        set.add(1);
        for (int i = 0; i < set.array.length; ++i) {
            System.out.print(set.array[i] + " ");
        }
        System.out.println();
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList = set.asList();
        
        set.delete(5);
        for (int i = 0; i < set.array.length; ++i) {
            System.out.print(set.array[i] + " ");
        }
        System.out.println();
        
        System.out.println(set.contains(10));
    }
    
}
