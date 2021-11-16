public class ClassTestArray03 {
    //passing array to method
    static void min(int a[]) {
        int min=a[0];
        for(var i=1;i<a.length;i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int a[]={13,78,7,90,56,1};
        min(a);
    }
}
