package Q0;

import Ef.m;
import Q0.Q;
import kotlin.jvm.internal.C6496s;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import r0.S1;

/* renamed from: Q0.q  reason: case insensitive filesystem */
public final class C1334q {

    /* renamed from: a  reason: collision with root package name */
    private final C1333p f5373a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5374b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5375c;

    /* renamed from: d  reason: collision with root package name */
    private int f5376d;

    /* renamed from: e  reason: collision with root package name */
    private int f5377e;

    /* renamed from: f  reason: collision with root package name */
    private float f5378f;

    /* renamed from: g  reason: collision with root package name */
    private float f5379g;

    public C1334q(C1333p pVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f5373a = pVar;
        this.f5374b = i10;
        this.f5375c = i11;
        this.f5376d = i12;
        this.f5377e = i13;
        this.f5378f = f10;
        this.f5379g = f11;
    }

    public static /* synthetic */ long l(C1334q qVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return qVar.k(j10, z10);
    }

    public final float a() {
        return this.f5379g;
    }

    public final int b() {
        return this.f5375c;
    }

    public final int c() {
        return this.f5377e;
    }

    public final int d() {
        return this.f5375c - this.f5374b;
    }

    public final C1333p e() {
        return this.f5373a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1334q)) {
            return false;
        }
        C1334q qVar = (C1334q) obj;
        if (C6496s.c(this.f5373a, qVar.f5373a) && this.f5374b == qVar.f5374b && this.f5375c == qVar.f5375c && this.f5376d == qVar.f5376d && this.f5377e == qVar.f5377e && Float.compare(this.f5378f, qVar.f5378f) == 0 && Float.compare(this.f5379g, qVar.f5379g) == 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f5374b;
    }

    public final int g() {
        return this.f5376d;
    }

    public final float h() {
        return this.f5378f;
    }

    public int hashCode() {
        return (((((((((((this.f5373a.hashCode() * 31) + Integer.hashCode(this.f5374b)) * 31) + Integer.hashCode(this.f5375c)) * 31) + Integer.hashCode(this.f5376d)) * 31) + Integer.hashCode(this.f5377e)) * 31) + Float.hashCode(this.f5378f)) * 31) + Float.hashCode(this.f5379g);
    }

    public final C2423i i(C2423i iVar) {
        return iVar.t(C2422h.a(0.0f, this.f5378f));
    }

    public final S1 j(S1 s12) {
        s12.i(C2422h.a(0.0f, this.f5378f));
        return s12;
    }

    public final long k(long j10, boolean z10) {
        if (z10) {
            Q.a aVar = Q.f5291b;
            if (Q.g(j10, aVar.a())) {
                return aVar.a();
            }
        }
        return S.b(m(Q.n(j10)), m(Q.i(j10)));
    }

    public final int m(int i10) {
        return i10 + this.f5374b;
    }

    public final int n(int i10) {
        return i10 + this.f5376d;
    }

    public final float o(float f10) {
        return f10 + this.f5378f;
    }

    public final C2423i p(C2423i iVar) {
        return iVar.t(C2422h.a(0.0f, -this.f5378f));
    }

    public final long q(long j10) {
        return C2422h.a(C2421g.m(j10), C2421g.n(j10) - this.f5378f);
    }

    public final int r(int i10) {
        return m.l(i10, this.f5374b, this.f5375c) - this.f5374b;
    }

    public final int s(int i10) {
        return i10 - this.f5376d;
    }

    public final float t(float f10) {
        return f10 - this.f5378f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f5373a + ", startIndex=" + this.f5374b + ", endIndex=" + this.f5375c + ", startLineIndex=" + this.f5376d + ", endLineIndex=" + this.f5377e + ", top=" + this.f5378f + ", bottom=" + this.f5379g + ')';
    }
}
