public class ex27 {
    public static void main(String[] args) {
        int [] printArray= twoPar(3,7);
        for (int i = 0 ; i < printArray.length; i++){
            System.out.println(printArray[i]);
        }

    }
    public static int [] twoParameters (int firstParameter, int secondParameter){
        int [] newArray = new int[firstParameter];
        for (int i = 0 ; i<newArray.length; i++){
            newArray[i]=secondParameter;
            secondParameter++;


        }
        return newArray;
    }

    public static int [] twoPar (int firstParameter, int secondParameter){
        int [] newArr = new int[firstParameter];
        for (int i = 0 , j =secondParameter; i< newArr.length; j++,i++){
            newArr[i]=j;
        }
        return newArr;
    }
}
