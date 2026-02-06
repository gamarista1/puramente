package io.intercom.android.sdk.ui.preview.ui;

import D.c;
import Y.C1500m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LD/c;", "", "it", "Llf/M;", "invoke", "(LD/c;ILY/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3 extends C6498u implements r {
    final /* synthetic */ int $currentPage$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ C6798l $onThumbnailClick$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3(List list, int i10, C6798l lVar) {
        super(4);
        this.$items = list;
        this.$currentPage$inlined = i10;
        this.$onThumbnailClick$inlined = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(D.c r21, int r22, Y.C1500m r23, int r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r7 = r23
            r2 = r24 & 6
            r3 = 2
            r4 = 4
            if (r2 != 0) goto L_0x001a
            r2 = r21
            boolean r2 = r7.S(r2)
            if (r2 == 0) goto L_0x0016
            r2 = r4
            goto L_0x0017
        L_0x0016:
            r2 = r3
        L_0x0017:
            r2 = r24 | r2
            goto L_0x001c
        L_0x001a:
            r2 = r24
        L_0x001c:
            r5 = 48
            r6 = r24 & 48
            r8 = 32
            if (r6 != 0) goto L_0x002f
            boolean r6 = r7.d(r1)
            if (r6 == 0) goto L_0x002c
            r6 = r8
            goto L_0x002e
        L_0x002c:
            r6 = 16
        L_0x002e:
            r2 = r2 | r6
        L_0x002f:
            r6 = r2 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x0041
            boolean r6 = r23.i()
            if (r6 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            r23.I()
            goto L_0x0179
        L_0x0041:
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x0050
            r6 = -1
            java.lang.String r9 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            r10 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            Y.C1506p.Q(r10, r2, r6, r9)
        L_0x0050:
            java.util.List r6 = r0.$items
            java.lang.Object r6 = r6.get(r1)
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile r6 = (io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile) r6
            r9 = 534177283(0x1fd6e603, float:9.101305E-20)
            r7.T(r9)
            int r9 = r0.$currentPage$inlined
            if (r9 != r1) goto L_0x0069
            r0.x0$a r9 = r0.C2544x0.f25560b
            long r9 = r9.i()
            goto L_0x006f
        L_0x0069:
            r0.x0$a r9 = r0.C2544x0.f25560b
            long r9 = r9.g()
        L_0x006f:
            k0.i$a r11 = k0.i.f23074a
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r12 = 10
            I.f r13 = I.g.a(r12)
            k0.i r3 = x.C2866e.f(r11, r3, r9, r13)
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            k0.i r13 = androidx.compose.foundation.layout.n.i(r3, r4)
            r3 = -1229685931(0xffffffffb6b47b55, float:-5.3787758E-6)
            r7.T(r3)
            yf.l r3 = r0.$onThumbnailClick$inlined
            boolean r3 = r7.S(r3)
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ r5
            r9 = 0
            if (r4 <= r8) goto L_0x00a1
            boolean r4 = r7.d(r1)
            if (r4 != 0) goto L_0x00a4
        L_0x00a1:
            r2 = r2 & r5
            if (r2 != r8) goto L_0x00a6
        L_0x00a4:
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = r9
        L_0x00a7:
            r2 = r2 | r3
            java.lang.Object r3 = r23.A()
            if (r2 != 0) goto L_0x00b6
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00c0
        L_0x00b6:
            io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1 r3 = new io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1
            yf.l r2 = r0.$onThumbnailClick$inlined
            r3.<init>(r2, r1)
            r7.r(r3)
        L_0x00c0:
            r17 = r3
            yf.a r17 = (yf.C6787a) r17
            r23.M()
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            k0.i r1 = androidx.compose.foundation.d.d(r13, r14, r15, r16, r17, r18, r19)
            k0.c$a r2 = k0.c.f23044a
            k0.c r2 = r2.o()
            H0.F r2 = androidx.compose.foundation.layout.d.h(r2, r9)
            int r3 = Y.C1494j.a(r7, r9)
            Y.y r4 = r23.p()
            k0.i r1 = k0.h.e(r7, r1)
            J0.g$a r8 = J0.C1241g.f3853J
            yf.a r9 = r8.a()
            Y.f r10 = r23.j()
            if (r10 != 0) goto L_0x00f8
            Y.C1494j.c()
        L_0x00f8:
            r23.F()
            boolean r10 = r23.f()
            if (r10 == 0) goto L_0x0105
            r7.U(r9)
            goto L_0x0108
        L_0x0105:
            r23.q()
        L_0x0108:
            Y.m r9 = Y.F1.a(r23)
            yf.p r10 = r8.c()
            Y.F1.b(r9, r2, r10)
            yf.p r2 = r8.e()
            Y.F1.b(r9, r4, r2)
            yf.p r2 = r8.b()
            boolean r4 = r9.f()
            if (r4 != 0) goto L_0x0132
            java.lang.Object r4 = r9.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r10)
            if (r4 != 0) goto L_0x0140
        L_0x0132:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r9.r(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.V(r3, r2)
        L_0x0140:
            yf.p r2 = r8.d()
            Y.F1.b(r9, r1, r2)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            float r1 = (float) r5
            float r1 = c1.h.j(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.n(r11, r1)
            I.f r2 = I.g.a(r12)
            k0.i r1 = o0.C2342e.a(r1, r2)
            H0.h$a r2 = H0.C1187h.f2609a
            H0.h r2 = r2.a()
            r5 = 560(0x230, float:7.85E-43)
            r8 = 0
            r3 = r6
            r4 = r23
            r6 = r8
            io.intercom.android.sdk.ui.preview.ui.PreviewUriKt.ThumbnailPreview(r1, r2, r3, r4, r5, r6)
            r23.u()
            r23.M()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0179
            Y.C1506p.P()
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3.invoke(D.c, int, Y.m, int):void");
    }
}
