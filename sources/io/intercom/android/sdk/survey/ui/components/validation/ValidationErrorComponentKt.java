package io.intercom.android.sdk.survey.ui.components.validation;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import Q.b;
import V.B0;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.components.icons.ErrorKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.Phrase;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;", "validationStringError", "Lr0/x0;", "errorColor", "Llf/M;", "ValidationErrorComponent-FNF3uiM", "(Lk0/i;Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;JLY/m;II)V", "ValidationErrorComponent", "ErrorPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValidationErrorComponentKt {
    public static final void ErrorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1851250451);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ValidationErrorComponentKt.INSTANCE.m469getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorPreview$lambda$3(int i10, C1500m mVar, int i11) {
        ErrorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: ValidationErrorComponent-FNF3uiM  reason: not valid java name */
    public static final void m470ValidationErrorComponentFNF3uiM(i iVar, ValidationError.ValidationStringError validationStringError, long j10, C1500m mVar, int i10, int i11) {
        i iVar2;
        int i12 = i10;
        C6496s.h(validationStringError, "validationStringError");
        C1500m h10 = mVar.h(-1195832801);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        float f10 = (float) 2;
        i m10 = n.m(q.h(iVar2, 0.0f, 1, (Object) null), 0.0f, h.j(f10), 0.0f, h.j(f10), 5, (Object) null);
        F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, m10);
        C1241g.a aVar = C1241g.f3853J;
        C6787a a11 = aVar.a();
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
        F1.b(a12, b10, aVar.c());
        F1.b(a12, p10, aVar.e());
        p b11 = aVar.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar.d());
        Z z10 = Z.f873a;
        V.b(ErrorKt.getError(b.a.f5156a), (String) null, q.r(i.f23074a, h.j((float) 16)), j10, h10, ((i12 << 3) & 7168) | 432, 0);
        Phrase from = Phrase.from((Context) h10.m(AndroidCompositionLocals_androidKt.g()), validationStringError.getStringRes());
        for (Pair pair : validationStringError.getParams()) {
            from.put((String) pair.c(), (CharSequence) pair.d());
        }
        T0.b(from.format().toString(), n.m(q.h(i.f23074a, 0.0f, 1, (Object) null), h.j((float) 4), 0.0f, 0.0f, 0.0f, 14, (Object) null), j10, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), h10, (i12 & 896) | 48, 0, 65528);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(iVar2, validationStringError, j10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ValidationErrorComponent_FNF3uiM$lambda$2(i iVar, ValidationError.ValidationStringError validationStringError, long j10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(validationStringError, "$validationStringError");
        m470ValidationErrorComponentFNF3uiM(iVar, validationStringError, j10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
