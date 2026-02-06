package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import rh.C6703A;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/api/IntercomFlipperClient;", "", "<init>", "()V", "Lrh/A$a;", "builder", "Landroid/content/Context;", "context", "Llf/M;", "addInterceptor", "(Lrh/A$a;Landroid/content/Context;)V", "addDefaultFlipperInterceptor", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomFlipperClient {
    public static final int $stable = 0;
    public static final IntercomFlipperClient INSTANCE = new IntercomFlipperClient();

    private IntercomFlipperClient() {
    }

    public final void addDefaultFlipperInterceptor(C6703A.a aVar, Context context) {
        C6496s.h(aVar, "builder");
        C6496s.h(context, "context");
    }

    public final void addInterceptor(C6703A.a aVar, Context context) {
        C6496s.h(aVar, "builder");
        C6496s.h(context, "context");
    }
}
