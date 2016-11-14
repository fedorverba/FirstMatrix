public class Matrix{
int n,m;
    double arr[][];
Matrix(int n,int m){
    arr = new double[n][m];
    this.n = n;
    this.m = m;
}
Matrix(int n){
arr=new double[n][n];
    this.n=n;
    this.m=n;
}
Matrix(){
arr=new double[1][1];
    this.n=1;
    this.m=1;
    arr[0][0]=0;
}
Matrix(double arr[][]){
    this.arr = new double[n][m];
for (int i=0;i<arr.length;i++){
    for (int j=1;j<arr[i].length;j++){
        this.arr[i][j]=arr[i][j];
    }
}
}
public String toString(){
    System.out.println();
}
}