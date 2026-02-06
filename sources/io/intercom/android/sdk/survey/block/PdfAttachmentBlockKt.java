package io.intercom.android.sdk.survey.block;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.C1187h;
import H0.F;
import J0.C1241g;
import O0.g;
import Q0.T;
import Sg.p;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Z3.u;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1644k0;
import b1.j;
import b1.k;
import b1.t;
import c1.d;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import j4.C3622i;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import r0.C2547y0;
import yf.C6787a;
import yf.C6798l;
import yf.r;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\b*\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;", "blockAttachment", "", "isAdmin", "Lk0/i;", "modifier", "Lr0/x0;", "tintColor", "Llf/M;", "PdfAttachmentBlock-ww6aTOc", "(Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;ZLk0/i;JLY/m;II)V", "PdfAttachmentBlock", "LC/Y;", "PdfDetails-FNF3uiM", "(LC/Y;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;JZLY/m;I)V", "PdfDetails", "Landroid/content/Context;", "context", "", "cacheKey", "Lc1/d;", "density", "Lc1/h;", "pdfSize", "PdfThumbnail-3xixttE", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;Lc1/d;FLY/m;I)V", "PdfThumbnail", "PdfAttachmentBlockPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PdfAttachmentBlockKt {
    /* renamed from: PdfAttachmentBlock-ww6aTOc  reason: not valid java name */
    public static final void m457PdfAttachmentBlockww6aTOc(BlockAttachment blockAttachment, boolean z10, i iVar, long j10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        long j11;
        int i12;
        float f10;
        float f11;
        C6496s.h(blockAttachment, "blockAttachment");
        C1500m h10 = mVar.h(369048797);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 8) != 0) {
            j11 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m700getPrimaryText0d7_KjU();
            i12 = i10 & -7169;
        } else {
            j11 = j10;
            i12 = i10;
        }
        float j12 = h.j((float) 90);
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        d dVar = (d) h10.m(C1644k0.e());
        String a10 = M0.i.a(R.string.intercom_permission_denied, h10, 0);
        String a11 = M0.i.a(R.string.intercom_file_saved, h10, 0);
        String a12 = M0.i.a(R.string.intercom_something_went_wrong_try_again, h10, 0);
        String a13 = M0.i.a(R.string.intercom_saving, h10, 0);
        String url = blockAttachment.getUrl();
        C6496s.g(url, "getUrl(...)");
        String str = (String) C6565s.o0(p.F0(url, new String[]{"?"}, false, 0, 6, (Object) null));
        c.C0368c i13 = c.f23044a.i();
        i d10 = androidx.compose.foundation.d.d(q.x(aVar, (c) null, false, 3, (Object) null), false, (String) null, (g) null, new y(context, blockAttachment, a13, a11, a12, a10), 7, (Object) null);
        if (z10) {
            f10 = (float) 16;
        } else {
            f10 = (float) 4;
        }
        float j13 = h.j(f10);
        if (z10) {
            f11 = (float) 4;
        } else {
            f11 = (float) 16;
        }
        float f12 = (float) 4;
        i l10 = n.l(d10, j13, h.j(f12), h.j(f11), h.j(f12));
        F b10 = W.b(C1085c.f882a.f(), i13, h10, 48);
        int a14 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, l10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a15 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a15);
        } else {
            h10.q();
        }
        C1500m a16 = F1.a(h10);
        F1.b(a16, b10, aVar2.c());
        F1.b(a16, p10, aVar2.e());
        yf.p b11 = aVar2.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b11);
        }
        F1.b(a16, e10, aVar2.d());
        Z z11 = Z.f873a;
        if (z10) {
            h10.T(189348674);
            C1500m mVar2 = h10;
            m458PdfDetailsFNF3uiM(z11, blockAttachment, j11, true, mVar2, 3142 | ((i12 >> 3) & 896));
            a0.a(q.r(i.f23074a, h.j((float) 16)), h10, 6);
            m459PdfThumbnail3xixttE(context, str, blockAttachment, dVar, j12, mVar2, 25096);
            h10.M();
        } else {
            h10.T(189553057);
            C1500m mVar3 = h10;
            m459PdfThumbnail3xixttE(context, str, blockAttachment, dVar, j12, mVar3, 25096);
            a0.a(q.r(i.f23074a, h.j((float) 16)), h10, 6);
            m458PdfDetailsFNF3uiM(z11, blockAttachment, j11, false, mVar3, 3142 | ((i12 >> 3) & 896));
            h10.M();
        }
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new z(blockAttachment, z10, aVar, j11, i10, i11));
        }
    }

    @IntercomPreviews
    private static final void PdfAttachmentBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1883421095);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m452getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfAttachmentBlockPreview$lambda$8(int i10, C1500m mVar, int i11) {
        PdfAttachmentBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfAttachmentBlock_ww6aTOc$lambda$0(Context context, BlockAttachment blockAttachment, String str, String str2, String str3, String str4) {
        boolean z10;
        C6496s.h(context, "$context");
        C6496s.h(blockAttachment, "$blockAttachment");
        C6496s.h(str, "$fileSavingText");
        C6496s.h(str2, "$fileSavedText");
        C6496s.h(str3, "$saveFailedText");
        C6496s.h(str4, "$permissionDeniedText");
        IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
        String url = blockAttachment.getUrl();
        C6496s.g(url, "getUrl(...)");
        List e10 = C6565s.e(new IntercomPreviewFile.NetworkFile(url, "application/pdf"));
        String url2 = blockAttachment.getUrl();
        C6496s.g(url2, "getUrl(...)");
        if (url2.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(e10, (DeleteType) null, (String) null, false, new DownloadState(z10, str, str2, str3, str4), 14, (DefaultConstructorMarker) null)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfAttachmentBlock_ww6aTOc$lambda$2(BlockAttachment blockAttachment, boolean z10, i iVar, long j10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockAttachment, "$blockAttachment");
        m457PdfAttachmentBlockww6aTOc(blockAttachment, z10, iVar, j10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* renamed from: PdfDetails-FNF3uiM  reason: not valid java name */
    private static final void m458PdfDetailsFNF3uiM(Y y10, BlockAttachment blockAttachment, long j10, boolean z10, C1500m mVar, int i10) {
        c.b bVar;
        C1500m h10 = mVar.h(-1205911716);
        i a10 = y10.a(i.f23074a, 1.0f, false);
        c.a aVar = c.f23044a;
        if (z10) {
            bVar = aVar.k();
        } else {
            bVar = aVar.j();
        }
        F a11 = C1090h.a(C1085c.f882a.b(), bVar, h10, 6);
        int a12 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, a10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a13 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a13);
        } else {
            h10.q();
        }
        C1500m a14 = F1.a(h10);
        F1.b(a14, a11, aVar2.c());
        F1.b(a14, p10, aVar2.e());
        yf.p b10 = aVar2.b();
        if (a14.f() || !C6496s.c(a14.A(), Integer.valueOf(a12))) {
            a14.r(Integer.valueOf(a12));
            a14.V(Integer.valueOf(a12), b10);
        }
        F1.b(a14, e10, aVar2.d());
        C1093k kVar = C1093k.f978a;
        String name = blockAttachment.getName();
        String str = name;
        C6496s.g(name, "getName(...)");
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        T type04 = intercomTheme.getTypography(h10, i11).getType04();
        t.a aVar3 = t.f19154a;
        int i12 = i10 & 896;
        IntercomTheme intercomTheme2 = intercomTheme;
        T0.b(str, (i) null, j10, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, aVar3.b(), false, 1, 0, (C6798l) null, type04, h10, i12, 3120, 55290);
        String humanFileSize = blockAttachment.getHumanFileSize();
        String str2 = humanFileSize;
        C6496s.g(humanFileSize, "getHumanFileSize(...)");
        T type05 = intercomTheme2.getTypography(h10, i11).getType05();
        long j11 = j10;
        T0.b(str2, (i) null, j11, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, aVar3.b(), false, 1, 0, (C6798l) null, type05, h10, i12, 3120, 55290);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(y10, blockAttachment, j10, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfDetails_FNF3uiM$lambda$4(Y y10, BlockAttachment blockAttachment, long j10, boolean z10, int i10, C1500m mVar, int i11) {
        C6496s.h(y10, "$this_PdfDetails");
        C6496s.h(blockAttachment, "$blockAttachment");
        m458PdfDetailsFNF3uiM(y10, blockAttachment, j10, z10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: PdfThumbnail-3xixttE  reason: not valid java name */
    private static final void m459PdfThumbnail3xixttE(Context context, String str, BlockAttachment blockAttachment, d dVar, float f10, C1500m mVar, int i10) {
        String str2 = str;
        C1500m h10 = mVar.h(1296049859);
        C3622i a10 = new C3622i.a(context).l(str2).f(str2).d(blockAttachment.getUrl()).y((int) dVar.t1(f10), (int) dVar.t1(f10)).c(true).h(R.drawable.intercom_image_load_failed).a();
        X3.g imageLoader = IntercomImageLoaderKt.getImageLoader(context);
        String name = blockAttachment.getName();
        i n10 = q.n(C2342e.a(i.f23074a, I.g.c(h.j((float) 5))), f10);
        C1187h a11 = C1187h.f2609a.a();
        ComposableSingletons$PdfAttachmentBlockKt composableSingletons$PdfAttachmentBlockKt = ComposableSingletons$PdfAttachmentBlockKt.INSTANCE;
        u.c(a10, name, imageLoader, n10, (C6798l) null, composableSingletons$PdfAttachmentBlockKt.m449getLambda1$intercom_sdk_base_release(), (r) null, composableSingletons$PdfAttachmentBlockKt.m450getLambda2$intercom_sdk_base_release(), (C6798l) null, (C6798l) null, (C6798l) null, (c) null, a11, 0.0f, (C2547y0) null, 0, false, (Z3.p) null, h10, 12780040, 384, 257872);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(context, str, blockAttachment, dVar, f10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfThumbnail_3xixttE$lambda$7(Context context, String str, BlockAttachment blockAttachment, d dVar, float f10, int i10, C1500m mVar, int i11) {
        C6496s.h(context, "$context");
        C6496s.h(blockAttachment, "$blockAttachment");
        C6496s.h(dVar, "$density");
        m459PdfThumbnail3xixttE(context, str, blockAttachment, dVar, f10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
