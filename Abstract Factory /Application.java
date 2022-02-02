public class Application {
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.CreateButton();
        checkbox = factory.CreateCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}