package io.intercom.android.sdk.api;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.k;
import com.intercom.twig.Twig;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"extractErrorString", "", "errorObject", "Lio/intercom/android/sdk/api/ErrorObject;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorStringExtractorKt {
    public static final String extractErrorString(ErrorObject errorObject) {
        C6496s.h(errorObject, "errorObject");
        Twig logger = LumberMill.getLogger();
        if (!errorObject.hasErrorBody() || errorObject.getErrorBody() == null) {
            return "Something went wrong";
        }
        try {
            k kVar = (k) Injector.get().getGson().m(errorObject.getErrorBody(), k.class);
            if (kVar == null) {
                return "Something went wrong";
            }
            if (kVar.z(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)) {
                String g10 = kVar.v(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR).g();
                C6496s.e(g10);
                return g10;
            } else if (!kVar.z("errors")) {
                return "Something went wrong";
            } else {
                g x10 = kVar.x("errors");
                C6496s.g(x10, "getAsJsonArray(...)");
                return C6565s.x0(x10, " - ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new e(), 30, (Object) null);
            }
        } catch (Exception e10) {
            logger.e(e10);
            String message = errorObject.getThrowable().getMessage();
            if (message == null) {
                return "Something went wrong";
            }
            return message;
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence extractErrorString$lambda$0(h hVar) {
        if (!hVar.m() || !hVar.b().z(MetricTracker.Object.MESSAGE)) {
            return "Something went wrong";
        }
        String g10 = hVar.b().v(MetricTracker.Object.MESSAGE).g();
        C6496s.e(g10);
        return g10;
    }
}
