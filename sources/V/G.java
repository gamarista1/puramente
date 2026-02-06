package V;

import C.N;
import V.Z;
import W.C1426a;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.window.s;
import c1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public static final G f6534a = new G();

    /* renamed from: b  reason: collision with root package name */
    private static final N f6535b = n.b(I.f6551a, h.j((float) 0));

    private G() {
    }

    private static final boolean b(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    public final s a(String str, C1500m mVar, int i10) {
        int i11;
        if (C1506p.H()) {
            C1506p.Q(-1724259382, i10, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        A1 c10 = C1426a.c(false, false, mVar, 0, 3);
        if (!b(c10)) {
            i11 = 393248;
        } else {
            i11 = 393216;
        }
        Z.a aVar = Z.f7173b;
        if (Z.g(str, aVar.a()) || (Z.g(str, aVar.c()) && !b(c10))) {
            i11 |= 8;
        }
        s sVar = new s(i11, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (C1506p.H()) {
            C1506p.P();
        }
        return sVar;
    }
}
