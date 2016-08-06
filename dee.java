public class Passwordstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int i,j,k=0;int count=1,l=0;  
          //System.out.println(""+n);
    String[] a=new String[n]; 
    Scanner sc1=new Scanner(System.in); 
    for(i=0;i<n;i++)
    {
        a[i]=sc1.nextLine();
    }
    for(i=0;i<n;i++)
    {   
        l=a[i].length();
        //System.out.println(l);
       char[] b=a[i].toCharArray();
      //  System.out.println(""+b[i]);
       int y= b[k];
       // System.out.println(y);
       if(91>y&&y>=65||96<y&&y<123){      
          for(k=1;k<l;k++){
           //count++;
           y=b[k];
          if((91>y&&y>=65||96<y&&y<123)||(b[k]>=48&&b[k]<57)||(b[k]==95))
          {
          
          }}System.out.println("valid");
       
         for(k=1;k<l;k++){
        if(b[k]>=33&&b[k]<47){
           
       }
         
          } System.out.println("invalid"); 
       
       
       }}
    
    }           
    }
         
