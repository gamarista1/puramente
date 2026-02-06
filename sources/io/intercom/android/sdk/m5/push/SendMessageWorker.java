package io.intercom.android.sdk.m5.push;

import Ug.L;
import Ug.Z;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/push/SendMessageWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/r$a;", "doWork", "(Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public final class SendMessageWorker extends CoroutineWorker {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final ConversationRepository conversationRepository = new ConversationRepository((MessengerApi) null, (UploadRepository) null, (Api) null, (UserIdentity) null, (NexusClient) null, L.a(Z.b()), 31, (DefaultConstructorMarker) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendMessageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C6496s.h(context, "context");
        C6496s.h(workerParameters, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(qf.C6658d<? super androidx.work.r.a> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1 r0 = (io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1 r0 = new io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r11)
            goto L_0x0080
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0031:
            lf.w.b(r11)
            androidx.work.g r11 = r10.getInputData()
            java.lang.String r2 = "io.intercom.android.sdk.INTERCOM_KEY_TEXT_REPLY"
            java.lang.String r5 = r11.i(r2)
            java.lang.String r11 = "failure(...)"
            if (r5 != 0) goto L_0x004a
            androidx.work.r$a r0 = androidx.work.r.a.a()
            kotlin.jvm.internal.C6496s.g(r0, r11)
            return r0
        L_0x004a:
            androidx.work.g r2 = r10.getInputData()
            java.lang.String r4 = "io.intercom.android.sdk.INTERCOM_KEY_CONVERSATION_ID"
            java.lang.String r7 = r2.i(r4)
            if (r7 != 0) goto L_0x005e
            androidx.work.r$a r0 = androidx.work.r.a.a()
            kotlin.jvm.internal.C6496s.g(r0, r11)
            return r0
        L_0x005e:
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r8 = r11.toString()
            java.lang.String r11 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r8, r11)
            Ug.G r11 = Ug.Z.b()
            io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1 r2 = new io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1
            r9 = 0
            r4 = r2
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = Ug.C5572i.g(r11, r2, r0)
            if (r11 != r1) goto L_0x0080
            return r1
        L_0x0080:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.C6496s.g(r11, r0)
            androidx.work.r$a r11 = (androidx.work.r.a) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.push.SendMessageWorker.doWork(qf.d):java.lang.Object");
    }
}
