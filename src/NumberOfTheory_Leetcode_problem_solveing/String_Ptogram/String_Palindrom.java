package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class String_Palindrom {
    public static void main(String[] args) {
        String s="maDaM ";
        if (palindrome(s))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
    public static boolean palindrome(String s)
    {
       String k=s.toLowerCase().replaceAll(" ","");
       String reverse="";
        for(int i=k.length()-1;i>=0;i--)
        {
            reverse+=k.charAt(i);
        }
        return k.equals(reverse);
    }
}
