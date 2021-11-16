public class Tesr123 {
    int a;
    int b;

    Tesr123(int x, int y){
        a=x;
        b=y;
    }

    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Tesr123 obj = new Tesr123(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        obj.show();
    }
}







