package com.revenuecat.purchases;

import Sg.p;
import android.content.Context;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6535s;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0002\b0J\u0013\u00101\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u00103\u001a\u000204H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00148FX\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "", "getDiagnosticsEnabled", "()Z", "observerMode", "getObserverMode$annotations", "()V", "getObserverMode", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "service", "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", "store", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "copy", "copy$purchases_defaultsRelease", "equals", "other", "hashCode", "", "Builder", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\b\u0010:\u001a\u00020;H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010<\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0016H\u0007J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0016H\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR&\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\t\u001a\u0004\u0018\u00010%8@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010+\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u00105\u001a\u0002042\u0006\u0010\t\u001a\u0002048@@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_defaultsRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_defaultsRelease", "setAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "getContext$purchases_defaultsRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_defaultsRelease", "()Z", "setDiagnosticsEnabled$purchases_defaultsRelease", "(Z)V", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getPurchasesAreCompletedBy$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "Ljava/util/concurrent/ExecutorService;", "service", "getService$purchases_defaultsRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_defaultsRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_defaultsRelease", "setShowInAppMessagesAutomatically$purchases_defaultsRelease", "Lcom/revenuecat/purchases/Store;", "store", "getStore$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", "build", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "observerMode", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private DangerousSettings dangerousSettings = new DangerousSettings(false, 1, (DefaultConstructorMarker) null);
        private boolean diagnosticsEnabled;
        private boolean pendingTransactionsForPrepaidPlansEnabled;
        private PurchasesAreCompletedBy purchasesAreCompletedBy = PurchasesAreCompletedBy.REVENUECAT;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically = true;
        private Store store = Store.PLAY_STORE;
        private EntitlementVerificationMode verificationMode = EntitlementVerificationMode.Companion.getDefault();

        public Builder(Context context2, String str) {
            C6496s.h(context2, "context");
            C6496s.h(str, "apiKey");
            this.context = context2;
            this.apiKey = str;
        }

        public final Builder appUserID(String str) {
            this.appUserID = str;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings2) {
            C6496s.h(dangerousSettings2, "dangerousSettings");
            this.dangerousSettings = dangerousSettings2;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean z10) {
            this.diagnosticsEnabled = z10;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode entitlementVerificationMode) {
            C6496s.h(entitlementVerificationMode, "verificationMode");
            this.verificationMode = entitlementVerificationMode;
            return this;
        }

        public final /* synthetic */ String getApiKey$purchases_defaultsRelease() {
            return this.apiKey;
        }

        public final /* synthetic */ String getAppUserID$purchases_defaultsRelease() {
            return this.appUserID;
        }

        public final /* synthetic */ Context getContext$purchases_defaultsRelease() {
            return this.context;
        }

        public final /* synthetic */ DangerousSettings getDangerousSettings$purchases_defaultsRelease() {
            return this.dangerousSettings;
        }

        public final /* synthetic */ boolean getDiagnosticsEnabled$purchases_defaultsRelease() {
            return this.diagnosticsEnabled;
        }

        public final /* synthetic */ boolean getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final /* synthetic */ PurchasesAreCompletedBy getPurchasesAreCompletedBy$purchases_defaultsRelease() {
            return this.purchasesAreCompletedBy;
        }

        public final /* synthetic */ ExecutorService getService$purchases_defaultsRelease() {
            return this.service;
        }

        public final /* synthetic */ boolean getShowInAppMessagesAutomatically$purchases_defaultsRelease() {
            return this.showInAppMessagesAutomatically;
        }

        public final /* synthetic */ Store getStore$purchases_defaultsRelease() {
            return this.store;
        }

        public final /* synthetic */ EntitlementVerificationMode getVerificationMode$purchases_defaultsRelease() {
            return this.verificationMode;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        @C6521e
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean z10) {
            if (z10) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
            } else {
                this.verificationMode = EntitlementVerificationMode.DISABLED;
                this.diagnosticsEnabled = false;
            }
            return this;
        }

        @C6521e
        public final Builder observerMode(boolean z10) {
            PurchasesAreCompletedBy purchasesAreCompletedBy2;
            if (z10) {
                purchasesAreCompletedBy2 = PurchasesAreCompletedBy.MY_APP;
            } else {
                purchasesAreCompletedBy2 = PurchasesAreCompletedBy.REVENUECAT;
            }
            purchasesAreCompletedBy(purchasesAreCompletedBy2);
            return this;
        }

        public final Builder pendingTransactionsForPrepaidPlansEnabled(boolean z10) {
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
            return this;
        }

        public final Builder purchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy2) {
            C6496s.h(purchasesAreCompletedBy2, "purchasesAreCompletedBy");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy2;
            return this;
        }

        public final Builder service(ExecutorService executorService) {
            C6496s.h(executorService, "service");
            this.service = executorService;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_defaultsRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_defaultsRelease(DangerousSettings dangerousSettings2) {
            C6496s.h(dangerousSettings2, "<set-?>");
            this.dangerousSettings = dangerousSettings2;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z10) {
            this.diagnosticsEnabled = z10;
        }

        public final /* synthetic */ void setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease(boolean z10) {
            this.pendingTransactionsForPrepaidPlansEnabled = z10;
        }

        public final /* synthetic */ void setPurchasesAreCompletedBy$purchases_defaultsRelease(PurchasesAreCompletedBy purchasesAreCompletedBy2) {
            C6496s.h(purchasesAreCompletedBy2, "<set-?>");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy2;
        }

        public final /* synthetic */ void setService$purchases_defaultsRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
        }

        public final /* synthetic */ void setStore$purchases_defaultsRelease(Store store2) {
            C6496s.h(store2, "<set-?>");
            this.store = store2;
        }

        public final /* synthetic */ void setVerificationMode$purchases_defaultsRelease(EntitlementVerificationMode entitlementVerificationMode) {
            C6496s.h(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
            return this;
        }

        public final Builder store(Store store2) {
            C6496s.h(store2, ProductResponseJsonKeys.STORE);
            this.store = store2;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.revenuecat.purchases.PurchasesAreCompletedBy[] r0 = com.revenuecat.purchases.PurchasesAreCompletedBy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.PurchasesAreCompletedBy r1 = com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesConfiguration.WhenMappings.<clinit>():void");
        }
    }

    public PurchasesConfiguration(Builder builder) {
        C6496s.h(builder, "builder");
        Context applicationContext = builder.getContext$purchases_defaultsRelease().getApplicationContext();
        C6496s.g(applicationContext, "builder.context.applicationContext");
        this.context = applicationContext;
        this.apiKey = p.g1(builder.getApiKey$purchases_defaultsRelease()).toString();
        this.appUserID = builder.getAppUserID$purchases_defaultsRelease();
        this.purchasesAreCompletedBy = builder.getPurchasesAreCompletedBy$purchases_defaultsRelease();
        this.service = builder.getService$purchases_defaultsRelease();
        this.store = builder.getStore$purchases_defaultsRelease();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled$purchases_defaultsRelease();
        this.verificationMode = builder.getVerificationMode$purchases_defaultsRelease();
        this.dangerousSettings = builder.getDangerousSettings$purchases_defaultsRelease();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically$purchases_defaultsRelease();
        this.pendingTransactionsForPrepaidPlansEnabled = builder.getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease();
    }

    public static /* synthetic */ PurchasesConfiguration copy$purchases_defaultsRelease$default(PurchasesConfiguration purchasesConfiguration, String str, ExecutorService executorService, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = purchasesConfiguration.appUserID;
            }
            if ((i10 & 2) != 0) {
                executorService = purchasesConfiguration.service;
            }
            return purchasesConfiguration.copy$purchases_defaultsRelease(str, executorService);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @C6521e
    public static /* synthetic */ void getObserverMode$annotations() {
    }

    public final PurchasesConfiguration copy$purchases_defaultsRelease(String str, ExecutorService executorService) {
        Builder pendingTransactionsForPrepaidPlansEnabled2 = new Builder(this.context, this.apiKey).appUserID(str).purchasesAreCompletedBy(this.purchasesAreCompletedBy).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled);
        if (executorService != null) {
            pendingTransactionsForPrepaidPlansEnabled2 = pendingTransactionsForPrepaidPlansEnabled2.service(executorService);
        }
        return pendingTransactionsForPrepaidPlansEnabled2.build();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C6496s.c(cls2, cls)) {
            return false;
        }
        C6496s.f(obj, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesConfiguration");
        PurchasesConfiguration purchasesConfiguration = (PurchasesConfiguration) obj;
        if (C6496s.c(this.apiKey, purchasesConfiguration.apiKey) && C6496s.c(this.appUserID, purchasesConfiguration.appUserID) && this.purchasesAreCompletedBy == purchasesConfiguration.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == purchasesConfiguration.showInAppMessagesAutomatically && this.store == purchasesConfiguration.store && this.diagnosticsEnabled == purchasesConfiguration.diagnosticsEnabled && C6496s.c(this.dangerousSettings, purchasesConfiguration.dangerousSettings) && this.verificationMode == purchasesConfiguration.verificationMode && this.pendingTransactionsForPrepaidPlansEnabled == purchasesConfiguration.pendingTransactionsForPrepaidPlansEnabled) {
            return true;
        }
        return false;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.purchasesAreCompletedBy.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        throw new C6535s();
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.apiKey.hashCode() * 31;
        String str = this.appUserID;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((((((((hashCode + i10) * 31) + this.purchasesAreCompletedBy.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically)) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.diagnosticsEnabled)) * 31) + this.dangerousSettings.hashCode()) * 31) + this.verificationMode.hashCode()) * 31) + Boolean.hashCode(this.pendingTransactionsForPrepaidPlansEnabled);
    }
}
