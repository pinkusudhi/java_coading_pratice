public class PyramidPattern {
    public static void main(String[] args) {

      int row=4;
      for (int i=1;i<=row;i++)
      {
          for(int j=i;j<=row-1;j++)
          {
              System.out.print(" ");
          }
          for (int k=1;k<=i*2-1;k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
