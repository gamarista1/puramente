package com.google.firebase.perf.network;

import Ac.l;
import Ac.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import vc.h;
import xc.d;
import zc.C5313k;

public class FirebasePerfUrlConnection {
    static Object a(n nVar, C5313k kVar, l lVar) {
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, lVar, c10).getContent();
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, lVar, c10).getContent();
            }
            return a10.getContent();
        } catch (IOException e11) {
            c10.s(e10);
            c10.y(lVar.c());
            c10.F(nVar.toString());
            d.d(c10);
            throw e11;
        }
    }

    static Object b(n nVar, Class[] clsArr, C5313k kVar, l lVar) {
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, lVar, c10).getContent(clsArr);
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, lVar, c10).getContent(clsArr);
            }
            return a10.getContent(clsArr);
        } catch (IOException e11) {
            c10.s(e10);
            c10.y(lVar.c());
            c10.F(nVar.toString());
            d.d(c10);
            throw e11;
        }
    }

    static InputStream c(n nVar, C5313k kVar, l lVar) {
        if (!C5313k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long e10 = lVar.e();
        h c10 = h.c(kVar);
        try {
            URLConnection a10 = nVar.a();
            if (a10 instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) a10, lVar, c10).getInputStream();
            }
            if (a10 instanceof HttpURLConnection) {
                return new a((HttpURLConnection) a10, lVar, c10).getInputStream();
            }
            return a10.getInputStream();
        } catch (IOException e11) {
            c10.s(e10);
            c10.y(lVar.c());
            c10.F(nVar.toString());
            d.d(c10);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), C5313k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new l(), h.c(C5313k.k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new a((HttpURLConnection) obj, new l(), h.c(C5313k.k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), C5313k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, C5313k.k(), new l());
    }
}
