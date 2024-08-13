package HW2.server;

import HW2.client.ClientGUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame implements ServerGUI {
    private ServerController controller;
    private List<ClientGUI> clientGUIList;
    private JTextArea log;

    public ServerWindow() {
        this.controller = controller;
        clientGUIList = new ArrayList<>();
        createPanel();
        setVisible(true);
    }

    @Override
    public void appendLog(String text) {
        log.append(text + "\n");
    }

    @Override
    public void displayLog(String log) {
        this.log.setText(log);
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        // Добавление кнопок и других элементов управления
    }

}
