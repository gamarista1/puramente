package io.intercom.android.sdk.survey.block;

import C.C1087e;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import Z3.f;
import android.net.Uri;
import io.intercom.android.sdk.blocks.lib.models.Block;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00020\u0007*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/Block;", "block", "Lk0/i;", "modifier", "Lkotlin/Function1;", "Llf/M;", "onClick", "", "shouldLoadPreviewUrl", "Lio/intercom/android/sdk/survey/block/ImageRenderType;", "renderType", "ImageBlock", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lk0/i;Lyf/l;ZLio/intercom/android/sdk/survey/block/ImageRenderType;LY/m;II)V", "getHasUri", "(Lio/intercom/android/sdk/blocks/lib/models/Block;)Z", "hasUri", "LZ3/f$b;", "state", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImageBlockKt {
    public static final void ImageBlock(Block block, i iVar, C6798l lVar, boolean z10, ImageRenderType imageRenderType, C1500m mVar, int i10, int i11) {
        i.a aVar;
        C6798l lVar2;
        boolean z11;
        ImageRenderType imageRenderType2;
        Uri parse;
        String previewUrl;
        C6496s.h(block, "block");
        C1500m h10 = mVar.h(-762701011);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        boolean z12 = false;
        if ((i11 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 16) != 0) {
            imageRenderType2 = ImageRenderType.CROPPED;
        } else {
            imageRenderType2 = imageRenderType;
        }
        if (!getHasUri(block) && z11 && (previewUrl = block.getPreviewUrl()) != null && previewUrl.length() != 0) {
            z12 = true;
        }
        if (getHasUri(block)) {
            parse = block.getLocalUri();
        } else if (z12) {
            parse = Uri.parse(block.getPreviewUrl());
        } else {
            String url = block.getUrl();
            if (url == null) {
                url = "";
            }
            parse = Uri.parse(url);
        }
        Uri uri = parse;
        String path = uri.getPath();
        h10.T(2072019078);
        Object A10 = h10.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = u1.d(f.b.a.f10446a, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        h10.M();
        C1087e.a(aVar, (c) null, false, g0.c.e(-179054825, true, new ImageBlockKt$ImageBlock$1(block, imageRenderType2, path, uri, aVar, (C1510r0) A10, lVar2), h10, 54), h10, ((i10 >> 3) & 14) | 3072, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(block, aVar, lVar2, z11, imageRenderType2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final f.b ImageBlock$lambda$1(C1510r0 r0Var) {
        return (f.b) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void ImageBlock$lambda$2(C1510r0 r0Var, f.b bVar) {
        r0Var.setValue(bVar);
    }

    /* access modifiers changed from: private */
    public static final C6514M ImageBlock$lambda$3(Block block, i iVar, C6798l lVar, boolean z10, ImageRenderType imageRenderType, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(block, "$block");
        ImageBlock(block, iVar, lVar, z10, imageRenderType, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final boolean getHasUri(Block block) {
        if (block.getLocalUri() == null || C6496s.c(block.getLocalUri(), Uri.EMPTY)) {
            return false;
        }
        return true;
    }
}
