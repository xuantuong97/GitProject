package thuc_hanh;



public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        int[] intArray2 = new int[5];
        int j = 0;
        for (int i = intArray.length - 1; i >=0; i--){
            intArray2[j] = intArray[i];
            j++;
        }
        System.out.println("Reverse Array: ");
        for (int k = 0; k < intArray2.length; k++){
            System.out.print(intArray2[k] + "\t");
        }

    }
}
