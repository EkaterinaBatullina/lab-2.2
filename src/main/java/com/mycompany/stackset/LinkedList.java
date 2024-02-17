package com.mycompany.stackset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ekaterina
 */
public class LinkedList <T> {
    Node head;
        
    public void add(T e) throws EmptyElementException {
        
        if (head == null) {
            head = new Node();
             head.value = e;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node();
            current = current.next;
            current.value = e;
        }
        
    }
    
}
