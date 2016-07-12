/**
 * Created by admin on 7/12/2016.
 */
public class NewsMain {
    public static void main(String[] args) {
        String para = "The Central Bureau of Investigation (CBI), which is investigating the case of unnatural death of 2009 batch IAS officer D K Ravi, is set to file a closure report or a 'B' report after concluding the case to be one of suicide";
        News news = new News("mysterious death of ips officer",para);

        System.out.println("\nApplying First style");
        news.applyStyle(new HTMLStyle());
        System.out.println("Applying second style");
        news.applyStyle(new SecondStyle());
    }
}
