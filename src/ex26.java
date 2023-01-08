public class ex26 {
    public static void main(String[] args) {
        int [] printArray= twoParameters(5,3);
        for (int i = 0 ; i<printArray.length;i++){
            System.out.print(printArray[i] + "\t");
        }
    }
    public static int [] twoParameters (int firstParameter, int secondParameter) {
        int [] newArray = new int[firstParameter];
        for (int i = 0 ; i< newArray.length;i++){
            newArray[i]=secondParameter;
        }
        return newArray;

    }

}
