package com.revenuecat.purchases.common.diagnostics;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import yf.C6787a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lkotlin/Lazy;)V", "Llf/M;", "resetDiagnosticsStatus", "()V", "clearConsecutiveNumberOfErrors", "", "increaseConsecutiveNumberOfErrors", "()I", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lkotlin/Lazy;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsHelper {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final Lazy sharedPreferences;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper$Companion;", "", "()V", "CONSECUTIVE_FAILURES_COUNT_KEY", "", "getCONSECUTIVE_FAILURES_COUNT_KEY$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            C6496s.h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            C6496s.g(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    public DiagnosticsHelper(Context context, DiagnosticsFileHelper diagnosticsFileHelper2, Lazy lazy) {
        C6496s.h(context, "context");
        C6496s.h(diagnosticsFileHelper2, "diagnosticsFileHelper");
        C6496s.h(lazy, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper2;
        this.sharedPreferences = lazy;
    }

    public final void clearConsecutiveNumberOfErrors() {
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    public final int increaseConsecutiveNumberOfErrors() {
        int i10 = ((SharedPreferences) this.sharedPreferences.getValue()).getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        ((SharedPreferences) this.sharedPreferences.getValue()).edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i10).apply();
        return i10;
    }

    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiagnosticsHelper(final Context context, DiagnosticsFileHelper diagnosticsFileHelper2, Lazy lazy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, diagnosticsFileHelper2, (i10 & 4) != 0 ? C6531o.b(new C6787a() {
            public final SharedPreferences invoke() {
                return DiagnosticsHelper.Companion.initializeSharedPreferences(context);
            }
        }) : lazy);
    }
}
