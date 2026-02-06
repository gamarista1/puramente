package io.intercom.android.sdk.m5.conversation.ui.components.row;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.W;
import C.Z;
import H0.F;
import I.g;
import J0.C1241g;
import V.B0;
import V.S;
import V.T0;
import V.U;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinRowStyle;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import x.C2869h;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u0016\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0004\b\"\u0010#¨\u0006&²\u0006\u000e\u0010%\u001a\u00020$8\n@\nX\u0002"}, d2 = {"Lio/intercom/android/sdk/models/Part;", "conversationPart", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "groupingPosition", "Lk0/i;", "modifier", "", "timestamp", "Llf/M;", "FinAnswerRow", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;Lk0/i;Ljava/lang/String;LY/m;II)V", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/FinRowStyle;", "getFinRowStyle", "(Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;LY/m;I)Lio/intercom/android/sdk/m5/conversation/ui/components/row/FinRowStyle;", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "title", "suffix", "", "Lio/intercom/android/sdk/models/AiAnswerInfo;", "aiAnswerInfo", "FinAnswerMetadata", "(Ljava/util/List;Ljava/lang/String;Lk0/i;Ljava/lang/String;Ljava/lang/Long;Lio/intercom/android/sdk/models/AiAnswerInfo;LY/m;II)V", "Lio/intercom/android/sdk/models/Source;", "sources", "FinAnswerSources", "(Ljava/util/List;LY/m;I)V", "source", "Lr0/x0;", "textColor", "SourceRow-FNF3uiM", "(Lio/intercom/android/sdk/models/Source;Lk0/i;JLY/m;II)V", "SourceRow", "FinAnswerRowPreview", "(LY/m;I)V", "", "showDialog", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FinAnswerRowKt {
    public static final void FinAnswerMetadata(List<AvatarWrapper> list, String str, i iVar, String str2, Long l10, AiAnswerInfo aiAnswerInfo, C1500m mVar, int i10, int i11) {
        i iVar2;
        String str3;
        Long l11;
        AiAnswerInfo aiAnswerInfo2;
        int i12 = i10;
        C6496s.h(list, "avatars");
        C6496s.h(str, b.f37461S);
        C1500m h10 = mVar.h(916495479);
        if ((i11 & 4) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i11 & 16) != 0) {
            l11 = null;
        } else {
            l11 = l10;
        }
        if ((i11 & 32) != 0) {
            aiAnswerInfo2 = null;
        } else {
            aiAnswerInfo2 = aiAnswerInfo;
        }
        i h11 = q.h(iVar2, 0.0f, 1, (Object) null);
        F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, h11);
        C1241g.a aVar = C1241g.f3853J;
        C6787a a11 = aVar.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, b10, aVar.c());
        F1.b(a12, p10, aVar.e());
        p b11 = aVar.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar.d());
        Z z10 = Z.f873a;
        i.a aVar2 = i.f23074a;
        i.a aVar3 = aVar2;
        AiAnswerInfo aiAnswerInfo3 = aiAnswerInfo2;
        MessageMetadataKt.MessageMetadata(list, str, z10.a(aVar2, 1.0f, true), str3, l11, h10, (i12 & 112) | 8 | (i12 & 7168) | (57344 & i12), 0);
        h10.T(1671220161);
        if (aiAnswerInfo3 != null) {
            h10.T(1468239213);
            Object A10 = h10.A();
            C1500m.a aVar4 = C1500m.f10026a;
            if (A10 == aVar4.a()) {
                A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
                h10.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            h10.M();
            h10.T(1671222230);
            if (FinAnswerMetadata$lambda$10$lambda$9$lambda$3(r0Var)) {
                h10.T(1468244385);
                Object A11 = h10.A();
                if (A11 == aVar4.a()) {
                    A11 = new K(r0Var);
                    h10.r(A11);
                }
                h10.M();
                AnswerInfoDialogKt.AnswerInfoDialog(aiAnswerInfo3, (C6787a) A11, h10, 48, 0);
            }
            h10.M();
            i n10 = q.n(aVar3, c1.h.j((float) 24));
            h10.T(1468249344);
            Object A12 = h10.A();
            if (A12 == aVar4.a()) {
                A12 = new L(r0Var);
                h10.r(A12);
            }
            h10.M();
            U.b((C6787a) A12, n10, false, (S) null, (l) null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m296getLambda1$intercom_sdk_base_release(), h10, 196662, 28);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new M(list, str, iVar2, str3, l11, aiAnswerInfo3, i10, i11));
        }
    }

    private static final boolean FinAnswerMetadata$lambda$10$lambda$9$lambda$3(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    private static final void FinAnswerMetadata$lambda$10$lambda$9$lambda$4(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerMetadata$lambda$10$lambda$9$lambda$6$lambda$5(C1510r0 r0Var) {
        C6496s.h(r0Var, "$showDialog$delegate");
        FinAnswerMetadata$lambda$10$lambda$9$lambda$4(r0Var, false);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerMetadata$lambda$10$lambda$9$lambda$8$lambda$7(C1510r0 r0Var) {
        C6496s.h(r0Var, "$showDialog$delegate");
        FinAnswerMetadata$lambda$10$lambda$9$lambda$4(r0Var, true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerMetadata$lambda$11(List list, String str, i iVar, String str2, Long l10, AiAnswerInfo aiAnswerInfo, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$avatars");
        C6496s.h(str, "$title");
        FinAnswerMetadata(list, str, iVar, str2, l10, aiAnswerInfo, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void FinAnswerRow(Part part, GroupingPosition groupingPosition, i iVar, String str, C1500m mVar, int i10, int i11) {
        i.a aVar;
        String str2;
        BottomMetadata bottomMetadata;
        GroupingPosition groupingPosition2 = groupingPosition;
        Part part2 = part;
        C6496s.h(part, "conversationPart");
        C6496s.h(groupingPosition2, "groupingPosition");
        C1500m h10 = mVar.h(1592336570);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        int i12 = i10 >> 3;
        FinRowStyle finRowStyle = getFinRowStyle(groupingPosition2, h10, i12 & 14);
        if (str2 != null) {
            bottomMetadata = new BottomMetadata(str2, 0.0f, false, 6, (DefaultConstructorMarker) null);
        } else {
            bottomMetadata = null;
        }
        ClickableMessageRowKt.ClickableMessageRow(part, aVar, bottomMetadata, finRowStyle.getRowAlignment(), finRowStyle.getRowPadding(), (C6787a) null, g0.c.e(-1613562521, true, new FinAnswerRowKt$FinAnswerRow$2(finRowStyle), h10, 54), h10, (i12 & 112) | 1572872, 32);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(part, groupingPosition, aVar, str2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerRow$lambda$1(Part part, GroupingPosition groupingPosition, i iVar, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(part, "$conversationPart");
        C6496s.h(groupingPosition, "$groupingPosition");
        FinAnswerRow(part, groupingPosition, iVar, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void FinAnswerRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1987882525);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m297getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new N(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerRowPreview$lambda$18(int i10, C1500m mVar, int i11) {
        FinAnswerRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void FinAnswerSources(List<Source> list, C1500m mVar, int i10) {
        int i11;
        List<Source> list2 = list;
        C1500m h10 = mVar.h(349442765);
        C1085c.f n10 = C1085c.f882a.n(c1.h.j((float) 8));
        i.a aVar = i.f23074a;
        F a10 = C1090h.a(n10, c.f23044a.k(), h10, 6);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, aVar);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a12 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar2.c());
        F1.b(a13, p10, aVar2.e());
        p b10 = aVar2.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar2.d());
        C1093k kVar = C1093k.f978a;
        if (list.size() == 1) {
            i11 = R.string.intercom_source;
        } else {
            i11 = R.string.intercom_sources;
        }
        String a14 = M0.i.a(i11, h10, 0);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        T0.b(a14, (i) null, intercomTheme.getColors(h10, i12).m682getCaptionText0d7_KjU(), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i12).getType04SemiBold(), h10, 0, 0, 65530);
        h10.T(845823034);
        for (Source r22 : list2) {
            m317SourceRowFNF3uiM(r22, (i) null, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m682getCaptionText0d7_KjU(), h10, 0, 2);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Q(list2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinAnswerSources$lambda$14(List list, int i10, C1500m mVar, int i11) {
        C6496s.h(list, "$sources");
        FinAnswerSources(list, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: SourceRow-FNF3uiM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m317SourceRowFNF3uiM(io.intercom.android.sdk.models.Source r35, k0.i r36, long r37, Y.C1500m r39, int r40, int r41) {
        /*
            r1 = r35
            r5 = r40
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = 602796556(0x23edf20c, float:2.5798102E-17)
            r2 = r39
            Y.m r0 = r2.h(r0)
            r2 = r41 & 1
            r4 = 4
            if (r2 == 0) goto L_0x001a
            r2 = r5 | 6
            goto L_0x002a
        L_0x001a:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x0029
            boolean r2 = r0.S(r1)
            if (r2 == 0) goto L_0x0026
            r2 = r4
            goto L_0x0027
        L_0x0026:
            r2 = 2
        L_0x0027:
            r2 = r2 | r5
            goto L_0x002a
        L_0x0029:
            r2 = r5
        L_0x002a:
            r6 = r41 & 2
            if (r6 == 0) goto L_0x0033
            r2 = r2 | 48
        L_0x0030:
            r7 = r36
            goto L_0x0045
        L_0x0033:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0030
            r7 = r36
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0042:
            r8 = 16
        L_0x0044:
            r2 = r2 | r8
        L_0x0045:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005e
            r8 = r41 & 4
            if (r8 != 0) goto L_0x0058
            r8 = r37
            boolean r10 = r0.e(r8)
            if (r10 == 0) goto L_0x005a
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r8 = r37
        L_0x005a:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r2 = r2 | r10
            goto L_0x0060
        L_0x005e:
            r8 = r37
        L_0x0060:
            r10 = r2 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0074
            boolean r10 = r0.i()
            if (r10 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r0.I()
            r2 = r7
            r3 = r8
            goto L_0x01f9
        L_0x0074:
            r0.D()
            r10 = r5 & 1
            if (r10 == 0) goto L_0x0090
            boolean r10 = r0.L()
            if (r10 == 0) goto L_0x0082
            goto L_0x0090
        L_0x0082:
            r0.I()
            r6 = r41 & 4
            if (r6 == 0) goto L_0x008b
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008b:
            r31 = r8
            r8 = r2
            r2 = r7
            goto L_0x00b0
        L_0x0090:
            if (r6 == 0) goto L_0x0095
            k0.i$a r6 = k0.i.f23074a
            goto L_0x0096
        L_0x0095:
            r6 = r7
        L_0x0096:
            r7 = r41 & 4
            if (r7 == 0) goto L_0x00ad
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r7.getColors(r0, r8)
            long r7 = r7.m700getPrimaryText0d7_KjU()
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            r31 = r7
        L_0x00aa:
            r8 = r2
            r2 = r6
            goto L_0x00b0
        L_0x00ad:
            r31 = r8
            goto L_0x00aa
        L_0x00b0:
            r0.v()
            Y.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r0.m(r6)
            android.content.Context r6 = (android.content.Context) r6
            k0.c$a r7 = k0.c.f23044a
            k0.c$c r7 = r7.i()
            io.intercom.android.sdk.m5.conversation.ui.components.row.O r13 = new io.intercom.android.sdk.m5.conversation.ui.components.row.O
            r13.<init>(r1, r6)
            r14 = 7
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r2
            k0.i r6 = androidx.compose.foundation.d.d(r9, r10, r11, r12, r13, r14, r15)
            C.c r9 = C.C1085c.f882a
            C.c$e r9 = r9.f()
            r10 = 48
            H0.F r7 = C.W.b(r9, r7, r0, r10)
            r9 = 0
            int r10 = Y.C1494j.a(r0, r9)
            Y.y r11 = r0.p()
            k0.i r6 = k0.h.e(r0, r6)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r13 = r12.a()
            Y.f r14 = r0.j()
            if (r14 != 0) goto L_0x00fa
            Y.C1494j.c()
        L_0x00fa:
            r0.F()
            boolean r14 = r0.f()
            if (r14 == 0) goto L_0x0107
            r0.U(r13)
            goto L_0x010a
        L_0x0107:
            r0.q()
        L_0x010a:
            Y.m r13 = Y.F1.a(r0)
            yf.p r14 = r12.c()
            Y.F1.b(r13, r7, r14)
            yf.p r7 = r12.e()
            Y.F1.b(r13, r11, r7)
            yf.p r7 = r12.b()
            boolean r11 = r13.f()
            if (r11 != 0) goto L_0x0134
            java.lang.Object r11 = r13.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 != 0) goto L_0x0142
        L_0x0134:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.V(r10, r7)
        L_0x0142:
            yf.p r7 = r12.d()
            Y.F1.b(r13, r6, r7)
            C.Z r14 = C.Z.f873a
            k0.i$a r13 = k0.i.f23074a
            r18 = 2
            r19 = 0
            r16 = 1073741824(0x40000000, float:2.0)
            r17 = 0
            r15 = r13
            k0.i r7 = C.Y.b(r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = r35.getTitle()
            io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r10 = r15.getTypography(r0, r14)
            Q0.T r26 = r10.getType04()
            r8 = r8 & 896(0x380, float:1.256E-42)
            r28 = r8
            r29 = 0
            r30 = 65528(0xfff8, float:9.1824E-41)
            r10 = 0
            r12 = 0
            r8 = 0
            r3 = r13
            r13 = r8
            r33 = r14
            r14 = r8
            r16 = 0
            r8 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r34 = r8
            r8 = r31
            r27 = r0
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r6 = 8
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.r(r3, r6)
            r7 = 6
            C.a0.a(r6, r0, r7)
            java.lang.String r6 = r35.getType()
            java.lang.String r8 = "article"
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r8)
            if (r6 == 0) goto L_0x01cf
            r6 = -2006663133(0xffffffff8864c023, float:-6.883711E-34)
            r0.T(r6)
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            r6 = 0
            r8 = 0
            r9 = 2
            k0.i r3 = androidx.compose.foundation.layout.n.k(r3, r4, r6, r9, r8)
            r4 = 0
            io.intercom.android.sdk.m5.components.IntercomChevronKt.IntercomChevron(r3, r0, r7, r4)
            r0.M()
            goto L_0x01f4
        L_0x01cf:
            r4 = 0
            r3 = -2006576891(0xffffffff88661105, float:-6.9233114E-34)
            r0.T(r3)
            int r3 = io.intercom.android.sdk.R.drawable.intercom_external_link
            w0.c r6 = M0.e.c(r3, r0, r4)
            r4 = r33
            r3 = r34
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r0, r4)
            long r9 = r3.m673getActionContrastWhite0d7_KjU()
            r12 = 56
            r13 = 4
            r7 = 0
            r8 = 0
            r11 = r0
            V.V.a(r6, r7, r8, r9, r11, r12, r13)
            r0.M()
        L_0x01f4:
            r0.u()
            r3 = r31
        L_0x01f9:
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x020e
            io.intercom.android.sdk.m5.conversation.ui.components.row.P r8 = new io.intercom.android.sdk.m5.conversation.ui.components.row.P
            r0 = r8
            r1 = r35
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r5, r6)
            r7.a(r8)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.m317SourceRowFNF3uiM(io.intercom.android.sdk.models.Source, k0.i, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SourceRow_FNF3uiM$lambda$15(Source source, Context context) {
        C6496s.h(source, "$source");
        C6496s.h(context, "$context");
        LinkOpener.handleUrl(source.getUrl(), context, Injector.get().getApi(), C6496s.c(source.getType(), "article"));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SourceRow_FNF3uiM$lambda$17(Source source, i iVar, long j10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(source, "$source");
        m317SourceRowFNF3uiM(source, iVar, j10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final FinRowStyle getFinRowStyle(GroupingPosition groupingPosition, C1500m mVar, int i10) {
        float f10;
        GroupingPosition groupingPosition2 = groupingPosition;
        C1500m mVar2 = mVar;
        C6496s.h(groupingPosition2, "groupingPosition");
        mVar2.T(1658672574);
        float j10 = c1.h.j((float) 20);
        float j11 = c1.h.j((float) 4);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        long r62 = intercomTheme.getColors(mVar2, i11).m675getAdminBackground0d7_KjU();
        float f11 = (float) 16;
        N b10 = androidx.compose.foundation.layout.n.b(c1.h.j(f11), c1.h.j((float) 12));
        if (groupingPosition2 == GroupingPosition.BOTTOM || groupingPosition2 == GroupingPosition.MIDDLE) {
            f10 = j11;
        } else {
            f10 = j10;
        }
        if (!(groupingPosition2 == GroupingPosition.TOP || groupingPosition2 == GroupingPosition.MIDDLE)) {
            j11 = j10;
        }
        FinRowStyle finRowStyle = new FinRowStyle(new FinRowStyle.BubbleStyle(r62, b10, g.d(f10, j10, j10, j11), C2869h.a(c1.h.j((float) 1), intercomTheme.getColors(mVar2, i11).m676getAdminBorder0d7_KjU()), (DefaultConstructorMarker) null), c.f23044a.k(), androidx.compose.foundation.layout.n.e(c1.h.j(f11), 0.0f, c1.h.j(f11), 0.0f, 10, (Object) null), g.c(c1.h.j((float) 8)));
        mVar.M();
        return finRowStyle;
    }
}
