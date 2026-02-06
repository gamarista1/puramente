package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.Q;
import com.facebook.react.views.scroll.e;
import com.facebook.react.views.scroll.f;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import vd.D;
import vd.v;

public final class o implements D {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59614a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.facebook.react.uimanager.H[] r0 = com.facebook.react.uimanager.H.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.uimanager.H r1 = com.facebook.react.uimanager.H.BOX_ONLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.uimanager.H r1 = com.facebook.react.uimanager.H.BOX_NONE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.react.uimanager.H r1 = com.facebook.react.uimanager.H.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.react.uimanager.H r1 = com.facebook.react.uimanager.H.AUTO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f59614a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.o.a.<clinit>():void");
        }
    }

    public v a(View view) {
        H h10;
        C6496s.h(view, "view");
        if (view instanceof Q) {
            h10 = ((Q) view).getPointerEvents();
            C6496s.e(h10);
        } else {
            h10 = H.AUTO;
        }
        if (!view.isEnabled()) {
            if (h10 == H.AUTO) {
                return v.BOX_NONE;
            }
            if (h10 == H.BOX_ONLY) {
                return v.NONE;
            }
        }
        int i10 = a.f59614a[h10.ordinal()];
        if (i10 == 1) {
            return v.BOX_ONLY;
        }
        if (i10 == 2) {
            return v.BOX_NONE;
        }
        if (i10 == 3) {
            return v.NONE;
        }
        if (i10 == 4) {
            return v.AUTO;
        }
        throw new C6535s();
    }

    public boolean b(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "view");
        if (viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof f) {
            if (!C6496s.c(((f) viewGroup).getOverflow(), "visible")) {
                return true;
            }
        } else if (viewGroup instanceof e) {
            if (!C6496s.c(((e) viewGroup).getOverflow(), "visible")) {
                return true;
            }
        } else if (viewGroup instanceof com.facebook.react.views.view.e) {
            return C6496s.c(((com.facebook.react.views.view.e) viewGroup).getOverflow(), "hidden");
        }
        return false;
    }

    public View c(ViewGroup viewGroup, int i10) {
        C6496s.h(viewGroup, "parent");
        if (viewGroup instanceof com.facebook.react.views.view.e) {
            View childAt = viewGroup.getChildAt(((com.facebook.react.views.view.e) viewGroup).getZIndexMappedChildIndex(i10));
            C6496s.e(childAt);
            return childAt;
        }
        View childAt2 = viewGroup.getChildAt(i10);
        C6496s.e(childAt2);
        return childAt2;
    }
}
