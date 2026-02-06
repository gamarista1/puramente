package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1 extends C6498u implements C6787a {
    final /* synthetic */ DiagnosticsSynchronizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        super(0);
        this.this$0 = diagnosticsSynchronizer;
    }

    public final void invoke() {
        try {
            List access$getEventsToSync = this.this$0.getEventsToSync();
            final int size = access$getEventsToSync.size();
            if (size == 0) {
                LogUtilsKt.verboseLog("No diagnostics to sync.");
                return;
            }
            Backend access$getBackend$p = this.this$0.backend;
            final DiagnosticsSynchronizer diagnosticsSynchronizer = this.this$0;
            AnonymousClass1 r32 = new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((JSONObject) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(JSONObject jSONObject) {
                    C6496s.h(jSONObject, "it");
                    LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
                    diagnosticsSynchronizer.diagnosticsHelper.clearConsecutiveNumberOfErrors();
                    diagnosticsSynchronizer.diagnosticsFileHelper.clear(size);
                }
            };
            final DiagnosticsSynchronizer diagnosticsSynchronizer2 = this.this$0;
            access$getBackend$p.postDiagnostics(access$getEventsToSync, r32, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                    return C6514M.f71813a;
                }

                public final void invoke(PurchasesError purchasesError, boolean z10) {
                    C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                    if (z10) {
                        LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Will retry the next time the SDK is initialized");
                        if (diagnosticsSynchronizer2.diagnosticsHelper.increaseConsecutiveNumberOfErrors() >= 3) {
                            LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                            diagnosticsSynchronizer2.diagnosticsHelper.resetDiagnosticsStatus();
                            diagnosticsSynchronizer2.diagnosticsTracker.trackMaxDiagnosticsSyncRetriesReached();
                            return;
                        }
                        return;
                    }
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Deleting diagnostics file without retrying.");
                    diagnosticsSynchronizer2.diagnosticsHelper.resetDiagnosticsStatus();
                    diagnosticsSynchronizer2.diagnosticsTracker.trackClearingDiagnosticsAfterFailedSync();
                }
            });
        } catch (Exception e10) {
            LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e10);
            try {
                this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
            } catch (IOException e11) {
                LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e11);
            }
        }
    }
}
