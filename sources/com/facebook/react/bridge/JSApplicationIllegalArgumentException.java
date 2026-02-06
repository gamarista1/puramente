package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;", "Lcom/facebook/react/bridge/JSApplicationCausedNativeException;", "detailMessage", "", "<init>", "(Ljava/lang/String;)V", "t", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JSApplicationIllegalArgumentException extends JSApplicationCausedNativeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JSApplicationIllegalArgumentException(String str) {
        super(str);
        C6496s.h(str, "detailMessage");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JSApplicationIllegalArgumentException(String str, Throwable th2) {
        super(str, th2);
        C6496s.h(str, "detailMessage");
        C6496s.h(th2, "t");
    }
}
