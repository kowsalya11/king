public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a[]={3,-4,6,2,-6,3};
      int t=a.length;
       int[] c=new int[t];
       int sum=0;
        int i;
        c[0]=2;
        for(i=0;i<t-1;i++)
        {
            
         c[i+1]=a[i]+c[i];
            System.out.println(""+c[i]);
    sum+=c[i];
          }  System.out.println(""+c[0]);
        System.out.println(""+sum);
    
    }
}