package io.intercom.android.sdk;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NexusWrapper f68551a;

    public /* synthetic */ c(NexusWrapper nexusWrapper) {
        this.f68551a = nexusWrapper;
    }

    public final void run() {
        NexusWrapper.disconnect$lambda$1(this.f68551a);
    }
}
