// 반환값을 참조변수로 반환하는 예제
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;

        Data data2 = copy(data);
        System.out.println("data.x = " + data.x);
        System.out.println("data2.x = " + data2.x);
    }

    static Data copy(Data data) {
        Data temp = new Data();
        temp.x = data.x;

        return temp;
    }
}
