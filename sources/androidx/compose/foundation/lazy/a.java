package androidx.compose.foundation.lazy;

import D.c;
import Y.A1;
import Y.C1488g1;
import Y.C1505o0;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import com.google.android.gms.common.api.a;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C2763G;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private C1505o0 f12935a = C1488g1.a(a.e.API_PRIORITY_OTHER);

    /* renamed from: b  reason: collision with root package name */
    private C1505o0 f12936b = C1488g1.a(a.e.API_PRIORITY_OTHER);

    public i b(i iVar, float f10) {
        return iVar.h(new ParentSizeElement(f10, (A1) null, this.f12936b, "fillParentMaxHeight", 2, (DefaultConstructorMarker) null));
    }

    public i c(i iVar, C2763G g10, C2763G g11, C2763G g12) {
        if (g10 == null && g11 == null && g12 == null) {
            return iVar;
        }
        return iVar.h(new LazyLayoutAnimateItemElement(g10, g11, g12));
    }

    public final void d(int i10, int i11) {
        this.f12935a.f(i10);
        this.f12936b.f(i11);
    }
}
