package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        String[] str = {"break", "case", "continue", "default", "defer", "else","for", "func", "goto",
                "if", "map", "range", "return", "struct", "type", "var"};
        String input = sc.nextLine();
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(input))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println(input +" is a keyword ");
        }
        else
        {
            System.out.println(input +" is not a keyword ");
        }
    }
}
