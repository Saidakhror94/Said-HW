package Hello;

public class Main {
    int instanceVar = 1;
    static int staticVar = 2;

    public static void main(String[] args) {
        int localVar = 3;
        System.out.println(localVar); // заработало так как локальные переменная может работать только внутри метода
        System.out.println(staticVar); // так же заработало так как статические переменные могут вне зависимости расположения выводить консоль и являються гипкими
        System.out.println(instanceVar); // переменные экземпляра является на данный момент не понятной
    }
    public static void test(){
        System.out.println(staticVar);
        System.out.println(InstanceVar);
        System.out.println(localVar);

    }
}
