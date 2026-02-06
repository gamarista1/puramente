package com.google.firebase.perf.network;

import Ac.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import uc.C5233a;
import vc.h;
import xc.C5277a;
import xc.C5278b;
import xc.d;

class c {

    /* renamed from: f  reason: collision with root package name */
    private static final C5233a f57725f = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f57726a;

    /* renamed from: b  reason: collision with root package name */
    private final h f57727b;

    /* renamed from: c  reason: collision with root package name */
    private long f57728c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f57729d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final l f57730e;

    public c(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        this.f57726a = httpURLConnection;
        this.f57727b = hVar;
        this.f57730e = lVar;
        hVar.F(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f57728c == -1) {
            this.f57730e.g();
            long e10 = this.f57730e.e();
            this.f57728c = e10;
            this.f57727b.s(e10);
        }
        String F10 = F();
        if (F10 != null) {
            this.f57727b.l(F10);
        } else if (o()) {
            this.f57727b.l("POST");
        } else {
            this.f57727b.l("GET");
        }
    }

    public boolean A() {
        return this.f57726a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f57726a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f57726a.getOutputStream();
            if (outputStream != null) {
                return new C5278b(outputStream, this.f57727b, this.f57730e);
            }
            return outputStream;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public Permission D() {
        try {
            return this.f57726a.getPermission();
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public int E() {
        return this.f57726a.getReadTimeout();
    }

    public String F() {
        return this.f57726a.getRequestMethod();
    }

    public Map G() {
        return this.f57726a.getRequestProperties();
    }

    public String H(String str) {
        return this.f57726a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f57729d == -1) {
            long c10 = this.f57730e.c();
            this.f57729d = c10;
            this.f57727b.B(c10);
        }
        try {
            int responseCode = this.f57726a.getResponseCode();
            this.f57727b.n(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public String J() {
        a0();
        if (this.f57729d == -1) {
            long c10 = this.f57730e.c();
            this.f57729d = c10;
            this.f57727b.B(c10);
        }
        try {
            String responseMessage = this.f57726a.getResponseMessage();
            this.f57727b.n(this.f57726a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public URL K() {
        return this.f57726a.getURL();
    }

    public boolean L() {
        return this.f57726a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f57726a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f57726a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f57726a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f57726a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f57726a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f57726a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f57726a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f57726a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f57726a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f57726a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f57726a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f57726a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f57727b.G(str2);
        }
        this.f57726a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f57726a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f57726a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f57728c == -1) {
            this.f57730e.g();
            long e10 = this.f57730e.e();
            this.f57728c = e10;
            this.f57727b.s(e10);
        }
        try {
            this.f57726a.connect();
        } catch (IOException e11) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f57726a.usingProxy();
    }

    public void c() {
        this.f57727b.y(this.f57730e.c());
        this.f57727b.b();
        this.f57726a.disconnect();
    }

    public boolean d() {
        return this.f57726a.getAllowUserInteraction();
    }

    public int e() {
        return this.f57726a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f57726a.equals(obj);
    }

    public Object f() {
        a0();
        this.f57727b.n(this.f57726a.getResponseCode());
        try {
            Object content = this.f57726a.getContent();
            if (content instanceof InputStream) {
                this.f57727b.u(this.f57726a.getContentType());
                return new C5277a((InputStream) content, this.f57727b, this.f57730e);
            }
            this.f57727b.u(this.f57726a.getContentType());
            this.f57727b.v((long) this.f57726a.getContentLength());
            this.f57727b.y(this.f57730e.c());
            this.f57727b.b();
            return content;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f57727b.n(this.f57726a.getResponseCode());
        try {
            Object content = this.f57726a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f57727b.u(this.f57726a.getContentType());
                return new C5277a((InputStream) content, this.f57727b, this.f57730e);
            }
            this.f57727b.u(this.f57726a.getContentType());
            this.f57727b.v((long) this.f57726a.getContentLength());
            this.f57727b.y(this.f57730e.c());
            this.f57727b.b();
            return content;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f57726a.getContentEncoding();
    }

    public int hashCode() {
        return this.f57726a.hashCode();
    }

    public int i() {
        a0();
        return this.f57726a.getContentLength();
    }

    public long j() {
        a0();
        return this.f57726a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f57726a.getContentType();
    }

    public long l() {
        a0();
        return this.f57726a.getDate();
    }

    public boolean m() {
        return this.f57726a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f57726a.getDoInput();
    }

    public boolean o() {
        return this.f57726a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f57727b.n(this.f57726a.getResponseCode());
        } catch (IOException unused) {
            f57725f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f57726a.getErrorStream();
        if (errorStream != null) {
            return new C5277a(errorStream, this.f57727b, this.f57730e);
        }
        return errorStream;
    }

    public long q() {
        a0();
        return this.f57726a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f57726a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f57726a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f57726a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f57726a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f57726a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f57726a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f57726a.getHeaderFieldLong(str, j10);
    }

    public Map x() {
        a0();
        return this.f57726a.getHeaderFields();
    }

    public long y() {
        return this.f57726a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f57727b.n(this.f57726a.getResponseCode());
        this.f57727b.u(this.f57726a.getContentType());
        try {
            InputStream inputStream = this.f57726a.getInputStream();
            if (inputStream != null) {
                return new C5277a(inputStream, this.f57727b, this.f57730e);
            }
            return inputStream;
        } catch (IOException e10) {
            this.f57727b.y(this.f57730e.c());
            d.d(this.f57727b);
            throw e10;
        }
    }
}
