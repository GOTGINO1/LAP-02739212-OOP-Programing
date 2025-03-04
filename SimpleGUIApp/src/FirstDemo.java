import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstDemo {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton multiplyButton;
    private JButton subButton;
    private JPanel mainForm;

    public FirstDemo() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = doAdd(Double.parseDouble(textField1.getText()),
                            Double.parseDouble(textField2.getText()));
                    displayResult("Add Result", result + "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err){
                    displayResult("ERROR" , "Please input numeric only!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = doSub(Double.parseDouble(textField1.getText()),
                            Double.parseDouble(textField2.getText()));
                    displayResult("Add Result", result + "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err){
                    displayResult("ERROR" , "Please input numeric only!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = doMul(Double.parseDouble(textField1.getText()),
                            Double.parseDouble(textField2.getText()));
                    displayResult("Add Result", result + "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err){
                    displayResult("ERROR" , "Please input numeric only!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    private double doAdd(double n1 , double n2){
        return n1+n2;
    }
    private double doSub(double n1 , double n2){
        return n1-n2;
    }
    private double doMul(double n1 , double n2){
        return n1*n2;
    }
    private void displayResult(String title , String msg, int type){
        JOptionPane.showMessageDialog(null , msg , title , type);
    }
    public JPanel getMainPanel(){
        return this.mainForm;
    }
}
