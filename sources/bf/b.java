package Bf;

import Ff.l;
import kotlin.jvm.internal.C6496s;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private Object f62440a;

    public b(Object obj) {
        this.f62440a = obj;
    }

    public Object a(Object obj, l lVar) {
        C6496s.h(lVar, "property");
        return this.f62440a;
    }

    public void b(Object obj, l lVar, Object obj2) {
        C6496s.h(lVar, "property");
        Object obj3 = this.f62440a;
        if (d(lVar, obj3, obj2)) {
            this.f62440a = obj2;
            c(lVar, obj3, obj2);
        }
    }

    /* access modifiers changed from: protected */
    public void c(l lVar, Object obj, Object obj2) {
        C6496s.h(lVar, "property");
    }

    /* access modifiers changed from: protected */
    public boolean d(l lVar, Object obj, Object obj2) {
        C6496s.h(lVar, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f62440a + ')';
    }
}
