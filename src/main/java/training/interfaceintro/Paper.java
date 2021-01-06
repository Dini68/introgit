package training.interfaceintro;

public class Paper implements Writable, Erasable, Flat{

    private String content = "";

    public String getContent() {
        return content;
    }

    private int maxContentSize = DEFAULT_CONTENT_SIZE;

    public Paper() {

    }
    public Paper(int maxContentSize){
        this.maxContentSize = maxContentSize;
    }

    public boolean write(String text) {
        String newContent = content + text;
        if (newContent.length() <= maxContentSize) {
            content = newContent;
            return true;
        }
        return false;
    }

    public void erase(){
        content = "";
    }
    public static void main(String[] args) {
        Paper paper = new Paper(200);
        Writable writable = paper;
        Erasable erasable = paper;

        writable.write("alma");
        paper.write("körte");
        System.out.println(paper.getContent()); // almakörte
        erasable.erase();
        System.out.println(paper.getContent()); // (üres sor)
    }

}
