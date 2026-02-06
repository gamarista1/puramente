package com.google.firebase.perf.network;

import Ac.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import vc.h;

public final class a extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f57722a;

    a(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        super(httpURLConnection.getURL());
        this.f57722a = new c(httpURLConnection, lVar, hVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f57722a.a(str, str2);
    }

    public void connect() {
        this.f57722a.b();
    }

    public void disconnect() {
        this.f57722a.c();
    }

    public boolean equals(Object obj) {
        return this.f57722a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f57722a.d();
    }

    public int getConnectTimeout() {
        return this.f57722a.e();
    }

    public Object getContent() {
        return this.f57722a.f();
    }

    public String getContentEncoding() {
        return this.f57722a.h();
    }

    public int getContentLength() {
        return this.f57722a.i();
    }

    public long getContentLengthLong() {
        return this.f57722a.j();
    }

    public String getContentType() {
        return this.f57722a.k();
    }

    public long getDate() {
        return this.f57722a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f57722a.m();
    }

    public boolean getDoInput() {
        return this.f57722a.n();
    }

    public boolean getDoOutput() {
        return this.f57722a.o();
    }

    public InputStream getErrorStream() {
        return this.f57722a.p();
    }

    public long getExpiration() {
        return this.f57722a.q();
    }

    public String getHeaderField(int i10) {
        return this.f57722a.r(i10);
    }

    public long getHeaderFieldDate(String str, long j10) {
        return this.f57722a.t(str, j10);
    }

    public int getHeaderFieldInt(String str, int i10) {
        return this.f57722a.u(str, i10);
    }

    public String getHeaderFieldKey(int i10) {
        return this.f57722a.v(i10);
    }

    public long getHeaderFieldLong(String str, long j10) {
        return this.f57722a.w(str, j10);
    }

    public Map getHeaderFields() {
        return this.f57722a.x();
    }

    public long getIfModifiedSince() {
        return this.f57722a.y();
    }

    public InputStream getInputStream() {
        return this.f57722a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f57722a.A();
    }

    public long getLastModified() {
        return this.f57722a.B();
    }

    public OutputStream getOutputStream() {
        return this.f57722a.C();
    }

    public Permission getPermission() {
        return this.f57722a.D();
    }

    public int getReadTimeout() {
        return this.f57722a.E();
    }

    public String getRequestMethod() {
        return this.f57722a.F();
    }

    public Map getRequestProperties() {
        return this.f57722a.G();
    }

    public String getRequestProperty(String str) {
        return this.f57722a.H(str);
    }

    public int getResponseCode() {
        return this.f57722a.I();
    }

    public String getResponseMessage() {
        return this.f57722a.J();
    }

    public URL getURL() {
        return this.f57722a.K();
    }

    public boolean getUseCaches() {
        return this.f57722a.L();
    }

    public int hashCode() {
        return this.f57722a.hashCode();
    }

    public void setAllowUserInteraction(boolean z10) {
        this.f57722a.M(z10);
    }

    public void setChunkedStreamingMode(int i10) {
        this.f57722a.N(i10);
    }

    public void setConnectTimeout(int i10) {
        this.f57722a.O(i10);
    }

    public void setDefaultUseCaches(boolean z10) {
        this.f57722a.P(z10);
    }

    public void setDoInput(boolean z10) {
        this.f57722a.Q(z10);
    }

    public void setDoOutput(boolean z10) {
        this.f57722a.R(z10);
    }

    public void setFixedLengthStreamingMode(int i10) {
        this.f57722a.S(i10);
    }

    public void setIfModifiedSince(long j10) {
        this.f57722a.U(j10);
    }

    public void setInstanceFollowRedirects(boolean z10) {
        this.f57722a.V(z10);
    }

    public void setReadTimeout(int i10) {
        this.f57722a.W(i10);
    }

    public void setRequestMethod(String str) {
        this.f57722a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f57722a.Y(str, str2);
    }

    public void setUseCaches(boolean z10) {
        this.f57722a.Z(z10);
    }

    public String toString() {
        return this.f57722a.toString();
    }

    public boolean usingProxy() {
        return this.f57722a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f57722a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f57722a.s(str);
    }

    public void setFixedLengthStreamingMode(long j10) {
        this.f57722a.T(j10);
    }
}
