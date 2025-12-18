public class Accessmodifier {  // access modifier-control diney
    private int a=10;
    public int b=20;
    protected int c=30;
    int d=40;
}
    class c{
        static void main() {
            Accessmodifier obj =new Accessmodifier(); // role of constructor-> object initilization 
            obj.test=10;
        }
    }