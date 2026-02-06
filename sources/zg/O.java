package Zg;

import Ug.V0;
import kotlin.jvm.internal.C6496s;
import qf.g;

final class O {

    /* renamed from: a  reason: collision with root package name */
    public final g f66963a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f66964b;

    /* renamed from: c  reason: collision with root package name */
    private final V0[] f66965c;

    /* renamed from: d  reason: collision with root package name */
    private int f66966d;

    public O(g gVar, int i10) {
        this.f66963a = gVar;
        this.f66964b = new Object[i10];
        this.f66965c = new V0[i10];
    }

    public final void a(V0 v02, Object obj) {
        Object[] objArr = this.f66964b;
        int i10 = this.f66966d;
        objArr[i10] = obj;
        V0[] v0Arr = this.f66965c;
        this.f66966d = i10 + 1;
        C6496s.f(v02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i10] = v02;
    }

    public final void b(g gVar) {
        int length = this.f66965c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                V0 v02 = this.f66965c[length];
                C6496s.e(v02);
                v02.E0(gVar, this.f66964b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
