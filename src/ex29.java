public class ex29 {
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,5,10,5};
        int printHighestNum;
        printHighestNum=wholePar(arr);
        System.out.println(printHighestNum);

    }
    public static int wholePar (int [] highestNum){
        int max = 0;
        for (int i = 0 ; i< highestNum.length; i++) {
            if (max<highestNum[i]){
                max = highestNum[i];

            }

        }
        return max;

    }
}
