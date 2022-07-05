import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jeopardy implements ActionListener {
  private JButton b1, b2, b3, b4;
 
  private JPanel quizPanel;
  int score = 0;
  JLabel scoreBox = new JLabel("0");
  int buttonCount = 0;
 
  public static void main(String[] args) {
    new Jeopardy().start();
  }
 
  private void start() {
    JFrame frame = new JFrame();
    quizPanel = new JPanel();
    frame.setLayout(new BorderLayout());
   
    frame.setVisible(true); //makes frame show up
    frame.setTitle("Jeopardy"); //names frame
    JPanel panel = createHeader("Computer Science"); //creates a header
    quizPanel.add(panel); //adds header to quizPanel
    frame.add(quizPanel); //adds quizPanel to frame
   
    b1 = createButton("$100"); //creates button, b1, to hold $100
    quizPanel.add(b1); //adds b1 to quizPanel
   
    b2 = createButton("$200");
    quizPanel.add(b2);
   
    b3 = createButton("$300");
    quizPanel.add(b3);
   
    b4 = createButton("$400");
    quizPanel.add(b4);
   
   
    b1.addActionListener(this);  //Add an action listeners to the buttons
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
   
    // 12. Fill in the actionPerformed() method below
   
    frame.pack();
    quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
    frame.add(makeScorePanel(), BorderLayout.NORTH);
    frame.setSize(500, 700);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 
  private JButton createButton(String dollarAmount) {
    JButton button = new JButton("");
    button.setText(dollarAmount);
    buttonCount++;
    return button;
  }
 
  public void actionPerformed(ActionEvent arg) {
   
    JOptionPane.showMessageDialog(null, "You pressed the " + ((JButton) arg.getSource()).getText() + " button.");
   
    JButton buttonPressed = (JButton)arg.getSource();
   
    if (buttonPressed.equals(b1)) {
      askQuestion("Is 5.0 a \"double\" or \"int?\"", "double", 100);
      b1.setEnabled(false);
    }
   
    else if (buttonPressed.equals(b2)) {
      askQuestion("\"System.out.println(a+b);\" prints out valid? \"yes\" or \"no\".", "no", 200);
      b2.setEnabled(false);
    }
    else if (buttonPressed.equals(b3)) {
      askQuestion("Is this application created with the Java Swing library? \"yes\" or \"no\".","yes", 300);
      b3.setEnabled(false);
    }
    else if (buttonPressed.equals(b4)) {
      askQuestion("How many bits are in a byte? Answer numerically.","8", 400);
      b4.setEnabled(false);
    }
  }
 
  public void askQuestion(String question, String correctAnswer, int prizeMoney) {
    JOptionPane.showMessageDialog(null, "Ready for the question?");
    String answer = JOptionPane.showInputDialog(question);
    if (answer.equals(correctAnswer)) {
      score += prizeMoney;
    }
    JOptionPane.showInputDialog(score);
    updateScore();
  }
 
  private Component makeScorePanel() {
    JPanel panel = new JPanel();
    panel.add(new JLabel("Score:"));
    panel.add(scoreBox);
    panel.setBackground(Color.LIGHT_GRAY);
    return panel;
  }
 
  private void updateScore() {
    scoreBox.setText(" " + score);
  }
 
  private JPanel createHeader(String topicName) {
    JPanel panelj = new JPanel();
    panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
    JLabel l1 = new JLabel(topicName);
    l1.setAlignmentX(Component.CENTER_ALIGNMENT);
    panelj.add(l1);
    return panelj;
  }
}