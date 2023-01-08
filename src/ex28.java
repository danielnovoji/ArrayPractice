import java.util.Random;

public class ex28
{
    public static void main(String[] args) {
        int [] newArr;
        newArr=firstPar(10);
        for (int i = 0 ; i < newArr.length; i ++){
            System.out.print(newArr[i] + "\t");
        }

    }
    public static int [] firstPar (int firstPar){
        int [] randomArray = new int[firstPar];
        for (int i = 0; i<randomArray.length; i ++){
            randomArray[i]=randomNumberGenerator();
        }
        return randomArray;

    }
    public static int randomNumberGenerator () {
        Random random = new Random();
        int randomNum = random.nextInt(1 , 101);
        return randomNum;

    }

}
