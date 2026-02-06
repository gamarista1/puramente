package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: androidx.core.view.g0  reason: case insensitive filesystem */
public abstract class C1690g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final WindowInsets f16087a = D0.f15980b.x();

    /* renamed from: b  reason: collision with root package name */
    static boolean f16088b = false;

    /* renamed from: androidx.core.view.g0$a */
    static class a {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.view.View$OnApplyWindowInsetsListener} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.view.WindowInsets b(android.view.View r5, android.view.WindowInsets r6) {
        /*
            int r0 = m1.C2187c.f23611M
            java.lang.Object r0 = r5.getTag(r0)
            int r1 = m1.C2187c.f23618T
            java.lang.Object r1 = r5.getTag(r1)
            boolean r2 = r0 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r2 == 0) goto L_0x0013
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            goto L_0x001c
        L_0x0013:
            boolean r0 = r1 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r0 == 0) goto L_0x001b
            r0 = r1
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r1 = 1
            android.view.WindowInsets[] r1 = new android.view.WindowInsets[r1]
            androidx.core.view.f0 r2 = new androidx.core.view.f0
            r2.<init>(r1, r0)
            r5.setOnApplyWindowInsetsListener(r2)
            r5.dispatchApplyWindowInsets(r6)
            int r6 = m1.C2187c.f23610L
            java.lang.Object r6 = r5.getTag(r6)
            boolean r2 = r6 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r2 == 0) goto L_0x0037
            r0 = r6
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
        L_0x0037:
            r5.setOnApplyWindowInsetsListener(r0)
            r6 = 0
            r0 = r1[r6]
            if (r0 == 0) goto L_0x005e
            boolean r0 = r0.isConsumed()
            if (r0 != 0) goto L_0x005e
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x005e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r2 = r6
        L_0x0050:
            if (r2 >= r0) goto L_0x005e
            android.view.View r3 = r5.getChildAt(r2)
            r4 = r1[r6]
            b(r3, r4)
            int r2 = r2 + 1
            goto L_0x0050
        L_0x005e:
            r5 = r1[r6]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1690g0.b(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public static boolean c(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ WindowInsets d(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        if (onApplyWindowInsetsListener != null) {
            windowInsets2 = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            windowInsets2 = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = windowInsets2;
        return f16087a;
    }
}
