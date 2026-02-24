public class vokal {
    public static void main(String[] args) {
        String hasil = "";
        String target = "Aku Aslab";

        String[] pisah = target.split(" ");
        for (String kata : pisah) {
            String result = "";
            String lower = kata.toLowerCase();

            for (int i = 0; i < kata.length(); i++) {
                if (lower.charAt(i) == 'a' ||
                        lower.charAt(i) == 'i' ||
                        lower.charAt(i) == 'u' ||
                        lower.charAt(i) == 'e' ||
                        lower.charAt(i) == 'o') {
                    result += "|" + kata.charAt(i) + "#";
                } else if (kata.charAt(i) == ' ') {
                    result += "=";
                } else {
                    result += kata.charAt(i) + "|" + "%";
                }
            }

            hasil += result.substring(0, result.length() - 1) + "=";
        }

        String result = hasil.substring(0, hasil.length() - 1);
        System.out.println(result);
    }
}
