// finally블럭을 사용하지 않은 예제(deleteTempFiles() 메서드를 중복해서 적어줘야한다.)
public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception exception){
            exception.printStackTrace();
            deleteTempFiles();
        }
    }

    static void startInstall() {
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }
    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */}
}
