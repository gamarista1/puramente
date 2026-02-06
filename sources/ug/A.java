package Ug;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

final class A {

    /* renamed from: a  reason: collision with root package name */
    public final Object f65272a;

    /* renamed from: b  reason: collision with root package name */
    public final C5580m f65273b;

    /* renamed from: c  reason: collision with root package name */
    public final C6798l f65274c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f65275d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f65276e;

    public A(Object obj, C5580m mVar, C6798l lVar, Object obj2, Throwable th2) {
        this.f65272a = obj;
        this.f65273b = mVar;
        this.f65274c = lVar;
        this.f65275d = obj2;
        this.f65276e = th2;
    }

    public static /* synthetic */ A b(A a10, Object obj, C5580m mVar, C6798l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = a10.f65272a;
        }
        if ((i10 & 2) != 0) {
            mVar = a10.f65273b;
        }
        C5580m mVar2 = mVar;
        if ((i10 & 4) != 0) {
            lVar = a10.f65274c;
        }
        C6798l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = a10.f65275d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = a10.f65276e;
        }
        return a10.a(obj, mVar2, lVar2, obj4, th2);
    }

    public final A a(Object obj, C5580m mVar, C6798l lVar, Object obj2, Throwable th2) {
        return new A(obj, mVar, lVar, obj2, th2);
    }

    public final boolean c() {
        if (this.f65276e != null) {
            return true;
        }
        return false;
    }

    public final void d(C5584o oVar, Throwable th2) {
        C5580m mVar = this.f65273b;
        if (mVar != null) {
            oVar.j(mVar, th2);
        }
        C6798l lVar = this.f65274c;
        if (lVar != null) {
            oVar.k(lVar, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        if (C6496s.c(this.f65272a, a10.f65272a) && C6496s.c(this.f65273b, a10.f65273b) && C6496s.c(this.f65274c, a10.f65274c) && C6496s.c(this.f65275d, a10.f65275d) && C6496s.c(this.f65276e, a10.f65276e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj = this.f65272a;
        int i14 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i15 = i10 * 31;
        C5580m mVar = this.f65273b;
        if (mVar == null) {
            i11 = 0;
        } else {
            i11 = mVar.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        C6798l lVar = this.f65274c;
        if (lVar == null) {
            i12 = 0;
        } else {
            i12 = lVar.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        Object obj2 = this.f65275d;
        if (obj2 == null) {
            i13 = 0;
        } else {
            i13 = obj2.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        Throwable th2 = this.f65276e;
        if (th2 != null) {
            i14 = th2.hashCode();
        }
        return i18 + i14;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f65272a + ", cancelHandler=" + this.f65273b + ", onCancellation=" + this.f65274c + ", idempotentResume=" + this.f65275d + ", cancelCause=" + this.f65276e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, C5580m mVar, C6798l lVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
