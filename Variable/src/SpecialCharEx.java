public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\''); // '''이 불가능하기 때문에 \n으로 표현해준다./ '
        System.out.println("abc\t123\b456"); // \t에 의해 abc와 123 사이의 tab(수평 탭)이 발생하고 \b에 의해 3이 지워진다./ abc    12456
        System.out.println('\n'); // 개행(new line)문자 출력하고 개행/
        System.out.println("\"Hello\""); // 큰따옴표를 표현할 수 있다./ "Hello"
        System.out.println("c:\\"); // \(백슬러쉬)를 표현할 수 있다./ c:\

    }
}
