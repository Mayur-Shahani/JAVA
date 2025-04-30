import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class aa extends JFrame {
    private JTextField fileNameField;
    private JTextArea fileContentArea;
    private final String directoryPath = "C:/SwingFiles/";
    public aa() {
        setTitle("File Handling Application");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel titleLabel = new JLabel("File Handling using Java Swing");
        titleLabel.setBounds(180, 10, 300, 30);
        add(titleLabel);
        JLabel nameLabel = new JLabel("File Name:");
        nameLabel.setBounds(30, 60, 100, 30);
       add(nameLabel);
        fileNameField = new JTextField();
        fileNameField.setBounds(120, 60, 250, 30);
        add(fileNameField);
        JButton createButton = new JButton("Create");
        createButton.setBounds(400, 60, 100, 30);
        add(createButton);
        fileContentArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(fileContentArea);
        scrollPane.setBounds(30, 110, 520, 250);
        add(scrollPane);
        JButton writeButton = new JButton("Write");
        writeButton.setBounds(30, 380, 100, 30);
        add(writeButton);
        JButton readButton = new JButton("Read");
        readButton.setBounds(150, 380, 100, 30);
        add(readButton);
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(270, 380, 100, 30);
        add(updateButton);
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(390, 380, 100, 30);
        add(deleteButton);
        // Ensure the directory exists
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Button Actions
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createFile();
            }
        });

        writeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                writeFile();
            }
        });
        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readFile();
            }
        });
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateFile();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteFile();
            }
        });
        setVisible(true);
    }
    private void createFile() {
        try {
            String fileName = fileNameField.getText();
            File file = new File(directoryPath + fileName + ".txt");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(this, "File created successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "File already exists.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    private void writeFile() {
        try {
            String fileName = fileNameField.getText();
            FileWriter writer = new FileWriter(directoryPath + fileName + ".txt");
            writer.write(fileContentArea.getText());
            writer.close();
            JOptionPane.showMessageDialog(this, "Content written successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    private void readFile() {
        try {
            String fileName = fileNameField.getText();
            BufferedReader reader = new BufferedReader(new FileReader(directoryPath + fileName + ".txt"));
            fileContentArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                fileContentArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    private void updateFile() {
        writeFile(); // In this case, update is same as write (overwrite)
    }
    private void deleteFile() {
        try {
            String fileName = fileNameField.getText();
            File file = new File(directoryPath + fileName + ".txt");
            if (file.delete()) {
                JOptionPane.showMessageDialog(this, "File deleted successfully!");
                fileContentArea.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "File not found!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        new aa();
     }
    public JTextField getFileNameField() {
        return fileNameField;
    }
    public void setFileNameField(JTextField fileNameField) {
        this.fileNameField = fileNameField;
    }
    public JTextArea getFileContentArea() {
        return fileContentArea;
    }
    public void setFileContentArea(JTextArea fileContentArea) {
        this.fileContentArea = fileContentArea;
    }
    public String getDirectoryPath() {
        return directoryPath;
    }
}