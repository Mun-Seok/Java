// 구문분석을 수행해 어떤 타입인지 출력하는 예제
interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        }else{
            Parseable p = new HTMLParser();
            return p;
            //return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문 분석 작업을 수행하는 코드를 적는다.*/
        System.out.println(fileName + "- XML Parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}
public class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
