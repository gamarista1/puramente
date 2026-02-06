package io.intercom.android.sdk.utilities;

import android.view.View;
import androidx.core.view.C1680b0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/utilities/AccessibilityUtils;", "", "<init>", "()V", "Landroid/view/View;", "view", "Llf/M;", "addClickAbilityAnnouncement", "(Landroid/view/View;)V", "removeClickAbilityAnnouncement", "addHeadingAnnouncement", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityUtils {
    public static final int $stable = 0;
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(View view) {
        C6496s.h(view, "view");
        C1680b0.o0(view, new AccessibilityUtils$addClickAbilityAnnouncement$1());
    }

    public final void addHeadingAnnouncement(View view) {
        C6496s.h(view, "view");
        C1680b0.o0(view, new AccessibilityUtils$addHeadingAnnouncement$1());
    }

    public final void removeClickAbilityAnnouncement(View view) {
        C6496s.h(view, "view");
        C1680b0.o0(view, new AccessibilityUtils$removeClickAbilityAnnouncement$1());
    }
}
