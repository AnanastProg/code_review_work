public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public double solver(int a, int b, int c, int d){
        ///(4*a - d*b)/(4*c)
        return div(dif(times(2, a), times(d, b)), times(4, c));
    }
}
