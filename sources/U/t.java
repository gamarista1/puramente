package U;

import B.j;
import J0.C1244j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import yf.C6787a;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f6301a = C6496s.c(Build.DEVICE, "layoutlib");

    /* access modifiers changed from: private */
    public static final j c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof j) {
                return (j) childAt;
            }
        }
        j jVar = new j(viewGroup.getContext());
        viewGroup.addView(jVar);
        return jVar;
    }

    public static final C1244j d(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar) {
        if (f6301a) {
            return new c(jVar, z10, f10, e02, aVar, (DefaultConstructorMarker) null);
        }
        return new b(jVar, z10, f10, e02, aVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.ViewGroup e(android.view.View r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0031
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0011
            r2 = r0
            goto L_0x0000
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't find a valid parent for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0031:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U.t.e(android.view.View):android.view.ViewGroup");
    }
}
