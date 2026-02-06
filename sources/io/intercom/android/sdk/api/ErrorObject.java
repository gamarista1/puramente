package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import retrofit2.F;

public class ErrorObject {
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th2, F f10) {
        this.throwable = th2;
        this.errorBody = parseErrorBody(f10);
        this.statusCode = parseStatusCode(f10);
    }

    private String parseErrorBody(F f10) {
        if (f10 == null || f10.d() == null) {
            return null;
        }
        try {
            return f10.d().E();
        } catch (IOException e10) {
            Twig twig2 = this.twig;
            twig2.internal("Couldn't parse error body: " + e10.getMessage());
            return null;
        }
    }

    private int parseStatusCode(F f10) {
        if (f10 != null) {
            return f10.b();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    /* access modifiers changed from: package-private */
    public boolean hasErrorBody() {
        if (this.errorBody != null) {
            return true;
        }
        return false;
    }
}
