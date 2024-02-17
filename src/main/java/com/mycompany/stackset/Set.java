/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackset;

/**
 *
 * @author ekaterina
 */
public class Set <T> {
    
    Object[] array;
    int size;
    
    public Set(int size) {
        
        array = new Object[size];
        
    }
    
    public void add(T e) {
        
        boolean flag = true;
        for (int i = 0; i < array.length; ++i) {        
            if (e.equals(array[i]) == true) {
                flag = false;
            } 
        }
        if (flag == true) {
            if (size == array.length) {
                Object[] array1 = new Object[size + 1];
                for (int j = 0; j < size; ++j) {
                    array1[j] = array[j];
                }
                array = array1;   
            }
            array[size] = e;
            size++;            
        }    
            
    } 
    
    public LinkedList <T> asList() throws EmptyElementException {
        
        LinkedList<T> linkedList = new LinkedList<T>();
        for (int i = 0; i < array.length; ++i) {
            linkedList.add((T) array[i]);
        }
        return linkedList;
        
    }
    
    public void delete(T e) {
        
        int delta = 0;
        Object[] array1 = new Object[array.length - 1];
        for (int i = 0; i < array.length; ++i) {
            array1[i - delta] = array[i];
            if (array[i].equals(e)) {
                delta = 1;
            }
        }
        array = array1;   
        
    }
    
    public boolean contains(T e) { 
        
        boolean flag = false;
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals(e)) {
                flag = true;
            }
        }
        return flag;
        
    }
    
}
