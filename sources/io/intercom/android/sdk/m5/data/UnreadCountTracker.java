package io.intercom.android.sdk.m5.data;

import Ug.C5600w0;
import Ug.G;
import Ug.L;
import Ug.M;
import Ug.Z;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/data/UnreadCountTracker;", "", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "<init>", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "Lio/intercom/android/sdk/UnreadConversationCountListener;", "listener", "LUg/G;", "dispatcher", "Llf/M;", "addListener", "(Lio/intercom/android/sdk/UnreadConversationCountListener;LUg/G;)V", "removeListener", "(Lio/intercom/android/sdk/UnreadConversationCountListener;)V", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "getDataLayer", "()Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Ljava/util/concurrent/ConcurrentHashMap;", "LUg/w0;", "listeners", "Ljava/util/concurrent/ConcurrentHashMap;", "getListeners", "()Ljava/util/concurrent/ConcurrentHashMap;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnreadCountTracker {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final ConcurrentHashMap<UnreadConversationCountListener, C5600w0> listeners = new ConcurrentHashMap<>();

    public UnreadCountTracker(IntercomDataLayer intercomDataLayer) {
        C6496s.h(intercomDataLayer, "dataLayer");
        this.dataLayer = intercomDataLayer;
    }

    public static /* synthetic */ void addListener$default(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, G g10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = Z.a();
        }
        unreadCountTracker.addListener(unreadConversationCountListener, g10);
    }

    public final void addListener(UnreadConversationCountListener unreadConversationCountListener, G g10) {
        C6496s.h(unreadConversationCountListener, "listener");
        C6496s.h(g10, "dispatcher");
        this.listeners.put(unreadConversationCountListener, C5576k.d(L.a(g10), (g) null, (M) null, new UnreadCountTracker$addListener$job$1(this, unreadConversationCountListener, (C6658d<? super UnreadCountTracker$addListener$job$1>) null), 3, (Object) null));
    }

    public final IntercomDataLayer getDataLayer() {
        return this.dataLayer;
    }

    public final ConcurrentHashMap<UnreadConversationCountListener, C5600w0> getListeners() {
        return this.listeners;
    }

    public final void removeListener(UnreadConversationCountListener unreadConversationCountListener) {
        C5600w0 remove;
        C6496s.h(unreadConversationCountListener, "listener");
        if (this.listeners.containsKey(unreadConversationCountListener) && (remove = this.listeners.remove(unreadConversationCountListener)) != null) {
            C5600w0.a.a(remove, (CancellationException) null, 1, (Object) null);
        }
    }
}
