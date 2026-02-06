package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import retrofit2.C6671d;
import retrofit2.C6673f;
import retrofit2.F;

public abstract class BaseCallback<T> implements C6673f {
    private final Twig twig = LumberMill.getLogger();

    static String getDetails(ErrorObject errorObject) {
        String str;
        if (errorObject.hasErrorBody()) {
            str = errorObject.getErrorBody();
        } else {
            str = errorObject.getThrowable().getMessage();
        }
        if (str == null) {
            return "unknown error";
        }
        return str;
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    /* access modifiers changed from: package-private */
    public void logFailure(String str, ErrorObject errorObject) {
        Twig twig2 = this.twig;
        twig2.e(str + ": " + getDetails(errorObject), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public void onError(ErrorObject errorObject) {
    }

    public final void onFailure(C6671d<T> dVar, Throwable th2) {
        handleError(new ErrorObject(th2, (F) null));
    }

    public final void onResponse(C6671d<T> dVar, F<T> f10) {
        if (f10 == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), (F) null));
        } else if (f10.a() == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), f10));
        } else if (!f10.e()) {
            handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), f10));
        } else {
            onSuccess(f10.a());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onSuccess(T t10);
}
