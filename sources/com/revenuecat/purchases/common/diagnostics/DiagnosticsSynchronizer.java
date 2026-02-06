package com.revenuecat.purchases.common.diagnostics;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mf.C6565s;
import org.json.JSONObject;
import yf.C6787a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/Dispatcher;)V", "", "Lorg/json/JSONObject;", "getEventsToSync", "()Ljava/util/List;", "Lkotlin/Function0;", "Llf/M;", "command", "enqueue", "(Lyf/a;)V", "syncDiagnosticsFileIfNeeded", "()V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsSynchronizer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    /* access modifiers changed from: private */
    public final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    /* access modifiers changed from: private */
    public final DiagnosticsFileHelper diagnosticsFileHelper;
    /* access modifiers changed from: private */
    public final DiagnosticsHelper diagnosticsHelper;
    /* access modifiers changed from: private */
    public final DiagnosticsTracker diagnosticsTracker;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer$Companion;", "", "()V", "MAX_EVENTS_TO_SYNC_PER_REQUEST", "", "getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations", "MAX_NUMBER_POST_RETRIES", "getMAX_NUMBER_POST_RETRIES$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
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

    public DiagnosticsSynchronizer(DiagnosticsHelper diagnosticsHelper2, DiagnosticsFileHelper diagnosticsFileHelper2, DiagnosticsTracker diagnosticsTracker2, Backend backend2, Dispatcher dispatcher) {
        C6496s.h(diagnosticsHelper2, "diagnosticsHelper");
        C6496s.h(diagnosticsFileHelper2, "diagnosticsFileHelper");
        C6496s.h(diagnosticsTracker2, "diagnosticsTracker");
        C6496s.h(backend2, "backend");
        C6496s.h(dispatcher, "diagnosticsDispatcher");
        this.diagnosticsHelper = diagnosticsHelper2;
        this.diagnosticsFileHelper = diagnosticsFileHelper2;
        this.diagnosticsTracker = diagnosticsTracker2;
        this.backend = backend2;
        this.diagnosticsDispatcher = dispatcher;
    }

    private final void enqueue(C6787a aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new a(aVar), (Delay) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final List<JSONObject> getEventsToSync() {
        N n10 = new N();
        n10.f71759a = C6565s.n();
        this.diagnosticsFileHelper.readFileAsJson(new DiagnosticsSynchronizer$getEventsToSync$1(n10));
        return (List) n10.f71759a;
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1(this));
    }
}
