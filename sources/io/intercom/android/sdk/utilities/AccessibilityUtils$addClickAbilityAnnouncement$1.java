package io.intercom.android.sdk.utilities;

import android.view.View;
import androidx.core.view.C1677a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import y1.C2930A;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/intercom/android/sdk/utilities/AccessibilityUtils$addClickAbilityAnnouncement$1", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly1/A;", "info", "Llf/M;", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Ly1/A;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityUtils$addClickAbilityAnnouncement$1 extends C1677a {
    AccessibilityUtils$addClickAbilityAnnouncement$1() {
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
        C6496s.h(view, "host");
        C6496s.h(a10, "info");
        super.onInitializeAccessibilityNodeInfo(view, a10);
        a10.b(C2930A.a.f28602i);
        a10.u0(true);
    }
}
