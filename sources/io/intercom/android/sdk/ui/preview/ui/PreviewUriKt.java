package io.intercom.android.sdk.ui.preview.ui;

import C.C1085c;
import C.C1087e;
import C.N;
import D.A;
import D.C1109b;
import D.x;
import H0.C1187h;
import X3.g;
import Y.A1;
import Y.C1500m;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.p1;
import Z3.p;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.e;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.media3.exoplayer.ExoPlayer;
import f2.w;
import i3.F;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import j4.C3622i;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import r0.C2547y0;
import yf.C6798l;
import z.n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0006\u001a#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "file", "Llf/M;", "PreviewUri", "(Lk0/i;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;LY/m;II)V", "LH0/h;", "contentScale", "ThumbnailPreview", "(Lk0/i;LH0/h;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;LY/m;II)V", "Landroid/net/Uri;", "uri", "VideoPlayer", "(Lk0/i;Landroid/net/Uri;LY/m;II)V", "", "showTitle", "DocumentPreview", "(Lk0/i;Landroid/net/Uri;ZLH0/h;LY/m;II)V", "PdfPreview", "LY/A1;", "", "Landroid/graphics/Bitmap;", "loadFilesAsBitmaps", "(Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;LY/m;I)LY/A1;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PreviewUriKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1790m.a.values().length];
            try {
                iArr[C1790m.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void DocumentPreview(i iVar, Uri uri, boolean z10, C1187h hVar, C1500m mVar, int i10, int i11) {
        C1500m h10 = mVar.h(1870066421);
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        if ((i11 & 8) != 0) {
            hVar = C1187h.f2609a.d();
        }
        C1087e.a(q.f(iVar, 0.0f, 1, (Object) null), (c) null, false, g0.c.e(1599096779, true, new PreviewUriKt$DocumentPreview$1((Context) h10.m(AndroidCompositionLocals_androidKt.g()), uri, hVar, z10), h10, 54), h10, 3072, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H(iVar, uri, z10, hVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DocumentPreview$lambda$11(i iVar, Uri uri, boolean z10, C1187h hVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(iVar, "$modifier");
        C6496s.h(uri, "$uri");
        DocumentPreview(iVar, uri, z10, hVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void PdfPreview(i iVar, IntercomPreviewFile intercomPreviewFile, C1500m mVar, int i10, int i11) {
        i.a aVar;
        IntercomPreviewFile intercomPreviewFile2 = intercomPreviewFile;
        int i12 = i11;
        C1500m h10 = mVar.h(25606530);
        if ((i12 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        C1109b.a(q.f(aVar, 0.0f, 1, (Object) null), (A) null, (N) null, false, (C1085c.m) null, (c.b) null, (n) null, false, new I((List) loadFilesAsBitmaps(intercomPreviewFile2, h10, 8).getValue()), h10, 0, 254);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(aVar, intercomPreviewFile2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfPreview$lambda$13(List list, x xVar) {
        C6496s.h(list, "$bitmaps");
        C6496s.h(xVar, "$this$LazyColumn");
        xVar.a(list.size(), (C6798l) null, new PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$3(PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$1.INSTANCE, list), g0.c.c(-632812321, true, new PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$4(list)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PdfPreview$lambda$14(i iVar, IntercomPreviewFile intercomPreviewFile, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(intercomPreviewFile, "$file");
        PdfPreview(iVar, intercomPreviewFile, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void PreviewUri(i iVar, IntercomPreviewFile intercomPreviewFile, C1500m mVar, int i10, int i11) {
        C6496s.h(intercomPreviewFile, "file");
        C1500m h10 = mVar.h(1385802164);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        Uri uri = intercomPreviewFile.getUri();
        String mimeType = intercomPreviewFile.getMimeType((Context) h10.m(AndroidCompositionLocals_androidKt.g()));
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            h10.T(1931959814);
            ThumbnailPreview(iVar, (C1187h) null, intercomPreviewFile, h10, (i10 & 14) | 512, 2);
            h10.M();
        } else if (ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isAudio(mimeType)) {
            h10.T(1932086573);
            VideoPlayer(iVar, uri, h10, (i10 & 14) | 64, 0);
            h10.M();
        } else if (ContentTypeExtensionKt.isPdf(mimeType)) {
            h10.T(1932182828);
            PdfPreview(iVar, intercomPreviewFile, h10, (i10 & 14) | 64, 0);
            h10.M();
        } else {
            h10.T(1932268233);
            DocumentPreview(iVar, uri, false, (C1187h) null, h10, (i10 & 14) | 64, 12);
            h10.M();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(iVar, intercomPreviewFile, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewUri$lambda$0(i iVar, IntercomPreviewFile intercomPreviewFile, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(intercomPreviewFile, "$file");
        PreviewUri(iVar, intercomPreviewFile, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void ThumbnailPreview(i iVar, C1187h hVar, IntercomPreviewFile intercomPreviewFile, C1500m mVar, int i10, int i11) {
        i iVar2;
        C1187h hVar2;
        IntercomPreviewFile intercomPreviewFile2 = intercomPreviewFile;
        C6496s.h(intercomPreviewFile2, "file");
        C1500m h10 = mVar.h(1221057551);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 2) != 0) {
            hVar2 = C1187h.f2609a.d();
        } else {
            hVar2 = hVar;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        String mimeType = intercomPreviewFile2.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType) || ContentTypeExtensionKt.isVideo(mimeType) || ContentTypeExtensionKt.isPdf(mimeType)) {
            h10.T(-1993113608);
            i f10 = q.f(iVar2, 0.0f, 1, (Object) null);
            g imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            C3622i.a d10 = new C3622i.a((Context) h10.m(AndroidCompositionLocals_androidKt.g())).d(intercomPreviewFile.getUri());
            d10.c(true);
            Z3.c.d(d10.a(), "Image", imageLoader, f10, (C6798l) null, (C6798l) null, (c) null, hVar2, 0.0f, (C2547y0) null, 0, false, (p) null, h10, ((i10 << 18) & 29360128) | 568, 0, 8048);
            h10.M();
        } else {
            h10.T(-1992720435);
            i iVar3 = iVar2;
            DocumentPreview(iVar3, intercomPreviewFile.getUri(), false, hVar2, h10, (i10 & 14) | 448 | ((i10 << 6) & 7168), 0);
            h10.M();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(iVar2, hVar2, intercomPreviewFile, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ThumbnailPreview$lambda$2(i iVar, C1187h hVar, IntercomPreviewFile intercomPreviewFile, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(intercomPreviewFile, "$file");
        ThumbnailPreview(iVar, hVar, intercomPreviewFile, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void VideoPlayer(i iVar, Uri uri, C1500m mVar, int i10, int i11) {
        C1500m h10 = mVar.h(-1579699387);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        A1 o10 = p1.o(h10.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), h10, 8);
        w.c a10 = w.b(uri).a();
        a10.c(String.valueOf(uri.hashCode()));
        a10.e(uri);
        w a11 = a10.a();
        C6496s.g(a11, "build(...)");
        ExoPlayer e10 = new ExoPlayer.b((Context) h10.m(AndroidCompositionLocals_androidKt.g())).e();
        e10.W(a11);
        e10.j();
        C6496s.g(e10, "apply(...)");
        e.a(new E(e10), iVar, (C6798l) null, h10, (i10 << 3) & 112, 4);
        P.c("", new F(e10, o10), h10, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(iVar, uri, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M VideoPlayer$lambda$10(i iVar, Uri uri, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(uri, "$uri");
        VideoPlayer(iVar, uri, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final F VideoPlayer$lambda$6(ExoPlayer exoPlayer, Context context) {
        C6496s.h(exoPlayer, "$exoPlayer");
        C6496s.h(context, "it");
        F f10 = new F(context);
        f10.setPlayer(exoPlayer);
        f10.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return f10;
    }

    /* access modifiers changed from: private */
    public static final L VideoPlayer$lambda$9(ExoPlayer exoPlayer, A1 a12, M m10) {
        C6496s.h(exoPlayer, "$exoPlayer");
        C6496s.h(a12, "$lifecycleOwner");
        C6496s.h(m10, "$this$DisposableEffect");
        exoPlayer.l();
        C c10 = new C(exoPlayer);
        C1790m lifecycle = ((C1798v) a12.getValue()).getLifecycle();
        lifecycle.a(c10);
        return new PreviewUriKt$VideoPlayer$lambda$9$$inlined$onDispose$1(lifecycle, c10, exoPlayer);
    }

    /* access modifiers changed from: private */
    public static final void VideoPlayer$lambda$9$lambda$7(ExoPlayer exoPlayer, C1798v vVar, C1790m.a aVar) {
        C6496s.h(exoPlayer, "$exoPlayer");
        C6496s.h(vVar, "<unused var>");
        C6496s.h(aVar, "event");
        if (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()] == 1) {
            exoPlayer.pause();
        }
    }

    private static final A1 loadFilesAsBitmaps(IntercomPreviewFile intercomPreviewFile, C1500m mVar, int i10) {
        mVar.T(-964565197);
        A1 l10 = p1.l(C6565s.n(), intercomPreviewFile, new PreviewUriKt$loadFilesAsBitmaps$1(intercomPreviewFile, (Context) mVar.m(AndroidCompositionLocals_androidKt.g()), (C6658d<? super PreviewUriKt$loadFilesAsBitmaps$1>) null), mVar, 582);
        mVar.M();
        return l10;
    }
}
