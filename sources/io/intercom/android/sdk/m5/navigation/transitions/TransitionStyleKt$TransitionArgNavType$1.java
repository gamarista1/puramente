package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import com.google.gson.e;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j3.C2126C;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u1.b;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0006J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/TransitionStyleKt$TransitionArgNavType$1", "Lj3/C;", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "", "transitionArgs", "toTransitionArgs", "(Ljava/lang/String;)Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "Landroid/os/Bundle;", "bundle", "key", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "value", "parseValue", "Llf/M;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransitionStyleKt$TransitionArgNavType$1 extends C2126C {
    TransitionStyleKt$TransitionArgNavType$1() {
        super(false);
    }

    private final TransitionArgs toTransitionArgs(String str) {
        Object m10 = new e().m(str, TransitionArgs.class);
        C6496s.g(m10, "fromJson(...)");
        return (TransitionArgs) m10;
    }

    public TransitionArgs get(Bundle bundle, String str) {
        C6496s.h(bundle, "bundle");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        TransitionArgs transitionArgs = (TransitionArgs) b.a(bundle, str, TransitionArgs.class);
        return transitionArgs == null ? new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null) : transitionArgs;
    }

    public TransitionArgs parseValue(String str) {
        C6496s.h(str, "value");
        return toTransitionArgs(str);
    }

    public void put(Bundle bundle, String str, TransitionArgs transitionArgs) {
        C6496s.h(bundle, "bundle");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(transitionArgs, "value");
        bundle.putParcelable(str, transitionArgs);
    }
}
