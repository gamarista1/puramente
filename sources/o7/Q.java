package o7;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum Q {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f47154b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final EnumSet f47155c = null;

    /* renamed from: a  reason: collision with root package name */
    private final long f47160a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet a(long j10) {
            EnumSet<E> noneOf = EnumSet.noneOf(Q.class);
            Iterator it = Q.f47155c.iterator();
            while (it.hasNext()) {
                Q q10 = (Q) it.next();
                if ((q10.c() & j10) != 0) {
                    noneOf.add(q10);
                }
            }
            C6496s.g(noneOf, "result");
            return noneOf;
        }

        private a() {
        }
    }

    static {
        f47154b = new a((DefaultConstructorMarker) null);
        EnumSet<E> allOf = EnumSet.allOf(Q.class);
        C6496s.g(allOf, "allOf(SmartLoginOption::class.java)");
        f47155c = allOf;
    }

    private Q(long j10) {
        this.f47160a = j10;
    }

    public final long c() {
        return this.f47160a;
    }
}
