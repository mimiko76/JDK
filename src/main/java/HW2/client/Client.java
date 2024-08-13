package HW2.client;

import HW2.server.ServerController;
import HW2.server.ServerWindow;

public class Client {

    private ServerController server;
    private boolean connected;
    private String name;
    private ClientView view;

    public Client(ClientView view, ServerController server){
        this.view = view;
        this.server = server;
    }

    public boolean connectToServer(String name){
        this.name=name;
        if(server.connectUser(this)){
            printText("Вы успешно подключились!\n");
            connected = true;
            String log = server.getHistory();
            if(log != null){
                printText(log);
            }
            return true;
        } else {
            printText("Подключение не удалось");
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public void disconnect(){
        if(connected){
            connected = false;
            view.disconnectFromServer();
            server.disconnectUser(this);
            printText("Вы отключены от сервера! Заходите еще");
        }
    }

    public void severAnswer(String answer){
        printText(answer);
    }
    public void sendMessage(String message){
        if(connected){
            server.sendMessage(name + ": " + message);
        }else {
            printText("Нет подключения к серверу.");
        }

    }

    private void printText(String text){
        view.sendMassage(text);
    }
}
