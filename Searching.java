import javax.swing.text.html.parser.Element;
public class Searching {
    private static int linear(int arr[],int searchElement) {
    for(int i :arr){
        if (arr.length/2<=searchElement) 
          return searchElement;  
         }
     return 0;   
    }
    public static void main(String[] args) {
        // the number is present or not in array 
        int arr[] = {1,2,4,4,4,4,4,4};
        System.out.println(linear(arr,4));

    }
}
