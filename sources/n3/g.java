package N3;

import M3.c;
import O3.h;
import P3.u;
import android.os.Build;
import androidx.work.t;
import kotlin.jvm.internal.C6496s;

public final class g extends c {

    /* renamed from: b  reason: collision with root package name */
    private final int f4452b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(hVar);
        C6496s.h(hVar, "tracker");
    }

    public int b() {
        return this.f4452b;
    }

    public boolean c(u uVar) {
        C6496s.h(uVar, "workSpec");
        t d10 = uVar.f5100j.d();
        if (d10 == t.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d10 == t.TEMPORARILY_UNMETERED)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean e(c cVar) {
        C6496s.h(cVar, "value");
        if (!cVar.a() || cVar.b()) {
            return true;
        }
        return false;
    }
}
