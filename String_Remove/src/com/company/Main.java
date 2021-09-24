package com.company;


public class Main {

    public static  String convert(String s)
    {
        StringBuffer  sb = new StringBuffer(s);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)<48 || sb.charAt(i)>57)
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
	// write your code
        String s = "8292sd01md33se83";
        String a =  convert(s);
        System.out.println(a);
    }
}
