// 2개의 사용자 정의 예외 클래스를 만들어 예외를 발생시키는 예제
public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException spaceException) {
            System.out.println("에러 메시지 : " + spaceException.getMessage());
            spaceException.printStackTrace();
            System.out.println("공간을 다시 확보한 후에 다시 설치하시기 바랍니다.");
        } catch(MemoryException memoryException) {
            System.out.println("에러 메시지 : " + memoryException.getMessage());
            memoryException.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
         }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다.");
        }
    }
    static void copyFiles(){/* 파일들을 복사하는 코드를 적는다. */}
    static void deleteTempFiles(){/* 파일들을 복사하는 코드를 적는다. */}

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
    static boolean enoughMemory(){
     // 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String message) {
        super(message);
    }
}

class MemoryException extends Exception {
    MemoryException(String message) {
        super(message);
    }
}
