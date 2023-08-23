// try-catch-resorces문을 사용한 예제
public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource closeableResource = new CloseableResource()) {
            closeableResource.exceptionWork(false); // 예외가 발생하지 않는다.
        } catch (WorkException workException) {
            workException.printStackTrace();
        } catch (CloseException closeException) {
            closeException.printStackTrace();
        }
        System.out.println();

        try (CloseableResource closeableResource = new CloseableResource()) {
            closeableResource.exceptionWork(true); // 예외가 발생한다.
        } catch (WorkException workException) {
            workException.printStackTrace();
        } catch (CloseException closeException) {
            closeException.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨");

        if (exception) {
            throw new WorkException("WorkException발생!!!");
        }
    }
    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String message) {
        super(message);
    }
}

class CloseException extends Exception {
    CloseException(String message){
        super(message);
    }
}