package y1;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: y1.b  reason: case insensitive filesystem */
public abstract class C2932b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
