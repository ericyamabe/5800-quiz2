package prototype;

import prototype.library.BookDeepCopy;
import prototype.library.BookShallowCopy;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Part 2
        System.out.println("Part 2");
        String bookOneTitle = "Book One";
        String bookOneAuthor = "John Doe";
        ArrayList<String> shallowBookOneChapters = new ArrayList<>();
        ArrayList<String> shallowBookTwoChapters = new ArrayList<>();

        shallowBookOneChapters.add("Chapter 1");
        shallowBookOneChapters.add("Chapter 2");
        shallowBookOneChapters.add("Chapter 3");
        shallowBookOneChapters.add("Chapter 4");
        shallowBookOneChapters.add("Chapter 5");
        shallowBookOneChapters.add("Chapter 6");
        shallowBookOneChapters.add("Chapter 7");
        shallowBookOneChapters.add("Chapter 8");

        shallowBookTwoChapters.add("The Beginning");
        shallowBookTwoChapters.add("Next Chapter");
        shallowBookTwoChapters.add("Chapter Three");
        shallowBookTwoChapters.add("Chapter Four");
        shallowBookTwoChapters.add("Chapter Five");
        shallowBookTwoChapters.add("Chapter Six");
        shallowBookTwoChapters.add("Chapter Seven");
        shallowBookTwoChapters.add("The Ending");

        BookShallowCopy shallowBookOne = new BookShallowCopy(bookOneTitle, bookOneAuthor, shallowBookOneChapters);
        BookShallowCopy shallowBookTwo = shallowBookOne.clone();
        shallowBookTwo.setChapters(shallowBookTwoChapters);

        System.out.println(shallowBookOne);
        System.out.println(shallowBookTwo);

        // Part 3
        System.out.println("\n\nPart 3");
        String deepCopyBookOneTitle = "Deep Copy Book One";
        String deepCopyBookOneAuthor = "John Smith";

        ArrayList<String> deepCopyBookOneChapters = new ArrayList<>();
        deepCopyBookOneChapters.add("One");
        deepCopyBookOneChapters.add("Two");
        deepCopyBookOneChapters.add("Three");
        deepCopyBookOneChapters.add("Four");
        deepCopyBookOneChapters.add("Five");
        deepCopyBookOneChapters.add("Six");
        deepCopyBookOneChapters.add("Seven");
        deepCopyBookOneChapters.add("Eight");

        ArrayList<String> deepCopyBookTwoChapters = new ArrayList<>();
        deepCopyBookTwoChapters.add("1");
        deepCopyBookTwoChapters.add("2");
        deepCopyBookTwoChapters.add("3");
        deepCopyBookTwoChapters.add("4");
        deepCopyBookTwoChapters.add("5");
        deepCopyBookTwoChapters.add("6");
        deepCopyBookTwoChapters.add("7");
        deepCopyBookTwoChapters.add("8");

        BookDeepCopy deepBookCopy = new BookDeepCopy(deepCopyBookOneTitle, deepCopyBookOneAuthor, deepCopyBookOneChapters);
        BookDeepCopy deepBookCopy2 = deepBookCopy.clone();
        deepBookCopy2.setChapters(deepCopyBookTwoChapters);

        System.out.println(deepBookCopy);
        System.out.println(deepBookCopy2);

    }
}
