public class VarEx2 {
    public static void main(String[] args) {

        int x = 10, y = 20; // 변수 x와 y에 각각 10 20으로 초기화
        int temp = 20; // 변수 temp를 20으로 초기화

        System.out.println("x : " + x + " y : " + y); // 변수 x와 y의 값 출력   x : 10 y : 20

        temp = x; // 변수 x에 저장된 값을 변수 temp에 저장
        x = y; // 변수 y에 저장된 값을 변수 x에 저장
        y = temp; // 변수 temp에 저장된 값을 변수 y에 저장

        System.out.println("x : " + x + " y : " + y); // 변수 x와 y의 값 출력   x : 20 y : 10

    }
}
