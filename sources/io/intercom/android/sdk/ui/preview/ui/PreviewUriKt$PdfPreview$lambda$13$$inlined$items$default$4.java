package io.intercom.android.sdk.ui.preview.ui;

import D.c;
import H0.C1187h;
import Y.C1500m;
import Y.C1506p;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2465Q;
import r0.C2547y0;
import x.C2842F;
import yf.r;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "Llf/M;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4 extends C6498u implements r {
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4(List list) {
        super(4);
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, int i10, C1500m mVar, int i11) {
        int i12;
        int i13 = i10;
        C1500m mVar2 = mVar;
        if ((i11 & 6) == 0) {
            i12 = i11 | (mVar2.S(cVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= mVar2.d(i13) ? 32 : 16;
        }
        if ((i12 & 147) != 146 || !mVar.i()) {
            if (C1506p.H()) {
                C1506p.Q(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            mVar2.T(-1436658847);
            C2842F.b(C2465Q.c((Bitmap) this.$items.get(i13)), "Pdf Preview", n.m(q.f(i.f23074a, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, h.j((float) 8), 7, (Object) null), (k0.c) null, C1187h.f2609a.c(), 0.0f, (C2547y0) null, 0, mVar, 25016, 232);
            mVar.M();
            if (C1506p.H()) {
                C1506p.P();
                return;
            }
            return;
        }
        mVar.I();
    }
}
