
class RepeatElement  
{ 
    void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        RepeatElement repeat = new RepeatElement(); 
        int n;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }
        
        int arr_size = arr.length; 
        repeat.printRepeating(arr, arr_size); 
    } 
}