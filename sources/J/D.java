package J;

import Q0.S;

public abstract class D {
    public static final int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == 10) {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == 10) {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i10) {
        return S.b(b(charSequence, i10), a(charSequence, i10));
    }
}
