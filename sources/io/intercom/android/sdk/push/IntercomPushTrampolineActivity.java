package io.intercom.android.sdk.push;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.d;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/push/IntercomPushTrampolineActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lio/intercom/android/sdk/push/PushReceiverDelegate;", "pushReceiverDelegate", "Lio/intercom/android/sdk/push/PushReceiverDelegate;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPushTrampolineActivity extends d {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Twig TWIG = LumberMill.getLogger();
    private final PushReceiverDelegate pushReceiverDelegate = new PushReceiverDelegate();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/push/IntercomPushTrampolineActivity$Companion;", "", "<init>", "()V", "TWIG", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        C6496s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Injector.initIfCachedCredentials((Application) applicationContext);
        if (Injector.isNotInitialised()) {
            TWIG.w("Push not handled because Intercom is not initialised", new Object[0]);
            finish();
            return;
        }
        Injector injector = Injector.get();
        UserIdentity userIdentity = injector.getUserIdentity();
        MetricTracker metricTracker = injector.getMetricTracker();
        this.pushReceiverDelegate.handlePushTap(this, getIntent(), injector.getApi(), userIdentity, metricTracker);
        finish();
    }
}
