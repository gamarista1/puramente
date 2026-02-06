package W;

import B.i;
import c1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import w.C2760D;
import w.C2762F;
import w.C2782a;
import w.C2797i;
import w.C2812x;
import w.q0;
import yf.C6798l;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final C2760D f8362a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final q0 f8363b = new q0(120, 0, C2762F.d(), 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final q0 f8364c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final q0 f8365d;

    static {
        C2812x xVar = new C2812x(0.4f, 0.0f, 0.6f, 1.0f);
        f8362a = xVar;
        C2812x xVar2 = xVar;
        f8364c = new q0(150, 0, xVar2, 2, (DefaultConstructorMarker) null);
        f8365d = new q0(120, 0, xVar2, 2, (DefaultConstructorMarker) null);
    }

    public static final Object d(C2782a aVar, float f10, i iVar, i iVar2, C6658d dVar) {
        C2797i iVar3;
        if (iVar2 != null) {
            iVar3 = k.f8361a.a(iVar2);
        } else if (iVar != null) {
            iVar3 = k.f8361a.b(iVar);
        } else {
            iVar3 = null;
        }
        C2797i iVar4 = iVar3;
        if (iVar4 != null) {
            Object f11 = C2782a.f(aVar, h.e(f10), iVar4, (Object) null, (C6798l) null, dVar, 12, (Object) null);
            if (f11 == C6680b.f()) {
                return f11;
            }
            return C6514M.f71813a;
        }
        Object t10 = aVar.t(h.e(f10), dVar);
        if (t10 == C6680b.f()) {
            return t10;
        }
        return C6514M.f71813a;
    }
}
