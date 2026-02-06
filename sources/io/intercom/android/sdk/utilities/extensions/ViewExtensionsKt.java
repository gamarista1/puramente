package io.intercom.android.sdk.utilities.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Llf/M;", "hide", "(Landroid/view/View;)V", "show", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewExtensionsKt {
    public static final void hide(View view) {
        C6496s.h(view, "<this>");
        view.setVisibility(8);
    }

    public static final void show(View view) {
        C6496s.h(view, "<this>");
        view.setVisibility(0);
    }
}
