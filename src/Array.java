import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //配列の宣言と作成
        int[] array1 = new int[5];
        System.out.println(Arrays.toString(array1));

        // 初期値を指定し、配列を宣言・作成
        int[] array2 = {1,10,100,1000,10000};
        System.out.println(array2[2]);

        //for文で配列の要素を全て取得
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        //２次元配列の作成
       String[][] array3 = new String[][]{
            {"1-1","1-2","1-3"},
	         {"2-1","2-2","2-3"},
	       {"3-1","3-2","3-3"},
        };
        array3[2][2] = "A";
        System.out.println(array3[2][2]);
        System.out.println(array3[1][1]);
    }
}
