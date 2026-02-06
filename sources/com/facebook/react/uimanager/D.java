package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import n7.C3863a;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f41384a;

    /* renamed from: b  reason: collision with root package name */
    private final C3409e0 f41385b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f41386c = new SparseBooleanArray();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public final U f41387a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41388b;

        a(U u10, int i10) {
            this.f41387a = u10;
            this.f41388b = i10;
        }
    }

    public D(s0 s0Var, C3409e0 e0Var) {
        this.f41384a = s0Var;
        this.f41385b = e0Var;
    }

    private void a(U u10, U u11, int i10) {
        boolean z10;
        boolean z11;
        if (u11.getNativeKind() != B.PARENT) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3863a.a(z10);
        for (int i11 = 0; i11 < u11.getChildCount(); i11++) {
            U childAt = u11.getChildAt(i11);
            if (childAt.getNativeParent() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3863a.a(z11);
            int nativeChildCount = u10.getNativeChildCount();
            if (childAt.getNativeKind() == B.NONE) {
                d(u10, childAt, i10);
            } else {
                b(u10, childAt, i10);
            }
            i10 += u10.getNativeChildCount() - nativeChildCount;
        }
    }

    private void b(U u10, U u11, int i10) {
        u10.addNativeChildAt(u11, i10);
        this.f41384a.G(u10.getReactTag(), (int[]) null, new u0[]{new u0(u11.getReactTag(), i10)}, (int[]) null);
        if (u11.getNativeKind() != B.PARENT) {
            a(u10, u11, i10 + 1);
        }
    }

    private void c(U u10, U u11, int i10) {
        int nativeOffsetForChild = u10.getNativeOffsetForChild(u10.getChildAt(i10));
        if (u10.getNativeKind() != B.PARENT) {
            a s10 = s(u10, nativeOffsetForChild);
            if (s10 != null) {
                U u12 = s10.f41387a;
                nativeOffsetForChild = s10.f41388b;
                u10 = u12;
            } else {
                return;
            }
        }
        if (u11.getNativeKind() != B.NONE) {
            b(u10, u11, nativeOffsetForChild);
        } else {
            d(u10, u11, nativeOffsetForChild);
        }
    }

    private void d(U u10, U u11, int i10) {
        a(u10, u11, i10);
    }

    private void e(U u10) {
        int reactTag = u10.getReactTag();
        if (!this.f41386c.get(reactTag)) {
            this.f41386c.put(reactTag, true);
            U parent = u10.getParent();
            int screenX = u10.getScreenX();
            int screenY = u10.getScreenY();
            while (parent != null && parent.getNativeKind() != B.PARENT) {
                if (!parent.isVirtual()) {
                    screenX += Math.round(parent.getLayoutX());
                    screenY += Math.round(parent.getLayoutY());
                }
                parent = parent.getParent();
            }
            f(u10, screenX, screenY);
        }
    }

    private void f(U u10, int i10, int i11) {
        if (u10.getNativeKind() == B.NONE || u10.getNativeParent() == null) {
            for (int i12 = 0; i12 < u10.getChildCount(); i12++) {
                U childAt = u10.getChildAt(i12);
                int reactTag = childAt.getReactTag();
                if (!this.f41386c.get(reactTag)) {
                    this.f41386c.put(reactTag, true);
                    f(childAt, childAt.getScreenX() + i10, childAt.getScreenY() + i11);
                }
            }
            return;
        }
        this.f41384a.P(u10.getLayoutParent().getReactTag(), u10.getReactTag(), i10, i11, u10.getScreenWidth(), u10.getScreenHeight(), u10.getLayoutDirection());
    }

    public static void j(U u10) {
        u10.removeAllNativeChildren();
    }

    private static boolean n(W w10) {
        if (w10 == null) {
            return true;
        }
        if (w10.c("collapsable") && !w10.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = w10.f41560a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!F0.a(w10.f41560a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(U u10, boolean z10) {
        if (u10.getNativeKind() != B.PARENT) {
            for (int childCount = u10.getChildCount() - 1; childCount >= 0; childCount--) {
                q(u10.getChildAt(childCount), z10);
            }
        }
        U nativeParent = u10.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(u10);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            this.f41384a.G(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, (u0[]) null, z10 ? new int[]{u10.getReactTag()} : null);
        }
    }

    private void r(U u10, W w10) {
        boolean z10;
        U parent = u10.getParent();
        if (parent == null) {
            u10.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(u10);
        parent.removeChildAt(indexOf);
        q(u10, false);
        u10.setIsLayoutOnly(false);
        this.f41384a.C(u10.getThemedContext(), u10.getReactTag(), u10.getViewClass(), w10);
        parent.addChildAt(u10, indexOf);
        c(parent, u10, indexOf);
        for (int i10 = 0; i10 < u10.getChildCount(); i10++) {
            c(u10, u10.getChildAt(i10), i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(u10.getReactTag());
        sb2.append(" - rootTag: ");
        sb2.append(u10.getRootTag());
        sb2.append(" - hasProps: ");
        boolean z11 = true;
        if (w10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f41386c.size());
        U5.a.s("NativeViewHierarchyOptimizer", sb2.toString());
        if (this.f41386c.size() != 0) {
            z11 = false;
        }
        C3863a.a(z11);
        e(u10);
        for (int i11 = 0; i11 < u10.getChildCount(); i11++) {
            e(u10.getChildAt(i11));
        }
        this.f41386c.clear();
    }

    private a s(U u10, int i10) {
        int i11;
        while (u10.getNativeKind() != B.PARENT) {
            U parent = u10.getParent();
            if (parent == null) {
                return null;
            }
            if (u10.getNativeKind() == B.LEAF) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            i10 = i10 + i11 + parent.getNativeOffsetForChild(u10);
            u10 = parent;
        }
        return new a(u10, i10);
    }

    public void g(U u10, C3415h0 h0Var, W w10) {
        boolean z10;
        if (!u10.getViewClass().equals(ReactViewManager.REACT_CLASS) || !n(w10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        u10.setIsLayoutOnly(z10);
        if (u10.getNativeKind() != B.NONE) {
            this.f41384a.C(h0Var, u10.getReactTag(), u10.getViewClass(), w10);
        }
    }

    public void h(U u10) {
        if (u10.isLayoutOnly()) {
            r(u10, (W) null);
        }
    }

    public void i(U u10, int[] iArr, int[] iArr2, u0[] u0VarArr, int[] iArr3) {
        boolean z10;
        for (int i10 : iArr2) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArr3.length) {
                    z10 = false;
                    break;
                } else if (iArr3[i11] == i10) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            q(this.f41385b.c(i10), z10);
        }
        for (u0 u0Var : u0VarArr) {
            c(u10, this.f41385b.c(u0Var.f41822a), u0Var.f41823b);
        }
    }

    public void k(U u10, ReadableArray readableArray) {
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            c(u10, this.f41385b.c(readableArray.getInt(i10)), i10);
        }
    }

    public void l(U u10) {
        e(u10);
    }

    public void m(U u10, String str, W w10) {
        if (u10.isLayoutOnly() && !n(w10)) {
            r(u10, w10);
        } else if (!u10.isLayoutOnly()) {
            this.f41384a.Q(u10.getReactTag(), str, w10);
        }
    }

    public void o() {
        this.f41386c.clear();
    }

    /* access modifiers changed from: package-private */
    public void p(U u10) {
        this.f41386c.clear();
    }
}
