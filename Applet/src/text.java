import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=text width=200 height=200>
</applet>
*/
public class text extends Applet implements ActionListener {
String msg="", msg2 = " ";
Button clearButton, rememberButton , recallButton;
TextField tf,sf,inputArea;
String message;

public void init() {
    clearButton = new Button("Clear");
    rememberButton = new Button("Remember");
    recallButton  =new Button("Recall");
    tf = new TextField(30);
    inputArea = new TextField(30);
    clearButton.addActionListener(this);
    rememberButton.addActionListener(this);
    recallButton.addActionListener(this);
    inputArea.addActionListener(this);
    add(clearButton);
    add(rememberButton);
    add(recallButton);
    add(inputArea);
    add(tf);
}
public void actionPerformed(ActionEvent e) {
    if ( e.getSource() == clearButton ) {
        msg = " ";
        inputArea.setText(msg);
        msg2 = "You preseed clear";
        tf.setText(msg2);
    }
    if ( e.getSource() == rememberButton ) {
        msg = "You pressed Remember";
        tf.setText(msg);
        message = inputArea.getText();
    }
    if ( e.getSource() == recallButton ) {
        msg = "You pressed Recall";
        tf.setText(msg);
        inputArea.setText(message);
    }
}
}

