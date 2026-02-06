package androidx.compose.foundation.layout;

import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import c1.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

public abstract class l {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f12861b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f12860a = f10;
            this.f12861b = f11;
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

    public static final i a(i iVar, float f10, float f11) {
        return iVar.h(new OffsetElement(f10, f11, true, new a(f10, f11), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i b(i iVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h.j((float) 0);
        }
        if ((i10 & 2) != 0) {
            f11 = h.j((float) 0);
        }
        return a(iVar, f10, f11);
    }
}
