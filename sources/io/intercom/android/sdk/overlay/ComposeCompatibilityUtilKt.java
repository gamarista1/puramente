package io.intercom.android.sdk.overlay;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.f0;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "composeView", "", "isLegacyActivity", "(Landroidx/compose/ui/platform/ComposeView;)Z", "Lio/intercom/android/sdk/models/Participant;", "lastAdmin", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Llf/M;", "addAvatarIconToCompose", "(Landroidx/compose/ui/platform/ComposeView;Lio/intercom/android/sdk/models/Participant;Lio/intercom/android/sdk/identity/AppConfig;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposeCompatibilityUtilKt {
    public static final void addAvatarIconToCompose(ComposeView composeView, Participant participant, AppConfig appConfig) {
        C6496s.h(composeView, "<this>");
        C6496s.h(participant, "lastAdmin");
        C6496s.h(appConfig, "appConfig");
        if (!isLegacyActivity(composeView)) {
            composeView.setContent(c.c(421691537, true, new ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1(appConfig, participant)));
        }
    }

    public static final boolean isLegacyActivity(ComposeView composeView) {
        C1790m mVar;
        boolean z10;
        C1798v a10;
        if (composeView == null || (a10 = f0.a(composeView)) == null) {
            mVar = null;
        } else {
            mVar = a10.getLifecycle();
        }
        if (mVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
        }
        return z10;
    }
}
