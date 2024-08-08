package HW1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 550;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;

    ServerWindow(){
        isServerWorking = false;

        // Настройка JTextArea
        log.setEditable(false); // Запрет редактирования
        JScrollPane scrollPane = new JScrollPane(log); // Добавляем прокрутку
        scrollPane.setPreferredSize(new Dimension(WIDTH, HEIGHT - 100)); // Устанавливаем размер

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
                    appendLog("The server is not running, you do not need to do anything\n");
                } else {
                    isServerWorking = false;
                    appendLog("Server stopped " + isServerWorking + "\n");
                }
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                appendLog("Server started " + isServerWorking + "\n");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setAlwaysOnTop(true);
        setLayout(new BorderLayout()); // Используем BorderLayout
        add(scrollPane, BorderLayout.CENTER); // Добавляем JTextArea с прокруткой в центр
        JPanel buttonPanel = new JPanel(); // Панель для кнопок
        buttonPanel.setLayout(new FlowLayout()); // Устанавливаем FlowLayout для кнопок
        buttonPanel.add(btnStart);
        buttonPanel.add(btnStop);
        add(buttonPanel, BorderLayout.SOUTH); // Добавляем панель с кнопками в южную часть
        setVisible(true);
    }

    private void appendLog(String message) {
        log.append(message); // Добавляем сообщение в JTextArea
        log.setCaretPosition(log.getDocument().getLength()); // Прокручиваем вниз
    }
}
