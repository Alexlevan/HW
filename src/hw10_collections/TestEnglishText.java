package hw10_collections;

public class TestEnglishText {
    public static void main(String[] args) {
        String text = "Ruskin Bond used to spend his summer at his grandmother’s house in Dehradun. " +
                "While taking the train, he always had to pass through a small station called Deoli. " +
                "No one used to get down at the station and nothing happened there. " +
                "Until one day he sees a girl selling fruit and he is unable to forget her.";

        System.out.println(new EnglishText(text).getWord());
    }
}
