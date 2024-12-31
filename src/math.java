public class math {
    public static void main(String[] args) {
        // 後置インクリメント/デクリメント 後置の場合は、1行中に含まれる全ての処理の後に、インクリメント/デクリメント
        int x = 2;
        int y = x++;
        System.out.println(x); //3
        System.out.println(y); //2

        //前置インクリメント/デクリメント 前置の場合は、1行中に含まれる全ての処理の前に、インクリメント/デクリメントします。
        int x1 = 2;
        int y2 = ++x1;
        System.out.println(x1); //3
        System.out.println(y2); //3

        //基本型
        int a = 10;
        int b = a;
        int c = 10;
        b = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a == b);
        System.out.println(a == c);

        //参照型
        //参照型は、値そのものではなく、参照値を格納していru。 つまり、「abc」という文字列ではなく。参照元を比較している
        String A = new String("abc");
        String B = A;
        System.out.println(A);
        System.out.println(B);
        System.out.println(A == B);

        String C = new String("abc");
        String D = new String("abc");
        //それぞれ「new String()」という形で、新しいオブジェクト(つまり、参照元)を作成しているため、falseに
        System.out.println(C == D);


        // 条件演算子
        int aaa = 1;
        int bbb = 1;
        int ccc = 2;
        if(aaa == bbb){
            System.out.println("aaaとbbbは等しい");
        }
        if((aaa == bbb) && (aaa == ccc)){
            System.out.println("aaaとbbbは等しい、かつaaaとcccは等しい");
        }
        if((aaa == bbb) || (aaa == ccc)){
             System.out.println("aaaとbbbは等しい、またaaaとcccは等しい");
        }
    }
}
