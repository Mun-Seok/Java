// 새로 생성한 쓰레드에서 고의로 예외를 발생시키고 예외 발생 당시의 호출스택을 출력하는 예제
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
    }
}
class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
