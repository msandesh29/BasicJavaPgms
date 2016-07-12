/**
 * Created by admin on 7/12/2016.
 */
public class SecondStyle implements Style {
    @Override
    public void applyStyle(String headline, String paragraph) {
        System.out.println(headline.toUpperCase()+"\n\n");
        System.out.println(paragraph.toLowerCase());
        System.out.println("-------------------------------");
    }
}
