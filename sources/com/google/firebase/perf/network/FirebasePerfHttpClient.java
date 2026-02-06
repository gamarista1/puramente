package com.google.firebase.perf.network;

import Ac.l;
import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import vc.h;
import xc.C5279c;
import xc.d;
import zc.C5313k;

public class FirebasePerfHttpClient {
    static Object a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = d.a(httpRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new C5279c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static Object b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = d.a(httpRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            return httpClient.execute(httpHost, httpRequest, new C5279c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static Object c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = d.a(httpUriRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            return httpClient.execute(httpUriRequest, new C5279c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static Object d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = d.a(httpUriRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            return httpClient.execute(httpUriRequest, new C5279c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = d.a(httpRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.y(lVar.c());
            c10.n(execute.getStatusLine().getStatusCode());
            Long a11 = d.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = d.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), C5313k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpHost.toURI() + httpRequest.getRequestLine().getUri()).l(httpRequest.getRequestLine().getMethod());
            Long a10 = d.a(httpRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.y(lVar.c());
            c10.n(execute.getStatusLine().getStatusCode());
            Long a11 = d.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = d.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = d.a(httpUriRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.y(lVar.c());
            c10.n(execute.getStatusLine().getStatusCode());
            Long a11 = d.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = d.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, C5313k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.F(httpUriRequest.getURI().toString()).l(httpUriRequest.getMethod());
            Long a10 = d.a(httpUriRequest);
            if (a10 != null) {
                c10.q(a10.longValue());
            }
            lVar.g();
            c10.s(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.y(lVar.c());
            c10.n(execute.getStatusLine().getStatusCode());
            Long a11 = d.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = d.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.y(lVar.c());
            d.d(c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), C5313k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return c(httpClient, httpUriRequest, responseHandler, new l(), C5313k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), C5313k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), C5313k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), C5313k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return a(httpClient, httpHost, httpRequest, responseHandler, new l(), C5313k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), C5313k.k());
    }
}
