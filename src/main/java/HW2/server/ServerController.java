package HW2.server;

import HW2.client.Client;
import HW2.client.ClientGUI;

public interface ServerController {
    void startServer();
    void stopServer();
    boolean connectUser(Client clientGUI);
    ServerController getServer();
    void disconnectUser(Client clientGUI);

    String getHistory();
    void setMessage(String text);
    
    void message(String text);

    void sendMessage(String s);
}
