import java.util.Scanner;
public class TransposeMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row value of the Matrix:");
        int rows =sc.nextInt();
        System.out.println("Enter Column value of the Matrix:");
        int cols=sc.nextInt();
        
        int[][] Matrix=new int[rows][cols];
        int[][] Transpose=new int[cols][rows];
        
        System.out.println("Enter the Matrix values:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Transpose of the Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               Transpose[j][i]=Matrix[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
         System.out.print(Transpose[i][j]+" "); 
            }
         System.out.println();

        }
        sc.close();
    }
}