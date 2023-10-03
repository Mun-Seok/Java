// 람다식의 타입을 어떤 형식으로 만들어내는지 알 수 있는 예제
@FunctionalInterface
interface MyFunction2 {
    void myMethod(); // public abstract void MyMethod
}
public class LamdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {}; // MyFunction f = (MyFunction)(() -> {});
        Object obj = (MyFunction)(()->{}); // Object타입으로 형변환이 생략됨
        String str = ((Object) (MyFunction2)(()->{})).toString();
        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(()->{}); // 에러 람다식은 Object 타입으로 형변환 안됨
        System.out.println((MyFunction2) (() -> {}));
//        System.out.println((MyFunction2)(()->{}).toString(); // 에러
        System.out.println(((Object) (MyFunction2) (() -> {})).toString());
    }
}
