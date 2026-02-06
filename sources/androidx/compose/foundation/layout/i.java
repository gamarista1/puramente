package androidx.compose.foundation.layout;

import C.I;
import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public abstract class i {

    public static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I f12855a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(I i10) {
            super(1);
            this.f12855a = i10;
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

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I f12856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(I i10) {
            super(1);
            this.f12856a = i10;
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

    public static final k0.i a(k0.i iVar, I i10) {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new a(i10);
        } else {
            lVar = C1676z0.a();
        }
        return iVar.h(new IntrinsicHeightElement(i10, true, lVar));
    }

    public static final k0.i b(k0.i iVar, I i10) {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new b(i10);
        } else {
            lVar = C1676z0.a();
        }
        return iVar.h(new IntrinsicWidthElement(i10, true, lVar));
    }
}
