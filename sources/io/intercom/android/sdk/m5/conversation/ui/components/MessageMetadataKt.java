package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import O0.m;
import O0.v;
import Q0.A;
import Q0.T;
import V.B0;
import V.T0;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import b1.t;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.e2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "", "title", "Lk0/i;", "modifier", "suffix", "", "timestamp", "Llf/M;", "MessageMetadata", "(Ljava/util/List;Ljava/lang/String;Lk0/i;Ljava/lang/String;Ljava/lang/Long;LY/m;II)V", "MessageMetadataPreview", "(LY/m;I)V", "MessageMetadataLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MessageMetadataKt {
    public static final void MessageMetadata(List<AvatarWrapper> list, String str, i iVar, String str2, Long l10, C1500m mVar, int i10, int i11) {
        i.a aVar;
        String str3;
        Long l11;
        long j10;
        List<AvatarWrapper> list2 = list;
        C6496s.h(list2, "avatars");
        C6496s.h(str, b.f37461S);
        C1500m h10 = mVar.h(1631390024);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i11 & 16) != 0) {
            l11 = null;
        } else {
            l11 = l10;
        }
        T c10 = T.c(IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5(), 0, 0, p.f8210b.d(), (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777211, (Object) null);
        float f10 = (float) 4;
        F b10 = W.b(C1085c.f882a.n(c1.h.j(f10)), c.f23044a.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar);
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
        yf.p b11 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        h10.T(1642417258);
        if (!list2.isEmpty()) {
            AvatarGroupKt.m136AvatarGroupJ8mCjc(list, androidx.compose.foundation.layout.n.m(i.f23074a, 0.0f, 0.0f, c1.h.j(f10), 0.0f, 11, (Object) null), c1.h.j((float) 24), 0, h10, 440, 8);
        }
        h10.M();
        i.a aVar3 = i.f23074a;
        i a13 = z10.a(aVar3, 1.0f, false);
        t.a aVar4 = t.f19154a;
        Z z11 = z10;
        i iVar2 = aVar;
        C1500m mVar2 = h10;
        T0.b(str, a13, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, aVar4.b(), false, 1, 0, (C6798l) null, c10, mVar2, (i10 >> 3) & 14, 3120, 55292);
        mVar2.T(1642431398);
        if (str3 != null) {
            mVar2.T(1642431772);
            if (!Sg.p.d0(str)) {
                T0.b("•", m.d(aVar3, false, new y0(), 1, (Object) null), 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, c10, mVar2, 6, 0, 65532);
            }
            mVar2.M();
            T0.b(str3, (i) null, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, aVar4.b(), false, 1, 0, (C6798l) null, c10, mVar2, 0, 3120, 55294);
        }
        mVar2.M();
        mVar2.T(1642448818);
        if (l11 != null) {
            long longValue = l11.longValue();
            mVar2.T(1642449084);
            if (!Sg.p.d0(str) || (str3 != null && (!Sg.p.d0(str3)))) {
                j10 = longValue;
                T0.b("•", m.d(aVar3, false, new z0(), 1, (Object) null), 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, c10, mVar2, 6, 0, 65532);
            } else {
                j10 = longValue;
            }
            mVar2.M();
            T0.b(TimeFormatterExtKt.formattedDateFromLong(j10, (Context) mVar2.m(AndroidCompositionLocals_androidKt.g())), z11.a(aVar3, 0.5f, false), 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, aVar4.b(), false, 1, 0, (C6798l) null, c10, mVar2, 0, 3120, 55292);
        }
        mVar2.M();
        mVar2.u();
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new A0(list, str, iVar2, str3, l11, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMetadata$lambda$4$lambda$1$lambda$0(v vVar) {
        C6496s.h(vVar, "$this$semantics");
        O0.t.Y(vVar, "");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMetadata$lambda$4$lambda$3$lambda$2(v vVar) {
        C6496s.h(vVar, "$this$semantics");
        O0.t.Y(vVar, "");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMetadata$lambda$5(List list, String str, i iVar, String str2, Long l10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$avatars");
        C6496s.h(str, "$title");
        MessageMetadata(list, str, iVar, str2, l10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void MessageMetadataLongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-764241754);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MessageMetadataKt.INSTANCE.m245getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMetadataLongTextPreview$lambda$7(int i10, C1500m mVar, int i11) {
        MessageMetadataLongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void MessageMetadataPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1316869201);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MessageMetadataKt.INSTANCE.m243getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMetadataPreview$lambda$6(int i10, C1500m mVar, int i11) {
        MessageMetadataPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
