package com.revenuecat.purchases.google.usecase;

import Tg.a;
import com.android.billingclient.api.C3194a;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00028\u0000H&¢\u0006\u0004\b!\u0010\"JI\u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00028\u00002\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00020\u0007*\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u0005H\u0004¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R;\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\nj\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0014XD¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002XD¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001f\u0010:\u001a\u0002098\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0012\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "T", "", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/UseCaseParams;Lyf/l;Lyf/p;)V", "", "getStackTrace", "()Ljava/lang/String;", "Lcom/android/billingclient/api/e;", "billingResult", "forwardError", "(Lcom/android/billingclient/api/e;)V", "backoffOrRetryNetworkError", "(Lyf/l;Lcom/android/billingclient/api/e;)V", "backoffOrErrorIfServiceUnavailable", "retryWithBackoff", "()V", "delayMilliseconds", "run", "(J)V", "executeAsync", "received", "onOk", "(Ljava/lang/Object;)V", "response", "onSuccess", "processResult", "(Lcom/android/billingclient/api/e;Ljava/lang/Object;Lyf/l;Lyf/l;)V", "Lcom/android/billingclient/api/a;", "receivingFunction", "withConnectedClient", "(Lcom/android/billingclient/api/a;Lyf/l;)V", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "Lyf/l;", "Lyf/p;", "getExecuteRequestOnUIThread", "()Lyf/p;", "", "backoffForNetworkErrors", "Z", "getBackoffForNetworkErrors", "()Z", "", "maxRetries", "I", "retryAttempt", "LTg/a;", "retryBackoff", "J", "getErrorMessage", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final p executeRequestOnUIThread;
    private final int maxRetries = 3;
    /* access modifiers changed from: private */
    public final C6798l onError;
    private int retryAttempt;
    private long retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
    private final UseCaseParams useCaseParams;

    public BillingClientUseCase(UseCaseParams useCaseParams2, C6798l lVar, p pVar) {
        C6496s.h(useCaseParams2, "useCaseParams");
        C6496s.h(lVar, "onError");
        C6496s.h(pVar, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams2;
        this.onError = lVar;
        this.executeRequestOnUIThread = pVar;
    }

    private final void backoffOrErrorIfServiceUnavailable(C6798l lVar, C3198e eVar) {
        long j10;
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String format = String.format(BillingStrings.BILLING_SERVICE_UNAVAILABLE, Arrays.copyOf(new Object[]{Boolean.valueOf(this.useCaseParams.getAppInBackground())}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        if (this.useCaseParams.getAppInBackground()) {
            j10 = BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME();
        } else {
            j10 = BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND();
        }
        if (a.j(this.retryBackoff, j10) < 0) {
            retryWithBackoff();
        } else {
            lVar.invoke(eVar);
        }
    }

    private final void backoffOrRetryNetworkError(C6798l lVar, C3198e eVar) {
        int i10;
        if (getBackoffForNetworkErrors() && a.j(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i10 = this.retryAttempt) >= this.maxRetries) {
            lVar.invoke(eVar);
        } else {
            this.retryAttempt = i10 + 1;
            executeAsync();
        }
    }

    /* access modifiers changed from: private */
    public final void forwardError(C3198e eVar) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(eVar);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        C6798l lVar = this.onError;
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(eVar.b(), str);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        lVar.invoke(billingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        C6496s.g(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, C3198e eVar, Object obj, C6798l lVar, C6798l lVar2, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                lVar = new BillingClientUseCase$processResult$1(billingClientUseCase);
            }
            if ((i10 & 8) != 0) {
                lVar2 = new BillingClientUseCase$processResult$2(billingClientUseCase);
            }
            billingClientUseCase.processResult(eVar, obj, lVar, lVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
    }

    private final void retryWithBackoff() {
        long j10 = this.retryBackoff;
        this.retryBackoff = DurationExtensionsKt.m49minQTBD994(a.P(j10, 2), BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(a.t(j10));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            billingClientUseCase.run(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
    }

    public abstract void executeAsync();

    /* access modifiers changed from: protected */
    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final p getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t10);

    public final void processResult(C3198e eVar, T t10, C6798l lVar, C6798l lVar2) {
        C6496s.h(eVar, "billingResult");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        BillingResponse fromCode = BillingResponse.Companion.fromCode(eVar.b());
        if (C6496s.c(fromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.RETRY_TIMER_START;
            lVar.invoke(t10);
            return;
        }
        boolean z10 = true;
        if (C6496s.c(fromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0, 1, (Object) null);
        } else if (C6496s.c(fromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
            backoffOrErrorIfServiceUnavailable(lVar2, eVar);
        } else {
            if (!C6496s.c(fromCode, BillingResponse.NetworkError.INSTANCE)) {
                z10 = C6496s.c(fromCode, BillingResponse.Error.INSTANCE);
            }
            if (z10) {
                backoffOrRetryNetworkError(lVar2, eVar);
            } else {
                lVar2.invoke(eVar);
            }
        }
    }

    public final void run(long j10) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j10), new BillingClientUseCase$run$1(this));
    }

    /* access modifiers changed from: protected */
    public final void withConnectedClient(C3194a aVar, C6798l lVar) {
        C6496s.h(lVar, "receivingFunction");
        C6514M m10 = null;
        if (aVar != null) {
            if (!aVar.f()) {
                aVar = null;
            }
            if (aVar != null) {
                lVar.invoke(aVar);
                m10 = C6514M.f71813a;
            }
        }
        if (m10 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String format = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
    }
}
