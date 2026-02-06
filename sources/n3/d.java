package N3;

import M3.c;
import O3.h;
import P3.u;
import android.os.Build;
import androidx.work.t;
import kotlin.jvm.internal.C6496s;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    private final int f4445b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(hVar);
        C6496s.h(hVar, "tracker");
    }

    public int b() {
        return this.f4445b;
    }

    public boolean c(u uVar) {
        C6496s.h(uVar, "workSpec");
        if (uVar.f5100j.d() == t.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean e(c cVar) {
        C6496s.h(cVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!cVar.a() || !cVar.d()) {
                return true;
            }
        } else if (!cVar.a()) {
            return true;
        }
        return false;
    }
}
