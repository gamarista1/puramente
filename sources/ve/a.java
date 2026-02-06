package ve;

import android.view.View;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qe.L;
import qe.M;
import yf.C6798l;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f62042a;

    /* renamed from: b  reason: collision with root package name */
    private final View f62043b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f62044c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62045d;

    public a(String str, View view, C6798l lVar) {
        C6496s.h(str, "name");
        C6496s.h(view, "view");
        this.f62042a = str;
        this.f62043b = view;
        this.f62044c = lVar;
    }

    private final WritableMap a(Object obj) {
        Object b10 = L.b(L.f61392a, obj, (L.a) null, false, 6, (Object) null);
        if ((b10 instanceof C6514M) || b10 == null) {
            return null;
        }
        if (b10 instanceof WritableMap) {
            return (WritableMap) b10;
        }
        WritableMap b11 = L.b.f61393a.b();
        M.b(b11, "payload", b10);
        return b11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Short} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.Object r10) {
        /*
            r9 = this;
            android.view.View r0 = r9.f62043b
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            expo.modules.adapters.react.NativeModulesProxy r0 = ae.r.a(r0)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            ae.k r0 = r0.getKotlinInteropModuleRegistry()
            ae.a r0 = r0.f()
            boolean r1 = r9.f62045d
            r2 = 0
            if (r1 != 0) goto L_0x00cc
            ae.u r1 = r0.o()
            ae.n r1 = r1.h()
            android.view.View r3 = r9.f62043b
            java.lang.Class r3 = r3.getClass()
            ae.m r1 = r1.r(r3)
            r3 = 2
            if (r1 != 0) goto L_0x0055
            Rd.d r10 = ae.C4466c.a()
            android.view.View r0 = r9.f62043b
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "⚠️ Cannot get module holder for "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Rd.d.g(r10, r0, r2, r3, r2)
            return
        L_0x0055:
            ke.d r4 = r1.e()
            expo.modules.kotlin.views.n r4 = r4.h()
            if (r4 == 0) goto L_0x0064
            expo.modules.kotlin.views.b r4 = r4.c()
            goto L_0x0065
        L_0x0064:
            r4 = r2
        L_0x0065:
            if (r4 != 0) goto L_0x0088
            Rd.d r10 = ae.C4466c.a()
            ke.b r0 = r1.g()
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "⚠️ Cannot get callbacks for "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Rd.d.g(r10, r0, r2, r3, r2)
            return
        L_0x0088:
            java.lang.String[] r4 = r4.a()
            int r5 = r4.length
            r6 = 0
        L_0x008e:
            if (r6 >= r5) goto L_0x00a1
            r7 = r4[r6]
            java.lang.String r8 = r9.f62042a
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r8)
            if (r7 == 0) goto L_0x009e
            r1 = 1
            r9.f62045d = r1
            goto L_0x00cc
        L_0x009e:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00a1:
            Rd.d r10 = ae.C4466c.a()
            java.lang.String r0 = r9.f62042a
            ke.b r1 = r1.g()
            java.lang.Class r1 = r1.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "⚠️ Event "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " wasn't exported from "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            Rd.d.g(r10, r0, r2, r3, r2)
            return
        L_0x00cc:
            ge.b r0 = r0.j()
            if (r0 == 0) goto L_0x00e8
            android.view.View r1 = r9.f62043b
            java.lang.String r3 = r9.f62042a
            com.facebook.react.bridge.WritableMap r4 = r9.a(r10)
            yf.l r5 = r9.f62044c
            if (r5 == 0) goto L_0x00e5
            java.lang.Object r10 = r5.invoke(r10)
            r2 = r10
            java.lang.Short r2 = (java.lang.Short) r2
        L_0x00e5:
            r0.b(r1, r3, r4, r2)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.a.invoke(java.lang.Object):void");
    }
}
