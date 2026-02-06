package P3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public interface z {

    public static final class a {
        public static void a(z zVar, String str, Set set) {
            C6496s.h(str, "id");
            C6496s.h(set, "tags");
            z.super.d(str, set);
        }
    }

    List a(String str);

    void c(y yVar);

    void d(String str, Set set) {
        C6496s.h(str, "id");
        C6496s.h(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c(new y((String) it.next(), str));
        }
    }
}
