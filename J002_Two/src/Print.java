public class Print {

    public void printMessage(MessageType type){
        switch (type){
            case STANDART:
                System.out.println("Standart Message");
                break;
            case ERROR:
                System.err.println("Error Message");
                break;
        }
    }
}
