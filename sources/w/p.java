package W;

import Y.A1;
import Y.C1510r0;
import Y.o1;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;

final class p implements AccessibilityManager.AccessibilityStateChangeListener, A1 {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f8382a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final c f8383b;

    /* renamed from: c  reason: collision with root package name */
    private final b f8384c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8385a = new a();

        private a() {
        }

        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final C1510r0 f8386a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f8387b;

        b(p pVar) {
            this.f8387b = pVar;
        }

        public final boolean a() {
            return ((Boolean) this.f8386a.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f8386a.setValue(Boolean.valueOf(z10));
        }

        public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            b(this.f8387b.m(accessibilityManager));
        }
    }

    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final C1510r0 f8388a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

        c() {
        }

        public final boolean a() {
            return ((Boolean) this.f8388a.getValue()).booleanValue();
        }

        public final void b(boolean z10) {
            this.f8388a.setValue(Boolean.valueOf(z10));
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            b(z10);
        }
    }

    public p(boolean z10, boolean z11) {
        c cVar;
        b bVar = null;
        if (z10) {
            cVar = new c();
        } else {
            cVar = null;
        }
        this.f8383b = cVar;
        if (z11 && Build.VERSION.SDK_INT >= 33) {
            bVar = new b(this);
        }
        this.f8384c = bVar;
    }

    private final boolean k() {
        return ((Boolean) this.f8382a.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final boolean m(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && Sg.p.O(settingsActivityName, "SwitchAccess", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final void r(boolean z10) {
        this.f8382a.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0 != false) goto L_0x001f;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean getValue() {
        /*
            r2 = this;
            boolean r0 = r2.k()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            W.p$c r0 = r2.f8383b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.a()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 != 0) goto L_0x001f
            W.p$b r0 = r2.f8384c
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.a()
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W.p.getValue():java.lang.Boolean");
    }

    public void onAccessibilityStateChanged(boolean z10) {
        r(z10);
    }

    public final void q(AccessibilityManager accessibilityManager) {
        b bVar;
        r(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        c cVar = this.f8383b;
        if (cVar != null) {
            cVar.b(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT >= 33 && (bVar = this.f8384c) != null) {
            bVar.b(m(accessibilityManager));
            a.a(accessibilityManager, o.a(bVar));
        }
    }

    public final void s(AccessibilityManager accessibilityManager) {
        b bVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        c cVar = this.f8383b;
        if (cVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT >= 33 && (bVar = this.f8384c) != null) {
            a.b(accessibilityManager, o.a(bVar));
        }
    }
}
