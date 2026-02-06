package io.intercom.android.sdk.survey.block;

import B.l;
import C.C1088f;
import Ef.m;
import H0.C1187h;
import Sg.p;
import T8.c;
import X3.g;
import Y.C1500m;
import Y.C1510r0;
import Z3.f;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import j4.C3622i;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import r0.C2435A0;
import r0.C2547y0;
import r0.C2550z0;
import r0.g2;
import w.C2769M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ImageBlockKt$ImageBlock$1 implements q {
    final /* synthetic */ Block $block;
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Uri $dataUri;
    final /* synthetic */ i $modifier;
    final /* synthetic */ C6798l $onClick;
    final /* synthetic */ ImageRenderType $renderType;
    final /* synthetic */ C1510r0 $state$delegate;

    ImageBlockKt$ImageBlock$1(Block block, ImageRenderType imageRenderType, String str, Uri uri, i iVar, C1510r0 r0Var, C6798l lVar) {
        this.$block = block;
        this.$renderType = imageRenderType;
        this.$cacheKey = str;
        this.$dataUri = uri;
        this.$modifier = iVar;
        this.$state$delegate = r0Var;
        this.$onClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final i invoke$lambda$10$lambda$9(float f10, float f11, i iVar) {
        C6496s.h(iVar, "$this$ifTrue");
        return androidx.compose.foundation.layout.q.o(iVar, f10, f11);
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$12(C6798l lVar, Block block, View view, String str, String str2, String str3, String str4) {
        boolean z10;
        C6496s.h(block, "$block");
        C6496s.h(view, "$currentView");
        C6496s.h(str, "$fileSavingText");
        C6496s.h(str2, "$fileSavedText");
        C6496s.h(str3, "$saveFailedText");
        C6496s.h(str4, "$permissionDeniedText");
        if (lVar != null) {
            lVar.invoke(block);
        } else {
            String linkUrl = block.getLinkUrl();
            C6496s.g(linkUrl, "getLinkUrl(...)");
            if (linkUrl.length() > 0) {
                LinkOpener.handleUrl(block.getLinkUrl(), view.getContext(), Injector.get().getApi());
            } else {
                Context context = view.getContext();
                IntercomPreviewActivity.Companion companion = IntercomPreviewActivity.Companion;
                C6496s.e(context);
                String url = block.getUrl();
                C6496s.g(url, "getUrl(...)");
                List e10 = C6565s.e(new IntercomPreviewFile.NetworkFile(url, "image/*"));
                String url2 = block.getUrl();
                C6496s.g(url2, "getUrl(...)");
                if (url2.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                context.startActivity(companion.createIntent(context, new IntercomPreviewArgs(e10, (DeleteType) null, (String) null, false, new DownloadState(z10, str, str2, str3, str4), 14, (DefaultConstructorMarker) null)));
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$14$lambda$13(C1510r0 r0Var, f.b bVar) {
        C6496s.h(r0Var, "$state$delegate");
        C6496s.h(bVar, "it");
        ImageBlockKt.ImageBlock$lambda$2(r0Var, bVar);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final i invoke$lambda$8$lambda$7(float f10, float f11, i iVar) {
        C6496s.h(iVar, "$this$ifTrue");
        return androidx.compose.foundation.layout.q.q(iVar, 0.0f, 0.0f, f10, f11, 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1088f fVar, C1500m mVar, int i10) {
        int i11;
        Pair pair;
        float f10;
        C1088f fVar2 = fVar;
        C1500m mVar2 = mVar;
        C6496s.h(fVar2, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(fVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            d dVar = (d) mVar2.m(C1644k0.e());
            boolean z10 = this.$block.getHeight() > 0 && this.$block.getWidth() > 0;
            ImageRenderType imageRenderType = this.$renderType;
            ImageRenderType imageRenderType2 = ImageRenderType.WITH_MAX_SIZE;
            if (imageRenderType == imageRenderType2 && z10) {
                float t12 = dVar.t1(h.j((float) 268));
                if (this.$block.getWidth() > this.$block.getHeight()) {
                    pair = C6502A.a(h.e(dVar.m1(t12)), h.e(dVar.m1(t12 * ((((float) this.$block.getHeight()) * 1.0f) / ((float) this.$block.getWidth())))));
                } else {
                    pair = C6502A.a(h.e(dVar.m1(((((float) this.$block.getWidth()) * 1.0f) / ((float) this.$block.getHeight())) * t12)), h.e(dVar.m1(t12)));
                }
            } else if (imageRenderType == imageRenderType2) {
                float f11 = (float) 268;
                pair = C6502A.a(h.e(h.j(f11)), h.e(h.j(f11)));
            } else {
                float d10 = fVar.d();
                if (this.$renderType == ImageRenderType.FULL) {
                    f10 = fVar.g();
                } else {
                    f10 = h.j(1.5f * d10);
                }
                if (this.$block.getHeight() > 0) {
                    Block block = this.$block;
                    f10 = h.j(m.g(dVar.E(ImageUtils.getAspectHeight((int) dVar.t1(d10), ImageUtils.getAspectRatio(block.getWidth(), block.getHeight()))), f10));
                }
                pair = C6502A.a(h.e(d10), h.e(f10));
            }
            float r10 = ((h) pair.a()).r();
            float r11 = ((h) pair.b()).r();
            View view = (View) mVar2.m(AndroidCompositionLocals_androidKt.k());
            float[] b10 = C2435A0.b((float[]) null, 1, (DefaultConstructorMarker) null);
            C2435A0.e(b10, 0.0f);
            String a10 = M0.i.a(R.string.intercom_permission_denied, mVar2, 0);
            String a11 = M0.i.a(R.string.intercom_file_saved, mVar2, 0);
            String a12 = M0.i.a(R.string.intercom_saving, mVar2, 0);
            String a13 = M0.i.a(R.string.intercom_something_went_wrong_try_again, mVar2, 0);
            C3622i a14 = new C3622i.a((Context) mVar2.m(AndroidCompositionLocals_androidKt.g())).l(this.$cacheKey).f(this.$cacheKey).d(this.$dataUri).y((int) dVar.t1(r10), (int) dVar.t1(r11)).c(true).h(R.drawable.intercom_image_load_failed).a();
            g imageLoader = IntercomImageLoaderKt.getImageLoader((Context) mVar2.m(AndroidCompositionLocals_androidKt.g()));
            mVar2.T(1738641811);
            String text = this.$block.getText();
            if (p.d0(text)) {
                text = M0.i.a(R.string.intercom_image_attached, mVar2, 0);
            }
            String str = text;
            mVar.M();
            i iVar = this.$modifier;
            boolean z11 = this.$renderType == imageRenderType2 && !z10;
            mVar2.T(1738649296);
            boolean c10 = mVar2.c(r10) | mVar2.c(r11);
            Object A10 = mVar.A();
            if (c10 || A10 == C1500m.f10026a.a()) {
                A10 = new q(r10, r11);
                mVar2.r(A10);
            }
            mVar.M();
            i ifTrue = ModifierExtensionsKt.ifTrue(iVar, z11, (C6798l) A10);
            boolean z12 = this.$renderType != imageRenderType2 || z10;
            mVar2.T(1738655368);
            boolean c11 = mVar2.c(r10) | mVar2.c(r11);
            Object A11 = mVar.A();
            if (c11 || A11 == C1500m.f10026a.a()) {
                A11 = new r(r10, r11);
                mVar2.r(A11);
            }
            mVar.M();
            i d11 = androidx.compose.foundation.d.d(FocusableKt.b(T8.d.d(b.d(ModifierExtensionsKt.ifTrue(ifTrue, z12, (C6798l) A11), IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m681getBubbleBackground0d7_KjU(), (g2) null, 2, (Object) null), (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof f.b.a) || (ImageBlockKt.ImageBlock$lambda$1(this.$state$delegate) instanceof f.b.c), C2550z0.b(869059788), (g2) null, c.b(T8.b.f34209a, C2550z0.d(2499805183L), (C2769M) null, 0.0f, 6, (Object) null), (q) null, (q) null, 52, (Object) null), false, (l) null, 3, (Object) null), false, (String) null, (O0.g) null, new s(this.$onClick, this.$block, view, a12, a11, a13, a10), 7, (Object) null);
            C1187h a15 = this.$renderType == ImageRenderType.CROPPED ? C1187h.f2609a.a() : C1187h.f2609a.d();
            C2547y0 a16 = ImageBlockKt.getHasUri(this.$block) ? C2547y0.f25576b.a(b10) : null;
            mVar2.T(1738644608);
            C1510r0 r0Var = this.$state$delegate;
            Object A12 = mVar.A();
            if (A12 == C1500m.f10026a.a()) {
                A12 = new t(r0Var);
                mVar2.r(A12);
            }
            mVar.M();
            Z3.c.d(a14, str, imageLoader, d11, (C6798l) null, (C6798l) A12, (k0.c) null, a15, 0.0f, a16, 0, false, (Z3.p) null, mVar, 197128, 0, 7504);
            return;
        }
        mVar.I();
    }
}
