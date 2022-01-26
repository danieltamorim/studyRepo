package com.company;

public class Main {
    static int a, b;
    public static void main(String[] args) {
	// write your code here
        a = 10;
        b = 5;
        Add obj = new Add();
        System.out.print(a + "+" + b + " is equal to: ");
        System.out.println(obj.addNum(a,b));

        Difference obj2= new Difference();
        System.out.print(a + "-" + b + " is equal to: ");
        System.out.println(obj2.getDif(a,b));
    }


}
