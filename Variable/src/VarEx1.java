public class VarEx1 {
    public static void main(String[] args) {

        int year = 0; // 변수 year 선언하고 0으로 초기화
        int age = 14; // 변수 age 선언하고 14로 초기화

        System.out.println(year); // 변수 year을 출력    0
        System.out.println(age); // 변수 age를 출력      14

        year = age + 2000; // 변수 age 값에 2000을 더해서 변수 year에 저장
        age = age + 1; // 변수 age에 저장된 값을 1 증가시킴

        System.out.println(year); // 변수 year을 출력    2014
        System.out.println(age); // 변수 age를 출력      15

    }
}
