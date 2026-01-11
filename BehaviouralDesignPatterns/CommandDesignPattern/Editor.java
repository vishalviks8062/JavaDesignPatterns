package BehaviouralDesignPatterns.CommandDesignPattern;

public class Editor {
    String content;

    Editor(){
        content = "";
    }

    String getcontent(){
        return content;
    }

    void resetContent(){
        this.content = "";
    }

}
