package ProblemsOnSorting;

public class Question2 {
    //use selection sort
    static void fruitsort(String arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minIbdex = i;
            for (int j = i+1; j < arr.length; j++) {
               if (arr[j].compareTo(arr[minIbdex]) < 0){
                   minIbdex = j;
               }
            }
            String tepm = arr[i];
            arr[i] = arr[minIbdex];
            arr[minIbdex] = tepm;
        }
    }
    public static void main(String[] args) {
        String arr[]  = {"mango",  "apple" , "banana", "guava" , "grapes"};
        fruitsort(arr);
        for (String i:
            arr ) {
            System.out.print(i + " ");
        }

    }
}
