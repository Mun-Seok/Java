// fork & join 프레임웍으로 계산한 시간와 for문을 사용한 시간 비교하는 예제
import java.util.concurrent.*;
public class ForkJoinEx1 {
    static final ForkJoinPool pool = new ForkJoinPool(); // 쓰레드 풀을 생성

    public static void main(String[] args) {
        long from = 1L, to = 100_000_000L;

        SumTask task = new SumTask(from, to);

        long start = System.currentTimeMillis(); // 시작시간 초기화
        long result = pool.invoke(task);
        System.out.println("Elapsed time(4 Core) : " + (System.currentTimeMillis() - start));

        System.out.printf("sum of %d~%d = %d%n", from, to, result);
        System.out.println();

        result = 0L;
        start = System.currentTimeMillis(); // 시작시간 초기화
        for (long i = from; i <= to; i++) {
            result += i;
        }
        System.out.println("Elapsed time(1 Core) : " + (System.currentTimeMillis() - start));
        System.out.printf("sum of %d~%d = %d%n", from, to, result);
    }
}

class SumTask extends RecursiveTask<Long> {
    long from, to;

    SumTask(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long compute() {
        long size = to - from + 1; // from ≤ i ≤ to

        if (size <= 5) { // 더할 숫자가 5개 이하면 숫자의 합을 반환
            return sum();
        }
        long half = (from + to) / 2;

        // 범위를 반으로 나눠서 두 개의 작업을 생성
        SumTask leftSum = new SumTask(from, half);
        SumTask rightSum = new SumTask(half + 1, to);

        leftSum.fork();

        return rightSum.compute() + leftSum.join();
    }
    long sum() { // from ~ to의 모든 숫자를 더한 결과를 반환
        long tmp = 0L;
        for (long i = from; i <= to; i++) {
            tmp += i;
        }
        return tmp;
    }
}