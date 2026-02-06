package io.intercom.android.sdk.views.compose;

import B.l;
import C.C1092j;
import C.N;
import H0.F;
import I.a;
import J.C1226w;
import J.C1227x;
import J0.C1241g;
import M0.e;
import Q0.T;
import V.C1372b0;
import V.C1375d;
import V.C1400p0;
import V.E;
import V.P0;
import V.V;
import V.Z;
import W0.c0;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.o;
import c1.h;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ListAttributeCollectorKt$ListAttributeCollector$3 implements q {
    final /* synthetic */ AttributeData $attributeData;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ C1510r0 $expanded$delegate;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ C6798l $onSubmitAttribute;
    final /* synthetic */ boolean $showDropdownMenu;
    final /* synthetic */ boolean $submitted;
    final /* synthetic */ C1510r0 $value$delegate;

    ListAttributeCollectorKt$ListAttributeCollector$3(boolean z10, boolean z11, AttributeData attributeData, C1510r0 r0Var, boolean z12, boolean z13, C1510r0 r0Var2, C6798l lVar) {
        this.$disabled = z10;
        this.$showDropdownMenu = z11;
        this.$attributeData = attributeData;
        this.$value$delegate = r0Var;
        this.$submitted = z12;
        this.$loading = z13;
        this.$expanded$delegate = r0Var2;
        this.$onSubmitAttribute = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1(C1510r0 r0Var) {
        C6496s.h(r0Var, "$expanded$delegate");
        ListAttributeCollectorKt.ListAttributeCollector$lambda$3(r0Var, false);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((E) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(E e10, C1500m mVar, int i10) {
        int i11;
        E e11 = e10;
        C1500m mVar2 = mVar;
        C6496s.h(e11, "$this$ExposedDropdownMenuBox");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(e11) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            i e12 = E.e(e10, androidx.compose.foundation.layout.q.i(androidx.compose.foundation.layout.q.h(i.f23074a, 0.0f, 1, (Object) null), h.j((float) 40)), Z.f7173b.b(), false, 2, (Object) null);
            String access$ListAttributeCollector$lambda$5 = ListAttributeCollectorKt.ListAttributeCollector$lambda$5(this.$value$delegate);
            boolean z10 = !this.$disabled;
            C c10 = r3;
            C c11 = new C();
            p r15 = ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m738getLambda1$intercom_sdk_base_release();
            final boolean z11 = this.$submitted;
            final boolean z12 = this.$loading;
            String str = access$ListAttributeCollector$lambda$5;
            C1500m mVar3 = mVar2;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(str, c10, e12, z10, true, (T) null, (p) null, r15, (p) null, c.e(-1903726860, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        i.a aVar = i.f23074a;
                        i n10 = androidx.compose.foundation.layout.q.n(n.m(aVar, h.j((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), h.j((float) 40));
                        k0.c e10 = k0.c.f23044a.e();
                        boolean z10 = z11;
                        boolean z11 = z12;
                        F h10 = d.h(e10, false);
                        int a10 = C1494j.a(mVar, 0);
                        C1523y p10 = mVar.p();
                        i e11 = k0.h.e(mVar, n10);
                        C1241g.a aVar2 = C1241g.f3853J;
                        C6787a a11 = aVar2.a();
                        if (mVar.j() == null) {
                            C1494j.c();
                        }
                        mVar.F();
                        if (mVar.f()) {
                            mVar.U(a11);
                        } else {
                            mVar.q();
                        }
                        C1500m a12 = F1.a(mVar);
                        F1.b(a12, h10, aVar2.c());
                        F1.b(a12, p10, aVar2.e());
                        p b10 = aVar2.b();
                        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                            a12.r(Integer.valueOf(a10));
                            a12.V(Integer.valueOf(a10), b10);
                        }
                        F1.b(a12, e11, aVar2.d());
                        f fVar = f.f12848a;
                        if (z10) {
                            mVar.T(-1795451461);
                            V.a(e.c(R.drawable.intercom_attribute_verified_tick, mVar, 0), (String) null, (i) null, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m674getActive0d7_KjU(), mVar, 56, 4);
                            mVar.M();
                        } else if (z11) {
                            mVar.T(175868479);
                            C1400p0.a(androidx.compose.foundation.layout.q.n(aVar, h.j((float) 20)), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m700getPrimaryText0d7_KjU(), h.j((float) 3), 0, 0, mVar, 390, 24);
                            mVar.M();
                        } else {
                            mVar.T(-1795433709);
                            V.a(e.c(R.drawable.intercom_list_arrow_down, mVar, 0), (String) null, (i) null, 0, mVar, 56, 12);
                            mVar.M();
                        }
                        mVar.u();
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54), false, (c0) null, (C1227x) null, (C1226w) null, true, 0, 0, (l) null, (g2) null, (P0) null, (N) null, mVar, 817913904, 24576, 0, 2080096);
            if (this.$showDropdownMenu) {
                boolean z13 = !this.$attributeData.isFormDisabled() && ListAttributeCollectorKt.ListAttributeCollector$lambda$2(this.$expanded$delegate);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                long r18 = intercomTheme.getColors(mVar3, i12).m678getBackground0d7_KjU();
                a e13 = intercomTheme.getShapes(mVar3, i12).e();
                float j10 = h.j((float) 8);
                mVar3.T(-742015086);
                C1510r0 r0Var = this.$expanded$delegate;
                Object A10 = mVar.A();
                if (A10 == C1500m.f10026a.a()) {
                    A10 = new D(r0Var);
                    mVar3.r(A10);
                }
                mVar.M();
                final AttributeData attributeData = this.$attributeData;
                final C6798l lVar = this.$onSubmitAttribute;
                final C1510r0 r0Var2 = this.$value$delegate;
                final C1510r0 r0Var3 = this.$expanded$delegate;
                e10.a(z13, (C6787a) A10, (i) null, (o) null, false, e13, r18, 0.0f, j10, (C2868g) null, c.e(-1185294213, true, new q() {
                    /* access modifiers changed from: private */
                    public static final C6514M invoke$lambda$1$lambda$0(String str, C6798l lVar, AttributeData attributeData, C1510r0 r0Var, C1510r0 r0Var2) {
                        C1510r0 r0Var3 = r0Var;
                        C1510r0 r0Var4 = r0Var2;
                        C6496s.h(str, "$option");
                        AttributeData attributeData2 = attributeData;
                        C6496s.h(attributeData, "$attributeData");
                        C6496s.h(r0Var, "$value$delegate");
                        C6496s.h(r0Var4, "$expanded$delegate");
                        ListAttributeCollectorKt.ListAttributeCollector$lambda$6(r0Var, str);
                        ListAttributeCollectorKt.ListAttributeCollector$lambda$3(r0Var4, false);
                        AttributeData attributeData3 = attributeData;
                        C6798l lVar2 = lVar;
                        lVar.invoke(AttributeData.copy$default(attributeData3, Attribute.copy$default(attributeData.getAttribute(), (String) null, (String) null, (String) null, false, (String) null, (List) null, (Boolean) null, str, 127, (Object) null), (String) null, false, 6, (Object) null));
                        return C6514M.f71813a;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
                        return C6514M.f71813a;
                    }

                    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
                        C6496s.h(jVar, "$this$ExposedDropdownMenu");
                        if ((i10 & 81) != 16 || !mVar.i()) {
                            List<String> options = attributeData.getAttribute().getOptions();
                            if (options != null) {
                                C6798l lVar = lVar;
                                AttributeData attributeData = attributeData;
                                C1510r0 r0Var = r0Var2;
                                C1510r0 r0Var2 = r0Var3;
                                for (String str : options) {
                                    C1375d.b(c.e(1941734396, true, new ListAttributeCollectorKt$ListAttributeCollector$3$4$1$1(str), mVar, 54), new E(str, lVar, attributeData, r0Var, r0Var2), (i) null, (p) null, (p) null, false, (C1372b0) null, (N) null, (l) null, mVar, 6, 508);
                                }
                                return;
                            }
                            return;
                        }
                        mVar.I();
                    }
                }, mVar3, 54), mVar, 100663344, (E.f6489a << 3) | 6 | ((i11 << 3) & 112), 668);
                return;
            }
            return;
        }
        mVar.I();
    }
}
