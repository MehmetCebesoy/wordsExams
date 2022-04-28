import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k=30;
        String a=s.substring(0,k);
            String smallest = a;
            String largest = a;
            int small = 0, large = 0;

        largest = s.substring(large, large + k);
        for (int i = 0; i <= (s.length() - k); i++) {
             a=s.substring(i,k+i);
                if (a.compareTo(smallest)<0) {
                    smallest=a;
                }
                if (a.compareTo(largest)>0) {
                    largest=a;
                }

            }

        

          System.out.println( smallest + "\n" + largest);
        }
}