

 class Dup{

    int Remove_Duplicate(int a[],int n){

    if(n==0|| n==1)
    {
        return n;
    }
    int temp[] = new int[n];
    int j = 0;

    for(int i = 0;i<n-1;i++)
    {
        if(a[i]!=a[i+1])
        {
            temp[j++] = a[i];
            
        }

        
    }
    temp[j++] = a[n-1];
    
    for (int i=0; i<j; i++){  
        a[i] = temp[i];  
    }  
    return j; 
} 
}
public class Duplicate{


    public static void main(String[]args){

        int a[] = {'1','1','4','6','8','9','4'};
        Dup d1 = new Dup();

        int length = a.length;

        d1.Remove_Duplicate(a, length);


        
        for (int i=0; i<length; i++){ 
        System.out.print(a[i]+" ");  
 }  


    }
}




