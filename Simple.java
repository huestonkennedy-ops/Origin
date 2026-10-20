import java.util.ArrayList;
public class Simple{
    private ArrayList<String> items;
    public Simple() {
        this.items = new ArrayList<>();
    }
    public void addItem(String name) {
        items.add(name);
    }
    public String longest() {
        String temp = items.get(0);
        for(String i: items) {
            if(i.length()>temp.length()) {
                temp = i;
            }
        }
        return temp;
    }
}