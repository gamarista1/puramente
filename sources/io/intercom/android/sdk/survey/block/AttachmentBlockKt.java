package io.intercom.android.sdk.survey.block;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import M0.e;
import O0.g;
import Q0.A;
import Q0.T;
import V.B0;
import V.T0;
import V.V;
import V0.n;
import V0.o;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2342e;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "", "isAdmin", "Llf/M;", "AttachmentBlock", "(Lk0/i;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLY/m;II)V", "Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;", "blockAttachment", "Lr0/x0;", "tintColor", "TextAttachmentBlock-FNF3uiM", "(Lk0/i;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;JLY/m;II)V", "TextAttachmentBlock", "VideoAttachmentBlock", "(Lk0/i;Lio/intercom/android/sdk/blocks/lib/models/BlockAttachment;LY/m;II)V", "AttachmentBlockPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AttachmentBlockKt {
    public static final void AttachmentBlock(i iVar, BlockRenderData blockRenderData, boolean z10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        long y10;
        C6496s.h(blockRenderData, "blockRenderData");
        C1500m h10 = mVar.h(-1719159681);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        F a10 = C1090h.a(C1085c.f882a.n(h.j((float) 8)), c.f23044a.k(), h10, 6);
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
        C2544x0 r12 = blockRenderData.getTextStyle().m444getTextColorQN2ZGVo();
        if (r12 == null) {
            r12 = blockRenderData.m432getTextColorQN2ZGVo();
        }
        h10.T(-1626976079);
        if (r12 == null) {
            y10 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m700getPrimaryText0d7_KjU();
        } else {
            y10 = r12.y();
        }
        long j10 = y10;
        h10.M();
        h10.T(-1626970016);
        List<BlockAttachment> attachments = blockRenderData.getBlock().getAttachments();
        C6496s.g(attachments, "getAttachments(...)");
        for (BlockAttachment blockAttachment : attachments) {
            String contentType = blockAttachment.getContentType();
            C6496s.g(contentType, "getContentType(...)");
            if (ContentTypeExtensionKt.isVideo(contentType)) {
                h10.T(1321275707);
                C6496s.e(blockAttachment);
                VideoAttachmentBlock(C2342e.a(i.f23074a, IntercomTheme.INSTANCE.getShapes(h10, IntercomTheme.$stable).e()), blockAttachment, h10, 64, 0);
                h10.M();
            } else {
                String contentType2 = blockAttachment.getContentType();
                C6496s.g(contentType2, "getContentType(...)");
                if (ContentTypeExtensionKt.isPdf(contentType2)) {
                    h10.T(1321435977);
                    C6496s.e(blockAttachment);
                    PdfAttachmentBlockKt.m457PdfAttachmentBlockww6aTOc(blockAttachment, z10, (i) null, j10, h10, ((i10 >> 3) & 112) | 8, 4);
                    h10.M();
                } else {
                    h10.T(1321554459);
                    C6496s.e(blockAttachment);
                    m428TextAttachmentBlockFNF3uiM((i) null, blockAttachment, j10, h10, 64, 1);
                    h10.M();
                }
            }
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6268d(aVar, blockRenderData, z10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AttachmentBlock$lambda$2(i iVar, BlockRenderData blockRenderData, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        AttachmentBlock(iVar, blockRenderData, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void AttachmentBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-550090117);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AttachmentBlockKt.INSTANCE.m446getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6269e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AttachmentBlockPreview$lambda$7(int i10, C1500m mVar, int i11) {
        AttachmentBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: TextAttachmentBlock-FNF3uiM  reason: not valid java name */
    public static final void m428TextAttachmentBlockFNF3uiM(i iVar, BlockAttachment blockAttachment, long j10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        long j11;
        int i12;
        BlockAttachment blockAttachment2 = blockAttachment;
        C6496s.h(blockAttachment2, "blockAttachment");
        C1500m h10 = mVar.h(-1146554998);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            j11 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m700getPrimaryText0d7_KjU();
            i12 = i10 & -897;
        } else {
            j11 = j10;
            i12 = i10;
        }
        i d10 = d.d(aVar, false, (String) null, (g) null, new C6266b(blockAttachment2, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), 7, (Object) null);
        F b10 = W.b(C1085c.f882a.n(h.j((float) 4)), c.f23044a.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, d10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a11 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, b10, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b11 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        V.a(e.c(R.drawable.intercom_ic_attachment, h10, 0), "Attachment Icon", (i) null, j11, h10, ((i12 << 3) & 7168) | 56, 4);
        String name = blockAttachment.getName();
        C6496s.g(name, "getName(...)");
        T0.b(name, (i) null, j11, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), 0, 0, (V0.p) null, (n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, k.f19119b.d(), (e2) null, (C2606g) null, 0, 0, 0, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16773119, (Object) null), h10, i12 & 896, 0, 65530);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6267c(aVar, blockAttachment, j11, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttachmentBlock_FNF3uiM$lambda$3(BlockAttachment blockAttachment, Context context) {
        C6496s.h(blockAttachment, "$blockAttachment");
        C6496s.h(context, "$context");
        LinkOpener.handleUrl(blockAttachment.getUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttachmentBlock_FNF3uiM$lambda$5(i iVar, BlockAttachment blockAttachment, long j10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockAttachment, "$blockAttachment");
        m428TextAttachmentBlockFNF3uiM(iVar, blockAttachment, j10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void VideoAttachmentBlock(i iVar, BlockAttachment blockAttachment, C1500m mVar, int i10, int i11) {
        C6496s.h(blockAttachment, "blockAttachment");
        C1500m h10 = mVar.h(-745319067);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        String url = blockAttachment.getUrl();
        C6496s.g(url, "getUrl(...)");
        VideoFileBlockKt.VideoFileBlock(iVar, url, (String) null, h10, (i10 & 14) | 384, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6265a(iVar, blockAttachment, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M VideoAttachmentBlock$lambda$6(i iVar, BlockAttachment blockAttachment, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockAttachment, "$blockAttachment");
        VideoAttachmentBlock(iVar, blockAttachment, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
