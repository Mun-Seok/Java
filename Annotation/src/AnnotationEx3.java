// Annotation @SuppressWarnings를 사용해 경고가 뜨는 것을 억제하는 예제
import java.util.ArrayList;
class NewClass2{
    int newField;
    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;
    @Deprecated
    int getOldField(){
        return oldField;
    }
}

public class AnnotationEx3 {
//    @SuppressWarnings({"deprecation","unchecked"}) // 합쳐서 사용할 수 있음
    @SuppressWarnings("deprecation") // deprecation 관련 경고를 억제
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10; // @Deprecated가 붙은 대상을 사용
        System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상을 사용

        @SuppressWarnings("unchecked") // 지네릭스 관련 경고를 억제
        ArrayList<NewClass> list = new ArrayList<>(); // 타입을 지정하지 않음.
        list.add(nc);
    }
}
