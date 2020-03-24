package beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        String beautifyText = poemDecorator.decorate(text);
        return beautifyText;
    }
}
