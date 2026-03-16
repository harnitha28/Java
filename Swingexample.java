import javax.swing.*;
public class Swingexample {
public static void main(String[] args) {
JFrame frame = new JFrame("JList Example");
JFrame frame = new JFrame("ScrollPane Example");
String[] data = {"Java", "Python", "C++"};
JList<String> list = new JList<>(data);
list.setBounds(80, 40, 100, 80);
JTextArea ta = new JTextArea(5, 20);
JScrollPane sp = new JScrollPane(ta);
frame.add(list);
frame.setSize(300, 200);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
sp.setBounds(50, 40, 200, 100);
frame.add(sp);
frame.setSize(300, 200);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
