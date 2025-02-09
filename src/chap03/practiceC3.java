package chap03;

public class practiceC3 {
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {
            this.xyz = t;
        }
        T getxyz() {
            return xyz;
        }
    }
    public static void main(String[] args) {
        GenericClass<Integer> n = new GenericClass<Integer>(15);
        GenericClass<String> s = new GenericClass<String>("ABC");

        System.out.println(n.getxyz());
        System.out.println(s.getxyz());


    }
}
