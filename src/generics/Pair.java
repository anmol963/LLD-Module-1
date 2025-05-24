package generics;

public class Pair<V, S>{

    private V first;
    private S second;

    public Pair(V first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public V getFirst() {
        return this.first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getSecond() {
        return this.second;
    }
//    Here V ans S does not exist. Basically a static function can not reference a not static member
//    public static V doSomething(V val1, S val2){
//        System.out.println(val1);
//        return val1;
//    }

    // generics on method level
    // here T is available only for this method
    public static <T> void doSomething(T val) {
        System.out.println(val);
    }

    public <Y, Z> Z example(V first, Y second, Z third) {
        return third;
    }
}
