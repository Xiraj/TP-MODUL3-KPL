public class DoorMachine {
    private String state = "Terkunci";
    public void pintu(String command) {
        switch (command) {
            case "BukaPintu":
                this.state = "Terbuka";
                break;
            case "KunciPintu":
                this.state = "Terkunci";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}