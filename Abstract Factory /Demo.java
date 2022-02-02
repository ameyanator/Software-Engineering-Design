public class Demo {
    public static void main(String args[]) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac"))
            factory = new MacFactory();
        else
            factory = new WinFactory();
        Application app = new Application(factory);
        return app;
    }
}