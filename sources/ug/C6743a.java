package ug;

import kotlin.jvm.internal.C6496s;

/* renamed from: ug.a  reason: case insensitive filesystem */
public abstract class C6743a implements Comparable {
    /* renamed from: a */
    public int compareTo(C6743a aVar) {
        C6496s.h(aVar, "other");
        int compareTo = b().compareTo(aVar.b());
        if (compareTo != 0 || c() || !aVar.c()) {
            return compareTo;
        }
        return 1;
    }

    public abstract C6744b b();

    public abstract boolean c();
}
