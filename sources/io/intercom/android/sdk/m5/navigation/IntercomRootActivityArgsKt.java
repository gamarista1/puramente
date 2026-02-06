package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import u1.b;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\b\u0002\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"BUNDLE", "", "BUNDLE_ARGS", "getArgsForIntent", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "intent", "Landroid/content/Intent;", "getIntentForArgs", "context", "Landroid/content/Context;", "intercomRootActivityArgs", "activityName", "Ljava/lang/Class;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomRootActivityArgsKt {
    private static final String BUNDLE = "BUNDLE";
    private static final String BUNDLE_ARGS = "BUNDLE_ARGS";

    public static final IntercomRootActivityArgs getArgsForIntent(Intent intent) {
        C6496s.h(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
        if (bundleExtra == null) {
            return IntercomRootActivityArgs.NoContent.INSTANCE;
        }
        IntercomRootActivityArgs intercomRootActivityArgs = (IntercomRootActivityArgs) b.a(bundleExtra, BUNDLE_ARGS, IntercomRootActivityArgs.class);
        if (intercomRootActivityArgs == null) {
            return IntercomRootActivityArgs.NoContent.INSTANCE;
        }
        return intercomRootActivityArgs;
    }

    public static final Intent getIntentForArgs(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class<?> cls) {
        C6496s.h(context, "context");
        C6496s.h(intercomRootActivityArgs, "intercomRootActivityArgs");
        C6496s.h(cls, "activityName");
        Intent intent = new Intent(context, cls);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_ARGS, intercomRootActivityArgs);
        intent.putExtra(BUNDLE, bundle);
        intent.setFlags(268435456);
        return intent;
    }

    public static /* synthetic */ Intent getIntentForArgs$default(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class<IntercomRootActivity> cls, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getIntentForArgs(context, intercomRootActivityArgs, cls);
    }
}
