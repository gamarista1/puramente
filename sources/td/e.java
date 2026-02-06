package Td;

import Pd.c;
import Sg.p;
import Xd.b;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public class e implements b, c {
    private final EnumSet c(String str, Context context) {
        Object obj;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = d(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str2 = (String) obj;
                C6496s.e(canonicalPath);
                if (!p.J(canonicalPath, str2 + "/", false, 2, (Object) null)) {
                    if (C6496s.c(str2, canonicalPath)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (((String) obj) != null) {
                return EnumSet.of(Xd.c.READ, Xd.c.WRITE);
            }
            return null;
        } catch (IOException unused) {
            return EnumSet.noneOf(Xd.c.class);
        }
    }

    private final List d(Context context) {
        return C6565s.q(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath());
    }

    public EnumSet a(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "path");
        EnumSet c10 = c(str, context);
        if (c10 == null) {
            return b(str);
        }
        return c10;
    }

    /* access modifiers changed from: protected */
    public EnumSet b(String str) {
        C6496s.h(str, "path");
        File file = new File(str);
        EnumSet<E> noneOf = EnumSet.noneOf(Xd.c.class);
        if (file.canRead()) {
            noneOf.add(Xd.c.READ);
        }
        if (file.canWrite()) {
            noneOf.add(Xd.c.WRITE);
        }
        C6496s.g(noneOf, "apply(...)");
        return noneOf;
    }

    public List o() {
        return C6565s.e(b.class);
    }
}
