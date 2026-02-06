package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "", "Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "externalUploadApi", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Landroid/content/Context;", "context", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/api/ExternalUploadApi;Lio/intercom/android/sdk/identity/UserIdentity;Landroid/content/Context;)V", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "imageData", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Upload$Builder;", "uploadFile", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/api/MessengerApi;", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "Lio/intercom/android/sdk/identity/UserIdentity;", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final ExternalUploadApi externalUploadApi;
    private final MessengerApi messengerApi;
    private final UserIdentity userIdentity;

    public UploadRepository() {
        this((MessengerApi) null, (ExternalUploadApi) null, (UserIdentity) null, (Context) null, 15, (DefaultConstructorMarker) null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object uploadFile(io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media r19, qf.C6658d<? super io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse<io.intercom.android.sdk.models.Upload.Builder>> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1 r3 = (io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r15 = r3
            goto L_0x0020
        L_0x001a:
            io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1 r3 = new io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r15.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r15.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r1 = r15.L$0
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r1
            lf.w.b(r2)
            goto L_0x01c2
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r1 = r15.L$1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r1
            java.lang.Object r4 = r15.L$0
            io.intercom.android.sdk.m5.upload.data.UploadRepository r4 = (io.intercom.android.sdk.m5.upload.data.UploadRepository) r4
            lf.w.b(r2)
            goto L_0x00f0
        L_0x004e:
            lf.w.b(r2)
            java.util.Map r2 = mf.O.c()
            java.lang.String r4 = r19.getFileName()
            java.lang.String r7 = "original_filename"
            r2.put(r7, r4)
            long r7 = r19.getSize()
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.d(r7)
            java.lang.String r7 = "size_in_bytes"
            r2.put(r7, r4)
            java.lang.String r4 = "content_type"
            java.lang.String r7 = r19.getMimeType()
            r2.put(r4, r7)
            boolean r4 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            java.lang.String r7 = "height"
            java.lang.String r8 = "width"
            if (r4 == 0) goto L_0x0095
            r4 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r4 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r4
            int r9 = r4.getWidth()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.c(r9)
            r2.put(r8, r9)
            int r4 = r4.getHeight()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            r2.put(r7, r4)
        L_0x0095:
            boolean r4 = r1 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            if (r4 == 0) goto L_0x00b2
            r4 = r1
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r4 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r4
            int r9 = r4.getWidth()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.c(r9)
            r2.put(r8, r9)
            int r4 = r4.getHeight()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            r2.put(r7, r4)
        L_0x00b2:
            java.util.Map r2 = mf.O.b(r2)
            io.intercom.android.sdk.api.MessengerApiHelper r4 = io.intercom.android.sdk.api.MessengerApiHelper.INSTANCE
            java.lang.String r7 = "upload"
            kotlin.Pair r2 = lf.C6502A.a(r7, r2)
            io.intercom.android.sdk.identity.UserIdentity r7 = r0.userIdentity
            java.util.Map r7 = r7.toMap()
            java.lang.String r8 = "user"
            kotlin.Pair r7 = lf.C6502A.a(r8, r7)
            java.lang.String r8 = "include_metadata"
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r6)
            kotlin.Pair r8 = lf.C6502A.a(r8, r9)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r2, r7, r8}
            java.util.Map r2 = mf.O.l(r2)
            rh.D r2 = r4.getDefaultRequestBody$intercom_sdk_base_release(r2)
            io.intercom.android.sdk.api.MessengerApi r4 = r0.messengerApi
            r15.L$0 = r0
            r15.L$1 = r1
            r15.label = r6
            java.lang.Object r2 = r4.getUploadFileUrlSuspended(r2, r15)
            if (r2 != r3) goto L_0x00ef
            return r3
        L_0x00ef:
            r4 = r0
        L_0x00f0:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r2
            boolean r6 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r6 != 0) goto L_0x01e5
            boolean r6 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r6 != 0) goto L_0x01e5
            boolean r6 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r6 == 0) goto L_0x0100
            goto L_0x01e5
        L_0x0100:
            boolean r6 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r6 == 0) goto L_0x01df
            r6 = r2
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r6
            java.lang.Object r6 = r6.getBody()
            io.intercom.android.sdk.models.Upload$Builder r6 = (io.intercom.android.sdk.models.Upload.Builder) r6
            io.intercom.android.sdk.models.Upload r6 = r6.build()
            io.intercom.android.sdk.api.ExternalUploadApi r7 = r4.externalUploadApi
            java.lang.String r8 = r6.getUploadDestination()
            rh.z$c$a r9 = rh.z.c.f73523c
            java.lang.String r10 = r6.getKey()
            java.lang.String r11 = "getKey(...)"
            kotlin.jvm.internal.C6496s.g(r10, r11)
            java.lang.String r11 = "key"
            rh.z$c r10 = r9.b(r11, r10)
            java.lang.String r11 = r6.getAcl()
            java.lang.String r12 = "getAcl(...)"
            kotlin.jvm.internal.C6496s.g(r11, r12)
            java.lang.String r12 = "acl"
            rh.z$c r11 = r9.b(r12, r11)
            java.lang.String r12 = r6.getContentType()
            java.lang.String r13 = "getContentType(...)"
            kotlin.jvm.internal.C6496s.g(r12, r13)
            java.lang.String r13 = "Content-Type"
            rh.z$c r12 = r9.b(r13, r12)
            java.lang.String r13 = r6.getAwsAccessKey()
            java.lang.String r14 = "getAwsAccessKey(...)"
            kotlin.jvm.internal.C6496s.g(r13, r14)
            java.lang.String r14 = "AWSAccessKeyId"
            rh.z$c r13 = r9.b(r14, r13)
            java.lang.String r14 = r6.getPolicy()
            java.lang.String r5 = "getPolicy(...)"
            kotlin.jvm.internal.C6496s.g(r14, r5)
            java.lang.String r5 = "policy"
            rh.z$c r14 = r9.b(r5, r14)
            java.lang.String r5 = r6.getSignature()
            java.lang.String r0 = "getSignature(...)"
            kotlin.jvm.internal.C6496s.g(r5, r0)
            java.lang.String r0 = "signature"
            rh.z$c r0 = r9.b(r0, r5)
            java.lang.String r5 = r6.getSuccessActionStatus()
            r16 = r3
            java.lang.String r3 = "getSuccessActionStatus(...)"
            kotlin.jvm.internal.C6496s.g(r5, r3)
            java.lang.String r3 = "success_action_status"
            rh.z$c r3 = r9.b(r3, r5)
            io.intercom.android.sdk.models.UploadMetadata r5 = r6.getMetadata()
            java.lang.String r5 = r5.getSafeAppId()
            java.lang.String r6 = "x-amz-meta-safe_app_id"
            rh.z$c r17 = r9.b(r6, r5)
            java.lang.String r5 = r1.getFileName()
            io.intercom.android.sdk.m5.upload.data.UploadRequestBody r6 = new io.intercom.android.sdk.m5.upload.data.UploadRequestBody
            android.content.Context r4 = r4.context
            r6.<init>(r4, r1)
            java.lang.String r1 = "file"
            rh.z$c r1 = r9.c(r1, r5, r6)
            r15.L$0 = r2
            r4 = 0
            r15.L$1 = r4
            r4 = 2
            r15.label = r4
            r4 = r7
            r5 = r8
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r0
            r12 = r3
            r13 = r17
            r14 = r1
            java.lang.Object r0 = r4.uploadFileSuspended(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r16
            if (r0 != r1) goto L_0x01c0
            return r1
        L_0x01c0:
            r1 = r2
            r2 = r0
        L_0x01c2:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r2
            boolean r0 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r0 == 0) goto L_0x01c9
            goto L_0x01d2
        L_0x01c9:
            boolean r0 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r0 == 0) goto L_0x01ce
            goto L_0x01d2
        L_0x01ce:
            boolean r0 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r0 == 0) goto L_0x01d4
        L_0x01d2:
            r1 = r2
            goto L_0x01d8
        L_0x01d4:
            boolean r0 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r0 == 0) goto L_0x01d9
        L_0x01d8:
            return r1
        L_0x01d9:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x01df:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x01e5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.upload.data.UploadRepository.uploadFile(io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media, qf.d):java.lang.Object");
    }

    public UploadRepository(MessengerApi messengerApi2, ExternalUploadApi externalUploadApi2, UserIdentity userIdentity2, Context context2) {
        C6496s.h(messengerApi2, "messengerApi");
        C6496s.h(externalUploadApi2, "externalUploadApi");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(context2, "context");
        this.messengerApi = messengerApi2;
        this.externalUploadApi = externalUploadApi2;
        this.userIdentity = userIdentity2;
        this.context = context2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadRepository(MessengerApi messengerApi2, ExternalUploadApi externalUploadApi2, UserIdentity userIdentity2, Context context2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi2, (i10 & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi2, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity2, (i10 & 8) != 0 ? Injector.get().getApplication() : context2);
    }
}
