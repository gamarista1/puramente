package N3;

import M3.c;
import O3.h;
import P3.u;
import androidx.work.s;
import androidx.work.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4449c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f4450d;

    /* renamed from: b  reason: collision with root package name */
    private final int f4451b = 7;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i10 = s.i("NetworkNotRoamingCtrlr");
        C6496s.g(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f4450d = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(hVar);
        C6496s.h(hVar, "tracker");
    }

    public int b() {
        return this.f4451b;
    }

    public boolean c(u uVar) {
        C6496s.h(uVar, "workSpec");
        if (uVar.f5100j.d() == t.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean e(c cVar) {
        C6496s.h(cVar, "value");
        if (!cVar.a() || !cVar.c()) {
            return true;
        }
        return false;
    }
}
