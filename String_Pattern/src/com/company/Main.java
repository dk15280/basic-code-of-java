package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String original = "Dhananjay";
        String pattern = "anan";
       /* boolean result = original.contains(pattern);
        if(result)
            System.out.println("Pattern matches with original");
        else
            System.out.println("Pattern not match");

       */
      int olen = original.length();
      int plen = pattern.length();
      char o,p;
      int count =0;

      for(int i=0;i<=olen-plen;i++)
      {
          o = original.charAt(i);
          p = pattern.charAt(0);
          if(o == p)
          {
              for(int j=i,k=0;j<i+plen;j++,k++)
              {
                  o = original.charAt(j);
                  p = pattern.charAt(k);
                  if(o == p) {
                      count++;
                  }
              }
          }
      }
      if(count == plen)
          System.out.println("pattern match");
      else
          System.out.println("pattern not match");
    }
}
