package io.invertase.firebase.database;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;

public class N extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f71333a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71334b;

    N(int i10, String str, Throwable th2) {
        super(str, th2);
        String str2;
        String str3;
        if (i10 == -25) {
            str3 = "write-cancelled";
            str2 = "The write was canceled by the user.";
        } else if (i10 == -24) {
            str3 = "network-error";
            str2 = "The operation could not be performed due to a network error.";
        } else if (i10 == -4) {
            str3 = "disconnected";
            str2 = "The operation had to be aborted due to a network disconnect.";
        } else if (i10 == -3) {
            str3 = "permission-denied";
            str2 = "Client doesn't have permission to access the desired data.";
        } else if (i10 == -2) {
            str3 = "failure";
            str2 = "The server indicated that this operation failed.";
        } else if (i10 != -1) {
            switch (i10) {
                case IntegrityErrorCode.NONCE_TOO_SHORT:
                    str3 = "unavailable";
                    str2 = "The service is unavailable.";
                    break;
                case -9:
                    str3 = "overridden-by-set";
                    str2 = "The transaction was overridden by a subsequent set.";
                    break;
                case -8:
                    str3 = "max-retries";
                    str2 = "The transaction had too many retries.";
                    break;
                case -7:
                    str3 = "invalid-token";
                    str2 = "The supplied auth token was invalid.";
                    break;
                case -6:
                    str3 = "expired-token";
                    str2 = "The supplied auth token has expired.";
                    break;
                default:
                    str3 = "unknown";
                    str2 = "An unknown error occurred";
                    break;
            }
        } else {
            str3 = "data-stale";
            str2 = "The transaction needs to be run again with current data.";
        }
        this.f71333a = str3;
        this.f71334b = str2;
    }

    public String a() {
        return this.f71333a;
    }

    public String getMessage() {
        return this.f71334b;
    }
}
