import java.util.Scanner;
class Pattern14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n-1;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}