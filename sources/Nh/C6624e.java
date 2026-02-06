package nh;

import Ff.d;
import gh.C5977a;
import gh.C5978b;
import gh.C5987k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: nh.e  reason: case insensitive filesystem */
public abstract class C6624e {
    public /* synthetic */ C6624e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ C5978b c(C6624e eVar, d dVar, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                list = C6565s.n();
            }
            return eVar.b(dVar, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(h hVar);

    public abstract C5978b b(d dVar, List list);

    public abstract C5977a d(d dVar, String str);

    public abstract C5987k e(d dVar, Object obj);

    private C6624e() {
    }
}
