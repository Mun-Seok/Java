// 익명 클래스를 이용해 변경한 예제
import java.awt.*;
import java.awt.event.*;
public class InnerEX8 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
