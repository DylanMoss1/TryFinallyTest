public class TryFinallyTest {
    public static int x = 0;
    public static void main(String[] args) {
        System.out.println(x());
    }

    public static int x() {
        try{
            x = 1;
            return 6;
        }
        finally{return x;}
    }

}
