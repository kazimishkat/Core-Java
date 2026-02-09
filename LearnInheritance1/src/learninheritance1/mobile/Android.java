
package learninheritance1.mobile;


public class Android extends Mobile{
    private String PlayStore;
    private String os;
    private String browser;

    public Android() {
    }

    public Android(String PlayStore, String os, String browser) {
        this.PlayStore = PlayStore;
        this.os = os;
        this.browser = browser;
    }

    public Android(String PlayStore, String os, String browser, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.PlayStore = PlayStore;
        this.os = os;
        this.browser = browser;
    }

    public String getPlayStore() {
        return PlayStore;
    }

    public void setPlayStore(String PlayStore) {
        this.PlayStore = PlayStore;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return "Android{" + "PlayStore=" + PlayStore + ", os=" + os + ", browser=" + browser + '}';
    }
    
    
    
}
