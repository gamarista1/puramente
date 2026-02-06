package Hg;

import Fg.v0;
import Lf.g;
import Lf.i;
import Of.C5490h;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class j implements v0 {

    /* renamed from: a  reason: collision with root package name */
    private final k f63380a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f63381b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63382c;

    public j(k kVar, String... strArr) {
        C6496s.h(kVar, "kind");
        C6496s.h(strArr, "formatParams");
        this.f63380a = kVar;
        this.f63381b = strArr;
        String b10 = b.ERROR_TYPE.b();
        String b11 = kVar.b();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(b11, Arrays.copyOf(copyOf, copyOf.length));
        C6496s.g(format, "format(...)");
        String format2 = String.format(b10, Arrays.copyOf(new Object[]{format}, 1));
        C6496s.g(format2, "format(...)");
        this.f63382c = format2;
    }

    public final k b() {
        return this.f63380a;
    }

    public final String c(int i10) {
        return this.f63381b[i10];
    }

    public List getParameters() {
        return C6565s.n();
    }

    public Collection l() {
        return C6565s.n();
    }

    public i m() {
        return g.f63871h.a();
    }

    public v0 n(Gg.g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this;
    }

    public C5490h o() {
        return l.f63471a.h();
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        return this.f63382c;
    }
}
