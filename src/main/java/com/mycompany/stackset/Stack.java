/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackset;

/**
 *
 * @author ekaterina
 */
public class Stack <T> {
    
    int size;
    Object[] array;
    
    public Stack(int size) {
        
        array = new Object[size];
        
    }
    
    public T pop() {
        
        return (T) array[array.length - 1];
    } 
    
    public void push(T e) {
        
        if (size == array.length) {
            Object[] array1 = new Object[size + 1];
            for (int i = 0; i < size; ++i) {
                array1[i] = array[i];
            }
            array = array1;   
        }
        array[size] = e;
        size++;
               
    }
    
    public int size() {
        
        return array.length;
        
    }
    
}
