package com.revenuecat.purchases.common.networking;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.NetworkStrings;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6531o;
import lf.C6535s;
import mf.O;
import yf.C6787a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010!JM\u0010.\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000bH\u0000¢\u0006\u0004\b6\u0010\u0012J\u000f\u0010:\u001a\u00020\u0010H\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010<¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager;", "", "Landroid/content/Context;", "context", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "prefs", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lkotlin/Lazy;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "path", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "result", "eTag", "Llf/M;", "storeResult", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "getStoredResultSavedInSharedPreferences", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "resultFromBackend", "", "shouldStoreBackendResult", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Z", "storedResult", "verificationRequested", "shouldUseETag", "(Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;Z)Z", "refreshETag", "", "getETagHeaders$purchases_defaultsRelease", "(Ljava/lang/String;ZZ)Ljava/util/Map;", "getETagHeaders", "", "responseCode", "payload", "eTagHeader", "urlPathWithVersion", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "getHTTPResultFromCacheOrBackend$purchases_defaultsRelease", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getHTTPResultFromCacheOrBackend", "shouldUseCachedVersion$purchases_defaultsRelease", "(I)Z", "shouldUseCachedVersion", "getStoredResult$purchases_defaultsRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getStoredResult", "eTagInResponse", "storeBackendResultIfNoError$purchases_defaultsRelease", "storeBackendResultIfNoError", "clearCaches$purchases_defaultsRelease", "()V", "clearCaches", "Lkotlin/Lazy;", "Lcom/revenuecat/purchases/common/DateProvider;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ETagManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final DateProvider dateProvider;
    private final Lazy prefs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagManager$Companion;", "", "()V", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            C6496s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            C6496s.g(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.revenuecat.purchases.VerificationResult[] r0 = com.revenuecat.purchases.VerificationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.VerificationResult r1 = com.revenuecat.purchases.VerificationResult.VERIFIED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.VerificationResult r1 = com.revenuecat.purchases.VerificationResult.NOT_REQUESTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.VerificationResult r1 = com.revenuecat.purchases.VerificationResult.FAILED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.VerificationResult r1 = com.revenuecat.purchases.VerificationResult.VERIFIED_ON_DEVICE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.networking.ETagManager.WhenMappings.<clinit>():void");
        }
    }

    public ETagManager(Context context, Lazy lazy, DateProvider dateProvider2) {
        C6496s.h(context, "context");
        C6496s.h(lazy, "prefs");
        C6496s.h(dateProvider2, "dateProvider");
        this.prefs = lazy;
        this.dateProvider = dateProvider2;
    }

    public static /* synthetic */ Map getETagHeaders$purchases_defaultsRelease$default(ETagManager eTagManager, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return eTagManager.getETagHeaders$purchases_defaultsRelease(str, z10, z11);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = ((SharedPreferences) this.prefs.getValue()).getString(str, (String) null);
        if (string != null) {
            return HTTPResultWithETag.Companion.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult hTTPResult) {
        int responseCode = hTTPResult.getResponseCode();
        if (responseCode == 304 || responseCode >= 500 || hTTPResult.getVerificationResult() == VerificationResult.FAILED) {
            return false;
        }
        return true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag hTTPResultWithETag, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[hTTPResultWithETag.getHttpResult().getVerificationResult().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (!(i10 == 3 || i10 == 4)) {
                throw new C6535s();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        ((SharedPreferences) this.prefs.getValue()).edit().putString(str, new HTTPResultWithETag(new ETagData(str2, this.dateProvider.getNow()), HTTPResult.copy$default(hTTPResult, 0, (String) null, HTTPResult.Origin.CACHE, (Date) null, (VerificationResult) null, 27, (Object) null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_defaultsRelease() {
        ((SharedPreferences) this.prefs.getValue()).edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_defaultsRelease(String str, boolean z10, boolean z11) {
        HTTPResultWithETag hTTPResultWithETag;
        ETagData eTagData;
        String str2;
        Date lastRefreshTime;
        C6496s.h(str, "path");
        String str3 = null;
        if (z11) {
            hTTPResultWithETag = null;
        } else {
            hTTPResultWithETag = getStoredResultSavedInSharedPreferences(str);
        }
        if (hTTPResultWithETag == null || (eTagData = hTTPResultWithETag.getETagData()) == null || !shouldUseETag(hTTPResultWithETag, z10)) {
            eTagData = null;
        }
        if (eTagData != null) {
            str2 = eTagData.getETag();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Pair a10 = C6502A.a("X-RevenueCat-ETag", str2);
        if (!(eTagData == null || (lastRefreshTime = eTagData.getLastRefreshTime()) == null)) {
            str3 = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        return O.l(a10, C6502A.a(HTTPRequest.ETAG_LAST_REFRESH_NAME, str3));
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_defaultsRelease(int i10, String str, String str2, String str3, boolean z10, Date date, VerificationResult verificationResult) {
        HTTPResult hTTPResult;
        Date date2;
        String str4 = str2;
        String str5 = str3;
        C6496s.h(str, "payload");
        C6496s.h(str5, "urlPathWithVersion");
        C6496s.h(verificationResult, "verificationResult");
        HTTPResult hTTPResult2 = new HTTPResult(i10, str, HTTPResult.Origin.BACKEND, date, verificationResult);
        if (str4 != null) {
            if (shouldUseCachedVersion$purchases_defaultsRelease(i10)) {
                HTTPResult storedResult$purchases_defaultsRelease = getStoredResult$purchases_defaultsRelease(str5);
                if (storedResult$purchases_defaultsRelease != null) {
                    if (date == null) {
                        date2 = storedResult$purchases_defaultsRelease.getRequestDate();
                    } else {
                        date2 = date;
                    }
                    hTTPResult = HTTPResult.copy$default(storedResult$purchases_defaultsRelease, 0, (String) null, (HTTPResult.Origin) null, date2, verificationResult, 7, (Object) null);
                } else {
                    hTTPResult = null;
                }
                if (hTTPResult != null) {
                    return hTTPResult;
                }
                if (!z10) {
                    return null;
                }
                LogIntent logIntent = LogIntent.WARNING;
                String format = String.format(NetworkStrings.ETAG_CALL_ALREADY_RETRIED, Arrays.copyOf(new Object[]{hTTPResult2}, 1));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(logIntent, format);
                return hTTPResult2;
            }
            storeBackendResultIfNoError$purchases_defaultsRelease(str5, hTTPResult2, str2);
        }
        return hTTPResult2;
    }

    public final HTTPResult getStoredResult$purchases_defaultsRelease(String str) {
        C6496s.h(str, "path");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_defaultsRelease(int i10) {
        return i10 == 304;
    }

    public final void storeBackendResultIfNoError$purchases_defaultsRelease(String str, HTTPResult hTTPResult, String str2) {
        C6496s.h(str, "path");
        C6496s.h(hTTPResult, "resultFromBackend");
        C6496s.h(str2, "eTagInResponse");
        if (shouldStoreBackendResult(hTTPResult)) {
            storeResult(str, hTTPResult, str2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ETagManager(final Context context, Lazy lazy, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? C6531o.b(new C6787a() {
            public final SharedPreferences invoke() {
                return ETagManager.Companion.initializeSharedPreferences(context);
            }
        }) : lazy, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider2);
    }
}
