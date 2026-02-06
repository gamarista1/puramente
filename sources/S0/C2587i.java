package s0;

import androidx.collection.C;
import androidx.collection.C1602p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.n;

/* renamed from: s0.i  reason: case insensitive filesystem */
public abstract class C2587i {

    /* renamed from: a  reason: collision with root package name */
    private static final C f25828a;

    static {
        C2585g gVar = C2585g.f25794a;
        int b10 = gVar.w().b();
        int b11 = gVar.w().b();
        n.a aVar = n.f25846a;
        f25828a = C1602p.c(b10 | (b11 << 6) | (aVar.b() << 12), C2586h.f25818g.c(gVar.w()), gVar.w().b() | (gVar.t().b() << 6) | (aVar.b() << 12), new C2586h(gVar.w(), gVar.t(), aVar.b(), (DefaultConstructorMarker) null), gVar.t().b() | (gVar.w().b() << 6) | (aVar.b() << 12), new C2586h(gVar.t(), gVar.w(), aVar.b(), (DefaultConstructorMarker) null));
    }

    public static final C a() {
        return f25828a;
    }
}
