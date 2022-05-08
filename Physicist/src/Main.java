import java.util.Scanner;

public class Main {




    public static String isEquil (int arr[][],int n){



        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {

                if (-100 <= arr[i][j] && arr[i][j] <= 100) {
                    sumx += arr[i][0];
                    sumy += arr[i][1];
                    sumz += arr[i][2];
                } else {

                    return "ERROR";
                }
            }

        }

        if (sumx == 0 && sumy == 0 && sumz == 0) {

return "YES";
        } else {

            return "NO";
        }

    }



    public static void main (String []args) {


        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("Number of forces ");
        if (n >= 1 && n <= 100) {
            int arr[][] = new int[n][3];
            Scanner o = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = o.nextInt();
                }
                System.out.println("Force number " + i);
            }
        String ans =   isEquil(arr,n);
        System.out.println(ans);
        if (ans.equals("ERROR")){
            System.exit(1);
        }
        }
        else {
            System.out.println("ERROR");
            System.exit(1);
        }
    }
}
