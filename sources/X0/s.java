package x0;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.U1;
import r0.i2;
import r0.j2;

public final class s extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f28197a;

    /* renamed from: b  reason: collision with root package name */
    private final List f28198b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28199c;

    /* renamed from: d  reason: collision with root package name */
    private final C2514n0 f28200d;

    /* renamed from: e  reason: collision with root package name */
    private final float f28201e;

    /* renamed from: f  reason: collision with root package name */
    private final C2514n0 f28202f;

    /* renamed from: g  reason: collision with root package name */
    private final float f28203g;

    /* renamed from: h  reason: collision with root package name */
    private final float f28204h;

    /* renamed from: i  reason: collision with root package name */
    private final int f28205i;

    /* renamed from: j  reason: collision with root package name */
    private final int f28206j;

    /* renamed from: k  reason: collision with root package name */
    private final float f28207k;

    /* renamed from: l  reason: collision with root package name */
    private final float f28208l;

    /* renamed from: m  reason: collision with root package name */
    private final float f28209m;

    /* renamed from: n  reason: collision with root package name */
    private final float f28210n;

    public /* synthetic */ s(String str, List list, int i10, C2514n0 n0Var, float f10, C2514n0 n0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, n0Var, f10, n0Var2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final float A() {
        return this.f28204h;
    }

    public final float C() {
        return this.f28209m;
    }

    public final float D() {
        return this.f28210n;
    }

    public final float E() {
        return this.f28208l;
    }

    public final C2514n0 a() {
        return this.f28200d;
    }

    public final float b() {
        return this.f28201e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (C6496s.c(this.f28197a, sVar.f28197a) && C6496s.c(this.f28200d, sVar.f28200d) && this.f28201e == sVar.f28201e && C6496s.c(this.f28202f, sVar.f28202f) && this.f28203g == sVar.f28203g && this.f28204h == sVar.f28204h && i2.e(this.f28205i, sVar.f28205i) && j2.e(this.f28206j, sVar.f28206j) && this.f28207k == sVar.f28207k && this.f28208l == sVar.f28208l && this.f28209m == sVar.f28209m && this.f28210n == sVar.f28210n && U1.d(this.f28199c, sVar.f28199c) && C6496s.c(this.f28198b, sVar.f28198b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String g() {
        return this.f28197a;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f28197a.hashCode() * 31) + this.f28198b.hashCode()) * 31;
        C2514n0 n0Var = this.f28200d;
        int i11 = 0;
        if (n0Var != null) {
            i10 = n0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((hashCode + i10) * 31) + Float.hashCode(this.f28201e)) * 31;
        C2514n0 n0Var2 = this.f28202f;
        if (n0Var2 != null) {
            i11 = n0Var2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i11) * 31) + Float.hashCode(this.f28203g)) * 31) + Float.hashCode(this.f28204h)) * 31) + i2.f(this.f28205i)) * 31) + j2.f(this.f28206j)) * 31) + Float.hashCode(this.f28207k)) * 31) + Float.hashCode(this.f28208l)) * 31) + Float.hashCode(this.f28209m)) * 31) + Float.hashCode(this.f28210n)) * 31) + U1.e(this.f28199c);
    }

    public final List k() {
        return this.f28198b;
    }

    public final int n() {
        return this.f28199c;
    }

    public final C2514n0 r() {
        return this.f28202f;
    }

    public final float t() {
        return this.f28203g;
    }

    public final int v() {
        return this.f28205i;
    }

    public final int x() {
        return this.f28206j;
    }

    public final float z() {
        return this.f28207k;
    }

    private s(String str, List list, int i10, C2514n0 n0Var, float f10, C2514n0 n0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super((DefaultConstructorMarker) null);
        this.f28197a = str;
        this.f28198b = list;
        this.f28199c = i10;
        this.f28200d = n0Var;
        this.f28201e = f10;
        this.f28202f = n0Var2;
        this.f28203g = f11;
        this.f28204h = f12;
        this.f28205i = i11;
        this.f28206j = i12;
        this.f28207k = f13;
        this.f28208l = f14;
        this.f28209m = f15;
        this.f28210n = f16;
    }
}
