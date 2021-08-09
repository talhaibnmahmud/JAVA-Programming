import java.util.ArrayList;
import java.util.List;

public class TwitterWithList implements Twitter {
    private List<Tweet> list = new ArrayList<>();

    @Override
    public void addTweet(Tweet tweet) {
        list.add(tweet);
    }

    @Override
    public void printAllTweets() {
        for(Tweet tweet : list) {
            System.out.println(tweet);
        }
    }
}
