//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String s = "abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int dn) {
        StringBuilder sb = new StringBuilder();
        while (dn != 0)
        {
            int n = dn%16;
            if (n > 10)
                sb.append(s.charAt(n - 10));
            else sb.append(n);
            dn/=16;
        }

        return sb.reverse().toString();
    }

    public static int toDecimal(String hn) {
        int dn = 0;
        for (int i = 0; i < hn.length(); i++)
        {
            if (Character.isDigit(hn.charAt(i)))
                dn += Integer.parseInt(String.valueOf((hn.charAt(hn.length() - (i + 1))))) * Math.pow(16, i);
            else
                dn += (s.indexOf(hn.charAt(i)) + 10) * Math.pow(16, i);
        }

        return dn;
    }
}