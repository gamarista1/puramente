package J;

import androidx.emoji2.text.f;
import java.text.BreakIterator;

public abstract class E {
    public static final int a(String str, int i10) {
        f c10 = c();
        Integer num = null;
        if (c10 != null) {
            Integer valueOf = Integer.valueOf(c10.d(str, i10));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(String str, int i10) {
        f c10 = c();
        Integer num = null;
        if (c10 != null) {
            Integer valueOf = Integer.valueOf(c10.f(str, Math.max(0, i10 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final f c() {
        if (!f.k()) {
            return null;
        }
        f c10 = f.c();
        if (c10.g() == 1) {
            return c10;
        }
        return null;
    }
}
