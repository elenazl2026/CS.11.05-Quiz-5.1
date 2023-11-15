import static org.junit.jupiter.api.Assertions.*;

class  MainTest {

    private int[] array1 ;
    private int[] array2;
    private int[] array3;
    private int[] array4;
    private String[] array5;
    private String[] array6;
    private String word;
    private String wordTwo;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        array1 = new int[] {1,2,3,4,5};
        array2 = new int[] {6,7,8,9,10};

        array3 = new int[] {1,3,5,7,9,11,13};
        array4 = new int[] {2,4,6,8,10,12,14};

        array5 = new String[] {"Christmas", "IS", "comInG", "!"};
        array6 = new String[] {"I", "lean", "agaINST", "tHE", "winD", "preTEnD", "tHAT", "I", "aM", "WEIGHTless"};

        word = "HellloOOOO!";
        wordTwo = "rENeGAde";

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        array1 = null;
        array2 = null;

        array3 = null;
        array4 = null;

        array5 = null;
        array6 = null;

        word = null;
        wordTwo = null;

    }

    @org.junit.jupiter.api.Test
    void combine() {

        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        int[] actual = Main.combine(array1, array2);

        assertEquals(expected.length, actual.length);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }

        int[] expectedTwo = {1,3,5,7,9,11,13,2,4,6,8,10,12,14};
        int[] actualTwo = Main.combine(array3, array4);

        assertEquals(expectedTwo.length, actualTwo.length);

        for (int i = 0; i < actualTwo.length; i++) {
            assertEquals(expectedTwo[i], actualTwo[i]);
        }

        for (int i = 0; i < expectedTwo.length; i++) {
            assertEquals(expectedTwo[i], actualTwo[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void zip() {

        int[] expected = {1,6,2,7,3,8,4,9,5,10};
        int[] expectedTwo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int[] actual = Main.zip(array1, array2);
        int[] actualTwo = Main.zip(array3, array4);

        assertEquals(expected.length, actual.length);
        assertEquals(expectedTwo.length, actualTwo.length);

        for (int i = 0; i < expected.length; i++) assertEquals(expected[i], actual[i]);
        for (int i = 0; i < actual.length; i++) assertEquals(expected[i], actual[i]);

        for (int i = 0; i < expectedTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);
        for (int i = 0; i < actualTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);

    }

    @org.junit.jupiter.api.Test
    void product() {

        int[] expected = {6,14,24,36,50};
        int[] expectedTwo = {2,12,30,56,90,132,182};

        int[] actual = Main.product(array1, array2);
        int[] actualTwo = Main.product(array3, array4);

        assertEquals(expected.length, actual.length);
        assertEquals(expectedTwo.length, actualTwo.length);

        for (int i = 0; i < expected.length; i++) assertEquals(expected[i], actual[i]);
        for (int i = 0; i < actual.length; i++) assertEquals(expected[i], actual[i]);

        for (int i = 0; i < expectedTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);
        for (int i = 0; i < actualTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);

    }

    @org.junit.jupiter.api.Test
    void capitalCount() {

        int[] expected = {1,2,2,0};
        int[] expectedTwo = {1,0,4,2,1,3,3,1,1,6};

        int[] actual = Main.capitalCount(array5);
        int[] actualTwo = Main.capitalCount(array6);

        assertEquals(expected.length, actual.length);
        assertEquals(expectedTwo.length, actualTwo.length);

        for (int i = 0; i < expected.length; i++) assertEquals(expected[i], actual[i]);
        for (int i = 0; i < actual.length; i++) assertEquals(expected[i], actual[i]);

        for (int i = 0; i < expectedTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);
        for (int i = 0; i < actualTwo.length; i++) assertEquals(expectedTwo[i], actualTwo[i]);

    }

    @org.junit.jupiter.api.Test
    void countCapitalLetters() {

        int expected = 5;
        int expectedTwo = 4;

        int actual = Main.countCapitalLetters(word);
        int actualTwo = Main.countCapitalLetters(wordTwo);

        assertEquals(expected, actual);
        assertEquals(expectedTwo, actualTwo);

    }
}