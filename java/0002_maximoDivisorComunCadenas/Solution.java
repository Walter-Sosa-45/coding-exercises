public class Solution {

    public static String mayorSecuencia(String str1, String str2) {
        int mcd = mcd(str1.length(), str2.length());

        // Probar desde el mayor divisor al menor
        for (int len = mcd; len >= 1; len--) {
            if (mcd % len != 0) {
                continue;
            }

            String candidato = str1.substring(0, len);

            if (formaCadena(str1, candidato) && formaCadena(str2, candidato)) {
                return candidato;
            }
        }

        return "";
    }

    private static boolean formaCadena(String cadena, String patron) {
        int veces = cadena.length() / patron.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            sb.append(patron);
        }

        return sb.toString().equals(cadena);
    }

    private static int mcd(int a, int b) {
        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mayorSecuencia("ABABABABABAB", "ABABABAB"));      // AB
        System.out.println(mayorSecuencia("ABCABC", "ABC"));       // ABC
        System.out.println(mayorSecuencia("AAAAAA", "AAA"));       // A
        System.out.println(mayorSecuencia("ABCDEF", "ABC"));       // ""
    }
}