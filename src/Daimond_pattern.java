public class Daimond_pattern {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++)
        {
            for(int j=row-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row-1;i>0;i--)
        {
            for(int k=row-i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
