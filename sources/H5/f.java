package h5;

import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f44008a = new ArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Class f44009a;

        /* renamed from: b  reason: collision with root package name */
        final Class f44010b;

        /* renamed from: c  reason: collision with root package name */
        final C3579e f44011c;

        a(Class cls, Class cls2, C3579e eVar) {
            this.f44009a = cls;
            this.f44010b = cls2;
            this.f44011c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            if (!this.f44009a.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.f44010b)) {
                return false;
            }
            return true;
        }
    }

    public synchronized C3579e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f44008a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f44011c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f44008a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f44010b)) {
                arrayList.add(aVar.f44010b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, C3579e eVar) {
        this.f44008a.add(new a(cls, cls2, eVar));
    }
}
