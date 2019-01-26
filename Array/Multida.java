class Multida
{
    public static void main(String[]args)
    {
    int [][] b ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int [][] a ={{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    int sum [][] =new int [3][4];
    for(int i = 0;i<3;i++)
    {
        for(int j =0;j<4;j++)
        {
            sum [i][j]=a[i][j]+b[i][j];
            System.out.print(sum[i][j]+"\t");
            
        }
  System.out.println();
    }
  
    }

}