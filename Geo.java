public class Geo {

    public static void main(String[] args){
        System.out.println(geoI(2,4,2));
        System.out.println(geoR(9,2,7));
    }
    public static float geoI(int a, float q, int n){
        float wynik = q;
        for(int i = 1; i<n-1;i++){
            wynik *=q;
        }
        return wynik * a;
    }
    public static float geoR(int a, float q, int n){
        if(n<=1){
            return a;
        }
        else{

            return q * geoR(a,q,n-1);
        }
    }
}
