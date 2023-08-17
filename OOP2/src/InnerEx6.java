// 익명 클래스를 사용하는 것을 보여주는 예제
public class InnerEx6 {
    Object iv = new Object() {
        void method() {
        }
    };
    static Object cv = new Object() {
        void method() {
        }
    };
    void myMethod(){
        Object lv = new Object() {
            void method() {
            }
        };
    }
}
