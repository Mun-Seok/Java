// Annotaion @Override를 사용해보는 예제
class Parent {
    void parentMethod(){}
}

class Child extends Parent {
    @Override
//    void parentmethod() {} // 조상 메서드의 이름을 잘못 적었음. 오버라이딩하지 않아 에러가 뜸.
    void parentMethod(){} // 에러 발생하지 않음
}
