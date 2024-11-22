package NumberOfTheory_Leetcode_problem_solveing.String_Ptogram;

public class String_Rotation {
    public static void main(String[] args) {
        String s="ABCD";
        String p="CDAB";
        String con=s.concat(s);
        boolean rotation=false;
        for(int i=0;i<con.length()-p.length();i++)
        {
            String sub=con.substring(i,i+p.length());
            if (sub.equals(p))
            {
                rotation=true;
                break;
            }
        }
        if (rotation)
        {
            System.out.println("string is rotaion");
        }
        else {
            System.out.println("String is not a rotation");
        }
    }
}
