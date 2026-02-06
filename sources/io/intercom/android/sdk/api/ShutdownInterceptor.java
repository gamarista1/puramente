package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import rh.E;
import rh.F;
import rh.w;

public class ShutdownInterceptor implements w {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState2) {
        this.shutdownState = shutdownState2;
    }

    public E intercept(w.a aVar) {
        if (this.shutdownState.canSendNetworkRequests()) {
            E a10 = aVar.a(aVar.request());
            if (!a10.m0()) {
                F a11 = a10.a();
                String E10 = a11.E();
                a10 = a10.T().b(F.v(a11.q(), E10)).c();
                a11.close();
                try {
                    JSONObject jSONObject = new JSONObject(E10).getJSONObject("error");
                    if (jSONObject.getString(TYPE).equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                        long j10 = jSONObject.getLong(SHUTDOWN_PERIOD);
                        this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(j10), jSONObject.getString("message"));
                    }
                } catch (JSONException unused) {
                    Twig twig2 = this.twig;
                    twig2.internal("Failed to deserialise error response: `" + E10 + "` message: `" + a10.M() + "`");
                }
            }
            return a10;
        }
        this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
        throw new IOException(this.shutdownState.getShutdownReason());
    }
}
