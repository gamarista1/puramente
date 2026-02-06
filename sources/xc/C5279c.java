package xc;

import Ac.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import vc.h;

/* renamed from: xc.c  reason: case insensitive filesystem */
public class C5279c implements ResponseHandler {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseHandler f62229a;

    /* renamed from: b  reason: collision with root package name */
    private final l f62230b;

    /* renamed from: c  reason: collision with root package name */
    private final h f62231c;

    public C5279c(ResponseHandler responseHandler, l lVar, h hVar) {
        this.f62229a = responseHandler;
        this.f62230b = lVar;
        this.f62231c = hVar;
    }

    public Object handleResponse(HttpResponse httpResponse) {
        this.f62231c.y(this.f62230b.c());
        this.f62231c.n(httpResponse.getStatusLine().getStatusCode());
        Long a10 = d.a(httpResponse);
        if (a10 != null) {
            this.f62231c.v(a10.longValue());
        }
        String b10 = d.b(httpResponse);
        if (b10 != null) {
            this.f62231c.u(b10);
        }
        this.f62231c.b();
        return this.f62229a.handleResponse(httpResponse);
    }
}
