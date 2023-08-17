// 익명 클래스로 변환하는 예
import java.awt.*;
import java.awt.event.*;

public class InnerEx7 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new EventHandler());
    }
}
class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        System.out.println("ActionEvent occurred!!!");
    }
}