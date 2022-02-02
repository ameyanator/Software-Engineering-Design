public class WinFactory implements GUIFactory {
    public Button CreateButton() {
        return new WinButton();
    }
    public Checkbox CreateCheckbox() {
        return new WinCheckbox();
    }
}