package day2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new  int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

    }
    public  static void takeUserInput(int ar[],int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the elemets");
        for (int i = 0; i < ar.length; i++) {
            ar[i]= sc.nextInt();
        }
    }
    public static void printingArray(int ar[],int size){
        for (int i = 0; i < size; i++) {
            System.out.println(ar[i]+" ");
        }
    }
    public static void changeValue(int ar[],int size){
        ar[0]=ar[0]+4;
    }
    public static int occurNumber(int ar[],int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter what you want to find");
        int ele = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i]==ele){
                count+=1;
            }
        }
        return count;
    }
    public  static int lineaerSearch(int ar[],int size,int key){
        Scanner sc = new Scanner(System.in);
        int flag=0;
        for (int i = 0; i < size; i++) {
            if (ar[i]==key){
                flag = 1;
            }
        }
        if (flag==1){
            System.out.println("the element is present in array");
        }else {
            System.out.println("the element is not present");
        }
        return key;
    }
    public static void zeroOne(int ar[],int size){
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < size; i++) {
            if (ar[i]==0){
                zeros+=1;
            }else {
                ones+=1;
            }
        }
        System.out.println("the ones: "+ones + "   " + "zeros is: "+ zeros);
    }
    public static void maxElement(int ar[],int size){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("the maximum is: "+ max);
    }
    public static void minElement(int[] ar, int size){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (ar[i]<min){
                min= ar[i];
            }
        }
        System.out.println("the minimum value  is: "+min);
    }
    public static void extreame(int ar[],int size){
        int start =0;
        int end = size-1;
        while (start<end){
            System.out.print(ar[start]+" ");
            System.out.print(ar[end]+" ");
            start+=1;
            end-=1;
        }
    }
    public static void reverse(int ar[],int size){
            int  start= 0;
            int end = size-1;
            while (start<=end){
                int temp = ar[start];
                ar[start]=ar[end];
                ar[end]=temp;
                start+=1;
                end-=1;
            }
        for (int i = 0; i < size; i++) {
            System.out.println(ar[i]);
        }
    }
}
