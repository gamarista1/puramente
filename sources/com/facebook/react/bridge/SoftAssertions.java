package com.facebook.react.bridge;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/bridge/SoftAssertions;", "", "<init>", "()V", "", "message", "Llf/M;", "assertUnreachable", "(Ljava/lang/String;)V", "", "condition", "assertCondition", "(ZLjava/lang/String;)V", "T", "instance", "assertNotNull", "(Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SoftAssertions {
    public static final SoftAssertions INSTANCE = new SoftAssertions();

    private SoftAssertions() {
    }

    public static final void assertCondition(boolean z10, String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (!z10) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
        }
    }

    public static final <T> T assertNotNull(T t10) {
        if (t10 == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t10;
    }

    public static final void assertUnreachable(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }
}
