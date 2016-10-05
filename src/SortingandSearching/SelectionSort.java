/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingandSearching;

/**
 *
 * @author zulfikar
 */

    public class selection {
    public static void main(String[] args)
    {
        int min,i,j, temp;
        int a[]={5,8,11,14,4,7,1};
         
          for(i=0;i<a.length;i++)
          {
              min=i;
              for( j=i+1;j<a.length;j++)
                  if(a[j]<a[min])
                  {
                      min=j;
                  }
          temp= a[i];
          a[i]=a[min];
          a[min]=temp;
          }
          
          	

for (int n = 0; n < a.length; n++) {
   System.out.print(a[n] + ", ");

    }
    
}
}
