package a0;

import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.V;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final K f10575a = V.d();

    public final void a(Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        K k10 = this.f10575a;
        int k11 = k10.k(obj);
        if (k11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj3 = null;
        } else {
            obj3 = k10.f12125c[k11];
        }
        if (obj3 != null) {
            if (obj3 instanceof L) {
                C6496s.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((L) obj3).h(obj2);
            } else if (obj3 != obj2) {
                L l10 = new L(0, 1, (DefaultConstructorMarker) null);
                C6496s.f(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                l10.h(obj3);
                l10.h(obj2);
                obj2 = l10;
            }
            obj2 = obj3;
        }
        if (z10) {
            int i10 = ~k11;
            k10.f12124b[i10] = obj;
            k10.f12125c[i10] = obj2;
            return;
        }
        k10.f12125c[k11] = obj2;
    }

    public final void b() {
        this.f10575a.h();
    }

    public final boolean c(Object obj) {
        return this.f10575a.a(obj);
    }

    public final K d() {
        return this.f10575a;
    }

    public final int e() {
        return this.f10575a.d();
    }

    public final boolean f(Object obj, Object obj2) {
        Object b10 = this.f10575a.b(obj);
        if (b10 == null) {
            return false;
        }
        if (b10 instanceof L) {
            L l10 = (L) b10;
            boolean x10 = l10.x(obj2);
            if (x10 && l10.d()) {
                this.f10575a.o(obj);
            }
            return x10;
        } else if (!C6496s.c(b10, obj2)) {
            return false;
        } else {
            this.f10575a.o(obj);
            return true;
        }
    }

    public final void g(Object obj) {
        boolean z10;
        K k10 = this.f10575a;
        long[] jArr = k10.f12123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = k10.f12124b[i13];
                            Object obj3 = k10.f12125c[i13];
                            if (obj3 instanceof L) {
                                C6496s.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                L l10 = (L) obj3;
                                l10.x(obj);
                                z10 = l10.d();
                            } else if (obj3 == obj) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                k10.p(i13);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Object obj, Object obj2) {
        this.f10575a.r(obj, obj2);
    }
}
