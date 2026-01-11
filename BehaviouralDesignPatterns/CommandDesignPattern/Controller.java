package BehaviouralDesignPatterns.CommandDesignPattern;

interface Controller {
    public void appendText(String toAppend);
    public void deleteText(int idx, int len);
}
