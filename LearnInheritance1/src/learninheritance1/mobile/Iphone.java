
package learninheritance1.mobile;


public class Iphone extends Mobile{
    private String AppStore;
    private String Icloud;
    private String Imessage;

    public Iphone() {
    }

    public Iphone(String AppStore, String Icloud, String Imessage) {
        this.AppStore = AppStore;
        this.Icloud = Icloud;
        this.Imessage = Imessage;
    }

    public Iphone(String AppStore, String Icloud, String Imessage, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.AppStore = AppStore;
        this.Icloud = Icloud;
        this.Imessage = Imessage;
    }

    public String getAppStore() {
        return AppStore;
    }

    public void setAppStore(String AppStore) {
        this.AppStore = AppStore;
    }

    public String getIcloud() {
        return Icloud;
    }

    public void setIcloud(String Icloud) {
        this.Icloud = Icloud;
    }

    public String getImessage() {
        return Imessage;
    }

    public void setImessage(String Imessage) {
        this.Imessage = Imessage;
    }

    @Override
    public String toString() {
        return "Iphone{" + "AppStore=" + AppStore + ", Icloud=" + Icloud + ", Imessage=" + Imessage + '}';
    }
    
    
}


