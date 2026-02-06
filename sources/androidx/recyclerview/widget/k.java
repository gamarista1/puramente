package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import java.util.Map;
import java.util.WeakHashMap;
import y1.B;
import y1.C2930A;

public class k extends C1677a {

    /* renamed from: a  reason: collision with root package name */
    final RecyclerView f18353a;

    /* renamed from: b  reason: collision with root package name */
    private final a f18354b;

    public static class a extends C1677a {

        /* renamed from: a  reason: collision with root package name */
        final k f18355a;

        /* renamed from: b  reason: collision with root package name */
        private Map f18356b = new WeakHashMap();

        public a(k kVar) {
            this.f18355a = kVar;
        }

        /* access modifiers changed from: package-private */
        public C1677a c(View view) {
            return (C1677a) this.f18356b.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            C1677a l10 = C1680b0.l(view);
            if (l10 != null && l10 != this) {
                this.f18356b.put(view, l10);
            }
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public B getAccessibilityNodeProvider(View view) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            if (this.f18355a.d() || this.f18355a.f18353a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, a10);
                return;
            }
            this.f18355a.f18353a.getLayoutManager().O0(view, a10);
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, a10);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, a10);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1677a aVar = (C1677a) this.f18356b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (this.f18355a.d() || this.f18355a.f18353a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.f18355a.f18353a.getLayoutManager().i1(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1677a aVar = (C1677a) this.f18356b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.f18353a = recyclerView;
        C1677a c10 = c();
        if (c10 == null || !(c10 instanceof a)) {
            this.f18354b = new a(this);
        } else {
            this.f18354b = (a) c10;
        }
    }

    public C1677a c() {
        return this.f18354b;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f18353a.t0();
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !d()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().K0(accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        super.onInitializeAccessibilityNodeInfo(view, a10);
        if (!d() && this.f18353a.getLayoutManager() != null) {
            this.f18353a.getLayoutManager().N0(a10);
        }
    }

    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (d() || this.f18353a.getLayoutManager() == null) {
            return false;
        }
        return this.f18353a.getLayoutManager().g1(i10, bundle);
    }
}
