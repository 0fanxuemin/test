import java.io.UnsupportedEncodingException;

public class TestEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a="mifan米饭";
        System.out.println(a.getBytes("unicode").toString());
        System.out.println(new String(a.getBytes("unicode"),"unicode"));
        String b=new String("mifan米饭")+"mifan";
        if(a==b){
            System.out.println("true");
        }
        String A="a1";
        int B=1;
        String C="a"+B;
        System.out.println(A==C);
        System.out.println(A.equals(C));//123
    }
}

