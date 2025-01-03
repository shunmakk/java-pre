public class Branch {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        if(var1 > var2){
            System.out.println(var1 + "は" + var2 + "よりも大きい");
        }
        else if(var1 < var2){
            System.out.println(var1 + "は" + var2 + "よりも小さい");
        }
        else{
            System.out.println(var1 + "は" + var2 + "と等しい");
        }

        //真偽値
        System.out.println(var1 > var2 ? "正" : "偽");

        int var3 = 3;

        switch (var3) {
            case 1:
            System.out.println(1);   
                break;
            case 2:
            System.out.println(2);   
                break;
            default:
             System.out.println(3);
                break;
        }
    }
}
