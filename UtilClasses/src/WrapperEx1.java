// Wrpper 클래스를 사용해 기본형을 객체로 다뤄 메서드를 사용해보는 예제
public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MAX_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + "bits");
        System.out.println("BYTES = " + Integer.BYTES + "bytes");
        System.out.println("TYPE = " + Integer.TYPE);
    }
}
