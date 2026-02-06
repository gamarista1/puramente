package io.intercom.android.sdk.m5.conversation.utils;

import Y.C1510r0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005²\u0006\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00018\n@\nX\u0002"}, d2 = {"LY/A1;", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "(LY/m;I)LY/A1;", "oldState", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KeyboardStateKt {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (((float) (r2 - r7)) >= r0) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 keyboardAsState(Y.C1500m r12, int r13) {
        /*
            r13 = -1867236611(0xffffffff90b43afd, float:-7.108837E-29)
            r12.T(r13)
            r13 = -137398301(0xfffffffff7cf77e3, float:-8.4159144E33)
            r12.T(r13)
            java.lang.Object r13 = r12.A()
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            r1 = 2
            if (r13 != r0) goto L_0x0021
            r13 = 0
            Y.r0 r13 = Y.u1.d(r13, r13, r1, r13)
            r12.r(r13)
        L_0x0021:
            Y.r0 r13 = (Y.C1510r0) r13
            r12.M()
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r12.m(r0)
            c1.d r0 = (c1.d) r0
            C.f0$a r2 = C.f0.f925a
            r3 = 8
            C.f0 r4 = C.l0.c(r2, r12, r3)
            int r7 = r4.a(r0)
            C.f0 r4 = C.l0.c(r2, r12, r3)
            C.f0 r5 = C.l0.f(r2, r12, r3)
            C.f0 r4 = C.h0.f(r4, r5)
            int r10 = r4.a(r0)
            r4 = 1
            r11 = 0
            if (r7 <= 0) goto L_0x0052
            r8 = r4
            goto L_0x0053
        L_0x0052:
            r8 = r11
        L_0x0053:
            C.f0 r5 = C.l0.d(r2, r12, r3)
            C.f0 r2 = C.l0.e(r2, r12, r3)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r5, r2)
            r6 = r2 ^ 1
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            float r0 = r0.t1(r1)
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r1 = new io.intercom.android.sdk.m5.conversation.utils.KeyboardState
            if (r8 == 0) goto L_0x0085
            if (r2 != 0) goto L_0x0083
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r2 = keyboardAsState$lambda$1(r13)
            if (r2 == 0) goto L_0x007b
            int r2 = r2.getBottomDiff()
            goto L_0x007c
        L_0x007b:
            r2 = r11
        L_0x007c:
            int r2 = r2 - r7
            float r2 = (float) r2
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r9 = r11
            goto L_0x0086
        L_0x0085:
            r9 = r4
        L_0x0086:
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            keyboardAsState$lambda$2(r13, r1)
            Y.A1 r13 = Y.p1.o(r1, r12, r11)
            r12.M()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(Y.m, int):Y.A1");
    }

    private static final KeyboardState keyboardAsState$lambda$1(C1510r0 r0Var) {
        return (KeyboardState) r0Var.getValue();
    }

    private static final void keyboardAsState$lambda$2(C1510r0 r0Var, KeyboardState keyboardState) {
        r0Var.setValue(keyboardState);
    }
}
