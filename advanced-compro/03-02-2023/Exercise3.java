import javax.swing.*;
import java.awt.*;

class Exercise3 extends JFrame {
    JPanel namePanel, addressPanel, buttonPanel;
    JLabel nameLabel, addressLabel;
    JTextField nameTextField;
    JTextArea addressTextArea;
    JScrollPane scrollPane;
    JButton okButton, cancelButton;

    Exercise3(String title) {
        super(title);
    }

    void addComponents() {
        namePanel = new JPanel();
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField("Siraspon", 20);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        this.add(namePanel, BorderLayout.NORTH);

        addressPanel = new JPanel();
        addressLabel = new JLabel("Address:");
        addressTextArea = new JTextArea(5, 20);
        addressTextArea.setText("I'll blow up into smithereens\n" +
                "And spew my tiny symphony\n" +
                "All up and down a city street\n" +
                "While tryna put my mind at ease\n" +
                "Like finishing this melody\n" +
                "This feels like a necessity\n" +
                "So this could be the death of me\n" +
                "Or maybe just a better me");
        addressTextArea.setLineWrap(true);
        addressTextArea.setWrapStyleWord(true);
        addressPanel.add(addressLabel);
        scrollPane = new JScrollPane(addressTextArea);
        addressPanel.add(scrollPane);
        this.add(addressPanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        this.add(buttonPanel, BorderLayout.SOUTH);        
    }

    void setFrameFeatures() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    static void createAndShowGUI() {
        Exercise3 frame = new Exercise3("653040462-9");
        frame.addComponents();
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
