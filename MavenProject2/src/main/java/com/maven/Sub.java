package com.maven;

public class Sub {
    public void su()
    {
    	int a=50;
    	int b=7;
    	int c=a-b;
    	//good
    	System.out.println(c);
    }public static void main(String[] args) {
		Sub d=new Sub();
		d.su();
	}
    
}
