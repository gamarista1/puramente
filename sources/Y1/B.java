package y1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class B {

    /* renamed from: a  reason: collision with root package name */
    private final Object f28627a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final B f28628a;

        a(B b10) {
            this.f28628a = b10;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C2930A b10 = this.f28628a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.k1();
        }

        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List c10 = this.f28628a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((C2930A) c10.get(i11)).k1());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            C2930A d10 = this.f28628a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.k1();
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f28628a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(B b10) {
            super(b10);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f28628a.a(i10, C2930A.l1(accessibilityNodeInfo), str, bundle);
        }
    }

    public B() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28627a = new b(this);
        } else {
            this.f28627a = new a(this);
        }
    }

    public C2930A b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public C2930A d(int i10) {
        return null;
    }

    public Object e() {
        return this.f28627a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public B(Object obj) {
        this.f28627a = obj;
    }

    public void a(int i10, C2930A a10, String str, Bundle bundle) {
    }
}
