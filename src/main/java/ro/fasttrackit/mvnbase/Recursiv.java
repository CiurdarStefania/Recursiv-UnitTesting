package ro.fasttrackit.mvnbase;

public class Recursiv {
    public float nNr(int n){
        if(n<0) throw  new IllegalArgumentException("n should be positive");
        if (n <= 1) {
            return n;
        }else {
            return 2/nNr(n+1)+n;
        }
    }
}
