package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState;", "state", "Lk0/i;", "modifier", "Llf/M;", "IntercomErrorScreen", "(Lio/intercom/android/sdk/m5/components/ErrorState;Lk0/i;LY/m;II)V", "ErrorScreenWithCTAPreview", "(LY/m;I)V", "ErrorScreenWithoutCTAPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomErrorScreenKt {
    @IntercomPreviews
    public static final void ErrorScreenWithCTAPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2005095861);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m178getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorScreenWithCTAPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ErrorScreenWithCTAPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ErrorScreenWithoutCTAPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(753957761);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m179getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorScreenWithoutCTAPreview$lambda$2(int i10, C1500m mVar, int i11) {
        ErrorScreenWithoutCTAPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomErrorScreen(io.intercom.android.sdk.m5.components.ErrorState r19, k0.i r20, Y.C1500m r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            java.lang.String r3 = "state"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            r3 = -45428996(0xfffffffffd4acefc, float:-1.6848674E37)
            r4 = r21
            Y.m r3 = r4.h(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002a
            boolean r4 = r3.S(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r20
            goto L_0x0046
        L_0x0034:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            r6 = r20
            boolean r7 = r3.S(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r4 = r4 & 91
            r7 = 18
            if (r4 != r7) goto L_0x0057
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            r3.I()
            goto L_0x008b
        L_0x0057:
            if (r5 == 0) goto L_0x005d
            k0.i$a r4 = k0.i.f23074a
            r15 = r4
            goto L_0x005e
        L_0x005d:
            r15 = r6
        L_0x005e:
            r4 = 0
            r5 = 0
            r6 = 1
            k0.i r4 = androidx.compose.foundation.layout.q.f(r15, r4, r6, r5)
            io.intercom.android.sdk.m5.components.IntercomErrorScreenKt$IntercomErrorScreen$1 r5 = new io.intercom.android.sdk.m5.components.IntercomErrorScreenKt$IntercomErrorScreen$1
            r5.<init>(r0)
            r7 = 54
            r8 = 847888321(0x3289bfc1, float:1.6036099E-8)
            g0.a r13 = g0.c.e(r8, r6, r5, r3, r7)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r3
            r18 = r15
            r15 = r16
            r16 = r17
            V.O0.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r6 = r18
        L_0x008b:
            Y.Y0 r3 = r3.k()
            if (r3 == 0) goto L_0x0099
            io.intercom.android.sdk.m5.components.C0 r4 = new io.intercom.android.sdk.m5.components.C0
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen(io.intercom.android.sdk.m5.components.ErrorState, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomErrorScreen$lambda$0(ErrorState errorState, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(errorState, "$state");
        IntercomErrorScreen(errorState, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
