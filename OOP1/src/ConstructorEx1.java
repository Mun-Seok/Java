// 컴파일러가 자동으로 기본 생성자를 추가해주는지 보는 예제
class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}
public class ConstructorEx1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
//        Data2 data2 = new Data2();  // Compile Error 발생
    }
}
