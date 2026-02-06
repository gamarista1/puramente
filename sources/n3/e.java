package N3;

import M3.c;
import O3.h;
import P3.u;
import android.os.Build;
import androidx.work.s;
import androidx.work.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4446c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f4447d;

    /* renamed from: b  reason: collision with root package name */
    private final int f4448b = 7;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String i10 = s.i("NetworkMeteredCtrlr");
        C6496s.g(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f4447d = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(hVar);
        C6496s.h(hVar, "tracker");
    }

    public int b() {
        return this.f4448b;
    }

    public boolean c(u uVar) {
        C6496s.h(uVar, "workSpec");
        if (uVar.f5100j.d() == t.METERED) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean e(c cVar) {
        C6496s.h(cVar, "value");
        if (Build.VERSION.SDK_INT < 26) {
            s.e().a(f4447d, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (cVar.a()) {
                return false;
            }
        } else if (cVar.a() && cVar.b()) {
            return false;
        }
        return true;
    }
}
