public class Settings {
    private static Settings INSTANCE = null;


    private Settings() {
        INSTANCE = this;
    }

    public static Settings getSettings() {
        if (INSTANCE == null) {
            return new Settings();
        } else return INSTANCE;
    }
}
