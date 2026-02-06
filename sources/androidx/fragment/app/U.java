package androidx.fragment.app;

import E3.C1155e;
import android.view.View;
import androidx.collection.C1587a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public static final U f16841a;

    /* renamed from: b  reason: collision with root package name */
    public static final W f16842b = new V();

    /* renamed from: c  reason: collision with root package name */
    public static final W f16843c;

    static {
        U u10 = new U();
        f16841a = u10;
        f16843c = u10.b();
    }

    private U() {
    }

    public static final void a(C1769q qVar, C1769q qVar2, boolean z10, C1587a aVar, boolean z11) {
        C6496s.h(qVar, "inFragment");
        C6496s.h(qVar2, "outFragment");
        C6496s.h(aVar, "sharedElements");
        if (z10) {
            qVar2.getEnterTransitionCallback();
        } else {
            qVar.getEnterTransitionCallback();
        }
    }

    private final W b() {
        Class<C1155e> cls = C1155e.class;
        try {
            C6496s.f(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(C1587a aVar, C1587a aVar2) {
        C6496s.h(aVar, "<this>");
        C6496s.h(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey((String) aVar.n(size))) {
                aVar.k(size);
            }
        }
    }

    public static final void d(List list, int i10) {
        C6496s.h(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
