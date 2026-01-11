package BehaviouralDesignPatterns.CommandDesignPattern;

public class Keypad implements Controller {

    Editor editor;

    Keypad(Editor editor){
        this.editor = editor;
    }

    @Override
    public void appendText(String toAppend) {

        StringBuilder sb = new StringBuilder(this.editor.content);
        sb.append(toAppend);
        this.editor.content = sb.toString();
    }

    @Override
    public void deleteText(int start, int len) {
        if(start >= this.editor.content.length()) return;
         
        if(start+len < this.editor.content.length()){
            this.editor.content = this.editor.content.substring(0, start)
            + this.editor.content.substring(start+len);
        } 
        else {
            this.editor.content = this.editor.content.substring(start);
        }
    }
}
