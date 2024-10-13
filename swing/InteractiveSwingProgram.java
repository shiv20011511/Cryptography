import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractiveSwingProgram {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
            new InteractiveSwingProgram().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Interactive Swing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a label
        label = new JLabel("Click the button!");

        // Create a button
        JButton button = new JButton("Click me!");
        button.addActionListener(new ButtonClickListener());
JButton butto = new JButton("Close");
        butto.addActionListener(new ButtonClickListener());
        // Add components to the panel
        panel.add(label);
        panel.add(button);
panel.add(butto);

        // Add the panel to the frame
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        // Set the frame visible
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent a) {
String str = a.getActionCommand();
	if(str.equals("Click me!")){
            label.setText("Button clicked!");
            JOptionPane.showMessageDialog(frame, "You clicked the button!", "Button Clicked", JOptionPane.INFORMATION_MESSAGE);       
}else if(str.equals("Close")){
frame.dispose();
}
}
    }
}
