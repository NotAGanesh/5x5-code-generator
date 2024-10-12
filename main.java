import java.util.ArrayList;
import java.util.Random;

public class CodeGenerator {
    public static ArrayList<String> generateCode() {
        String allowedChars = "2346789BCDFGHJKMNPQRTVWXYZ";
        ArrayList<String> codes = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            StringBuilder code = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                code.append(generateRandomString(allowedChars, 5));
                if (j < 3) {
                    code.append("-");
                }
            }
            code.append("-");
            code.append(generateRandomString(allowedChars, 4));
            code.append("Z");
            codes.add(code.toString());
        }

        return codes;
    }

    private static String generateRandomString(String allowedChars, int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
        }
        return sb.toString();
    }
}
