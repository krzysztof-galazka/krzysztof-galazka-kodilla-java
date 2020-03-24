import beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        //POEM DECORATOR
        System.out.println("Task: Poem Decorator");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Tekst do dużych liter", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("TEKST DO MAŁYCH LITER", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("TEKST DO DODANIA", text -> "ABC".concat(text)));
        System.out.println(poemBeautifier.beautify("Litery do zamiany", text -> text.replace("a", "A")));
        System.out.println(poemBeautifier.beautify("TEST", text -> "### " + text + " ###"));

    }
}
