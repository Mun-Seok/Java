// Annotation SafeVarargs 사용해 경고가 나타나지 않게 하는 예제
import java.util.Arrays;
class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... arr) {
        this.arr = arr;
    }

    @SafeVarargs
//    @SuppressWarnings("unchecked") // 같은 효과
    public static <T> MyArrayList<T> asList(T...a){
        return new MyArrayList<>(a);
    }
    public String toString(){
        return Arrays.toString(arr);
    }

}
public class AnnotationEx4 {
//    @SuppressWarnings("unchecked") // 같은 효과
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");

        System.out.println(list);
    }
}
