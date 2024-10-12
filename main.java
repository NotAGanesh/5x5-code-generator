import java.util.ArrayList;
import java.util.Random;

public class CodeGenerator {
    private static final String ALLOWED_CHARS = "2346789BCDFGHJKMNPQRTVWXYZ";
    private static final int NUMBER_OF_CODES = 25;
    private static final int SEGMENT_LENGTH = 5;
    private static final int FINAL_SEGMENT_LENGTH = 4;
    private static final char END_CHAR = 'Z';

    // Singleton Random instance
    private static final Random RANDOM = new Random();

    public static ArrayList<String> generateCode() {
        ArrayList<String> codes = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_CODES; i++) {
            StringBuilder code = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                code.append(generateRandomString(ALLOWED_CHARS, SEGMENT_LENGTH));
                if (j < 3) {
                    code.append("-");
                }
            }
            // Append final segment and end character
            code.append("-");
            code.append(generateRandomString(ALLOWED_CHARS, FINAL_SEGMENT_LENGTH));
            code.append(END_CHAR);
            codes.add(code.toString());
        }

        return codes;
    }

    private static String generateRandomString(String allowedChars, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(allowedChars.charAt(RANDOM.nextInt(allowedChars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> codes = generateCode();
        for (String code : codes) {
            System.out.println(code);
        }
    }
}
