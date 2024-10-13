import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeGenerator {
    public static List<String> generateCode() {
        String allowedChars = "2346789BCDFGHJKMNPQRTVWXYZ";
        List<String> codes = new ArrayList<>();
        Random random = new Random();

        while (codes.size() < 25) {  // Generate 25 codes
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    code.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
                }
                code.append("-");
            }
            for (int j = 0; j < 4; j++) {
                code.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
            }
            code.append("Z");

            // Check for three consecutive repeated characters
            boolean hasConsecutive = false;
            for (int i = 0; i < code.length() - 6; i++) {
                if (code.substring(i, i + 3).equals(code.substring(i + 3, i + 6))) {
                    hasConsecutive = true;
                    break;
                }
            }

            if (!hasConsecutive) {
                codes.add(code.toString());
            }
        }

        return codes;
    }

    public static void main(String[] args) {
        // Generate and print 25 codes
        for (String code : generateCode()) {
            System.out.println(code);
        }
    }
}

