package btvn3;

public class Boolean {
    public boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for (int i=2; i<= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for (int i=2; i<= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(float n){
        if (Math.ceil(n) != Math.floor(n)) {
            return false;
        }
        else {
            if(n<2){
                return false;
            }
            for (int i=2; i<= Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public  boolean isPrime(double n){
        if (Math.ceil(n) != Math.floor(n)) {
            return false;
        }
        else {
            if(n<2){
                return false;
            }
            for (int i=2; i<= Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
