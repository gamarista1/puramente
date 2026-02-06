package io.intercom.android.sdk.tickets;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import O0.g;
import V.O0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001am\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "files", "Llf/M;", "FileAttachmentList", "(Lk0/i;Ljava/util/List;LY/m;II)V", "", "mimeType", "Lio/intercom/android/sdk/models/FileType;", "getFileType", "(Ljava/lang/String;)Lio/intercom/android/sdk/models/FileType;", "fileName", "fileType", "Lr0/x0;", "borderColor", "textColor", "Lkotlin/Function1;", "LC/Y;", "trialingIcon", "leadingIcon", "FileAttachment-vRFhKjU", "(Lk0/i;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;JJLyf/q;Lyf/q;LY/m;II)V", "FileAttachment", "FailedFileAttached", "(Lk0/i;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;LY/m;II)V", "FileAttachmentListPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FIleAttachmentListKt {
    public static final void FailedFileAttached(i iVar, String str, FileType fileType, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i.a aVar;
        int i13;
        int i14;
        int i15;
        String str2 = str;
        FileType fileType2 = fileType;
        int i16 = i10;
        C6496s.h(str2, "fileName");
        C6496s.h(fileType2, "fileType");
        C1500m h10 = mVar.h(912363521);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i16 | 6;
            iVar2 = iVar;
        } else if ((i16 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i16;
        } else {
            iVar2 = iVar;
            i12 = i16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i16 & 112) == 0) {
            if (h10.S(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i16 & 896) == 0) {
            if (h10.S(fileType2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) != 146 || !h10.i()) {
            if (i17 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            long r52 = intercomTheme.getColors(h10, i18).m689getError0d7_KjU();
            m535FileAttachmentvRFhKjU(aVar, str, fileType, intercomTheme.getColors(h10, i18).m689getError0d7_KjU(), r52, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m518getLambda1$intercom_sdk_base_release(), (q) null, h10, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896), 64);
            iVar2 = aVar;
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6325e(iVar2, str, fileType, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FailedFileAttached$lambda$5(i iVar, String str, FileType fileType, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$fileName");
        C6496s.h(fileType, "$fileType");
        FailedFileAttached(iVar, str, fileType, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f5  */
    /* renamed from: FileAttachment-vRFhKjU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m535FileAttachmentvRFhKjU(k0.i r24, java.lang.String r25, io.intercom.android.sdk.models.FileType r26, long r27, long r29, yf.q r31, yf.q r32, Y.C1500m r33, int r34, int r35) {
        /*
            r11 = r25
            r12 = r26
            r13 = r34
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "fileType"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r0 = 1921960973(0x728ecc0d, float:5.656775E30)
            r1 = r33
            Y.m r14 = r1.h(r0)
            r0 = r35 & 1
            if (r0 == 0) goto L_0x0023
            r1 = r13 | 6
            r2 = r1
            r1 = r24
            goto L_0x0037
        L_0x0023:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0034
            r1 = r24
            boolean r2 = r14.S(r1)
            if (r2 == 0) goto L_0x0031
            r2 = 4
            goto L_0x0032
        L_0x0031:
            r2 = 2
        L_0x0032:
            r2 = r2 | r13
            goto L_0x0037
        L_0x0034:
            r1 = r24
            r2 = r13
        L_0x0037:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x003e
            r2 = r2 | 48
            goto L_0x004e
        L_0x003e:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004e
            boolean r3 = r14.S(r11)
            if (r3 == 0) goto L_0x004b
            r3 = 32
            goto L_0x004d
        L_0x004b:
            r3 = 16
        L_0x004d:
            r2 = r2 | r3
        L_0x004e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0055
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0065
            boolean r3 = r14.S(r12)
            if (r3 == 0) goto L_0x0062
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r3
        L_0x0065:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x007e
            r3 = r35 & 8
            if (r3 != 0) goto L_0x0078
            r3 = r27
            boolean r5 = r14.e(r3)
            if (r5 == 0) goto L_0x007a
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x0078:
            r3 = r27
        L_0x007a:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r2 = r2 | r5
            goto L_0x0080
        L_0x007e:
            r3 = r27
        L_0x0080:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x009b
            r5 = r35 & 16
            if (r5 != 0) goto L_0x0095
            r5 = r29
            boolean r7 = r14.e(r5)
            if (r7 == 0) goto L_0x0097
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r5 = r29
        L_0x0097:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r2 = r2 | r7
            goto L_0x009d
        L_0x009b:
            r5 = r29
        L_0x009d:
            r7 = r35 & 32
            r8 = 458752(0x70000, float:6.42848E-40)
            if (r7 == 0) goto L_0x00a9
            r9 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r9
        L_0x00a6:
            r9 = r31
            goto L_0x00bb
        L_0x00a9:
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00a6
            r9 = r31
            boolean r10 = r14.C(r9)
            if (r10 == 0) goto L_0x00b8
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r2 = r2 | r10
        L_0x00bb:
            r10 = r35 & 64
            if (r10 == 0) goto L_0x00c5
            r15 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r15
        L_0x00c2:
            r15 = r32
            goto L_0x00d9
        L_0x00c5:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00c2
            r15 = r32
            boolean r16 = r14.C(r15)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r2 = r2 | r16
        L_0x00d9:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r2 & r16
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r1) goto L_0x00f5
            boolean r1 = r14.i()
            if (r1 != 0) goto L_0x00ea
            goto L_0x00f5
        L_0x00ea:
            r14.I()
            r1 = r24
            r6 = r5
            r8 = r9
            r9 = r15
            r4 = r3
            goto L_0x01b4
        L_0x00f5:
            r14.D()
            r1 = r13 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x011e
            boolean r1 = r14.L()
            if (r1 == 0) goto L_0x0106
            goto L_0x011e
        L_0x0106:
            r14.I()
            r0 = r35 & 8
            if (r0 == 0) goto L_0x010f
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010f:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0114
            r2 = r2 & r8
        L_0x0114:
            r16 = r3
            r18 = r5
            r10 = r9
            r20 = r15
            r15 = r24
            goto L_0x0172
        L_0x011e:
            if (r0 == 0) goto L_0x0123
            k0.i$a r0 = k0.i.f23074a
            goto L_0x0125
        L_0x0123:
            r0 = r24
        L_0x0125:
            r1 = r35 & 8
            if (r1 == 0) goto L_0x0148
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r14, r3)
            long r16 = r1.m700getPrimaryText0d7_KjU()
            r22 = 14
            r23 = 0
            r18 = 1036831949(0x3dcccccd, float:0.1)
            r19 = 0
            r20 = 0
            r21 = 0
            long r3 = r0.C2544x0.o(r16, r18, r19, r20, r21, r22, r23)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0148:
            r1 = r35 & 16
            if (r1 == 0) goto L_0x015b
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r14, r5)
            long r5 = r1.m700getPrimaryText0d7_KjU()
            r1 = r2 & r8
            r2 = r1
        L_0x015b:
            r1 = 0
            if (r7 == 0) goto L_0x015f
            r9 = r1
        L_0x015f:
            if (r10 == 0) goto L_0x016a
            r15 = r0
            r20 = r1
            r16 = r3
            r18 = r5
            r10 = r9
            goto L_0x0172
        L_0x016a:
            r16 = r3
            r18 = r5
            r10 = r9
            r20 = r15
            r15 = r0
        L_0x0172:
            r14.v()
            io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1 r0 = new io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1
            r0.<init>(r10, r12)
            r1 = 54
            r3 = -344274505(0xffffffffeb7ac9b7, float:-3.0318403E26)
            r4 = 1
            g0.a r6 = g0.c.e(r3, r4, r0, r14, r1)
            r0 = r2 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r2 >> 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r9 = r0 | r1
            r21 = 0
            r0 = r15
            r1 = r25
            r2 = r16
            r4 = r18
            r7 = r20
            r8 = r14
            r22 = r10
            r10 = r21
            io.intercom.android.sdk.ui.component.BoxedTextLayoutKt.m567BoxedTextLayoutY0xEhic(r0, r1, r2, r4, r6, r7, r8, r9, r10)
            r1 = r15
            r4 = r16
            r6 = r18
            r9 = r20
            r8 = r22
        L_0x01b4:
            Y.Y0 r14 = r14.k()
            if (r14 == 0) goto L_0x01cb
            io.intercom.android.sdk.tickets.f r15 = new io.intercom.android.sdk.tickets.f
            r0 = r15
            r2 = r25
            r3 = r26
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            r14.a(r15)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.FIleAttachmentListKt.m535FileAttachmentvRFhKjU(k0.i, java.lang.String, io.intercom.android.sdk.models.FileType, long, long, yf.q, yf.q, Y.m, int, int):void");
    }

    public static final void FileAttachmentList(i iVar, List<Ticket.TicketAttribute.FilesAttribute.File> list, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<Ticket.TicketAttribute.FilesAttribute.File> list2 = list;
        int i12 = i11;
        C6496s.h(list2, "files");
        C1500m h10 = mVar.h(580044030);
        if ((i12 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        F a10 = C1090h.a(C1085c.f882a.n(h.j((float) 6)), c.f23044a.k(), h10, 6);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar);
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
        h10.T(-1441890306);
        for (Ticket.TicketAttribute.FilesAttribute.File file : list2) {
            m535FileAttachmentvRFhKjU(d.d(i.f23074a, false, (String) null, (g) null, new C6327g(file, context), 7, (Object) null), file.getName(), file.getFileType(), 0, 0, (q) null, (q) null, h10, 0, 120);
            context = context;
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6328h(aVar, list2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentList$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File file, Context context) {
        C6496s.h(file, "$file");
        C6496s.h(context, "$context");
        LinkOpener.handleUrl(file.getUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentList$lambda$3(i iVar, List list, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$files");
        FileAttachmentList(iVar, list, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-414644973);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m519getLambda2$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6329i(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentListPreview$lambda$6(int i10, C1500m mVar, int i11) {
        FileAttachmentListPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachment_vRFhKjU$lambda$4(i iVar, String str, FileType fileType, long j10, long j11, q qVar, q qVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$fileName");
        C6496s.h(fileType, "$fileType");
        m535FileAttachmentvRFhKjU(iVar, str, fileType, j10, j11, qVar, qVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final FileType getFileType(String str) {
        C6496s.h(str, "mimeType");
        if (Sg.p.O(str, AppearanceType.IMAGE, false, 2, (Object) null)) {
            return FileType.IMAGE;
        }
        if (Sg.p.O(str, "video", false, 2, (Object) null)) {
            return FileType.VIDEO;
        }
        return FileType.ATTACHMENT;
    }
}
