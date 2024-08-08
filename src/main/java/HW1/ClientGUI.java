package HW1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class ClientGUI extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JTextArea log = new JTextArea();

    private final JPanel panelTop = new JPanel(new GridLayout(2,3));
    private final JTextField tfIPAddress = new JTextField("127.0.0.1");
    private final JTextField tfPort = new JTextField("8189");
    private final JTextField tfLogin = new JTextField("Ivan");
    private final JPasswordField tfPassword = new JPasswordField("1234567");
    private final JButton btnLogin = new JButton("Login");

    private final JPanel panelBottom = new JPanel(new BorderLayout());
    private final JTextField tfMessage = new JTextField();
    private final JButton btnSend = new JButton("Send");

    private final JList<String> userList = new JList<>();
    private final DefaultListModel<String> userListModel = new DefaultListModel<>();

    ClientGUI(){
        String[] names = {"Марина", "Миша", "Oleg", "Misha"};
        userListModel.addAll(java.util.Arrays.asList(names));
        userList.setModel(userListModel);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(WIDTH,HEIGHT);
        setTitle("Chat client");
        //panelTop.add(tfIPAddress);
        //panelTop.add(tfPort);
        //panelTop.add(tfLogin);
        //panelTop.add(tfPassword);
        //panelTop.add(btnLogin);
        //add(panelTop,BorderLayout.NORTH);

        panelBottom.add(tfMessage, BorderLayout.CENTER);
        panelBottom.add(btnSend, BorderLayout.EAST);
        add(panelBottom,BorderLayout.SOUTH);
        readFromFile("log");
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = (tfLogin.getText()  + ": " + tfMessage.getText());
                appendLog(userInput + "\n");
                tfMessage.setText("");
                writeToFile(userInput);
            }
        });

        log.setEditable(false);
        JScrollPane scrollLong = new JScrollPane(log);
        add(scrollLong);

        JScrollPane userScrollPane = new JScrollPane(userList);
        userScrollPane.setPreferredSize(new Dimension(100, 150)); // Устанавливаем размер
        add(userScrollPane, BorderLayout.EAST);

        setVisible(true);
    }
    private void appendLog(String message) {
        log.append(message); // Добавляем сообщение в JTextArea
        log.setCaretPosition(log.getDocument().getLength()); // Прокручиваем вниз
    }
    public void writeToFile( String line) {
        String filename = "log";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(line);
            writer.newLine(); // добавляем новую строку
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для чтения всех строк из файла и их вывода
    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                log.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
