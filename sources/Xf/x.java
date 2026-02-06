package Xf;

import fg.C5916k;
import fg.C5918l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import ng.c;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static final List f66400a;

    /* renamed from: b  reason: collision with root package name */
    private static final List f66401b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f66402c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f66403d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f66404e;

    static {
        C5670c cVar = C5670c.FIELD;
        C5670c cVar2 = C5670c.METHOD_RETURN_TYPE;
        C5670c cVar3 = C5670c.VALUE_PARAMETER;
        List q10 = C6565s.q(cVar, cVar2, cVar3, C5670c.TYPE_PARAMETER_BOUNDS, C5670c.TYPE_USE);
        f66400a = q10;
        List e10 = C6565s.e(cVar3);
        f66401b = e10;
        c k10 = J.k();
        C5916k kVar = C5916k.NOT_NULL;
        Map l10 = O.l(C6502A.a(k10, new w(new C5918l(kVar, false, 2, (DefaultConstructorMarker) null), q10, false)), C6502A.a(J.i(), new w(new C5918l(kVar, false, 2, (DefaultConstructorMarker) null), q10, false)), C6502A.a(J.j(), new w(new C5918l(C5916k.FORCE_FLEXIBILITY, false, 2, (DefaultConstructorMarker) null), q10, false, 4, (DefaultConstructorMarker) null)));
        f66402c = l10;
        Map l11 = O.l(C6502A.a(J.d(), new w(new C5918l(kVar, false, 2, (DefaultConstructorMarker) null), e10, false, 4, (DefaultConstructorMarker) null)), C6502A.a(J.e(), new w(new C5918l(C5916k.NULLABLE, false, 2, (DefaultConstructorMarker) null), e10, false, 4, (DefaultConstructorMarker) null)));
        f66403d = l11;
        f66404e = O.p(l10, l11);
    }

    public static final Map a() {
        return f66404e;
    }

    public static final Map b() {
        return f66402c;
    }
}
