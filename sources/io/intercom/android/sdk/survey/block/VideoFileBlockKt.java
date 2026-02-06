package io.intercom.android.sdk.survey.block;

import H0.C1187h;
import H0.F;
import J0.C1241g;
import M0.e;
import O0.g;
import V.C1400p0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Z3.f;
import Z3.h;
import Z3.p;
import android.content.Context;
import android.util.Patterns;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import j4.C3622i;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2435A0;
import r0.C2547y0;
import r0.g2;
import x.C2842F;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk0/i;", "modifier", "", "videoUrl", "thumbnailUrl", "Llf/M;", "VideoFileBlock", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;LY/m;II)V", "", "isRemoteUrl", "(Ljava/lang/String;)Z", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VideoFileBlockKt {
    public static final void VideoFileBlock(i iVar, String str, String str2, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i iVar3;
        i iVar4;
        String str3;
        int i13;
        int i14;
        int i15;
        String str4 = str;
        String str5 = str2;
        int i16 = i10;
        C6496s.h(str4, "videoUrl");
        C1500m h10 = mVar.h(-224511788);
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
            if (h10.S(str4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i16 & 896) == 0) {
            if (h10.S(str5)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) != 146 || !h10.i()) {
            if (i17 != 0) {
                iVar4 = i.f23074a;
            } else {
                iVar4 = iVar2;
            }
            Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
            C3622i.a aVar = new C3622i.a(context);
            if (str5 == null || str2.length() == 0) {
                str3 = str4;
            } else {
                str3 = str5;
            }
            C3622i.a d10 = aVar.d(str3);
            d10.c(true);
            d10.h(R.drawable.intercom_image_load_failed);
            f c10 = h.c(d10.a(), IntercomImageLoaderKt.getImageLoader(context), (C6798l) null, (C6798l) null, (C1187h) null, 0, (p) null, h10, 72, 124);
            i d11 = d.d(iVar4, false, (String) null, (g) null, new L(str4, context), 7, (Object) null);
            c.a aVar2 = c.f23044a;
            F h11 = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, d11);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
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
            F1.b(a12, h11, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            yf.p b10 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
            C2547y0 y0Var = null;
            float[] b11 = C2435A0.b((float[]) null, 1, (DefaultConstructorMarker) null);
            C2435A0.e(b11, 0.0f);
            i.a aVar4 = i.f23074a;
            i o10 = q.o(aVar4, c1.h.j((float) 640), c1.h.j((float) 180));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            i e11 = fVar.e(b.d(o10, intercomTheme.getColors(h10, i18).m681getBubbleBackground0d7_KjU(), (g2) null, 2, (Object) null), aVar2.e());
            C1187h.a aVar5 = C1187h.f2609a;
            C1187h a13 = aVar5.a();
            c e12 = aVar2.e();
            if (!isRemoteUrl(str)) {
                y0Var = C2547y0.f25576b.a(b11);
            }
            C2547y0 y0Var2 = y0Var;
            f fVar2 = c10;
            IntercomTheme intercomTheme2 = intercomTheme;
            i.a aVar6 = aVar4;
            int i19 = i18;
            androidx.compose.foundation.layout.f fVar3 = fVar;
            i iVar5 = iVar4;
            C2842F.a(fVar2, "Video Thumbnail", e11, e12, a13, 0.0f, y0Var2, h10, 27696, 32);
            if (isRemoteUrl(str)) {
                h10.T(1592327165);
                androidx.compose.foundation.layout.f fVar4 = fVar3;
                IntercomTheme intercomTheme3 = intercomTheme2;
                int i20 = i19;
                i c11 = b.c(q.n(fVar4.e(aVar6, aVar2.e()), c1.h.j((float) 48)), intercomTheme3.getColors(h10, i20).m678getBackground0d7_KjU(), I.g.a(50));
                C2842F.a(e.c(R.drawable.intercom_play_arrow, h10, 0), "Play Video", c11, (c) null, aVar5.f(), 0.0f, C2547y0.a.c(C2547y0.f25576b, intercomTheme3.getColors(h10, i20).m673getActionContrastWhite0d7_KjU(), 0, 2, (Object) null), h10, 24632, 40);
                h10.M();
            } else {
                h10.T(1592846880);
                C1400p0.a(q.n(fVar3.e(aVar6, aVar2.e()), c1.h.j((float) 32)), intercomTheme2.getColors(h10, i19).m678getBackground0d7_KjU(), 0.0f, 0, 0, h10, 0, 28);
                h10.M();
            }
            h10.u();
            iVar3 = iVar5;
        } else {
            h10.I();
            iVar3 = iVar2;
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new M(iVar3, str, str2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M VideoFileBlock$lambda$1(String str, Context context) {
        C6496s.h(str, "$videoUrl");
        C6496s.h(context, "$context");
        if (isRemoteUrl(str)) {
            LinkOpener.handleUrl(str, context, Injector.get().getApi());
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M VideoFileBlock$lambda$3(i iVar, String str, String str2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$videoUrl");
        VideoFileBlock(iVar, str, str2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final boolean isRemoteUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }
}
