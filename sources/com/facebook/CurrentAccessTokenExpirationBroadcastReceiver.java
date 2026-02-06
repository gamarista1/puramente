package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llf/M;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C6496s.h(context, "context");
        C6496s.h(intent, "intent");
        if (C6496s.c("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && I.G()) {
            C3292g.f39489f.e().g();
        }
    }
}
