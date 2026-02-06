package Sg;

import kotlin.jvm.internal.C6496s;
import yf.C6798l;

abstract class q {
    public static void a(Appendable appendable, Object obj, C6798l lVar) {
        boolean z10;
        C6496s.h(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
