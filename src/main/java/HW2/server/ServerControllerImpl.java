package HW2.server;

import HW2.client.Client;
import HW2.client.ClientGUI;

import java.util.ArrayList;
import java.util.List;

public class ServerControllerImpl implements ServerController {
    private boolean work;
    private List<ClientGUI> clientGUIList;
    private LogRepository logRepository;
    private ServerGUI gui;

    public ServerControllerImpl(ServerGUI gui) {
        this.gui = gui;
        this.clientGUIList = new ArrayList<>();
        this.logRepository = new LogRepository();
    }

    @Override
    public void startServer() {
        // Логика запуска сервера
    }

    @Override
    public void stopServer() {
        // Логика остановки сервера
    }

    @Override
    public String getHistory() {
        return null;
    }

    @Override
    public void setMessage(String text) {

    }

    @Override
    public boolean connectUser(Client clientGUI) {
        // Логика подключения клиента
        return true; // или false в зависимости от состояния
    }

    @Override
    public ServerController getServer() {
        return null;
    }

    @Override
    public void disconnectUser(Client clientGUI) {
        // Логика отключения клиента
    }

    @Override
    public void message(String text) {
        // Логика обработки сообщения
    }

    @Override
    public void sendMessage(String s) {

    }
}