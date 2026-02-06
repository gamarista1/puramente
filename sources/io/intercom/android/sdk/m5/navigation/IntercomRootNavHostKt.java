package io.intercom.android.sdk.m5.navigation;

import V.O0;
import Y.B;
import Y.C1500m;
import Y.M0;
import Y.P;
import Y.Y0;
import android.content.Intent;
import androidx.activity.C1554j;
import g0.c;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import j3.C2128E;
import j3.x;
import k0.i;
import k3.C2160l;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.h;
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Intent;", "intent", "Landroidx/activity/j;", "rootActivity", "Llf/M;", "IntercomRootNavHost", "(Landroid/content/Intent;Landroidx/activity/j;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomRootNavHostKt {
    public static final void IntercomRootNavHost(Intent intent, C1554j jVar, C1500m mVar, int i10) {
        Intent intent2 = intent;
        C1554j jVar2 = jVar;
        int i11 = i10;
        C6496s.h(intent2, "intent");
        C6496s.h(jVar2, "rootActivity");
        C1500m h10 = mVar.h(884340874);
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        if (argsForIntent instanceof IntercomRootActivityArgs.NoContent) {
            jVar.finish();
            LumberMill.getLogger().e("No content to display. Closing the activity.", new Object[0]);
            Y0 k10 = h10.k();
            if (k10 != null) {
                k10.a(new C6225f0(intent2, jVar2, i11));
                return;
            }
            return;
        }
        x d10 = C2160l.d(new C2128E[0], h10, 8);
        Object A10 = h10.A();
        if (A10 == C1500m.f10026a.a()) {
            B b10 = new B(P.j(h.f72645a, h10));
            h10.r(b10);
            A10 = b10;
        }
        O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, c.e(1903672037, true, new IntercomRootNavHostKt$IntercomRootNavHost$2(d10, argsForIntent, jVar2, ((B) A10).a()), h10, 54), h10, 12582912, 127);
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new C6227g0(intent2, jVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomRootNavHost$lambda$0(Intent intent, C1554j jVar, int i10, C1500m mVar, int i11) {
        C6496s.h(intent, "$intent");
        C6496s.h(jVar, "$rootActivity");
        IntercomRootNavHost(intent, jVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomRootNavHost$lambda$1(Intent intent, C1554j jVar, int i10, C1500m mVar, int i11) {
        C6496s.h(intent, "$intent");
        C6496s.h(jVar, "$rootActivity");
        IntercomRootNavHost(intent, jVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
