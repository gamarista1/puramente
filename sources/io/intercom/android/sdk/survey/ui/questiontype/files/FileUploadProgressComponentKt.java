package io.intercom.android.sdk.survey.ui.questiontype.files;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "title", "Lkotlin/Function0;", "Llf/M;", "onStopUploading", "FileUploadProgressComponent", "(Ljava/lang/String;Lyf/a;LY/m;I)V", "UploadingActionSheetContentPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FileUploadProgressComponentKt {
    public static final void FileUploadProgressComponent(String str, C6787a aVar, C1500m mVar, int i10) {
        int i11;
        C1500m mVar2;
        int i12;
        int i13;
        String str2 = str;
        C6787a aVar2 = aVar;
        int i14 = i10;
        C6496s.h(str2, b.f37461S);
        C6496s.h(aVar2, "onStopUploading");
        C1500m h10 = mVar.h(-1826067636);
        if ((i14 & 14) == 0) {
            if (h10.S(str2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h10.C(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 91) != 18 || !h10.i()) {
            i.a aVar3 = i.f23074a;
            i h11 = q.h(aVar3, 0.0f, 1, (Object) null);
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, h11);
            C1241g.a aVar4 = C1241g.f3853J;
            C6787a a12 = aVar4.a();
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
            F1.b(a13, a10, aVar4.c());
            F1.b(a13, p10, aVar4.e());
            p b10 = aVar4.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar4.d());
            C1093k kVar = C1093k.f978a;
            C1500m mVar3 = h10;
            T0.b(str, n.i(q.h(aVar3, 0.0f, 1, (Object) null), c1.h.j((float) 16)), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), mVar3, (i15 & 14) | 48, 0, 65532);
            mVar2 = mVar3;
            IntercomDividerKt.IntercomDivider(n.k(q.h(aVar3, 0.0f, 1, (Object) null), 0.0f, c1.h.j((float) 4), 1, (Object) null), mVar2, 6, 0);
            FileUploadErrorComponentKt.m501ActionRowFHprtrg((i) null, R.drawable.intercom_close, R.string.intercom_stop_upload, 0, 0, aVar, mVar2, (i15 << 12) & 458752, 25);
            mVar2.u();
        } else {
            h10.I();
            mVar2 = h10;
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new E(str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FileUploadProgressComponent$lambda$1(String str, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(str, "$title");
        C6496s.h(aVar, "$onStopUploading");
        FileUploadProgressComponent(str, aVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UploadingActionSheetContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2021767087);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FileUploadProgressComponentKt.INSTANCE.m498getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadingActionSheetContentPreview$lambda$2(int i10, C1500m mVar, int i11) {
        UploadingActionSheetContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
