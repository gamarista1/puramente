package yg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: yg.m  reason: case insensitive filesystem */
public abstract class C6814m {
    public static final Set a(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterable g10 = ((C6812k) it.next()).g();
            if (g10 == null) {
                return null;
            }
            C6565s.D(hashSet, g10);
        }
        return hashSet;
    }
}
