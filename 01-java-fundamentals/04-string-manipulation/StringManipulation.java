public class StringManipulation {

    public static void main(String[] args) {
        
        trimAndConcat("    Hello    ", "     World    ");
        getIndexOrNull("Coding", 'o');
        getIndexOrNull("Hello World", 'o');
        getIndexOrNull("Hi", 'o');
        getIndexOrNull("Hello", "world");
        concatSubString("Hello", 1, 2, "World");

        
    }
    public static String trimAndConcat(String word1, String word2){
        System.out.println(word1.trim().concat(word2.trim()));
        return word1.trim().concat(word2.trim()); 
    }

    public static Integer getIndexOrNull(String word, char c) {
        System.out.println(word.indexOf(c) != -1 ? word.indexOf(c) : null);
        return word.indexOf(c) != -1 ? word.indexOf(c) : null;
    }

    public static String concatSubString(String word1, int start, int finish, String word2) {
        System.out.println(word1.substring(start, finish).concat(word2));
        return word1.substring(start, finish).concat(word2);
    }

    public static Integer getIndexOrNull(String word1, String word2) {
        System.out.println(word1.indexOf(word1.substring(2, 5)) != -1 ? word1.indexOf('l') : null);
        System.out.println(word2.indexOf(0) != -1 ? word2.indexOf(0) : null);
        return word1.indexOf(word1.substring(2, 5)) != -1 ? word1.indexOf('l') : null;
    }
}