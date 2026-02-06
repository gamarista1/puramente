package androidx.compose.foundation;

import B.l;
import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1674y0;
import androidx.compose.ui.platform.C1676z0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public abstract class FocusableKt {

    /* renamed from: a  reason: collision with root package name */
    private static final C1674y0 f12433a;

    /* renamed from: b  reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f12434b = new FocusableKt$FocusableInNonTouchModeElement$1();

    public static final class a extends C6498u implements C6798l {
        public a() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new a();
        } else {
            lVar = C1676z0.a();
        }
        f12433a = new C1674y0(lVar);
    }

    public static final i a(i iVar, boolean z10, l lVar) {
        i iVar2;
        if (z10) {
            iVar2 = new FocusableElement(lVar);
        } else {
            iVar2 = i.f23074a;
        }
        return iVar.h(iVar2);
    }

    public static /* synthetic */ i b(i iVar, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return a(iVar, z10, lVar);
    }
}
