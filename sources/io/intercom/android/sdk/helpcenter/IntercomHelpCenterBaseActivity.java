package io.intercom.android.sdk.helpcenter;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/content/Context;", "context", "localizedContext", "(Landroid/content/Context;)Landroid/content/Context;", "newBase", "Llf/M;", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class IntercomHelpCenterBaseActivity extends d {
    public static final int $stable = 0;

    private final Context localizedContext(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(Injector.get().getAppConfigProvider().get().getHelpCenterLocale()));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        C6496s.g(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C6496s.h(context, "newBase");
        super.attachBaseContext(localizedContext(context));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector.get().getActivityFinisher().register(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister(this);
    }
}
