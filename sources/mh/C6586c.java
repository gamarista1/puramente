package mh;

import com.adjust.sdk.Constants;
import gh.C5977a;
import ih.d;
import ih.e;
import ih.f;
import ih.j;
import ih.k;
import io.intercom.android.sdk.models.AttributeType;
import jh.c;
import kh.Y;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6527k;
import lh.C6538b;
import lh.C6539c;
import lh.g;
import lh.h;
import lh.i;
import lh.p;
import lh.t;
import lh.v;
import lh.x;
import nh.C6624e;

/* renamed from: mh.c  reason: case insensitive filesystem */
abstract class C6586c extends Y implements h {

    /* renamed from: c  reason: collision with root package name */
    private final C6538b f72188c;

    /* renamed from: d  reason: collision with root package name */
    private final i f72189d;

    /* renamed from: e  reason: collision with root package name */
    protected final g f72190e;

    public /* synthetic */ C6586c(C6538b bVar, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar);
    }

    private final p d0(x xVar, String str) {
        p pVar;
        if (xVar instanceof p) {
            pVar = (p) xVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            return pVar;
        }
        throw F.e(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    private final Void t0(String str) {
        throw F.f(-1, "Failed to parse literal as '" + str + "' value", f0().toString());
    }

    public boolean D() {
        return !(f0() instanceof t);
    }

    /* access modifiers changed from: protected */
    public String Z(String str, String str2) {
        C6496s.h(str, "parentName");
        C6496s.h(str2, "childName");
        return str2;
    }

    public C6624e a() {
        return d().a();
    }

    public c b(f fVar) {
        boolean z10;
        C6496s.h(fVar, "descriptor");
        i f02 = f0();
        j h10 = fVar.h();
        if (C6496s.c(h10, k.b.f68507a)) {
            z10 = true;
        } else {
            z10 = h10 instanceof d;
        }
        Class<C6539c> cls = C6539c.class;
        if (z10) {
            C6538b d10 = d();
            if (f02 instanceof C6539c) {
                return new O(d10, (C6539c) f02);
            }
            throw F.e(-1, "Expected " + O.b(cls) + " as the serialized body of " + fVar.i() + ", but had " + O.b(f02.getClass()));
        }
        Class<v> cls2 = v.class;
        if (C6496s.c(h10, k.c.f68508a)) {
            C6538b d11 = d();
            f a10 = e0.a(fVar.g(0), d11.a());
            j h11 = a10.h();
            if ((h11 instanceof e) || C6496s.c(h11, j.b.f68505a)) {
                C6538b d12 = d();
                if (f02 instanceof v) {
                    return new Q(d12, (v) f02);
                }
                throw F.e(-1, "Expected " + O.b(cls2) + " as the serialized body of " + fVar.i() + ", but had " + O.b(f02.getClass()));
            } else if (d11.f().b()) {
                C6538b d13 = d();
                if (f02 instanceof C6539c) {
                    return new O(d13, (C6539c) f02);
                }
                throw F.e(-1, "Expected " + O.b(cls) + " as the serialized body of " + fVar.i() + ", but had " + O.b(f02.getClass()));
            } else {
                throw F.d(a10);
            }
        } else {
            C6538b d14 = d();
            if (f02 instanceof v) {
                return new M(d14, (v) f02, (String) null, (f) null, 12, (DefaultConstructorMarker) null);
            }
            throw F.e(-1, "Expected " + O.b(cls2) + " as the serialized body of " + fVar.i() + ", but had " + O.b(f02.getClass()));
        }
    }

    public void c(f fVar) {
        C6496s.h(fVar, "descriptor");
    }

    public C6538b d() {
        return this.f72188c;
    }

    /* access modifiers changed from: protected */
    public abstract i e0(String str);

    /* access modifiers changed from: protected */
    public final i f0() {
        i e02;
        String str = (String) U();
        if (str == null || (e02 = e0(str)) == null) {
            return s0();
        }
        return e02;
    }

    public i g() {
        return f0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public boolean J(String str) {
        C6496s.h(str, "tag");
        try {
            Boolean e10 = lh.j.e(r0(str));
            if (e10 != null) {
                return e10.booleanValue();
            }
            t0(AttributeType.BOOLEAN);
            throw new C6527k();
        } catch (IllegalArgumentException unused) {
            t0(AttributeType.BOOLEAN);
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public byte K(String str) {
        Byte b10;
        C6496s.h(str, "tag");
        try {
            int k10 = lh.j.k(r0(str));
            if (-128 > k10 || k10 > 127) {
                b10 = null;
            } else {
                b10 = Byte.valueOf((byte) k10);
            }
            if (b10 != null) {
                return b10.byteValue();
            }
            t0("byte");
            throw new C6527k();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public char L(String str) {
        C6496s.h(str, "tag");
        try {
            return Sg.p.l1(r0(str).a());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public double M(String str) {
        C6496s.h(str, "tag");
        try {
            double g10 = lh.j.g(r0(str));
            if (d().f().a() || (!Double.isInfinite(g10) && !Double.isNaN(g10))) {
                return g10;
            }
            throw F.a(Double.valueOf(g10), str, f0().toString());
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public int N(String str, f fVar) {
        C6496s.h(str, "tag");
        C6496s.h(fVar, "enumDescriptor");
        return G.j(fVar, d(), r0(str).a(), (String) null, 4, (Object) null);
    }

    public jh.e l(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (U() != null) {
            return super.l(fVar);
        }
        return new I(d(), s0()).l(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public float O(String str) {
        C6496s.h(str, "tag");
        try {
            float i10 = lh.j.i(r0(str));
            if (d().f().a() || (!Float.isInfinite(i10) && !Float.isNaN(i10))) {
                return i10;
            }
            throw F.a(Float.valueOf(i10), str, f0().toString());
        } catch (IllegalArgumentException unused) {
            t0(AttributeType.FLOAT);
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public jh.e P(String str, f fVar) {
        C6496s.h(str, "tag");
        C6496s.h(fVar, "inlineDescriptor");
        if (Y.b(fVar)) {
            return new C6583A(new Z(r0(str).a()), d());
        }
        return super.P(str, fVar);
    }

    public Object n(C5977a aVar) {
        C6496s.h(aVar, "deserializer");
        return U.d(this, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public int Q(String str) {
        C6496s.h(str, "tag");
        try {
            return lh.j.k(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public long R(String str) {
        C6496s.h(str, "tag");
        try {
            return lh.j.q(r0(str));
        } catch (IllegalArgumentException unused) {
            t0(Constants.LONG);
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public short S(String str) {
        Short sh2;
        C6496s.h(str, "tag");
        try {
            int k10 = lh.j.k(r0(str));
            if (-32768 > k10 || k10 > 32767) {
                sh2 = null;
            } else {
                sh2 = Short.valueOf((short) k10);
            }
            if (sh2 != null) {
                return sh2.shortValue();
            }
            t0("short");
            throw new C6527k();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new C6527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public String T(String str) {
        C6496s.h(str, "tag");
        x r02 = r0(str);
        if (!d().f().p() && !d0(r02, "string").b()) {
            throw F.f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", f0().toString());
        } else if (!(r02 instanceof t)) {
            return r02.a();
        } else {
            throw F.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
        }
    }

    /* access modifiers changed from: protected */
    public final x r0(String str) {
        x xVar;
        C6496s.h(str, "tag");
        i e02 = e0(str);
        if (e02 instanceof x) {
            xVar = (x) e02;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw F.f(-1, "Expected JsonPrimitive at " + str + ", found " + e02, f0().toString());
    }

    public abstract i s0();

    private C6586c(C6538b bVar, i iVar) {
        this.f72188c = bVar;
        this.f72189d = iVar;
        this.f72190e = d().f();
    }
}
