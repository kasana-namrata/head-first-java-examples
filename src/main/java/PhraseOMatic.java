import java.util.concurrent.ThreadLocalRandom;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] list1 = {"where", "are", "younow"};
        String[] list2 = {"akhilesh", "namrata", "arun"};
        String[] list3 = {"bye", "gotcha", "level"};

        for (int i = 0; i < 5; i += 1) {
            int list1LengthRandom = ThreadLocalRandom.current().nextInt(list1.length);
            int list2LengthRandom = ThreadLocalRandom.current().nextInt(list2.length);
            int list3LengthRandom = ThreadLocalRandom.current().nextInt(list3.length);
            String phrase = String.join(" ", list1[list1LengthRandom], list2[list2LengthRandom], list3[list3LengthRandom]);
            System.out.println("We need a " + phrase);

        }
    }
}
