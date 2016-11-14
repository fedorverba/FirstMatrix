public class Matrix{
int n,m;
    double arr[][];
Matrix(int n,int m){
    this.n = n;
    this.m = m;
    arr = new double[n][m];
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
    this.n=arr.length;
    this.m=arr[1].length;
    this.arr = new double[n][m];
for (int i=0;i<arr.length;i++){
    for (int j=0;j<arr[i].length;j++){
        this.arr[i][j]=arr[i][j];
    }
}
}
public String toString(){
    String s="Matrix{"+"\n";
    for (int i=0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            s+=arr[i][j]+" ";
        }
        s+="\n";
    }
s+="}";
    return s;
}
}