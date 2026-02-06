package cg;

import Fg.C5366d0;
import Fg.G;
import Fg.I0;
import Of.m0;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

/* renamed from: cg.a  reason: case insensitive filesystem */
public final class C5798a extends G {

    /* renamed from: d  reason: collision with root package name */
    private final I0 f67326d;

    /* renamed from: e  reason: collision with root package name */
    private final C5800c f67327e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f67328f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f67329g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f67330h;

    /* renamed from: i  reason: collision with root package name */
    private final C5366d0 f67331i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5798a(I0 i02, C5800c cVar, boolean z10, boolean z11, Set set, C5366d0 d0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i02, (i10 & 2) != 0 ? C5800c.INFLEXIBLE : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : d0Var);
    }

    public static /* synthetic */ C5798a f(C5798a aVar, I0 i02, C5800c cVar, boolean z10, boolean z11, Set set, C5366d0 d0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i02 = aVar.f67326d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f67327e;
        }
        C5800c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f67328f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f67329g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = aVar.f67330h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            d0Var = aVar.f67331i;
        }
        return aVar.e(i02, cVar2, z12, z13, set2, d0Var);
    }

    public C5366d0 a() {
        return this.f67331i;
    }

    public I0 b() {
        return this.f67326d;
    }

    public Set c() {
        return this.f67330h;
    }

    public final C5798a e(I0 i02, C5800c cVar, boolean z10, boolean z11, Set set, C5366d0 d0Var) {
        C6496s.h(i02, "howThisTypeIsUsed");
        C6496s.h(cVar, "flexibility");
        return new C5798a(i02, cVar, z10, z11, set, d0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5798a)) {
            return false;
        }
        C5798a aVar = (C5798a) obj;
        if (C6496s.c(aVar.a(), a()) && aVar.b() == b() && aVar.f67327e == this.f67327e && aVar.f67328f == this.f67328f && aVar.f67329g == this.f67329g) {
            return true;
        }
        return false;
    }

    public final C5800c g() {
        return this.f67327e;
    }

    public final boolean h() {
        return this.f67329g;
    }

    public int hashCode() {
        int i10;
        C5366d0 a10 = a();
        if (a10 != null) {
            i10 = a10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = i10 + (i10 * 31) + b().hashCode();
        int hashCode2 = hashCode + (hashCode * 31) + this.f67327e.hashCode();
        int i11 = hashCode2 + (hashCode2 * 31) + (this.f67328f ? 1 : 0);
        return i11 + (i11 * 31) + (this.f67329g ? 1 : 0);
    }

    public final boolean i() {
        return this.f67328f;
    }

    public final C5798a j(boolean z10) {
        return f(this, (I0) null, (C5800c) null, z10, false, (Set) null, (C5366d0) null, 59, (Object) null);
    }

    public C5798a k(C5366d0 d0Var) {
        return f(this, (I0) null, (C5800c) null, false, false, (Set) null, d0Var, 31, (Object) null);
    }

    public final C5798a l(C5800c cVar) {
        C6496s.h(cVar, "flexibility");
        return f(this, (I0) null, cVar, false, false, (Set) null, (C5366d0) null, 61, (Object) null);
    }

    /* renamed from: m */
    public C5798a d(m0 m0Var) {
        Set d10;
        C6496s.h(m0Var, "typeParameter");
        if (c() != null) {
            d10 = Y.o(c(), m0Var);
        } else {
            d10 = Y.d(m0Var);
        }
        return f(this, (I0) null, (C5800c) null, false, false, d10, (C5366d0) null, 47, (Object) null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f67326d + ", flexibility=" + this.f67327e + ", isRaw=" + this.f67328f + ", isForAnnotationParameter=" + this.f67329g + ", visitedTypeParameters=" + this.f67330h + ", defaultType=" + this.f67331i + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5798a(I0 i02, C5800c cVar, boolean z10, boolean z11, Set set, C5366d0 d0Var) {
        super(i02, set, d0Var);
        C6496s.h(i02, "howThisTypeIsUsed");
        C6496s.h(cVar, "flexibility");
        this.f67326d = i02;
        this.f67327e = cVar;
        this.f67328f = z10;
        this.f67329g = z11;
        this.f67330h = set;
        this.f67331i = d0Var;
    }
}
