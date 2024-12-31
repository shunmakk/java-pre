class Curry {
   String name = "キーマカレー";

   public Curry() {
   }

   public String taste() {
      return "まずい";
   }
}



public class Main {
    public static void main(String[] args) {
        //Curry Classをインスタンス化
        Curry curryinstance = new Curry();
        ///Curryクラスのフィールドの値を参照
        System.out.println(curryinstance.name);
        //Curryクラスのフィールドの値を参照
        System.out.println(curryinstance.taste());
    }
}
