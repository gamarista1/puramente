package com.google.firebase.perf.network;

import Ac.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import vc.h;

public final class b extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f57723a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpsURLConnection f57724b;

    b(HttpsURLConnection httpsURLConnection, l lVar, h hVar) {
        super(httpsURLConnection.getURL());
        this.f57724b = httpsURLConnection;
        this.f57723a = new c(httpsURLConnection, lVar, hVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f57723a.a(str, str2);
    }

    public void connect() {
        this.f57723a.b();
    }

    public void disconnect() {
        this.f57723a.c();
    }

    public boolean equals(Object obj) {
        return this.f57723a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f57723a.d();
    }

    public String getCipherSuite() {
        return this.f57724b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f57723a.e();
    }

    public Object getContent() {
        return this.f57723a.f();
    }

    public String getContentEncoding() {
        return this.f57723a.h();
    }

    public int getContentLength() {
        return this.f57723a.i();
    }

    public long getContentLengthLong() {
        return this.f57723a.j();
    }

    public String getContentType() {
        return this.f57723a.k();
    }

    public long getDate() {
        return this.f57723a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f57723a.m();
    }

    public boolean getDoInput() {
        return this.f57723a.n();
    }

    public boolean getDoOutput() {
        return this.f57723a.o();
    }

    public InputStream getErrorStream() {
        return this.f57723a.p();
    }

    public long getExpiration() {
        return this.f57723a.q();
    }

    public String getHeaderField(int i10) {
        return this.f57723a.r(i10);
    }

    public long getHeaderFieldDate(String str, long j10) {
        return this.f57723a.t(str, j10);
    }

    public int getHeaderFieldInt(String str, int i10) {
        return this.f57723a.u(str, i10);
    }

    public String getHeaderFieldKey(int i10) {
        return this.f57723a.v(i10);
    }

    public long getHeaderFieldLong(String str, long j10) {
        return this.f57723a.w(str, j10);
    }

    public Map getHeaderFields() {
        return this.f57723a.x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f57724b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f57723a.y();
    }

    public InputStream getInputStream() {
        return this.f57723a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f57723a.A();
    }

    public long getLastModified() {
        return this.f57723a.B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f57724b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f57724b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        return this.f57723a.C();
    }

    public Principal getPeerPrincipal() {
        return this.f57724b.getPeerPrincipal();
    }

    public Permission getPermission() {
        return this.f57723a.D();
    }

    public int getReadTimeout() {
        return this.f57723a.E();
    }

    public String getRequestMethod() {
        return this.f57723a.F();
    }

    public Map getRequestProperties() {
        return this.f57723a.G();
    }

    public String getRequestProperty(String str) {
        return this.f57723a.H(str);
    }

    public int getResponseCode() {
        return this.f57723a.I();
    }

    public String getResponseMessage() {
        return this.f57723a.J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f57724b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        return this.f57724b.getServerCertificates();
    }

    public URL getURL() {
        return this.f57723a.K();
    }

    public boolean getUseCaches() {
        return this.f57723a.L();
    }

    public int hashCode() {
        return this.f57723a.hashCode();
    }

    public void setAllowUserInteraction(boolean z10) {
        this.f57723a.M(z10);
    }

    public void setChunkedStreamingMode(int i10) {
        this.f57723a.N(i10);
    }

    public void setConnectTimeout(int i10) {
        this.f57723a.O(i10);
    }

    public void setDefaultUseCaches(boolean z10) {
        this.f57723a.P(z10);
    }

    public void setDoInput(boolean z10) {
        this.f57723a.Q(z10);
    }

    public void setDoOutput(boolean z10) {
        this.f57723a.R(z10);
    }

    public void setFixedLengthStreamingMode(int i10) {
        this.f57723a.S(i10);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f57724b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j10) {
        this.f57723a.U(j10);
    }

    public void setInstanceFollowRedirects(boolean z10) {
        this.f57723a.V(z10);
    }

    public void setReadTimeout(int i10) {
        this.f57723a.W(i10);
    }

    public void setRequestMethod(String str) {
        this.f57723a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f57723a.Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f57724b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z10) {
        this.f57723a.Z(z10);
    }

    public String toString() {
        return this.f57723a.toString();
    }

    public boolean usingProxy() {
        return this.f57723a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f57723a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f57723a.s(str);
    }

    public void setFixedLengthStreamingMode(long j10) {
        this.f57723a.T(j10);
    }
}
