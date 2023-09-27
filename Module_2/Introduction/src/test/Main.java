package test;

public class Main {
    int[] solution(int[] a) {
        for(int i = 0; i<a.length -1; i++){
            for(int j = i+1; j<a.length; j++ ){
                if(a[i] != -1 && a[j]!= -1){
                    if(a[i]>a[j]){
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
