package Sg;

/* renamed from: Sg.c  reason: case insensitive filesystem */
abstract class C5540c extends C5539b {
    public static int d(char c10) {
        int b10 = C5539b.b(c10, 10);
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean e(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String f(char c10) {
        return G.a(c10);
    }
}
