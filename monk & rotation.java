import java.io.*;
/**
 *
 * @author shiv
 */
public class MonkRotFinal
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        int n,k,i,t,po;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        //System.out.println(t);
        for(int j=0;j<t;j++)
        {
    
            
            String[] line=br.readLine().split(" ");
   
            n=Integer.parseInt(line[0]);
            k=Integer.parseInt(line[1]);
            
            
             k=(k%n);
            int a[]=new int[n];
            int b[]=new int[n];
            
            String A=br.readLine();
            
            if(k==0)
            {
                System.out.println(A);
            }
            
            else
            {
                po=ordinalIndexOf(A," ",n-k);   
                
                String x1=A.substring(po+1);
                String x2=A.substring(0,po);
                
                System.out.println(x1+" "+x2);
                       
            }
                

        }
        
    }
    
    public static int ordinalIndexOf(String str, String substr, int n) 
    {
    int pos = str.indexOf(substr);
    while (--n > 0 && pos != -1)
        pos = str.indexOf(substr, pos + 1);
    return pos;
    }
    
}