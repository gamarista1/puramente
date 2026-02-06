package io.intercom.android.sdk.user;

import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.HostAppState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0019\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00070\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\n \u0012*\u0004\u0018\u00010\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/user/UserUpdaterHelper;", "", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/api/UserUpdater;", "userUpdaterProvider", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentityProvider", "<init>", "(Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/Provider;)V", "", "currentTime", "Llf/M;", "update", "(J)V", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "kotlin.jvm.PlatformType", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "getUserUpdater", "()Lio/intercom/android/sdk/api/UserUpdater;", "userUpdater", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserUpdaterHelper {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final Provider<UserIdentity> userIdentityProvider;
    private final Provider<UserUpdater> userUpdaterProvider;

    public UserUpdaterHelper(Provider<UserUpdater> provider, IntercomDataLayer intercomDataLayer, Provider<UserIdentity> provider2) {
        C6496s.h(provider, "userUpdaterProvider");
        C6496s.h(intercomDataLayer, "dataLayer");
        C6496s.h(provider2, "userIdentityProvider");
        this.userUpdaterProvider = provider;
        this.dataLayer = intercomDataLayer;
        this.userIdentityProvider = provider2;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentityProvider.get();
    }

    public final UserUpdater getUserUpdater() {
        return this.userUpdaterProvider.get();
    }

    public final void update(long j10) {
        HostAppState hostAppState = (HostAppState) this.dataLayer.getHostAppState().getValue();
        if (j10 - hostAppState.getBackgroundedTimestamp() > ((AppConfig) this.dataLayer.getConfig().getValue()).getNewSessionThresholdMs() && getUserIdentity().identityExists() && !hostAppState.getSessionStartedSinceLastBackgrounded()) {
            getUserUpdater().updateUser(UserUpdateRequest.create(true, hostAppState.isBackgrounded(), true), IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }
}
