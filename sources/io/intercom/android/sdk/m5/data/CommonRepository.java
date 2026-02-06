package io.intercom.android.sdk.m5.data;

import io.intercom.android.sdk.api.MessengerApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/data/CommonRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "openMessenger", "(Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/models/UsersResponse;", "fetchUnreadCounts", "Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonRepository {
    public static final int $stable = 8;
    private final IntercomDataLayer intercomDataLayer;
    private final MessengerApi messengerApi;

    public CommonRepository(MessengerApi messengerApi2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(messengerApi2, "messengerApi");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.messengerApi = messengerApi2;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchUnreadCounts(qf.C6658d<? super io.intercom.android.sdk.models.UsersResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1 r0 = (io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1 r0 = new io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            lf.w.b(r6)
            goto L_0x0040
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            lf.w.b(r6)
            io.intercom.android.sdk.api.MessengerApi r6 = r5.messengerApi
            r0.label = r4
            java.lang.Object r6 = io.intercom.android.sdk.api.MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x0040
            return r1
        L_0x0040:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r6
            boolean r0 = r6 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r0 == 0) goto L_0x0052
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r6
            java.lang.Object r6 = r6.getBody()
            io.intercom.android.sdk.models.UsersResponse$Builder r6 = (io.intercom.android.sdk.models.UsersResponse.Builder) r6
            io.intercom.android.sdk.models.UsersResponse r3 = r6.build()
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.data.CommonRepository.fetchUnreadCounts(qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object openMessenger(qf.C6658d<? super io.intercom.android.sdk.models.OpenMessengerResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1 r0 = (io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1 r0 = new io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            io.intercom.android.sdk.m5.data.CommonRepository r0 = (io.intercom.android.sdk.m5.data.CommonRepository) r0
            lf.w.b(r6)
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            lf.w.b(r6)
            io.intercom.android.sdk.m5.data.IntercomDataLayer r6 = r5.intercomDataLayer
            io.intercom.android.sdk.models.OpenMessengerResponse r6 = r6.getOpenResponse()
            if (r6 == 0) goto L_0x0042
            return r6
        L_0x0042:
            io.intercom.android.sdk.api.MessengerApi r6 = r5.messengerApi
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = io.intercom.android.sdk.api.MessengerApi.DefaultImpls.openMessengerSuspended$default(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0 = r5
        L_0x0050:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r6
            boolean r1 = r6 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r1 == 0) goto L_0x006a
            io.intercom.android.sdk.m5.data.IntercomDataLayer r0 = r0.intercomDataLayer
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r6
            java.lang.Object r1 = r6.getBody()
            io.intercom.android.sdk.models.OpenMessengerResponse r1 = (io.intercom.android.sdk.models.OpenMessengerResponse) r1
            r0.updateOpenResponse(r1)
            java.lang.Object r6 = r6.getBody()
            r3 = r6
            io.intercom.android.sdk.models.OpenMessengerResponse r3 = (io.intercom.android.sdk.models.OpenMessengerResponse) r3
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.data.CommonRepository.openMessenger(qf.d):java.lang.Object");
    }
}
