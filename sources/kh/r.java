package kh;

import gh.C5978b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class r extends C6470q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(C5978b bVar) {
        super(bVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "element");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Iterator d(Collection collection) {
        C6496s.h(collection, "<this>");
        return collection.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int e(Collection collection) {
        C6496s.h(collection, "<this>");
        return collection.size();
    }
}
