package io.intercom.android.sdk.m5.home.states;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeClientState;", "", "homeResponse", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "openMessengerResponseData", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "isHeaderImageLoaded", "", "<init>", "(Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;Lio/intercom/android/sdk/models/OpenMessengerResponse;Z)V", "getHomeResponse", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "getOpenMessengerResponseData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeClientState {
    public static final int $stable = 8;
    private final NetworkResponse<HomeV2Response> homeResponse;
    private final boolean isHeaderImageLoaded;
    private final OpenMessengerResponse openMessengerResponseData;

    public HomeClientState() {
        this((NetworkResponse) null, (OpenMessengerResponse) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HomeClientState copy$default(HomeClientState homeClientState, NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkResponse = homeClientState.homeResponse;
        }
        if ((i10 & 2) != 0) {
            openMessengerResponse = homeClientState.openMessengerResponseData;
        }
        if ((i10 & 4) != 0) {
            z10 = homeClientState.isHeaderImageLoaded;
        }
        return homeClientState.copy(networkResponse, openMessengerResponse, z10);
    }

    public final NetworkResponse<HomeV2Response> component1() {
        return this.homeResponse;
    }

    public final OpenMessengerResponse component2() {
        return this.openMessengerResponseData;
    }

    public final boolean component3() {
        return this.isHeaderImageLoaded;
    }

    public final HomeClientState copy(NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10) {
        return new HomeClientState(networkResponse, openMessengerResponse, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeClientState)) {
            return false;
        }
        HomeClientState homeClientState = (HomeClientState) obj;
        return C6496s.c(this.homeResponse, homeClientState.homeResponse) && C6496s.c(this.openMessengerResponseData, homeClientState.openMessengerResponseData) && this.isHeaderImageLoaded == homeClientState.isHeaderImageLoaded;
    }

    public final NetworkResponse<HomeV2Response> getHomeResponse() {
        return this.homeResponse;
    }

    public final OpenMessengerResponse getOpenMessengerResponseData() {
        return this.openMessengerResponseData;
    }

    public int hashCode() {
        NetworkResponse<HomeV2Response> networkResponse = this.homeResponse;
        int i10 = 0;
        int hashCode = (networkResponse == null ? 0 : networkResponse.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponseData;
        if (openMessengerResponse != null) {
            i10 = openMessengerResponse.hashCode();
        }
        return ((hashCode + i10) * 31) + Boolean.hashCode(this.isHeaderImageLoaded);
    }

    public final boolean isHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }

    public String toString() {
        return "HomeClientState(homeResponse=" + this.homeResponse + ", openMessengerResponseData=" + this.openMessengerResponseData + ", isHeaderImageLoaded=" + this.isHeaderImageLoaded + ')';
    }

    public HomeClientState(NetworkResponse<HomeV2Response> networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10) {
        this.homeResponse = networkResponse;
        this.openMessengerResponseData = openMessengerResponse;
        this.isHeaderImageLoaded = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeClientState(NetworkResponse networkResponse, OpenMessengerResponse openMessengerResponse, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : networkResponse, (i10 & 2) != 0 ? null : openMessengerResponse, (i10 & 4) != 0 ? false : z10);
    }
}
