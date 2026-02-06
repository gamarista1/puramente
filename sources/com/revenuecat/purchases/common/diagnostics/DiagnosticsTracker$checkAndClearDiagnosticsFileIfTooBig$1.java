package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1 extends C6498u implements C6787a {
    final /* synthetic */ C6787a $completion;
    final /* synthetic */ DiagnosticsTracker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1(DiagnosticsTracker diagnosticsTracker, C6787a aVar) {
        super(0);
        this.this$0 = diagnosticsTracker;
        this.$completion = aVar;
    }

    public final void invoke() {
        if (this.this$0.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
            LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
            this.this$0.diagnosticsHelper.resetDiagnosticsStatus();
            DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(this.this$0, false, 1, (Object) null);
        }
        this.$completion.invoke();
    }
}
