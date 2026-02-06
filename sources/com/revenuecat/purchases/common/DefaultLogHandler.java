package com.revenuecat.purchases.common;

import android.util.Log;
import com.revenuecat.purchases.LogHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/DefaultLogHandler;", "Lcom/revenuecat/purchases/LogHandler;", "<init>", "()V", "", "tag", "msg", "Llf/M;", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "i", "w", "", "throwable", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultLogHandler implements LogHandler {
    public void d(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        Log.d(str, str2);
    }

    public void e(String str, String str2, Throwable th2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        if (th2 != null) {
            Log.e(str, str2, th2);
        } else {
            Log.e(str, str2);
        }
    }

    public void i(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        Log.i(str, str2);
    }

    public void v(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        Log.v(str, str2);
    }

    public void w(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        Log.w(str, str2);
    }
}
