package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import m1.C2187c;
import y1.B;
import y1.C2930A;

/* renamed from: androidx.core.view.a  reason: case insensitive filesystem */
public class C1677a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    static final class C0283a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final C1677a f16038a;

        C0283a(C1677a aVar) {
            this.f16038a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f16038a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            B accessibilityNodeProvider = this.f16038a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16038a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C2930A l12 = C2930A.l1(accessibilityNodeInfo);
            l12.U0(C1680b0.V(view));
            l12.E0(C1680b0.Q(view));
            l12.O0(C1680b0.o(view));
            l12.a1(C1680b0.I(view));
            this.f16038a.onInitializeAccessibilityNodeInfo(view, l12);
            l12.f(accessibilityNodeInfo.getText(), view);
            List<C2930A.a> actionList = C1677a.getActionList(view);
            for (int i10 = 0; i10 < actionList.size(); i10++) {
                l12.b(actionList.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16038a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f16038a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f16038a.performAccessibilityAction(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f16038a.sendAccessibilityEvent(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f16038a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public C1677a() {
        this(DEFAULT_DELEGATE);
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] r10 = C2930A.r(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (r10 != null && i10 < r10.length) {
                if (clickableSpan.equals(r10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean b(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C2187c.f23607I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    static List<C2930A.a> getActionList(View view) {
        List<C2930A.a> list = (List) view.getTag(C2187c.f23606H);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public B getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new B(accessibilityNodeProvider);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, a10.k1());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        List<C2930A.a> actionList = getActionList(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= actionList.size()) {
                break;
            }
            C2930A.a aVar = actionList.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.mOriginalDelegate.performAccessibilityAction(view, i10, bundle);
        }
        if (z10 || i10 != C2187c.f23619a || bundle == null) {
            return z10;
        }
        return b(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i10) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i10);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1677a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0283a(this);
    }
}
