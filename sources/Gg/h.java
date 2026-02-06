package Gg;

import Fg.S;
import Of.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final G f63181a = new G("KotlinTypeRefiner");

    public static final G a() {
        return f63181a;
    }

    public static final List b(g gVar, Iterable iterable) {
        C6496s.h(gVar, "<this>");
        C6496s.h(iterable, "types");
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.h((S) it.next()));
        }
        return arrayList;
    }
}
