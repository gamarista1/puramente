package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "intent", "", "message", "Llf/M;", "log", "(Lcom/revenuecat/purchases/common/LogIntent;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/LogHandler;", "currentLogHandler", "Lcom/revenuecat/purchases/LogHandler;", "getCurrentLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setCurrentLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LogWrapperKt {
    private static LogHandler currentLogHandler = new DefaultLogHandler();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.revenuecat.purchases.common.LogIntent[] r0 = com.revenuecat.purchases.common.LogIntent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.GOOGLE_WARNING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.INFO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.PURCHASE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.RC_ERROR     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.RC_PURCHASE_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.RC_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.USER     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.WARNING     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.AMAZON_WARNING     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.AMAZON_ERROR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.<clinit>():void");
        }
    }

    public static final LogHandler getCurrentLogHandler() {
        return currentLogHandler;
    }

    public static final void log(LogIntent logIntent, String str) {
        C6496s.h(logIntent, "intent");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        String str2 = C6565s.x0(logIntent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + ' ' + str;
        switch (WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogUtilsKt.debugLog(str2);
                return;
            case 2:
                LogUtilsKt.errorLog$default(str2, (Throwable) null, 2, (Object) null);
                return;
            case 3:
                LogUtilsKt.warnLog(str2);
                return;
            case 4:
                LogUtilsKt.infoLog(str2);
                return;
            case 5:
                LogUtilsKt.debugLog(str2);
                return;
            case 6:
                LogUtilsKt.errorLog$default(str2, (Throwable) null, 2, (Object) null);
                return;
            case 7:
                LogUtilsKt.infoLog(str2);
                return;
            case 8:
                LogUtilsKt.debugLog(str2);
                return;
            case 9:
                LogUtilsKt.debugLog(str2);
                return;
            case 10:
                LogUtilsKt.warnLog(str2);
                return;
            case 11:
                LogUtilsKt.warnLog(str2);
                return;
            case 12:
                LogUtilsKt.errorLog$default(str2, (Throwable) null, 2, (Object) null);
                return;
            default:
                return;
        }
    }

    public static final void setCurrentLogHandler(LogHandler logHandler) {
        C6496s.h(logHandler, "<set-?>");
        currentLogHandler = logHandler;
    }
}
