package opps.generics;

public class Pair<T, S> {
    private T first;
    private S second;

    Pair(){

    }
    Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }
    public T getFirst(){
        return first;
    }
    //-----------------------
    public void setSecond(S second){
        this.second = second;
    }
    public S getSecond(){
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> psi = new Pair<>();
        psi.setFirst("Ravindra");
        psi.setSecond(209);
        System.out.println(psi.getFirst()+" "+psi.getSecond());
    }
}
