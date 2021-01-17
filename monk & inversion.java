import java.util.Scanner;

/**
 *
 * @author shiv
 */
public class MahaMat 
{

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int p,n,i,j,k,m;
        
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        for(int c=0;c<p;c++)
        {
            int count=0;
            n=sc.nextInt();
            int a[][]=new int[n][n];
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    for(k=i;k<n;k++)
                    {
                        for(m=j;m<n;m++)
                        {
                            if(a[i][j]>a[k][m])
                            {
                                count++;
                            }
                                
                        }
                    }
                }
            }
            
            System.out.println(count);
            
        }
    }
    
}