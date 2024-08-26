package org.core.java.interview;

public class LastOccuranceOfString {
    public static void main(String[] args) {
        String str ="googlesl";
        System.out.println("first index "+str.indexOf('g'));
        System.out.println("last index"+str.lastIndexOf('g'));
        System.out.println("last repeated char is ::"+lastRepeatedChar(str));
    }

    static char lastRepeatedChar(String str)
    {
        char lastRep='\0';
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first!=last)
            {
                System.out.println(str.charAt(i));
                lastRep= str.charAt(i);

            }

        }
        return lastRep;
    }
}
