package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import S8.c;
import S8.g;
import Y.C1500m;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.M0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import e.C1935h;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001aW\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "", "enabled", "Lr0/x0;", "contentColor", "activeContentColor", "backgroundColor", "activeBackgroundColor", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;", "speechRecognizerState", "Llf/M;", "VoiceInputLayout-Denoh9s", "(Lk0/i;ZJJJJLio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;LY/m;II)V", "VoiceInputLayout", "Lkotlin/Function0;", "onClick", "IconWithPulsatingBox-DZNDmhg", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;ZLyf/a;JJJJLY/m;II)V", "IconWithPulsatingBox", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "onStateChange", "rememberSpeechRecognizerState", "(Lyf/l;LY/m;II)Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;", "showPermissionDeniedDialog", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VoiceInputLayoutKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: IconWithPulsatingBox-DZNDmhg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m274IconWithPulsatingBoxDZNDmhg(k0.i r28, io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r29, boolean r30, yf.C6787a r31, long r32, long r34, long r36, long r38, Y.C1500m r40, int r41, int r42) {
        /*
            r4 = r31
            r13 = r41
            r0 = 764086828(0x2d8b0a2c, float:1.5806988E-11)
            r1 = r40
            Y.m r0 = r1.h(r0)
            r1 = r42 & 4
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r3 = r2
            goto L_0x0016
        L_0x0014:
            r3 = r30
        L_0x0016:
            boolean r1 = r29.isListening()
            if (r1 == 0) goto L_0x0029
            r0.x0 r1 = r0.C2544x0.k(r38)
            r0.x0 r5 = r0.C2544x0.k(r34)
            kotlin.Pair r1 = lf.C6502A.a(r1, r5)
            goto L_0x0035
        L_0x0029:
            r0.x0 r1 = r0.C2544x0.k(r36)
            r0.x0 r5 = r0.C2544x0.k(r32)
            kotlin.Pair r1 = lf.C6502A.a(r1, r5)
        L_0x0035:
            java.lang.Object r5 = r1.a()
            r0.x0 r5 = (r0.C2544x0) r5
            long r16 = r5.y()
            java.lang.Object r1 = r1.b()
            r0.x0 r1 = (r0.C2544x0) r1
            long r5 = r1.y()
            r1 = 48
            float r1 = (float) r1
            float r7 = c1.h.j(r1)
            float r1 = c1.h.j(r1)
            r8 = r28
            k0.i r1 = androidx.compose.foundation.layout.q.a(r8, r7, r1)
            k0.c$a r7 = k0.c.f23044a
            k0.c r7 = r7.e()
            r9 = 0
            H0.F r7 = androidx.compose.foundation.layout.d.h(r7, r9)
            int r10 = Y.C1494j.a(r0, r9)
            Y.y r11 = r0.p()
            k0.i r1 = k0.h.e(r0, r1)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r14 = r12.a()
            Y.f r15 = r0.j()
            if (r15 != 0) goto L_0x0080
            Y.C1494j.c()
        L_0x0080:
            r0.F()
            boolean r15 = r0.f()
            if (r15 == 0) goto L_0x008d
            r0.U(r14)
            goto L_0x0090
        L_0x008d:
            r0.q()
        L_0x0090:
            Y.m r14 = Y.F1.a(r0)
            yf.p r15 = r12.c()
            Y.F1.b(r14, r7, r15)
            yf.p r7 = r12.e()
            Y.F1.b(r14, r11, r7)
            yf.p r7 = r12.b()
            boolean r11 = r14.f()
            if (r11 != 0) goto L_0x00ba
            java.lang.Object r11 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r15)
            if (r11 != 0) goto L_0x00c8
        L_0x00ba:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r14.r(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.V(r10, r7)
        L_0x00c8:
            yf.p r7 = r12.d()
            Y.F1.b(r14, r1, r7)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r1 = k0.i.f23074a
            r7 = 32
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            k0.i r18 = androidx.compose.foundation.layout.q.n(r1, r7)
            r1 = 1597269732(0x5f3466e4, float:1.2999328E19)
            r0.T(r1)
            java.lang.Object r1 = r0.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r10 = r7.a()
            if (r1 != r10) goto L_0x00f7
            B.l r1 = B.k.a()
            r0.r(r1)
        L_0x00f7:
            r19 = r1
            B.l r19 = (B.l) r19
            r0.M()
            if (r3 == 0) goto L_0x0116
            r1 = 20
            float r1 = (float) r1
            float r21 = c1.h.j(r1)
            r24 = 4
            r25 = 0
            r20 = 0
            r22 = 0
            x.I r1 = V.C1409u0.c(r20, r21, r22, r24, r25)
        L_0x0113:
            r20 = r1
            goto L_0x0118
        L_0x0116:
            r1 = 0
            goto L_0x0113
        L_0x0118:
            r1 = 1597274507(0x5f34798b, float:1.3004578E19)
            r0.T(r1)
            r1 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r1 <= r10) goto L_0x012c
            boolean r1 = r0.b(r3)
            if (r1 != 0) goto L_0x0130
        L_0x012c:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != r10) goto L_0x0132
        L_0x0130:
            r1 = r2
            goto L_0x0133
        L_0x0132:
            r1 = r9
        L_0x0133:
            r10 = r13 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 <= r11) goto L_0x0141
            boolean r10 = r0.S(r4)
            if (r10 != 0) goto L_0x0145
        L_0x0141:
            r10 = r13 & 3072(0xc00, float:4.305E-42)
            if (r10 != r11) goto L_0x0146
        L_0x0145:
            r9 = r2
        L_0x0146:
            r1 = r1 | r9
            java.lang.Object r9 = r0.A()
            if (r1 != 0) goto L_0x0153
            java.lang.Object r1 = r7.a()
            if (r9 != r1) goto L_0x015b
        L_0x0153:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.F0 r9 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.F0
            r9.<init>(r3, r4)
            r0.r(r9)
        L_0x015b:
            r24 = r9
            yf.a r24 = (yf.C6787a) r24
            r0.M()
            r25 = 28
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            k0.i r14 = androidx.compose.foundation.d.b(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r19 = r29.isListening()
            r1 = 1050253722(0x3e99999a, float:0.3)
            float r7 = r29.getAmplitude()
            float r7 = r7 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r15 = r7 + r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt$IconWithPulsatingBox$1$3 r1 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt$IconWithPulsatingBox$1$3
            r7 = r29
            r1.<init>(r7, r5)
            r5 = 54
            r6 = 491745621(0x1d4f7155, float:2.7454813E-21)
            g0.a r20 = g0.c.e(r6, r2, r1, r0, r5)
            r22 = 196608(0x30000, float:2.75506E-40)
            r23 = 8
            r18 = 0
            r21 = r0
            io.intercom.android.sdk.ui.component.PulsatingBoxKt.m606PulsatingBoxFU0evQE(r14, r15, r16, r18, r19, r20, r21, r22, r23)
            r0.u()
            Y.Y0 r15 = r0.k()
            if (r15 == 0) goto L_0x01c3
            io.intercom.android.sdk.m5.conversation.ui.components.composer.G0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.G0
            r0 = r14
            r1 = r28
            r2 = r29
            r4 = r31
            r5 = r32
            r7 = r34
            r9 = r36
            r11 = r38
            r13 = r41
            r27 = r14
            r14 = r42
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.m274IconWithPulsatingBoxDZNDmhg(k0.i, io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState, boolean, yf.a, long, long, long, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IconWithPulsatingBox_DZNDmhg$lambda$15$lambda$14$lambda$13(boolean z10, C6787a aVar) {
        C6496s.h(aVar, "$onClick");
        if (z10) {
            aVar.invoke();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IconWithPulsatingBox_DZNDmhg$lambda$16(i iVar, SpeechRecognizerState speechRecognizerState, boolean z10, C6787a aVar, long j10, long j11, long j12, long j13, int i10, int i11, C1500m mVar, int i12) {
        i iVar2 = iVar;
        C6496s.h(iVar2, "$modifier");
        SpeechRecognizerState speechRecognizerState2 = speechRecognizerState;
        C6496s.h(speechRecognizerState2, "$speechRecognizerState");
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClick");
        m274IconWithPulsatingBoxDZNDmhg(iVar2, speechRecognizerState2, z10, aVar2, j10, j11, j12, j13, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e0  */
    /* renamed from: VoiceInputLayout-Denoh9s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m275VoiceInputLayoutDenoh9s(k0.i r36, boolean r37, long r38, long r40, long r42, long r44, io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r46, Y.C1500m r47, int r48, int r49) {
        /*
            r12 = r48
            r0 = -1361517133(0xffffffffaed8e5b3, float:-9.8633456E-11)
            r1 = r47
            Y.m r0 = r1.h(r0)
            r1 = r49 & 1
            if (r1 == 0) goto L_0x0015
            r3 = r12 | 6
            r4 = r3
            r3 = r36
            goto L_0x0029
        L_0x0015:
            r3 = r12 & 14
            if (r3 != 0) goto L_0x0026
            r3 = r36
            boolean r4 = r0.S(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r12
            goto L_0x0029
        L_0x0026:
            r3 = r36
            r4 = r12
        L_0x0029:
            r5 = r49 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r37
            goto L_0x0044
        L_0x0032:
            r6 = r12 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x002f
            r6 = r37
            boolean r7 = r0.b(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005d
            r7 = r49 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r38
            boolean r9 = r0.e(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r38
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r38
        L_0x005f:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0078
            r9 = r49 & 8
            if (r9 != 0) goto L_0x0072
            r9 = r40
            boolean r11 = r0.e(r9)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r9 = r40
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r11
            goto L_0x007a
        L_0x0078:
            r9 = r40
        L_0x007a:
            r11 = 57344(0xe000, float:8.0356E-41)
            r13 = r12 & r11
            if (r13 != 0) goto L_0x0096
            r13 = r49 & 16
            if (r13 != 0) goto L_0x0090
            r13 = r42
            boolean r15 = r0.e(r13)
            if (r15 == 0) goto L_0x0092
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r13 = r42
        L_0x0092:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r15
            goto L_0x0098
        L_0x0096:
            r13 = r42
        L_0x0098:
            r15 = 458752(0x70000, float:6.42848E-40)
            r16 = r12 & r15
            if (r16 != 0) goto L_0x00b2
            r16 = r49 & 32
            r2 = r44
            if (r16 != 0) goto L_0x00ad
            boolean r16 = r0.e(r2)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
            goto L_0x00b4
        L_0x00b2:
            r2 = r44
        L_0x00b4:
            r15 = r49 & 64
            if (r15 == 0) goto L_0x00bc
            r17 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 | r17
        L_0x00bc:
            r11 = 64
            if (r15 != r11) goto L_0x00e0
            r18 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r4 & r18
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r2) goto L_0x00e0
            boolean r2 = r0.i()
            if (r2 != 0) goto L_0x00d1
            goto L_0x00e0
        L_0x00d1:
            r0.I()
            r1 = r36
            r11 = r46
            r2 = r6
            r3 = r7
            r5 = r9
            r7 = r13
            r9 = r44
            goto L_0x0302
        L_0x00e0:
            r0.D()
            r2 = r12 & 1
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 0
            if (r2 == 0) goto L_0x011f
            boolean r2 = r0.L()
            if (r2 == 0) goto L_0x00f5
            goto L_0x011f
        L_0x00f5:
            r0.I()
            r1 = r49 & 4
            if (r1 == 0) goto L_0x00fe
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fe:
            r1 = r49 & 8
            if (r1 == 0) goto L_0x0104
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0104:
            r1 = r49 & 16
            if (r1 == 0) goto L_0x010a
            r4 = r4 & r18
        L_0x010a:
            r1 = r49 & 32
            if (r1 == 0) goto L_0x010f
            r4 = r4 & r11
        L_0x010f:
            if (r15 == 0) goto L_0x0115
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r1
        L_0x0115:
            r1 = r36
            r28 = r44
            r2 = r46
            r11 = r4
            r4 = r13
            goto L_0x01e6
        L_0x011f:
            if (r1 == 0) goto L_0x0124
            k0.i$a r1 = k0.i.f23074a
            goto L_0x0126
        L_0x0124:
            r1 = r36
        L_0x0126:
            if (r5 == 0) goto L_0x0129
            r6 = 1
        L_0x0129:
            r5 = r49 & 4
            if (r5 == 0) goto L_0x014b
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r0, r7)
            long r28 = r5.m700getPrimaryText0d7_KjU()
            r34 = 14
            r35 = 0
            r30 = 1056964608(0x3f000000, float:0.5)
            r31 = 0
            r32 = 0
            r33 = 0
            long r7 = r0.C2544x0.o(r28, r30, r31, r32, r33, r34, r35)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014b:
            r5 = r49 & 8
            if (r5 == 0) goto L_0x016d
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r0, r9)
            long r28 = r5.m700getPrimaryText0d7_KjU()
            r34 = 14
            r35 = 0
            r30 = 1056964608(0x3f000000, float:0.5)
            r31 = 0
            r32 = 0
            r33 = 0
            long r9 = r0.C2544x0.o(r28, r30, r31, r32, r33, r34, r35)
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x016d:
            r5 = r49 & 16
            if (r5 == 0) goto L_0x019d
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r13 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r0, r13)
            long r13 = r5.m700getPrimaryText0d7_KjU()
            r5 = 14
            r21 = 0
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 0
            r24 = 0
            r25 = 0
            r36 = r13
            r38 = r22
            r39 = r23
            r40 = r24
            r41 = r25
            r42 = r5
            r43 = r21
            long r13 = r0.C2544x0.o(r36, r38, r39, r40, r41, r42, r43)
            r4 = r4 & r18
        L_0x019d:
            r5 = r49 & 32
            if (r5 == 0) goto L_0x01ce
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r5.getColors(r0, r2)
            long r21 = r2.m700getPrimaryText0d7_KjU()
            r2 = 14
            r5 = 0
            r18 = 1056964608(0x3f000000, float:0.5)
            r23 = 0
            r24 = 0
            r25 = 0
            r37 = r21
            r39 = r18
            r40 = r23
            r41 = r24
            r42 = r25
            r43 = r2
            r44 = r5
            long r21 = r0.C2544x0.o(r37, r39, r40, r41, r42, r43, r44)
            r2 = r4 & r11
            r4 = r2
            goto L_0x01d0
        L_0x01ce:
            r21 = r44
        L_0x01d0:
            if (r15 == 0) goto L_0x01e2
            r2 = 0
            r5 = 1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r5 = rememberSpeechRecognizerState(r3, r0, r2, r5)
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r2
            r11 = r4
            r2 = r5
        L_0x01de:
            r4 = r13
            r28 = r21
            goto L_0x01e6
        L_0x01e2:
            r2 = r46
            r11 = r4
            goto L_0x01de
        L_0x01e6:
            r0.v()
            Y.I0 r13 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r13 = r0.m(r13)
            r15 = r13
            android.content.Context r15 = (android.content.Context) r15
            r13 = 1212224123(0x4841127b, float:197705.92)
            r0.T(r13)
            java.lang.Object r13 = r0.A()
            Y.m$a r30 = Y.C1500m.f10026a
            java.lang.Object r14 = r30.a()
            if (r13 != r14) goto L_0x0211
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r14 = 2
            Y.r0 r13 = Y.u1.d(r13, r3, r14, r3)
            r0.r(r13)
            goto L_0x0212
        L_0x0211:
            r14 = 2
        L_0x0212:
            Y.r0 r13 = (Y.C1510r0) r13
            r0.M()
            Y.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r3 = r0.m(r3)
            androidx.lifecycle.v r3 = (androidx.lifecycle.C1798v) r3
            java.lang.String r12 = "android.permission.RECORD_AUDIO"
            r46 = r4
            r36 = r15
            r4 = 0
            r15 = 0
            S8.c r4 = S8.d.a(r12, r4, r0, r15, r14)
            h.c r5 = new h.c
            r5.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.z0 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.z0
            r12.<init>(r2, r13)
            r14 = 8
            e.h r5 = e.C1930c.a(r5, r12, r0, r14)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.A0 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.A0
            r12.<init>(r3, r2)
            Y.P.c(r3, r12, r0, r14)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.B0 r3 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.B0
            r3.<init>(r4, r5, r2)
            r4 = r11 & 14
            r5 = 64
            r4 = r4 | r5
            int r5 = r11 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            int r5 = r11 << 6
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r5
            r4 = r4 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r5
            r4 = r4 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r5
            r4 = r4 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r11
            r26 = r4 | r5
            r27 = 0
            r4 = r13
            r13 = r1
            r14 = r2
            r5 = r36
            r15 = r6
            r16 = r3
            r17 = r7
            r19 = r9
            r21 = r46
            r23 = r28
            r25 = r0
            m274IconWithPulsatingBoxDZNDmhg(r13, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27)
            boolean r3 = VoiceInputLayout_Denoh9s$lambda$1(r4)
            if (r3 == 0) goto L_0x02fa
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo()
            android.content.pm.PackageManager r11 = r5.getPackageManager()
            java.lang.CharSequence r3 = r3.loadLabel(r11)
            java.lang.String r3 = r3.toString()
            int r11 = io.intercom.android.sdk.R.string.intercom_need_microphone_access
            io.intercom.android.sdk.utilities.Phrase r11 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r5, (int) r11)
            java.lang.String r12 = "app_name"
            io.intercom.android.sdk.utilities.Phrase r3 = r11.put((java.lang.String) r12, (java.lang.CharSequence) r3)
            java.lang.CharSequence r3 = r3.format()
            java.lang.String r3 = r3.toString()
            int r11 = io.intercom.android.sdk.R.string.intercom_settings
            r12 = 0
            java.lang.String r11 = M0.i.a(r11, r0, r12)
            int r13 = io.intercom.android.sdk.R.string.intercom_not_now
            java.lang.String r12 = M0.i.a(r13, r0, r12)
            int r13 = io.intercom.android.sdk.R.drawable.intercom_ic_mic
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 1212294427(0x4842251b, float:198804.42)
            r0.T(r14)
            java.lang.Object r14 = r0.A()
            java.lang.Object r15 = r30.a()
            if (r14 != r15) goto L_0x02d4
            io.intercom.android.sdk.m5.conversation.ui.components.composer.C0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.C0
            r14.<init>(r4)
            r0.r(r14)
        L_0x02d4:
            yf.a r14 = (yf.C6787a) r14
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.D0 r15 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.D0
            r15.<init>(r5, r4)
            r4 = 196608(0x30000, float:2.75506E-40)
            r5 = 1
            r16 = 0
            r36 = r16
            r37 = r3
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r15
            r43 = r0
            r44 = r4
            r45 = r5
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x02fa:
            r11 = r2
            r2 = r6
            r3 = r7
            r5 = r9
            r9 = r28
            r7 = r46
        L_0x0302:
            Y.Y0 r14 = r0.k()
            if (r14 == 0) goto L_0x0315
            io.intercom.android.sdk.m5.conversation.ui.components.composer.E0 r15 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.E0
            r0 = r15
            r12 = r48
            r13 = r49
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x0315:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.m275VoiceInputLayoutDenoh9s(k0.i, boolean, long, long, long, long, io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState, Y.m, int, int):void");
    }

    private static final boolean VoiceInputLayout_Denoh9s$lambda$1(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M VoiceInputLayout_Denoh9s$lambda$10(Context context, C1510r0 r0Var) {
        C6496s.h(context, "$context");
        C6496s.h(r0Var, "$showPermissionDeniedDialog$delegate");
        VoiceInputLayout_Denoh9s$lambda$2(r0Var, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), (String) null)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M VoiceInputLayout_Denoh9s$lambda$11(i iVar, boolean z10, long j10, long j11, long j12, long j13, SpeechRecognizerState speechRecognizerState, int i10, int i11, C1500m mVar, int i12) {
        m275VoiceInputLayoutDenoh9s(iVar, z10, j10, j11, j12, j13, speechRecognizerState, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void VoiceInputLayout_Denoh9s$lambda$2(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C6514M VoiceInputLayout_Denoh9s$lambda$3(SpeechRecognizerState speechRecognizerState, C1510r0 r0Var, boolean z10) {
        C6496s.h(r0Var, "$showPermissionDeniedDialog$delegate");
        if (z10) {
            speechRecognizerState.startListening();
        } else {
            VoiceInputLayout_Denoh9s$lambda$2(r0Var, true);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final L VoiceInputLayout_Denoh9s$lambda$6(C1798v vVar, SpeechRecognizerState speechRecognizerState, M m10) {
        C6496s.h(vVar, "$lifecycleOwner");
        C6496s.h(m10, "$this$DisposableEffect");
        x0 x0Var = new x0(speechRecognizerState);
        vVar.getLifecycle().a(x0Var);
        return new VoiceInputLayoutKt$VoiceInputLayout_Denoh9s$lambda$6$$inlined$onDispose$1(vVar, x0Var, speechRecognizerState);
    }

    /* access modifiers changed from: private */
    public static final void VoiceInputLayout_Denoh9s$lambda$6$lambda$4(SpeechRecognizerState speechRecognizerState, C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "<unused var>");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_PAUSE) {
            speechRecognizerState.stopListening();
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M VoiceInputLayout_Denoh9s$lambda$7(c cVar, C1935h hVar, SpeechRecognizerState speechRecognizerState) {
        C6496s.h(cVar, "$audioPermissionState");
        C6496s.h(hVar, "$permissionRequestLauncher");
        VoiceInputLayout_Denoh9s$onClick(cVar, hVar, speechRecognizerState);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M VoiceInputLayout_Denoh9s$lambda$9$lambda$8(C1510r0 r0Var) {
        C6496s.h(r0Var, "$showPermissionDeniedDialog$delegate");
        VoiceInputLayout_Denoh9s$lambda$2(r0Var, false);
        return C6514M.f71813a;
    }

    private static final void VoiceInputLayout_Denoh9s$onClick(c cVar, C1935h hVar, SpeechRecognizerState speechRecognizerState) {
        if (!g.f(cVar.getStatus())) {
            hVar.b("android.permission.RECORD_AUDIO");
        } else if (!speechRecognizerState.isListening()) {
            speechRecognizerState.startListening();
        } else {
            speechRecognizerState.stopListening();
        }
    }

    public static final SpeechRecognizerState rememberSpeechRecognizerState(C6798l lVar, C1500m mVar, int i10, int i11) {
        mVar.T(1459481519);
        if ((i11 & 1) != 0) {
            new y0
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r2v2 ? I:io.intercom.android.sdk.m5.conversation.ui.components.composer.y0) =  call: io.intercom.android.sdk.m5.conversation.ui.components.composer.y0.<init>():void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.rememberSpeechRecognizerState(yf.l, Y.m, int, int):io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState, dex: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r4 = 1459481519(0x56fdebaf, float:1.39594348E14)
                r3.T(r4)
                r4 = r5 & 1
                if (r4 == 0) goto L_0x000f
                io.intercom.android.sdk.m5.conversation.ui.components.composer.y0 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.y0
                r2.<init>()
            L_0x000f:
                Y.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                java.lang.Object r4 = r3.m(r4)
                android.content.Context r4 = (android.content.Context) r4
                android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createSpeechRecognizer(r4)
                boolean r4 = android.speech.SpeechRecognizer.isRecognitionAvailable(r4)
                r0 = 1305055235(0x4dc99003, float:4.22707296E8)
                r3.T(r0)
                java.lang.Object r0 = r3.A()
                Y.m$a r1 = Y.C1500m.f10026a
                java.lang.Object r1 = r1.a()
                if (r0 != r1) goto L_0x003e
                io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r0 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState
                kotlin.jvm.internal.C6496s.e(r5)
                r0.<init>(r5, r4, r2)
                r3.r(r0)
            L_0x003e:
                io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState r0 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState) r0
                r3.M()
                r3.M()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.VoiceInputLayoutKt.rememberSpeechRecognizerState(yf.l, Y.m, int, int):io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState");
        }

        /* access modifiers changed from: private */
        public static final C6514M rememberSpeechRecognizerState$lambda$17(SpeechRecognizerState.SpeechState speechState) {
            C6496s.h(speechState, "it");
            return C6514M.f71813a;
        }
    }
