package lesson2;

public class Task6 {
    public static void main(String[] args) {
        int[] forCheckBalanceArray = {1, 2, 3, 1, 2, 3};
        System.out.println(checkbalance(forCheckBalanceArray));
    }
    public static boolean checkbalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}
