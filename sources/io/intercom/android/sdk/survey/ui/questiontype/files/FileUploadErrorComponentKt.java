package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import com.amazon.a.a.o.b;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"", "title", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "error", "Lkotlin/Function0;", "Llf/M;", "onRetryClick", "onDeleteClick", "FileUploadErrorComponent", "(Ljava/lang/String;Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;Lyf/a;Lyf/a;LY/m;I)V", "Lk0/i;", "modifier", "", "icon", "text", "contentDescription", "Lr0/x0;", "tint", "onClick", "ActionRow-FHprtrg", "(Lk0/i;IIIJLyf/a;LY/m;II)V", "ActionRow", "ErrorActionSheetContentPreview", "(LY/m;I)V", "UploadFailedErrorActionSheetPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FileUploadErrorComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: k0.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: yf.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ea, code lost:
        if ((r45 & 16) != 0) goto L_0x00ec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0199  */
    /* renamed from: ActionRow-FHprtrg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m501ActionRowFHprtrg(k0.i r36, int r37, int r38, int r39, long r40, yf.C6787a r42, Y.C1500m r43, int r44, int r45) {
        /*
            r2 = r37
            r3 = r38
            r7 = r42
            r8 = r44
            r0 = 32
            r1 = 2
            r4 = 4
            r5 = 16
            java.lang.String r6 = "onClick"
            kotlin.jvm.internal.C6496s.h(r7, r6)
            r6 = -1845655864(0xffffffff91fd86c8, float:-3.9999427E-28)
            r9 = r43
            Y.m r6 = r9.h(r6)
            r9 = 1
            r10 = r45 & 1
            if (r10 == 0) goto L_0x0027
            r11 = r8 | 6
            r12 = r11
            r11 = r36
            goto L_0x003b
        L_0x0027:
            r11 = r8 & 14
            if (r11 != 0) goto L_0x0038
            r11 = r36
            boolean r12 = r6.S(r11)
            if (r12 == 0) goto L_0x0035
            r12 = r4
            goto L_0x0036
        L_0x0035:
            r12 = r1
        L_0x0036:
            r12 = r12 | r8
            goto L_0x003b
        L_0x0038:
            r11 = r36
            r12 = r8
        L_0x003b:
            r1 = r45 & 2
            if (r1 == 0) goto L_0x0042
            r12 = r12 | 48
            goto L_0x0050
        L_0x0042:
            r1 = r8 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0050
            boolean r1 = r6.d(r2)
            if (r1 == 0) goto L_0x004e
            r1 = r0
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            r12 = r12 | r1
        L_0x0050:
            r1 = r45 & 4
            if (r1 == 0) goto L_0x0057
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r1 = r8 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0067
            boolean r1 = r6.d(r3)
            if (r1 == 0) goto L_0x0064
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r12 = r12 | r1
        L_0x0067:
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0080
            r1 = r45 & 8
            if (r1 != 0) goto L_0x007a
            r1 = r39
            boolean r4 = r6.d(r1)
            if (r4 == 0) goto L_0x007c
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r1 = r39
        L_0x007c:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r12 = r12 | r4
            goto L_0x0082
        L_0x0080:
            r1 = r39
        L_0x0082:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r8
            if (r4 != 0) goto L_0x009b
            r4 = r45 & 16
            r13 = r40
            if (r4 != 0) goto L_0x0097
            boolean r4 = r6.e(r13)
            if (r4 == 0) goto L_0x0097
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r12 = r12 | r4
            goto L_0x009d
        L_0x009b:
            r13 = r40
        L_0x009d:
            r0 = r45 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r0 == 0) goto L_0x00a7
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x00a5:
            r12 = r12 | r0
            goto L_0x00b7
        L_0x00a7:
            r0 = r8 & r15
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r6.C(r7)
            if (r0 == 0) goto L_0x00b4
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a5
        L_0x00b4:
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a5
        L_0x00b7:
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r12
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r4) goto L_0x00ce
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            r6.I()
            r4 = r1
            r1 = r11
            goto L_0x0243
        L_0x00ce:
            r6.D()
            r0 = r8 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r6.L()
            if (r0 == 0) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            r6.I()
            r0 = r45 & 8
            if (r0 == 0) goto L_0x00e8
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00e8:
            r0 = r45 & 16
            if (r0 == 0) goto L_0x00ed
        L_0x00ec:
            r12 = r12 & r4
        L_0x00ed:
            r0 = r11
            r4 = r12
            r34 = r13
            goto L_0x010f
        L_0x00f2:
            if (r10 == 0) goto L_0x00f7
            k0.i$a r0 = k0.i.f23074a
            r11 = r0
        L_0x00f7:
            r0 = r45 & 8
            if (r0 == 0) goto L_0x00fe
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
            r1 = r3
        L_0x00fe:
            r0 = r45 & 16
            if (r0 == 0) goto L_0x00ed
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r6, r10)
            long r13 = r0.m700getPrimaryText0d7_KjU()
            goto L_0x00ec
        L_0x010f:
            r6.v()
            r10 = 0
            r11 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.h(r0, r10, r9, r11)
            r10 = 1130566626(0x436313e2, float:227.07767)
            r6.T(r10)
            r10 = r4 & r15
            r11 = 0
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r10 != r12) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r9 = r11
        L_0x0127:
            java.lang.Object r10 = r6.A()
            if (r9 != 0) goto L_0x0135
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x013d
        L_0x0135:
            io.intercom.android.sdk.survey.ui.questiontype.files.C r10 = new io.intercom.android.sdk.survey.ui.questiontype.files.C
            r10.<init>(r7)
            r6.r(r10)
        L_0x013d:
            r20 = r10
            yf.a r20 = (yf.C6787a) r20
            r6.M()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            k0.i r9 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r5 = (float) r5
            float r10 = c1.h.j(r5)
            float r12 = c1.h.j(r5)
            k0.i r9 = androidx.compose.foundation.layout.n.j(r9, r10, r12)
            k0.c$a r10 = k0.c.f23044a
            k0.c$c r10 = r10.i()
            C.c r12 = C.C1085c.f882a
            float r5 = c1.h.j(r5)
            C.c$f r5 = r12.n(r5)
            r12 = 54
            H0.F r5 = C.W.b(r5, r10, r6, r12)
            int r10 = Y.C1494j.a(r6, r11)
            Y.y r11 = r6.p()
            k0.i r9 = k0.h.e(r6, r9)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r13 = r12.a()
            Y.f r14 = r6.j()
            if (r14 != 0) goto L_0x0190
            Y.C1494j.c()
        L_0x0190:
            r6.F()
            boolean r14 = r6.f()
            if (r14 == 0) goto L_0x019d
            r6.U(r13)
            goto L_0x01a0
        L_0x019d:
            r6.q()
        L_0x01a0:
            Y.m r13 = Y.F1.a(r6)
            yf.p r14 = r12.c()
            Y.F1.b(r13, r5, r14)
            yf.p r5 = r12.e()
            Y.F1.b(r13, r11, r5)
            yf.p r5 = r12.b()
            boolean r11 = r13.f()
            if (r11 != 0) goto L_0x01ca
            java.lang.Object r11 = r13.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 != 0) goto L_0x01d8
        L_0x01ca:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.V(r10, r5)
        L_0x01d8:
            yf.p r5 = r12.d()
            Y.F1.b(r13, r9, r5)
            C.Z r5 = C.Z.f873a
            int r5 = r4 >> 3
            r9 = r5 & 14
            w0.c r9 = M0.e.c(r2, r6, r9)
            int r10 = r4 >> 9
            r10 = r10 & 14
            java.lang.String r10 = M0.i.a(r1, r6, r10)
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r15 = r5 | 8
            r16 = 4
            r11 = 0
            r12 = r34
            r14 = r6
            V.V.a(r9, r10, r11, r12, r14, r15, r16)
            int r4 = r4 >> 6
            r5 = r4 & 14
            java.lang.String r9 = M0.i.a(r3, r6, r5)
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r5 = r5.getTypography(r6, r10)
            Q0.T r29 = r5.getType04()
            r4 = r4 & 896(0x380, float:1.256E-42)
            r31 = r4
            r32 = 0
            r33 = 65530(0xfffa, float:9.1827E-41)
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r11 = r34
            r30 = r6
            V.T0.b(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r6.u()
            r4 = r1
            r13 = r34
            r1 = r0
        L_0x0243:
            Y.Y0 r10 = r6.k()
            if (r10 == 0) goto L_0x025d
            io.intercom.android.sdk.survey.ui.questiontype.files.D r11 = new io.intercom.android.sdk.survey.ui.questiontype.files.D
            r0 = r11
            r2 = r37
            r3 = r38
            r5 = r13
            r7 = r42
            r8 = r44
            r9 = r45
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.a(r11)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt.m501ActionRowFHprtrg(k0.i, int, int, int, long, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ActionRow_FHprtrg$lambda$3$lambda$2(C6787a aVar) {
        C6496s.h(aVar, "$onClick");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ActionRow_FHprtrg$lambda$5(i iVar, int i10, int i11, int i12, long j10, C6787a aVar, int i13, int i14, C1500m mVar, int i15) {
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClick");
        m501ActionRowFHprtrg(iVar, i10, i11, i12, j10, aVar2, mVar, M0.a(i13 | 1), i14);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ErrorActionSheetContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2121321299);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m494getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorActionSheetContentPreview$lambda$6(int i10, C1500m mVar, int i11) {
        ErrorActionSheetContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void FileUploadErrorComponent(String str, Answer.MediaAnswer.FileUploadError fileUploadError, C6787a aVar, C6787a aVar2, C1500m mVar, int i10) {
        Answer.MediaAnswer.FileUploadError fileUploadError2 = fileUploadError;
        C6496s.h(str, b.f37461S);
        C6496s.h(fileUploadError2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        C6496s.h(aVar, "onRetryClick");
        C6496s.h(aVar2, "onDeleteClick");
        C1500m h10 = mVar.h(725182893);
        i.a aVar3 = i.f23074a;
        i h11 = q.h(aVar3, 0.0f, 1, (Object) null);
        F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, h11);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a12 = aVar4.a();
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
        F1.b(a13, a10, aVar4.c());
        F1.b(a13, p10, aVar4.e());
        p b10 = aVar4.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar4.d());
        C1093k kVar = C1093k.f978a;
        float f10 = (float) 16;
        String str2 = str;
        C1500m mVar2 = h10;
        T0.b(str2, n.m(q.h(aVar3, 0.0f, 1, (Object) null), c1.h.j(f10), c1.h.j(f10), c1.h.j(f10), 0.0f, 8, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), mVar2, i10 & 14, 0, 65532);
        i.a aVar5 = aVar3;
        ErrorMessageLayoutKt.ErrorMessageLayout(n.j(q.h(aVar5, 0.0f, 1, (Object) null), c1.h.j(f10), c1.h.j((float) 8)), fileUploadError.getErrorMessages(), h10, 70, 0);
        float f11 = (float) 4;
        IntercomDividerKt.IntercomDivider(n.k(q.h(aVar5, 0.0f, 1, (Object) null), 0.0f, c1.h.j(f11), 1, (Object) null), h10, 6, 0);
        if ((fileUploadError2 instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || (fileUploadError2 instanceof Answer.MediaAnswer.FileUploadError.UnsupportedFileType) || (fileUploadError2 instanceof Answer.MediaAnswer.FileUploadError.FileTooLarge)) {
            h10.T(157589913);
            m501ActionRowFHprtrg((i) null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0, aVar2, h10, (i10 << 6) & 458752, 25);
            h10.M();
        } else if (fileUploadError2 instanceof Answer.MediaAnswer.FileUploadError.UploadFailed) {
            h10.T(157902703);
            float f12 = f11;
            C1500m mVar3 = h10;
            m501ActionRowFHprtrg((i) null, io.intercom.android.sdk.R.drawable.intercom_ic_reload, io.intercom.android.sdk.R.string.intercom_try_again, 0, 0, aVar, mVar3, (i10 << 9) & 458752, 25);
            IntercomDividerKt.IntercomDivider(n.k(q.h(aVar5, 0.0f, 1, (Object) null), 0.0f, c1.h.j(f12), 1, (Object) null), h10, 6, 0);
            m501ActionRowFHprtrg((i) null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0, aVar2, mVar3, (i10 << 6) & 458752, 25);
            h10.M();
        } else {
            h10.T(-549109013);
            h10.M();
            throw new C6535s();
        }
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new z(str, fileUploadError, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileUploadErrorComponent$lambda$1(String str, Answer.MediaAnswer.FileUploadError fileUploadError, C6787a aVar, C6787a aVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(str, "$title");
        C6496s.h(fileUploadError, "$error");
        C6496s.h(aVar, "$onRetryClick");
        C6496s.h(aVar2, "$onDeleteClick");
        FileUploadErrorComponent(str, fileUploadError, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void UploadFailedErrorActionSheetPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2130831888);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m496getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadFailedErrorActionSheetPreview$lambda$7(int i10, C1500m mVar, int i11) {
        UploadFailedErrorActionSheetPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
