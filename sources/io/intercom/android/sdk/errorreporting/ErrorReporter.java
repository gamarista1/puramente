package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import com.google.gson.e;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;

public class ErrorReporter {
    private final Provider<Api> apiProvider;
    private final ExceptionParser exceptionParser;
    private final ErrorReportStore reportStore;

    ErrorReporter(ErrorReportStore errorReportStore, Provider<Api> provider, ExceptionParser exceptionParser2) {
        this.reportStore = errorReportStore;
        this.apiProvider = provider;
        this.exceptionParser = exceptionParser2;
    }

    public static ErrorReporter create(Context context, e eVar, Provider<Api> provider) {
        return new ErrorReporter(ErrorReportStore.create(context.getApplicationContext(), eVar), provider, new ExceptionParser());
    }

    public void disableExceptionHandler() {
        IntercomExceptionHandler.disable();
        this.reportStore.deleteFromDisk();
    }

    public void enableExceptionHandler() {
        IntercomExceptionHandler.enable(this);
    }

    /* access modifiers changed from: package-private */
    public void saveReport(Throwable th2) {
        if (this.exceptionParser.containsIntercomMethod(th2)) {
            this.reportStore.saveToDisk(this.exceptionParser.createReportFrom(th2));
        }
    }

    public void sendSavedReport() {
        this.reportStore.sendSavedReport(this.apiProvider);
    }
}
