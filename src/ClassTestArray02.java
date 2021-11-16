public class ClassTestArray02 {
    public static void main(String[] args) {
        int a[];
        { a=new int[5];
    }
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println(a[4]);
        for(var i=0;i<a.length;i++) {      //type inference variable
            System.out.println(a[i]);
        }
    }
}
