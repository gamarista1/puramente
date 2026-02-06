package io.intercom.android.sdk.m5.helpcenter.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.C1613a;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterLoadingScreen;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llf/M;", "Content", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterLoadingScreen extends C1613a {
    public static final int $stable = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* access modifiers changed from: private */
    public static final C6514M Content$lambda$0(HelpCenterLoadingScreen helpCenterLoadingScreen, int i10, C1500m mVar, int i11) {
        C6496s.h(helpCenterLoadingScreen, "$tmp0_rcvr");
        helpCenterLoadingScreen.Content(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public void Content(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1926895347);
        if ((i10 & 1) != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m340getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l(this, i10));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C6496s.h(context, "context");
    }
}
