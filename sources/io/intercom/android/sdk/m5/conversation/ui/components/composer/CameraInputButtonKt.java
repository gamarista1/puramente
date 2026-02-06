package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.content.c;
import androidx.core.content.d;
import e.C1935h;
import g.C1998a;
import io.intercom.android.sdk.IntercomFileProviderKt;
import java.io.File;
import java.util.UUID;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import mf.C6559l;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001ae\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\u000e\u0010\u0018\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00158\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputType;", "cameraInputType", "Lkotlin/Function1;", "Landroid/net/Uri;", "Llf/M;", "onResult", "Lkotlin/Function0;", "performWithOnClick", "onPermissionDenied", "content", "CameraInputButton", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/CameraInputType;Lyf/l;Lyf/a;Lyf/a;Lyf/p;LY/m;II)V", "Landroid/content/Context;", "context", "", "fileName", "folderName", "getUriByFileName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "", "hasCameraPermissionInManifest", "(Landroid/content/Context;)Z", "latestFileName", "showDialog", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CameraInputButtonKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType[] r0 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType.PHOTO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.composer.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.composer.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CameraInputButton(k0.i r32, io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType r33, yf.C6798l r34, yf.C6787a r35, yf.C6787a r36, yf.p r37, Y.C1500m r38, int r39, int r40) {
        /*
            r8 = r33
            r9 = r34
            r10 = r37
            r11 = r39
            r7 = 8
            r0 = 16
            r1 = 32
            r2 = 4
            java.lang.String r3 = "cameraInputType"
            kotlin.jvm.internal.C6496s.h(r8, r3)
            java.lang.String r3 = "onResult"
            kotlin.jvm.internal.C6496s.h(r9, r3)
            java.lang.String r3 = "content"
            kotlin.jvm.internal.C6496s.h(r10, r3)
            r3 = -2022676727(0xffffffff87706709, float:-1.8085873E-34)
            r4 = r38
            Y.m r6 = r4.h(r3)
            r3 = 1
            r4 = r40 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0033
            r12 = r11 | 6
            r13 = r12
            r12 = r32
            goto L_0x0047
        L_0x0033:
            r12 = r11 & 14
            if (r12 != 0) goto L_0x0044
            r12 = r32
            boolean r13 = r6.S(r12)
            if (r13 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0042
        L_0x0041:
            r13 = r5
        L_0x0042:
            r13 = r13 | r11
            goto L_0x0047
        L_0x0044:
            r12 = r32
            r13 = r11
        L_0x0047:
            r14 = r40 & 2
            if (r14 == 0) goto L_0x004e
            r13 = r13 | 48
            goto L_0x005c
        L_0x004e:
            r14 = r11 & 112(0x70, float:1.57E-43)
            if (r14 != 0) goto L_0x005c
            boolean r14 = r6.S(r8)
            if (r14 == 0) goto L_0x005a
            r14 = r1
            goto L_0x005b
        L_0x005a:
            r14 = r0
        L_0x005b:
            r13 = r13 | r14
        L_0x005c:
            r2 = r40 & 4
            if (r2 == 0) goto L_0x0063
            r13 = r13 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0073
            boolean r2 = r6.C(r9)
            if (r2 == 0) goto L_0x0070
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r13 = r13 | r2
        L_0x0073:
            r2 = r40 & 8
            if (r2 == 0) goto L_0x007c
            r13 = r13 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r14 = r35
            goto L_0x008e
        L_0x007c:
            r14 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x0079
            r14 = r35
            boolean r15 = r6.C(r14)
            if (r15 == 0) goto L_0x008b
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r13 = r13 | r15
        L_0x008e:
            r0 = r40 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x009a
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
            r15 = r36
            goto L_0x00ad
        L_0x009a:
            r17 = r11 & r16
            r15 = r36
            if (r17 != 0) goto L_0x00ad
            boolean r17 = r6.C(r15)
            if (r17 == 0) goto L_0x00a9
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ab
        L_0x00a9:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00ab:
            r13 = r13 | r17
        L_0x00ad:
            r1 = r40 & 32
            if (r1 == 0) goto L_0x00b7
            r1 = 196608(0x30000, float:2.75506E-40)
        L_0x00b3:
            r13 = r13 | r1
        L_0x00b4:
            r22 = r13
            goto L_0x00c8
        L_0x00b7:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r11
            if (r1 != 0) goto L_0x00b4
            boolean r1 = r6.C(r10)
            if (r1 == 0) goto L_0x00c5
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00c5:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b3
        L_0x00c8:
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r22 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r13) goto L_0x00e2
            boolean r1 = r6.i()
            if (r1 != 0) goto L_0x00d9
            goto L_0x00e2
        L_0x00d9:
            r6.I()
            r8 = r6
            r1 = r12
            r4 = r14
            r5 = r15
            goto L_0x02ca
        L_0x00e2:
            if (r4 == 0) goto L_0x00e9
            k0.i$a r1 = k0.i.f23074a
            r30 = r1
            goto L_0x00eb
        L_0x00e9:
            r30 = r12
        L_0x00eb:
            if (r2 == 0) goto L_0x00f5
            io.intercom.android.sdk.m5.conversation.ui.components.composer.i r1 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.i
            r1.<init>()
            r31 = r1
            goto L_0x00f7
        L_0x00f5:
            r31 = r14
        L_0x00f7:
            if (r0 == 0) goto L_0x0100
            io.intercom.android.sdk.m5.conversation.ui.components.composer.j r0 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.j
            r0.<init>()
            r4 = r0
            goto L_0x0101
        L_0x0100:
            r4 = r15
        L_0x0101:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r6.m(r0)
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            r0 = -845514337(0xffffffffcd9a799f, float:-3.23957728E8)
            r6.T(r0)
            java.lang.Object r0 = r6.A()
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r12 = r1.a()
            r13 = 0
            if (r0 != r12) goto L_0x0128
            java.lang.String r0 = ""
            Y.r0 r0 = Y.u1.d(r0, r13, r5, r13)
            r6.r(r0)
        L_0x0128:
            Y.r0 r0 = (Y.C1510r0) r0
            r6.M()
            int[] r12 = io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt.WhenMappings.$EnumSwitchMapping$0
            int r14 = r33.ordinal()
            r12 = r12[r14]
            if (r12 == r3) goto L_0x0143
            if (r12 != r5) goto L_0x013d
            java.lang.String r12 = "images"
        L_0x013b:
            r15 = r12
            goto L_0x0146
        L_0x013d:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0143:
            java.lang.String r12 = "videos"
            goto L_0x013b
        L_0x0146:
            h.d r12 = new h.d
            r12.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.k r14 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.k
            r14.<init>(r9, r2, r15, r0)
            e.h r23 = e.C1930c.a(r12, r14, r6, r7)
            r12 = -845473406(0xffffffffcd9b1982, float:-3.2526752E8)
            r6.T(r12)
            java.lang.Object r12 = r6.A()
            java.lang.Object r14 = r1.a()
            if (r12 != r14) goto L_0x016d
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            Y.r0 r12 = Y.u1.d(r12, r13, r5, r13)
            r6.r(r12)
        L_0x016d:
            r5 = r12
            Y.r0 r5 = (Y.C1510r0) r5
            r6.M()
            r12 = -845471236(0xffffffffcd9b21fc, float:-3.2533696E8)
            r6.T(r12)
            boolean r12 = CameraInputButton$lambda$7(r5)
            r14 = 0
            if (r12 == 0) goto L_0x01fb
            android.content.pm.ApplicationInfo r12 = r2.getApplicationInfo()
            android.content.pm.PackageManager r13 = r2.getPackageManager()
            java.lang.CharSequence r12 = r12.loadLabel(r13)
            java.lang.String r12 = r12.toString()
            int r13 = io.intercom.android.sdk.R.string.intercom_need_camera_access
            io.intercom.android.sdk.utilities.Phrase r13 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r2, (int) r13)
            java.lang.String r3 = "app_name"
            io.intercom.android.sdk.utilities.Phrase r3 = r13.put((java.lang.String) r3, (java.lang.CharSequence) r12)
            java.lang.CharSequence r3 = r3.format()
            java.lang.String r13 = r3.toString()
            int r3 = io.intercom.android.sdk.R.string.intercom_settings
            java.lang.String r3 = M0.i.a(r3, r6, r14)
            int r12 = io.intercom.android.sdk.R.string.intercom_not_now
            java.lang.String r18 = M0.i.a(r12, r6, r14)
            int r12 = io.intercom.android.sdk.R.drawable.intercom_ic_camera
            java.lang.Integer r19 = java.lang.Integer.valueOf(r12)
            r12 = -845454121(0xffffffffcd9b64d7, float:-3.2588464E8)
            r6.T(r12)
            r12 = r22 & r16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r14) goto L_0x01c5
            r17 = 1
            goto L_0x01c7
        L_0x01c5:
            r17 = 0
        L_0x01c7:
            java.lang.Object r12 = r6.A()
            if (r17 != 0) goto L_0x01d3
            java.lang.Object r1 = r1.a()
            if (r12 != r1) goto L_0x01db
        L_0x01d3:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.l r12 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.l
            r12.<init>(r4, r5)
            r6.r(r12)
        L_0x01db:
            r17 = r12
            yf.a r17 = (yf.C6787a) r17
            r6.M()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.m r1 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.m
            r1.<init>(r2, r5)
            r20 = 0
            r21 = 1
            r12 = 0
            r14 = r3
            r24 = r15
            r15 = r18
            r16 = r19
            r18 = r1
            r19 = r6
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01fd
        L_0x01fb:
            r24 = r15
        L_0x01fd:
            r6.M()
            h.c r12 = new h.c
            r12.<init>()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.n r13 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.n
            r14 = r0
            r0 = r13
            r1 = r33
            r15 = r2
            r3 = r24
            r16 = r4
            r4 = r23
            r17 = r5
            r5 = r14
            r8 = r6
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e.h r3 = e.C1930c.a(r12, r13, r8, r7)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.o r27 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.o
            r0 = r27
            r1 = r31
            r4 = r33
            r5 = r24
            r6 = r23
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r28 = 7
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r23 = r30
            k0.i r0 = androidx.compose.foundation.d.d(r23, r24, r25, r26, r27, r28, r29)
            k0.c$a r1 = k0.c.f23044a
            k0.c r1 = r1.o()
            r2 = 0
            H0.F r1 = androidx.compose.foundation.layout.d.h(r1, r2)
            int r2 = Y.C1494j.a(r8, r2)
            Y.y r3 = r8.p()
            k0.i r0 = k0.h.e(r8, r0)
            J0.g$a r4 = J0.C1241g.f3853J
            yf.a r5 = r4.a()
            Y.f r6 = r8.j()
            if (r6 != 0) goto L_0x0265
            Y.C1494j.c()
        L_0x0265:
            r8.F()
            boolean r6 = r8.f()
            if (r6 == 0) goto L_0x0272
            r8.U(r5)
            goto L_0x0275
        L_0x0272:
            r8.q()
        L_0x0275:
            Y.m r5 = Y.F1.a(r8)
            yf.p r6 = r4.c()
            Y.F1.b(r5, r1, r6)
            yf.p r1 = r4.e()
            Y.F1.b(r5, r3, r1)
            yf.p r1 = r4.b()
            boolean r3 = r5.f()
            if (r3 != 0) goto L_0x029f
            java.lang.Object r3 = r5.A()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r6)
            if (r3 != 0) goto L_0x02ad
        L_0x029f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.r(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.V(r2, r1)
        L_0x02ad:
            yf.p r1 = r4.d()
            Y.F1.b(r5, r0, r1)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            int r0 = r22 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r8, r0)
            r8.u()
            r5 = r16
            r1 = r30
            r4 = r31
        L_0x02ca:
            Y.Y0 r12 = r8.k()
            if (r12 == 0) goto L_0x02e3
            io.intercom.android.sdk.m5.conversation.ui.components.composer.p r13 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.p
            r0 = r13
            r2 = r33
            r3 = r34
            r6 = r37
            r7 = r39
            r8 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.a(r13)
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt.CameraInputButton(k0.i, io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType, yf.l, yf.a, yf.a, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$10$lambda$9(C6787a aVar, C1510r0 r0Var) {
        C6496s.h(r0Var, "$showDialog$delegate");
        CameraInputButton$lambda$8(r0Var, false);
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$11(Context context, C1510r0 r0Var) {
        C6496s.h(context, "$context");
        C6496s.h(r0Var, "$showDialog$delegate");
        CameraInputButton$lambda$8(r0Var, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), (String) null)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$12(CameraInputType cameraInputType, Context context, String str, C1935h hVar, C1510r0 r0Var, C1510r0 r0Var2, boolean z10) {
        C6496s.h(cameraInputType, "$cameraInputType");
        C6496s.h(context, "$context");
        C6496s.h(str, "$folderName");
        C6496s.h(hVar, "$cameraLauncher");
        C6496s.h(r0Var, "$latestFileName$delegate");
        C6496s.h(r0Var2, "$showDialog$delegate");
        if (z10) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, str, hVar, r0Var);
        } else {
            CameraInputButton$lambda$8(r0Var2, true);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$13(C6787a aVar, Context context, C1935h hVar, CameraInputType cameraInputType, String str, C1935h hVar2, C1510r0 r0Var) {
        C6496s.h(context, "$context");
        C6496s.h(hVar, "$permissionLauncher");
        C6496s.h(cameraInputType, "$cameraInputType");
        C6496s.h(str, "$folderName");
        C6496s.h(hVar2, "$cameraLauncher");
        C6496s.h(r0Var, "$latestFileName$delegate");
        aVar.invoke();
        if (!hasCameraPermissionInManifest(context)) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, str, hVar2, r0Var);
        } else if (c.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, str, hVar2, r0Var);
        } else {
            hVar.b("android.permission.CAMERA");
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$15(i iVar, CameraInputType cameraInputType, C6798l lVar, C6787a aVar, C6787a aVar2, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(cameraInputType, "$cameraInputType");
        C6496s.h(lVar, "$onResult");
        C6496s.h(pVar, "$content");
        CameraInputButton(iVar, cameraInputType, lVar, aVar, aVar2, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final String CameraInputButton$lambda$3(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    private static final void CameraInputButton$lambda$4(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C6514M CameraInputButton$lambda$5(C6798l lVar, Context context, String str, C1510r0 r0Var, C1998a aVar) {
        C6496s.h(lVar, "$onResult");
        C6496s.h(context, "$context");
        C6496s.h(str, "$folderName");
        C6496s.h(r0Var, "$latestFileName$delegate");
        C6496s.h(aVar, "result");
        if (aVar.b() == -1 && CameraInputButton$lambda$3(r0Var).length() > 0) {
            lVar.invoke(getUriByFileName(context, CameraInputButton$lambda$3(r0Var), str));
        }
        CameraInputButton$lambda$4(r0Var, "");
        return C6514M.f71813a;
    }

    private static final boolean CameraInputButton$lambda$7(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    private static final void CameraInputButton$lambda$8(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final void CameraInputButton$launchCameraIntent(CameraInputType cameraInputType, Context context, String str, C1935h hVar, C1510r0 r0Var) {
        String str2;
        Intent intent;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[cameraInputType.ordinal()];
        if (i10 == 1) {
            str2 = ".mp4";
        } else if (i10 == 2) {
            str2 = ".jpg";
        } else {
            throw new C6535s();
        }
        String str3 = UUID.randomUUID() + str2;
        Uri uriByFileName = getUriByFileName(context, str3, str);
        CameraInputButton$lambda$4(r0Var, str3);
        int i11 = iArr[cameraInputType.ordinal()];
        if (i11 == 1) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else if (i11 == 2) {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } else {
            throw new C6535s();
        }
        Intent putExtra = intent.putExtra("output", uriByFileName);
        C6496s.g(putExtra, "putExtra(...)");
        hVar.b(putExtra);
    }

    private static final Uri getUriByFileName(Context context, String str, String str2) {
        File file = new File(context.getExternalCacheDir(), str2);
        file.mkdir();
        Uri uriForFile = d.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), new File(file, str));
        C6496s.g(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    private static final boolean hasCameraPermissionInManifest(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return C6559l.W(strArr, "android.permission.CAMERA");
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
