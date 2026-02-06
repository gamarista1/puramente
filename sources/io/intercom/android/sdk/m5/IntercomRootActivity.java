package io.intercom.android.sdk.m5;

import Y.r;
import android.os.Bundle;
import androidx.activity.M;
import androidx.activity.s;
import e.C1932e;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/IntercomRootActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.c(this, (M) null, (M) null, 3, (Object) null);
        C1932e.b(this, (r) null, c.c(1535831366, true, new IntercomRootActivity$onCreate$1(this)), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Injector.get().getDataLayer().clearOpenResponse();
    }
}
