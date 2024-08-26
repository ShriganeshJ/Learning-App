package org.core.java.interview;

public class FirstOccuranceOfString {
    public static void main(String[] args)
    {
        String str ="googles";
        System.out.println("first index "+str.indexOf('g'));
        System.out.println("last index"+str.lastIndexOf('g'));
        System.out.println("first repeated char is ::"+firstRepeatedChar(str));
    }

    static char firstRepeatedChar(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if(first!=last)
            {
                return str.charAt(i);
            }

        }
        return '\0'; // If no repeating character found
    }
}
