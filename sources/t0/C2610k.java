package t0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.T1;
import r0.i2;
import r0.j2;

/* renamed from: t0.k  reason: case insensitive filesystem */
public final class C2610k extends C2606g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25945e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f25946f = i2.f25529a.a();

    /* renamed from: g  reason: collision with root package name */
    private static final int f25947g = j2.f25533a.b();

    /* renamed from: a  reason: collision with root package name */
    private final float f25948a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25949b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25950c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25951d;

    /* renamed from: t0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2610k.f25946f;
        }

        private a() {
        }
    }

    public /* synthetic */ C2610k(float f10, float f11, int i10, int i11, T1 t12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, t12);
    }

    public final int b() {
        return this.f25950c;
    }

    public final int c() {
        return this.f25951d;
    }

    public final float d() {
        return this.f25949b;
    }

    public final T1 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2610k)) {
            return false;
        }
        C2610k kVar = (C2610k) obj;
        if (this.f25948a != kVar.f25948a || this.f25949b != kVar.f25949b || !i2.e(this.f25950c, kVar.f25950c) || !j2.e(this.f25951d, kVar.f25951d)) {
            return false;
        }
        kVar.getClass();
        if (!C6496s.c((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f25948a;
    }

    public int hashCode() {
        return ((((((Float.hashCode(this.f25948a) * 31) + Float.hashCode(this.f25949b)) * 31) + i2.f(this.f25950c)) * 31) + j2.f(this.f25951d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.f25948a + ", miter=" + this.f25949b + ", cap=" + i2.g(this.f25950c) + ", join=" + j2.g(this.f25951d) + ", pathEffect=" + null + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2610k(float f10, float f11, int i10, int i11, T1 t12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f25946f : i10, (i12 & 8) != 0 ? f25947g : i11, (i12 & 16) != 0 ? null : t12, (DefaultConstructorMarker) null);
    }

    private C2610k(float f10, float f11, int i10, int i11, T1 t12) {
        super((DefaultConstructorMarker) null);
        this.f25948a = f10;
        this.f25949b = f11;
        this.f25950c = i10;
        this.f25951d = i11;
    }
}
