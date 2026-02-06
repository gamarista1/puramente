package V0;

import android.os.Build;

public abstract class B {
    public static final x a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new z();
        }
        return new A();
    }

    public static final String b(String str, p pVar) {
        int m10 = pVar.m() / 100;
        if (m10 >= 0 && m10 < 2) {
            return str + "-thin";
        } else if (2 <= m10 && m10 < 4) {
            return str + "-light";
        } else if (m10 == 4) {
            return str;
        } else {
            if (m10 == 5) {
                return str + "-medium";
            } else if ((6 <= m10 && m10 < 8) || 8 > m10 || m10 >= 11) {
                return str;
            } else {
                return str + "-black";
            }
        }
    }
}
