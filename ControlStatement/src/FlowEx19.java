public class FlowEx19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) // 블럭 {} 생략
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    System.out.println(""+i+j+k); // 문자열을 더해 문자열로 바꿔줌
    }
}
