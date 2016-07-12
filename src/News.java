/**
 * Created by admin on 7/12/2016.
 */
public class News {
    String headLine;
    String paragraph;

    public News(String headLine, String paragraph) {
        this.headLine = headLine;
        this.paragraph = paragraph;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getHeadLine() {
        return headLine;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void applyStyle(Style style){
        style.applyStyle(headLine,paragraph);
    }
}

