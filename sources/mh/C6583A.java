package mh;

import Sg.F;
import ih.f;
import jh.C6432a;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;
import lh.C6538b;
import nh.C6624e;

/* renamed from: mh.A  reason: case insensitive filesystem */
public final class C6583A extends C6432a {

    /* renamed from: a  reason: collision with root package name */
    private final C6584a f72112a;

    /* renamed from: b  reason: collision with root package name */
    private final C6624e f72113b;

    public C6583A(C6584a aVar, C6538b bVar) {
        C6496s.h(aVar, "lexer");
        C6496s.h(bVar, "json");
        this.f72112a = aVar;
        this.f72113b = bVar.a();
    }

    public byte H() {
        C6584a aVar = this.f72112a;
        String q10 = aVar.q();
        try {
            return F.a(q10);
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + "UByte" + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public C6624e a() {
        return this.f72113b;
    }

    public int h() {
        C6584a aVar = this.f72112a;
        String q10 = aVar.q();
        try {
            return F.d(q10);
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + "UInt" + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public long m() {
        C6584a aVar = this.f72112a;
        String q10 = aVar.q();
        try {
            return F.g(q10);
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + "ULong" + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public int o(f fVar) {
        C6496s.h(fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    public short t() {
        C6584a aVar = this.f72112a;
        String q10 = aVar.q();
        try {
            return F.j(q10);
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + "UShort" + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }
}
