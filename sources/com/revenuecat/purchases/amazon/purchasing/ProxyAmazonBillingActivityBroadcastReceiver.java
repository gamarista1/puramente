package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llf/M;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "onReceiveCalled", "Z", "getOnReceiveCalled", "()Z", "setOnReceiveCalled", "(Z)V", "getOnReceiveCalled$annotations", "()V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProxyAmazonBillingActivityBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PURCHASE_FINISHED_ACTION = "com.revenuecat.purchases.purchase_finished";
    private final WeakReference<Activity> activity;
    private boolean onReceiveCalled;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver$Companion;", "", "()V", "PURCHASE_FINISHED_ACTION", "", "newPurchaseFinishedIntent", "Landroid/content/Intent;", "packageName", "newPurchaseFinishedIntentFilter", "Landroid/content/IntentFilter;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent newPurchaseFinishedIntent(String str) {
            C6496s.h(str, "packageName");
            Intent intent = new Intent(ProxyAmazonBillingActivityBroadcastReceiver.PURCHASE_FINISHED_ACTION);
            intent.setPackage(str);
            return intent;
        }

        public final IntentFilter newPurchaseFinishedIntentFilter() {
            return new IntentFilter(ProxyAmazonBillingActivityBroadcastReceiver.PURCHASE_FINISHED_ACTION);
        }

        private Companion() {
        }
    }

    public ProxyAmazonBillingActivityBroadcastReceiver(Activity activity2) {
        C6496s.h(activity2, "activity");
        this.activity = new WeakReference<>(activity2);
    }

    public static /* synthetic */ void getOnReceiveCalled$annotations() {
    }

    public final boolean getOnReceiveCalled() {
        return this.onReceiveCalled;
    }

    public void onReceive(Context context, Intent intent) {
        C6496s.h(context, "context");
        C6496s.h(intent, "intent");
        this.onReceiveCalled = true;
        Activity activity2 = this.activity.get();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void setOnReceiveCalled(boolean z10) {
        this.onReceiveCalled = z10;
    }
}
