package Pf;

import Fg.C5366d0;
import Fg.N0;
import Fg.S;
import Lf.i;
import Lf.o;
import Of.H;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import ng.b;
import ng.c;
import ng.f;
import tg.C6735a;
import tg.C6736b;
import tg.k;
import tg.x;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final f f64597a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f64598b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f64599c;

    /* renamed from: d  reason: collision with root package name */
    private static final f f64600d;

    /* renamed from: e  reason: collision with root package name */
    private static final f f64601e;

    static {
        f i10 = f.i(MetricTracker.Object.MESSAGE);
        C6496s.g(i10, "identifier(...)");
        f64597a = i10;
        f i11 = f.i("replaceWith");
        C6496s.g(i11, "identifier(...)");
        f64598b = i11;
        f i12 = f.i("level");
        C6496s.g(i12, "identifier(...)");
        f64599c = i12;
        f i13 = f.i("expression");
        C6496s.g(i13, "identifier(...)");
        f64600d = i13;
        f i14 = f.i("imports");
        C6496s.g(i14, "identifier(...)");
        f64601e = i14;
    }

    public static final c b(i iVar, String str, String str2, String str3, boolean z10) {
        C6496s.h(iVar, "<this>");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(str2, "replaceWith");
        C6496s.h(str3, "level");
        l lVar = new l(iVar, o.a.f63956B, O.l(C6502A.a(f64600d, new x(str2)), C6502A.a(f64601e, new C6736b(C6565s.n(), new f(iVar)))), false, 8, (DefaultConstructorMarker) null);
        c cVar = o.a.f64043y;
        Pair a10 = C6502A.a(f64597a, new x(str));
        Pair a11 = C6502A.a(f64598b, new C6735a(lVar));
        f fVar = f64599c;
        b c10 = b.f72283d.c(o.a.f63954A);
        f i10 = f.i(str3);
        C6496s.g(i10, "identifier(...)");
        return new l(iVar, cVar, O.l(a10, a11, C6502A.a(fVar, new k(c10, i10))), z10);
    }

    public static /* synthetic */ c c(i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(iVar, str, str2, str3, z10);
    }

    /* access modifiers changed from: private */
    public static final S d(i iVar, H h10) {
        C6496s.h(h10, "module");
        C5366d0 l10 = h10.m().l(N0.INVARIANT, iVar.W());
        C6496s.g(l10, "getArrayType(...)");
        return l10;
    }
}
