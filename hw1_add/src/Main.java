
public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {

        int count = 0;
        char [] arPATTERN = {'a', 'a', 'b'};

        for (int i = 0; i < TEXT.length(); i++) {
            // ll - char, "left letter"
            char ll = TEXT.charAt(i);

            int searchBegin = 0;

            for (char l: arPATTERN) {
                if (ll == l) {
                    searchBegin ++;
                    if ( i+ searchBegin != TEXT.length() ) {
                        ll = TEXT.charAt(i + searchBegin);
                    }
                } else {
                    break;
                }

            }

            if (searchBegin == 3) {
                count ++;
            }

        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}