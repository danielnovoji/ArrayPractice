public class ex30 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,3 ,5 ,6 ,7 ,7};
        int printer = printDupes(arr, 7);
        System.out.println(printer);


    }

    public static int printDupes (int [] array, int wholeNum){
        int counter = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]==wholeNum){
                counter++;
            }
        }
        return counter;

    }
}
