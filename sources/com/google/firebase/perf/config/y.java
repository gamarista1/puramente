package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class y implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f57672a;

    public /* synthetic */ y(RemoteConfigManager remoteConfigManager) {
        this.f57672a = remoteConfigManager;
    }

    public final void onSuccess(Object obj) {
        this.f57672a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
