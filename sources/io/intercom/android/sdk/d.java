package io.intercom.android.sdk;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NexusWrapper f68552a;

    public /* synthetic */ d(NexusWrapper nexusWrapper) {
        this.f68552a = nexusWrapper;
    }

    public final void run() {
        NexusWrapper.scheduleDisconnect$lambda$2(this.f68552a);
    }
}
