package io.intercom.android.sdk.views.compose;

import B.l;
import C.N;
import V.C1392l0;
import V.P0;
import W0.c0;
import Y.C1500m;
import c1.h;
import g0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3 implements q {
    final /* synthetic */ P0 $colors;
    final /* synthetic */ N $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ l $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ p $label;
    final /* synthetic */ p $leadingIcon;
    final /* synthetic */ p $placeholder;
    final /* synthetic */ g2 $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ p $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ c0 $visualTransformation;

    IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3(String str, boolean z10, boolean z11, c0 c0Var, l lVar, boolean z12, p pVar, p pVar2, p pVar3, p pVar4, P0 p02, N n10, g2 g2Var) {
        this.$value = str;
        this.$enabled = z10;
        this.$singleLine = z11;
        this.$visualTransformation = c0Var;
        this.$interactionSource = lVar;
        this.$isError = z12;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$colors = p02;
        this.$contentPadding = n10;
        this.$shape = g2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(p pVar, C1500m mVar, int i10) {
        int i11;
        p pVar2 = pVar;
        C1500m mVar2 = mVar;
        C6496s.h(pVar2, "innerTextField");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.C(pVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            C1392l0 l0Var = C1392l0.f7725a;
            String str = this.$value;
            boolean z10 = this.$enabled;
            boolean z11 = this.$singleLine;
            c0 c0Var = this.$visualTransformation;
            l lVar = this.$interactionSource;
            l lVar2 = lVar;
            boolean z12 = this.$isError;
            boolean z13 = z12;
            p pVar3 = this.$label;
            p pVar4 = this.$placeholder;
            final boolean z14 = z12;
            p pVar5 = this.$leadingIcon;
            final l lVar3 = lVar;
            p pVar6 = this.$trailingIcon;
            P0 p02 = this.$colors;
            final boolean z15 = z10;
            final P0 p03 = p02;
            final g2 g2Var = this.$shape;
            C1392l0 l0Var2 = l0Var;
            String str2 = str;
            l0Var2.b(str2, pVar, z10, z11, c0Var, lVar2, z13, pVar3, pVar4, pVar5, pVar6, (p) null, (p) null, (p) null, p02, this.$contentPadding, c.e(888607277, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        float f10 = (float) 1;
                        C1392l0.f7725a.a(z15, z14, lVar3, (i) null, p03, g2Var, h.j(f10), h.j(f10), mVar, 114819072, 8);
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54), mVar, (i11 << 3) & 112, 14155776, 14336);
            return;
        }
        mVar.I();
    }
}
