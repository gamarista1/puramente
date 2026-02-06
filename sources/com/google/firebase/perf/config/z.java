package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;

public final /* synthetic */ class z implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f57673a;

    public /* synthetic */ z(RemoteConfigManager remoteConfigManager) {
        this.f57673a = remoteConfigManager;
    }

    public final void onFailure(Exception exc) {
        this.f57673a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
