package io.intercom.android.sdk;

import io.intercom.android.nexus.NexusConfig;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NexusWrapper f68525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NexusConfig f68526b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f68527c;

    public /* synthetic */ b(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z10) {
        this.f68525a = nexusWrapper;
        this.f68526b = nexusConfig;
        this.f68527c = z10;
    }

    public final void run() {
        NexusWrapper.connect$lambda$0(this.f68525a, this.f68526b, this.f68527c);
    }
}
