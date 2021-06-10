/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author LENOVO
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
     private static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
         }  
    }
    
    public static void main(String[] args){
        int bilangan[] ={3,60,35,21,45,32,5};  
                 
        System.out.println("Sebelum Dilakukan Sorting");  
        for(int i=0; i < bilangan.length; i++){  
            System.out.print(bilangan[i] + " ");  
        }  
        
        System.out.println();  
                  
        bubbleSort(bilangan);
                 
        System.out.println("Sesudah Dilakukan Sorting");  
        for(int i=0; i < bilangan.length; i++){  
            System.out.print(bilangan[i] + " ");  
        }  
    }