package Hg;

import Of.C5490h;
import Wf.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.f;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;

public class g implements C6812k {

    /* renamed from: b  reason: collision with root package name */
    private final h f63358b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63359c;

    public g(h hVar, String... strArr) {
        C6496s.h(hVar, "kind");
        C6496s.h(strArr, "formatParams");
        this.f63358b = hVar;
        String b10 = hVar.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b10, Arrays.copyOf(copyOf, copyOf.length));
        C6496s.g(format, "format(...)");
        this.f63359c = format;
    }

    public Set a() {
        return Y.e();
    }

    public Set d() {
        return Y.e();
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        String format = String.format(b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{fVar}, 1));
        C6496s.g(format, "format(...)");
        f m10 = f.m(format);
        C6496s.g(m10, "special(...)");
        return new a(m10);
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return C6565s.n();
    }

    public Set g() {
        return Y.e();
    }

    /* renamed from: h */
    public Set c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return Y.d(new c(l.f63471a.h()));
    }

    /* renamed from: i */
    public Set b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return l.f63471a.j();
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return this.f63359c;
    }

    public String toString() {
        return "ErrorScope{" + this.f63359c + '}';
    }
}
