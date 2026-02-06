package com.amazon.device.simplesignin.a.a.c;

import android.util.Log;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import java.util.Map;

public class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f38045b = "SSI_PublishMetric";

    /* renamed from: c  reason: collision with root package name */
    private static final String f38046c = "1.0";

    /* renamed from: d  reason: collision with root package name */
    private static final String f38047d = "b";

    b(a aVar, SSIEventRequest sSIEventRequest) {
        super(aVar, f38045b, "1.0");
        super.a(a.f38021t, sSIEventRequest.getEvent().toString());
        super.a(a.f38022u, sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.a(a.f38023v, sSIEventRequest.getFailureReason().toString());
        } else {
            super.a(a.f38023v, "NA");
        }
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        if (!b10.containsKey(a.f38020s)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        b(RequestStatus.SUCCESSFUL);
        return Boolean.parseBoolean(b10.get(a.f38020s).toString());
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        String str = f38047d;
        Log.i(str, "Response for request id: " + dVar.e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(dVar.e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.a((Object) recordMetricsEventResponse);
    }
}
