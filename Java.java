import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Java {
    public static void main(String[] args) {
        // Frame create karo
        JFrame frame = new JFrame("File Handling with Swing");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Text Area create karo
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Panel with buttons
        JPanel panel = new JPanel();
        JButton saveButton = new JButton("Save to File");
        JButton loadButton = new JButton("Load from File");
        panel.add(saveButton);
        panel.add(loadButton);
        frame.add(panel, BorderLayout.SOUTH);

        // Save Button ka ActionListener
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("output.txt");
                    writer.write(textArea.getText());
                    writer.close();
                    JOptionPane.showMessageDialog(frame, "File saved successfully!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage());
                }
            }
        });

        // Load Button ka ActionListener
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
                    textArea.setText(""); // clear before loading
                    String line;
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    reader.close();
                    JOptionPane.showMessageDialog(frame, "File loaded successfully!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error loading file: " + ex.getMessage());
                }
            }
        });

        // Frame dikhana
        frame.setVisible(true);
    }
}
