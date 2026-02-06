package zh;

import Gh.C5407h;
import com.revenuecat.purchases.common.Constants;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zh.c  reason: case insensitive filesystem */
public final class C6845c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f74025d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final C5407h f74026e;

    /* renamed from: f  reason: collision with root package name */
    public static final C5407h f74027f;

    /* renamed from: g  reason: collision with root package name */
    public static final C5407h f74028g;

    /* renamed from: h  reason: collision with root package name */
    public static final C5407h f74029h;

    /* renamed from: i  reason: collision with root package name */
    public static final C5407h f74030i;

    /* renamed from: j  reason: collision with root package name */
    public static final C5407h f74031j;

    /* renamed from: a  reason: collision with root package name */
    public final C5407h f74032a;

    /* renamed from: b  reason: collision with root package name */
    public final C5407h f74033b;

    /* renamed from: c  reason: collision with root package name */
    public final int f74034c;

    /* renamed from: zh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C5407h.a aVar = C5407h.f63295d;
        f74026e = aVar.d(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        f74027f = aVar.d(":status");
        f74028g = aVar.d(":method");
        f74029h = aVar.d(":path");
        f74030i = aVar.d(":scheme");
        f74031j = aVar.d(":authority");
    }

    public C6845c(C5407h hVar, C5407h hVar2) {
        C6496s.h(hVar, "name");
        C6496s.h(hVar2, "value");
        this.f74032a = hVar;
        this.f74033b = hVar2;
        this.f74034c = hVar.O() + 32 + hVar2.O();
    }

    public final C5407h a() {
        return this.f74032a;
    }

    public final C5407h b() {
        return this.f74033b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6845c)) {
            return false;
        }
        C6845c cVar = (C6845c) obj;
        if (C6496s.c(this.f74032a, cVar.f74032a) && C6496s.c(this.f74033b, cVar.f74033b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f74032a.hashCode() * 31) + this.f74033b.hashCode();
    }

    public String toString() {
        return this.f74032a.W() + ": " + this.f74033b.W();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6845c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            Gh.h$a r0 = Gh.C5407h.f63295d
            Gh.h r2 = r0.d(r2)
            Gh.h r3 = r0.d(r3)
            r1.<init>((Gh.C5407h) r2, (Gh.C5407h) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.C6845c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6845c(C5407h hVar, String str) {
        this(hVar, C5407h.f63295d.d(str));
        C6496s.h(hVar, "name");
        C6496s.h(str, "value");
    }
}
