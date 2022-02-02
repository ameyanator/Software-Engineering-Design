public class MacFactory implements GUIFactory {
    public Button CreateButton() {
        return new MacButton();
    }
    public Checkbox CreateCheckbox() {
        return new MacCheckbox();
    }
}