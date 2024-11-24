import java.util.*;

class Matrix{
    private int row, col;
    private int[][] a;
    //method
    public Matrix(int row, int col){
        this.row = row;
        this.col = col;
        this.a = new int[row][col];
    }

    public void nextMatrix(Scanner sc){
        for(int i =0; i <row; i++){
            for(int j =0; j <col; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b){
        Matrix c = new Matrix(this.row, b.col);
        for(int i =0; i <row; i++){
            for(int j =0; j <b.col; j++){
                for(int k =0; k <col; k++){
                    c.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i <this.row; i++){
            for(int j =0; j <this.col; j++){
                sb.append(this.a[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
public class J04016_TICH_HAI_DOI_TUONG_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
