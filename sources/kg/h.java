package kg;

import ig.w;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71575b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final h f71576c = new h(C6565s.n());

    /* renamed from: a  reason: collision with root package name */
    private final List f71577a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w wVar) {
            C6496s.h(wVar, "table");
            if (wVar.v() == 0) {
                return b();
            }
            List w10 = wVar.w();
            C6496s.g(w10, "getRequirementList(...)");
            return new h(w10, (DefaultConstructorMarker) null);
        }

        public final h b() {
            return h.f71576c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private h(List list) {
        this.f71577a = list;
    }
}
