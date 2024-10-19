public class Zero_one_tringle {
    public static void main(String[] args) {
        //int curentnu=1;
                int row = 4;
                for(int i=0;i<=row;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if((i+j)%2==0)
                        {
                            System.out.print("1");
                        }
                        else {
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }
        }

