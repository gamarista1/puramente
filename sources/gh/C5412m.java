package Gh;

import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mf.C6565s;

/* renamed from: Gh.m  reason: case insensitive filesystem */
public abstract class C5412m extends C5411l {

    /* renamed from: e  reason: collision with root package name */
    private final C5411l f63322e;

    public C5412m(C5411l lVar) {
        C6496s.h(lVar, "delegate");
        this.f63322e = lVar;
    }

    public U b(M m10, boolean z10) {
        C6496s.h(m10, "file");
        return this.f63322e.b(r(m10, "appendingSink", "file"), z10);
    }

    public void c(M m10, M m11) {
        C6496s.h(m10, "source");
        C6496s.h(m11, "target");
        this.f63322e.c(r(m10, "atomicMove", "source"), r(m11, "atomicMove", "target"));
    }

    public void g(M m10, boolean z10) {
        C6496s.h(m10, "dir");
        this.f63322e.g(r(m10, "createDirectory", "dir"), z10);
    }

    public void i(M m10, boolean z10) {
        C6496s.h(m10, "path");
        this.f63322e.i(r(m10, "delete", "path"), z10);
    }

    public List k(M m10) {
        C6496s.h(m10, "dir");
        M r10 = r(m10, AttributeType.LIST, "dir");
        ArrayList arrayList = new ArrayList();
        for (M s10 : this.f63322e.k(r10)) {
            arrayList.add(s(s10, AttributeType.LIST));
        }
        C6565s.B(arrayList);
        return arrayList;
    }

    public C5410k m(M m10) {
        C6496s.h(m10, "path");
        C5410k m11 = this.f63322e.m(r(m10, "metadataOrNull", "path"));
        if (m11 == null) {
            return null;
        }
        if (m11.d() == null) {
            return m11;
        }
        return C5410k.b(m11, false, false, s(m11.d(), "metadataOrNull"), (Long) null, (Long) null, (Long) null, (Long) null, (Map) null, 251, (Object) null);
    }

    public C5409j n(M m10) {
        C6496s.h(m10, "file");
        return this.f63322e.n(r(m10, "openReadOnly", "file"));
    }

    public U p(M m10, boolean z10) {
        C6496s.h(m10, "file");
        return this.f63322e.p(r(m10, "sink", "file"), z10);
    }

    public W q(M m10) {
        C6496s.h(m10, "file");
        return this.f63322e.q(r(m10, "source", "file"));
    }

    public M r(M m10, String str, String str2) {
        C6496s.h(m10, "path");
        C6496s.h(str, "functionName");
        C6496s.h(str2, "parameterName");
        return m10;
    }

    public M s(M m10, String str) {
        C6496s.h(m10, "path");
        C6496s.h(str, "functionName");
        return m10;
    }

    public String toString() {
        return O.b(getClass()).w() + '(' + this.f63322e + ')';
    }
}
