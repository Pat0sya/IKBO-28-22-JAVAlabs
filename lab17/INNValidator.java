package mirea.javalabs.lab17;

public class INNValidator {
    public static boolean isValidInnRussia(String inn) {
        if (inn.length() != 12 || !inn.matches("\\d+")) {
            return false;
        }

        int[] weights = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] innDigits = new int[12];

        for (int i = 0; i < 12; i++) {
            innDigits[i] = Character.getNumericValue(inn.charAt(i));
        }

        int checkDigit = 0;
        for (int i = 0; i < 10; i++) {
            checkDigit += innDigits[i] * weights[i];
        }
        checkDigit = checkDigit % 11 % 10;

        return checkDigit == innDigits[10];
    }

    public static void main(String[] args) {
        String inn = "123456789012";
        if (isValidInnRussia(inn)) {
            System.out.println("Действительный ИНН");
        } else {
            System.out.println("Недействительный ИНН");
        }
    }
}

