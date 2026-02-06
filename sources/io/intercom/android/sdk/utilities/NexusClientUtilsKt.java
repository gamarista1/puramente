package io.intercom.android.sdk.utilities;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LUg/K;", "applicationScope", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "Lio/intercom/android/sdk/NexusWrapper;", "nexusWrapper", "Llf/M;", "handleNexusClientLifecycle", "(LUg/K;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/NexusWrapper;)V", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/NexusWrapper;Lqf/d;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NexusClientUtilsKt {
    public static final void handleNexusClientLifecycle(K k10, IntercomDataLayer intercomDataLayer, NexusWrapper nexusWrapper) {
        C6496s.h(k10, "applicationScope");
        C6496s.h(intercomDataLayer, "dataLayer");
        C6496s.h(nexusWrapper, "nexusWrapper");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new NexusClientUtilsKt$handleNexusClientLifecycle$1(intercomDataLayer, nexusWrapper, (C6658d<? super NexusClientUtilsKt$handleNexusClientLifecycle$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object handleNexusClientLifecycle(io.intercom.android.sdk.m5.data.IntercomDataLayer r4, io.intercom.android.sdk.NexusWrapper r5, qf.C6658d<? super lf.C6514M> r6) {
        /*
            boolean r0 = r6 instanceof io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2 r0 = (io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2 r0 = new io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            lf.w.b(r6)
            goto L_0x0046
        L_0x0031:
            lf.w.b(r6)
            Xg.B r6 = r4.getEvent()
            io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$3 r2 = new io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$3
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r4 = r6.collect(r2, r0)
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            lf.k r4 = new lf.k
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.utilities.NexusClientUtilsKt.handleNexusClientLifecycle(io.intercom.android.sdk.m5.data.IntercomDataLayer, io.intercom.android.sdk.NexusWrapper, qf.d):java.lang.Object");
    }
}
