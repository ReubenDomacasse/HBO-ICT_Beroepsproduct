import javax.swing.*;
import java.awt.*;

public class Test {

    private Test() {
        JFrame f = new JFrame("Kassabon");
        JPanel[] panelArray = new JPanel[6];
        for (JPanel aPanelArray : panelArray) {
            aPanelArray.setVisible(true);
            //x = horizontaal y = verticaal
            panelArray[0].setBounds(100, 10, 200, 200);
            panelArray[1].setBounds(300, 10, 200, 200);
            panelArray[2].setBounds(500, 10, 200, 200);
            panelArray[3].setBounds(700, 10, 200, 200);
            panelArray[4].setBounds(900, 10, 200, 200);
            panelArray[5].setBounds(1100, 10, 200, 200);
            panelArray[0].setBackground(Color.gray);
            panelArray[1].setBackground(Color.red);
            panelArray[2].setBackground(Color.blue);
            panelArray[3].setBackground(Color.green);
            panelArray[4].setBackground(Color.orange);
            panelArray[5].setBackground(Color.black);
            f.add(aPanelArray);
        }
        f.setSize(2160, 1440);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[]args){
        new Test();
    }
}
