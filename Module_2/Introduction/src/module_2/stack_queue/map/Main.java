package module_2.stack_queue.map;

public class Main {

    public static void main(String[] args) {
        String string = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph " +
                "is a group of at least five sentences, a paragraph is half a page long, etc.";

        MapExam mapExam = new MapExam();

        System.out.println(mapExam.getWordTimes(string));
    }
}
