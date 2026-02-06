package qg;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import sf.C6714a;

public enum v {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f72718b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final Set f72719c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f72720d = null;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f72737a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        int i10;
        v[] a10;
        f72736t = C6714a.a(a10);
        f72718b = new a((DefaultConstructorMarker) null);
        v[] values = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : values) {
            if (vVar.f72737a) {
                arrayList.add(vVar);
            }
        }
        f72719c = C6565s.j1(arrayList);
        f72720d = C6559l.z1(values());
    }

    private v(boolean z10) {
        this.f72737a = z10;
    }
}
