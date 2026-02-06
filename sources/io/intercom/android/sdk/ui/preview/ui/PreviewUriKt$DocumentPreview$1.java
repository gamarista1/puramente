package io.intercom.android.sdk.ui.preview.ui;

import C.C1085c;
import C.C1088f;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.C1187h;
import H0.F;
import J0.C1241g;
import M0.e;
import V.T0;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.foundation.b;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2547y0;
import r0.g2;
import wf.C6763c;
import x.C2842F;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PreviewUriKt$DocumentPreview$1 implements q {
    final /* synthetic */ C1187h $contentScale;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $showTitle;
    final /* synthetic */ Uri $uri;

    PreviewUriKt$DocumentPreview$1(Context context, Uri uri, C1187h hVar, boolean z10) {
        this.$context = context;
        this.$uri = uri;
        this.$contentScale = hVar;
        this.$showTitle = z10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1088f fVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        Throwable th2;
        C1088f fVar2 = fVar;
        C1500m mVar2 = mVar;
        C6496s.h(fVar2, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(fVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            float d10 = fVar.d();
            Cursor query = this.$context.getContentResolver().query(this.$uri, (String[]) null, (String) null, (String[]) null, (String) null);
            String str = "";
            if (query != null) {
                try {
                    query.moveToFirst();
                    if (query.getColumnIndex("_display_name") != -1) {
                        str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    }
                    C6514M m10 = C6514M.f71813a;
                    C6763c.a(query, (Throwable) null);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    C6763c.a(query, th2);
                    throw th4;
                }
            }
            String str2 = str;
            i.a aVar = i.f23074a;
            i o10 = androidx.compose.foundation.layout.q.o(aVar, d10, h.j(1.414f * d10));
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            i d11 = b.d(o10, intercomTheme.getColors(mVar2, 6).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
            c.a aVar2 = c.f23044a;
            i e10 = fVar2.e(d11, aVar2.e());
            c.b g10 = aVar2.g();
            C1085c.f b10 = C1085c.f882a.b();
            C1187h hVar = this.$contentScale;
            boolean z10 = this.$showTitle;
            F a10 = C1090h.a(b10, g10, mVar2, 54);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e11 = k0.h.e(mVar2, e10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b11 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b11);
            }
            F1.b(a13, e11, aVar3.d());
            C1093k kVar = C1093k.f978a;
            if (h.i(d10, h.j((float) 48)) > 0) {
                i12 = 56;
            } else {
                i12 = 24;
            }
            i n10 = androidx.compose.foundation.layout.q.n(aVar, h.j((float) i12));
            boolean z11 = z10;
            C2842F.a(e.c(R.drawable.intercom_ic_document, mVar2, 0), "Doc Icon", n10, (c) null, hVar, 0.0f, C2547y0.a.c(C2547y0.f25576b, intercomTheme.getColors(mVar2, 6).m672getAction0d7_KjU(), 0, 2, (Object) null), mVar, 56, 40);
            mVar2.T(-547888989);
            if (z11) {
                a0.a(androidx.compose.foundation.layout.q.i(aVar, h.j((float) 16)), mVar2, 6);
                T0.b(str2, (i) null, intercomTheme.getColors(mVar2, 6).m700getPrimaryText0d7_KjU(), 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, 6).getType04Point5(), mVar, 0, 0, 65530);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
