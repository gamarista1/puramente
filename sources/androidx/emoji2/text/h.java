package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Set;

abstract class h {

    private static class a {
        static Set<int[]> a() {
            return b.a();
        }
    }

    private static class b {
        static Set a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<Object> set = (Set) invoke;
                for (Object obj : set) {
                    if (!(obj instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    static Set a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a();
        }
        return b.a();
    }
}
