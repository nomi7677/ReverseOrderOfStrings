package com.firstpackage;

public class ReverseOrderOfStrings {
    public static void main(String[] args) {
        String s1 = "Task Force";
        String s2 = " ";
        String a[]= s1.split(" ");
        for (int i=a.length-1;i>=0;i--){
            s2=s2+a[i]+ " ";
        }
        System.out.println(s2);
    }
}
