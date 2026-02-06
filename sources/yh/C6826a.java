package yh;

import Gh.C5406g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.u;

/* renamed from: yh.a  reason: case insensitive filesystem */
public final class C6826a {

    /* renamed from: c  reason: collision with root package name */
    public static final C1078a f73970c = new C1078a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5406g f73971a;

    /* renamed from: b  reason: collision with root package name */
    private long f73972b = 262144;

    /* renamed from: yh.a$a  reason: collision with other inner class name */
    public static final class C1078a {
        public /* synthetic */ C1078a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1078a() {
        }
    }

    public C6826a(C5406g gVar) {
        C6496s.h(gVar, "source");
        this.f73971a = gVar;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.f();
            }
            aVar.c(b10);
        }
    }

    public final String b() {
        String N10 = this.f73971a.N(this.f73972b);
        this.f73972b -= (long) N10.length();
        return N10;
    }
}
