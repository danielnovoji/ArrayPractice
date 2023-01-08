public class ex31 {
    public static void main(String[] args) {
        int[] wow = new int[]{1,1,2,3,2};
        int [] catcher;
        catcher=newArr(wow, 1);
        for (int i = 0; i< catcher.length;i++){
            System.out.println(catcher[i]);
        }


    }

    public static int[] newArr(int[] arrayNum, int wholeNum) {
        int counter = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == wholeNum) {
                counter++;

            }
        }
        int[] newArray = new int[arrayNum.length - counter];
        for (int i = 0, j = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] != wholeNum) {
                newArray[j] = arrayNum[i];
                j++;
            }

        }
        return newArray;

    }
}
