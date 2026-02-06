package io.intercom.android.sdk.survey.ui.questiontype.files;

import V.O0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import x.C2868g;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "item", "Lkotlin/Function0;", "Llf/M;", "onRetryClick", "onDeleteClick", "onStopUploading", "dismiss", "FileActionSheet", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;Lyf/a;Lyf/a;Lyf/a;Lyf/a;LY/m;I)V", "FileActionSheetUploadingPreview", "(LY/m;I)V", "FileActionSheetQueuedPreview", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "uploadStatus", "FileActionSheetPreviewForStatus", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FileActionSheetKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FileActionSheet(io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.MediaItem r24, yf.C6787a r25, yf.C6787a r26, yf.C6787a r27, yf.C6787a r28, Y.C1500m r29, int r30) {
        /*
            r1 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r0 = r28
            r15 = r30
            java.lang.String r2 = "item"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            java.lang.String r2 = "onRetryClick"
            kotlin.jvm.internal.C6496s.h(r8, r2)
            java.lang.String r2 = "onDeleteClick"
            kotlin.jvm.internal.C6496s.h(r9, r2)
            java.lang.String r2 = "onStopUploading"
            kotlin.jvm.internal.C6496s.h(r10, r2)
            java.lang.String r2 = "dismiss"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            r2 = 592767504(0x2354ea10, float:1.1542108E-17)
            r3 = r29
            Y.m r14 = r3.h(r2)
            r2 = r15 & 14
            r3 = 2
            if (r2 != 0) goto L_0x003e
            boolean r2 = r14.S(r1)
            if (r2 == 0) goto L_0x003b
            r2 = 4
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            r2 = r2 | r15
            goto L_0x003f
        L_0x003e:
            r2 = r15
        L_0x003f:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004f
            boolean r4 = r14.C(r8)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004c:
            r4 = 16
        L_0x004e:
            r2 = r2 | r4
        L_0x004f:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005f
            boolean r4 = r14.C(r9)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r2 = r2 | r4
        L_0x005f:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006f
            boolean r4 = r14.C(r10)
            if (r4 == 0) goto L_0x006c
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x006e
        L_0x006c:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x006e:
            r2 = r2 | r4
        L_0x006f:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x0081
            boolean r4 = r14.C(r0)
            if (r4 == 0) goto L_0x007e
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0080
        L_0x007e:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0080:
            r2 = r2 | r4
        L_0x0081:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r4 = r4 & r2
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r6) goto L_0x0096
            boolean r4 = r14.i()
            if (r4 != 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            r14.I()
        L_0x0093:
            r4 = r14
            goto L_0x01e8
        L_0x0096:
            r4 = -984102416(0xffffffffc557c9f0, float:-3452.621)
            r14.T(r4)
            java.lang.Object r4 = r14.A()
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r7 = r6.a()
            r11 = 0
            if (r4 != r7) goto L_0x00b4
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r4 = r24.getUploadStatus()
            Y.r0 r4 = Y.u1.d(r4, r11, r3, r11)
            r14.r(r4)
        L_0x00b4:
            Y.r0 r4 = (Y.C1510r0) r4
            r14.M()
            java.lang.Object r3 = r4.getValue()
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r7 = r24.getUploadStatus()
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r7)
            if (r3 != 0) goto L_0x00ca
            r28.invoke()
        L_0x00ca:
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r3 = r24.getUploadStatus()
            r4.setValue(r3)
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus r3 = r24.getUploadStatus()
            boolean r4 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error
            if (r4 == 0) goto L_0x0104
            r4 = -442112019(0xffffffffe5a5e7ed, float:-9.793359E22)
            r14.T(r4)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r4 = r24.getData()
            java.lang.String r4 = r4.getFileName()
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Error r3 = (io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error) r3
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadError r3 = r3.getError()
            int r2 = r2 << 3
            r5 = r2 & 896(0x380, float:1.256E-42)
            r5 = r5 | 64
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r5 | r2
            r2 = r4
            r4 = r25
            r5 = r26
            r6 = r14
            io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt.FileUploadErrorComponent(r2, r3, r4, r5, r6, r7)
            r14.M()
            goto L_0x0093
        L_0x0104:
            boolean r4 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Success
            if (r4 == 0) goto L_0x019d
            r3 = -441836801(0xffffffffe5aa1aff, float:-1.0041254E23)
            r14.T(r3)
            r3 = 0
            r4 = 1
            U8.b r7 = U8.c.e(r11, r14, r3, r4)
            r0.x0$a r12 = r0.C2544x0.f25560b
            r13 = r6
            long r5 = r12.a()
            io.intercom.android.sdk.utilities.ApplyStatusBarColorKt.m710applyStatusBarColor4WTKRHQ(r7, r5)
            k0.i$a r5 = k0.i.f23074a
            r6 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.f(r5, r6, r4, r11)
            long r17 = r12.a()
            r20 = 2
            r21 = 0
            r19 = 0
            k0.i r11 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs r12 = new io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile$LocalFile r5 = new io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile$LocalFile
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r6 = r24.getData()
            android.net.Uri r6 = r6.getUri()
            r5.<init>(r6)
            java.util.List r17 = mf.C6565s.e(r5)
            io.intercom.android.sdk.ui.preview.data.DeleteType$Delete r18 = io.intercom.android.sdk.ui.preview.data.DeleteType.Delete.INSTANCE
            r22 = 28
            r23 = 0
            r20 = 0
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r5 = -984068715(0xffffffffc5584d95, float:-3460.8489)
            r14.T(r5)
            r5 = r2 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x0160
            r3 = r4
        L_0x0160:
            java.lang.Object r4 = r14.A()
            if (r3 != 0) goto L_0x016c
            java.lang.Object r3 = r13.a()
            if (r4 != r3) goto L_0x0174
        L_0x016c:
            io.intercom.android.sdk.survey.ui.questiontype.files.k r4 = new io.intercom.android.sdk.survey.ui.questiontype.files.k
            r4.<init>(r9)
            r14.r(r4)
        L_0x0174:
            r3 = r4
            yf.l r3 = (yf.C6798l) r3
            r14.M()
            io.intercom.android.sdk.survey.ui.questiontype.files.l r16 = new io.intercom.android.sdk.survey.ui.questiontype.files.l
            r16.<init>()
            int r4 = io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs.$stable
            int r4 = r4 << 3
            r5 = 196614(0x30006, float:2.75515E-40)
            r4 = r4 | r5
            int r2 = r2 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r18 = r4 | r2
            r19 = 4
            r13 = 0
            r4 = r14
            r14 = r28
            r15 = r3
            r17 = r4
            io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt.PreviewRootScreen(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.M()
            goto L_0x01e8
        L_0x019d:
            r4 = r14
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Uploading r5 = io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE
            boolean r5 = kotlin.jvm.internal.C6496s.c(r3, r5)
            if (r5 == 0) goto L_0x01bf
            r3 = -441254497(0xffffffffe5b2fd9f, float:-1.05657465E23)
            r4.T(r3)
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r3 = r24.getData()
            java.lang.String r3 = r3.getFileName()
            int r2 = r2 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadProgressComponentKt.FileUploadProgressComponent(r3, r10, r4, r2)
            r4.M()
            goto L_0x01e8
        L_0x01bf:
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$None r2 = io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.None.INSTANCE
            boolean r2 = kotlin.jvm.internal.C6496s.c(r3, r2)
            if (r2 != 0) goto L_0x01df
            io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$FileUploadStatus$Queued r2 = io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE
            boolean r2 = kotlin.jvm.internal.C6496s.c(r3, r2)
            if (r2 == 0) goto L_0x01d0
            goto L_0x01df
        L_0x01d0:
            r0 = -984094230(0xffffffffc557e9ea, float:-3454.6196)
            r4.T(r0)
            r4.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x01df:
            r2 = -441073922(0xffffffffe5b5befe, float:-1.0728394E23)
            r4.T(r2)
            r4.M()
        L_0x01e8:
            Y.Y0 r7 = r4.k()
            if (r7 == 0) goto L_0x0203
            io.intercom.android.sdk.survey.ui.questiontype.files.m r11 = new io.intercom.android.sdk.survey.ui.questiontype.files.m
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r11)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt.FileActionSheet(io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem, yf.a, yf.a, yf.a, yf.a, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheet$lambda$2$lambda$1(C6787a aVar, IntercomPreviewFile intercomPreviewFile) {
        C6496s.h(aVar, "$onDeleteClick");
        C6496s.h(intercomPreviewFile, "it");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheet$lambda$3(List list) {
        C6496s.h(list, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheet$lambda$4(Answer.MediaAnswer.MediaItem mediaItem, C6787a aVar, C6787a aVar2, C6787a aVar3, C6787a aVar4, int i10, C1500m mVar, int i11) {
        C6496s.h(mediaItem, "$item");
        C6496s.h(aVar, "$onRetryClick");
        C6496s.h(aVar2, "$onDeleteClick");
        C6496s.h(aVar3, "$onStopUploading");
        C6496s.h(aVar4, "$dismiss");
        FileActionSheet(mediaItem, aVar, aVar2, aVar3, aVar4, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus fileUploadStatus, C1500m mVar, int i10) {
        int i11;
        int i12;
        Answer.MediaAnswer.FileUploadStatus fileUploadStatus2 = fileUploadStatus;
        int i13 = i10;
        C1500m h10 = mVar.h(-915176137);
        if ((i13 & 14) == 0) {
            if (h10.S(fileUploadStatus2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i13;
        } else {
            i11 = i13;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, c.e(193945980, true, new FileActionSheetKt$FileActionSheetPreviewForStatus$1(fileUploadStatus2), h10, 54), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(fileUploadStatus2, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheetPreviewForStatus$lambda$7(Answer.MediaAnswer.FileUploadStatus fileUploadStatus, int i10, C1500m mVar, int i11) {
        C6496s.h(fileUploadStatus, "$uploadStatus");
        FileActionSheetPreviewForStatus(fileUploadStatus, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FileActionSheetQueuedPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-61695068);
        if (i10 != 0 || !h10.i()) {
            FileActionSheetPreviewForStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(C6565s.e(new StringProvider.StringRes(R.string.intercom_inbox_error_state_title, (List) null, 2, (DefaultConstructorMarker) null)))), h10, 8);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheetQueuedPreview$lambda$6(int i10, C1500m mVar, int i11) {
        FileActionSheetQueuedPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FileActionSheetUploadingPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(31049684);
        if (i10 != 0 || !h10.i()) {
            FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE, h10, 6);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileActionSheetUploadingPreview$lambda$5(int i10, C1500m mVar, int i11) {
        FileActionSheetUploadingPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
