package M6;

public abstract class c {
    public static boolean a(char c10) {
        if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean b(char c10) {
        if ((c10 < 'a' || c10 > 'z') && (c10 < 'A' || c10 > 'Z')) {
            return false;
        }
        return true;
    }

    public static boolean c(char c10) {
        if (b(c10) || a(c10)) {
            return true;
        }
        return false;
    }

    public static boolean d(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        int i14;
        if (i11 >= charSequence.length() || (i14 = (i11 - i10) + 1) < i12 || i14 > i13) {
            return false;
        }
        while (i10 <= i11) {
            if (!c(charSequence.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean e(CharSequence charSequence, int i10, int i11) {
        return d(charSequence, i10, i11, 3, 8);
    }
}
