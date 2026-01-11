package BehaviouralDesignPatterns.CommandDesignPattern;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Keypad keypad = new Keypad(editor);

        keypad.appendText("Hello");
        System.out.println(editor.getcontent());
        keypad.appendText(" World");
        System.out.println(editor.getcontent());
        keypad.deleteText(5, 5);
        System.out.println(editor.getcontent());

    }
    
}
