package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import O0.g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.d;
import c1.h;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "items", "Lkotlin/Function1;", "Llf/M;", "onItemClick", "FileAttachmentList", "(Ljava/util/List;Lyf/l;LY/m;I)V", "FileAttachmentListPreview", "(LY/m;I)V", "FileAttachmentListErrorPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FileAttachmentListKt {
    public static final void FileAttachmentList(List<Answer.MediaAnswer.MediaItem> list, C6798l lVar, C1500m mVar, int i10) {
        List<Answer.MediaAnswer.MediaItem> list2 = list;
        C6798l lVar2 = lVar;
        C6496s.h(list2, "items");
        C6496s.h(lVar2, "onItemClick");
        C1500m h10 = mVar.h(-2107060022);
        C1085c.f n10 = C1085c.f882a.n(h.j((float) 8));
        i.a aVar = i.f23074a;
        F a10 = C1090h.a(n10, c.f23044a.k(), h10, 6);
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
        h10.T(1339367056);
        for (Answer.MediaAnswer.MediaItem mediaItem : list2) {
            if (mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                h10.T(-582474763);
                FIleAttachmentListKt.FailedFileAttached(d.d(i.f23074a, false, (String) null, (g) null, new v(lVar2, mediaItem), 7, (Object) null), mediaItem.getData().getFileName(), FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType()), h10, 0, 0);
                h10.M();
            } else {
                h10.T(-582164546);
                String fileName = mediaItem.getData().getFileName();
                FileType fileType = FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType());
                FIleAttachmentListKt.m535FileAttachmentvRFhKjU(d.d(i.f23074a, false, (String) null, (g) null, new w(lVar2, mediaItem), 7, (Object) null), fileName, fileType, 0, 0, (q) null, g0.c.e(2007803062, true, new FileAttachmentListKt$FileAttachmentList$1$1$3(mediaItem), h10, 54), h10, 1572864, 56);
                h10.M();
            }
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(list2, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentList$lambda$3$lambda$2$lambda$0(C6798l lVar, Answer.MediaAnswer.MediaItem mediaItem) {
        C6496s.h(lVar, "$onItemClick");
        C6496s.h(mediaItem, "$it");
        lVar.invoke(mediaItem);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentList$lambda$3$lambda$2$lambda$1(C6798l lVar, Answer.MediaAnswer.MediaItem mediaItem) {
        C6496s.h(lVar, "$onItemClick");
        C6496s.h(mediaItem, "$it");
        lVar.invoke(mediaItem);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentList$lambda$4(List list, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(list, "$items");
        C6496s.h(lVar, "$onItemClick");
        FileAttachmentList(list, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListErrorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(232584117);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m492getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentListErrorPreview$lambda$6(int i10, C1500m mVar, int i11) {
        FileAttachmentListErrorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1973696025);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m490getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new y(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileAttachmentListPreview$lambda$5(int i10, C1500m mVar, int i11) {
        FileAttachmentListPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
