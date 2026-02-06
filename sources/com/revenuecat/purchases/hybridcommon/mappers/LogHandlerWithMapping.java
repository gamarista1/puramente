package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0010R,\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/mappers/LogHandlerWithMapping;", "Lcom/revenuecat/purchases/LogHandler;", "Lkotlin/Function1;", "", "", "Llf/M;", "callback", "<init>", "(Lyf/l;)V", "Lcom/revenuecat/purchases/LogLevel;", "logLevel", "msg", "invokeCallback", "(Lcom/revenuecat/purchases/LogLevel;Ljava/lang/String;)V", "tag", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "i", "v", "w", "Lyf/l;", "hybridcommon_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LogHandlerWithMapping implements LogHandler {
    private final C6798l callback;

    public LogHandlerWithMapping(C6798l lVar) {
        C6496s.h(lVar, "callback");
        this.callback = lVar;
    }

    private final void invokeCallback(LogLevel logLevel, String str) {
        C6798l lVar = this.callback;
        String upperCase = logLevel.name().toUpperCase(Locale.ROOT);
        C6496s.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        lVar.invoke(O.l(C6502A.a("logLevel", upperCase), C6502A.a(MetricTracker.Object.MESSAGE, str)));
    }

    public void d(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        invokeCallback(LogLevel.DEBUG, str2);
    }

    public void e(String str, String str2, Throwable th2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        if (th2 != null) {
            String str3 = str2 + ". Throwable: " + th2;
            if (str3 != null) {
                str2 = str3;
            }
        }
        invokeCallback(LogLevel.ERROR, str2);
    }

    public void i(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        invokeCallback(LogLevel.INFO, str2);
    }

    public void v(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        invokeCallback(LogLevel.VERBOSE, str2);
    }

    public void w(String str, String str2) {
        C6496s.h(str, "tag");
        C6496s.h(str2, "msg");
        invokeCallback(LogLevel.WARN, str2);
    }
}
