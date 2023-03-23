import java.util.*;
public class A1113364_0317_1 {
    public static void main(String[] argv) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入n的值:");
        int n= sc.nextInt();
        System.out.print("請輸入m的值:");
        int m= sc.nextInt();

        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+"\t");
                System.out.printl("");
            }
        }
        
    }
}

    

