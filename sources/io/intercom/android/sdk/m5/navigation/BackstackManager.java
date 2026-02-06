package io.intercom.android.sdk.m5.navigation;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00040\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/BackstackManager;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "Llf/M;", "setBackstackItem", "(Ljava/lang/Class;)V", "getBackstackItem", "()Ljava/lang/Class;", "", "hasBackstackItem", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "backstackItem", "Ljava/util/concurrent/atomic/AtomicReference;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackstackManager {
    public static final int $stable = 8;
    public static final BackstackManager INSTANCE = new BackstackManager();
    private static final AtomicReference<Class<? extends Activity>> backstackItem = new AtomicReference<>((Object) null);

    private BackstackManager() {
    }

    public final Class<? extends Activity> getBackstackItem() {
        return backstackItem.get();
    }

    public final boolean hasBackstackItem() {
        if (backstackItem.get() != null) {
            return true;
        }
        return false;
    }

    public final void setBackstackItem(Class<? extends Activity> cls) {
        C6496s.h(cls, "activityClass");
        backstackItem.set(cls);
    }
}
