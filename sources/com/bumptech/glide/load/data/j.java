package com.bumptech.glide.load.data;

import T4.e;
import Z4.h;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import o5.c;
import o5.g;

public class j implements d {

    /* renamed from: g  reason: collision with root package name */
    static final b f39137g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final h f39138a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39139b;

    /* renamed from: c  reason: collision with root package name */
    private final b f39140c;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f39141d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f39142e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f39143f;

    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(h hVar, int i10) {
        this(hVar, i10, f39137g);
    }

    private HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a10 = this.f39140c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a10.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a10.setConnectTimeout(this.f39139b);
            a10.setReadTimeout(this.f39139b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new e("URL.openConnection threw", 0, e10);
        }
    }

    private static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream f(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f39142e = c.b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f39142e = httpURLConnection.getInputStream();
            }
            return this.f39142e;
        } catch (IOException e10) {
            throw new e("Failed to obtain InputStream", e(httpURLConnection), e10);
        }
    }

    private static boolean g(int i10) {
        if (i10 / 100 == 2) {
            return true;
        }
        return false;
    }

    private static boolean h(int i10) {
        if (i10 / 100 == 3) {
            return true;
        }
        return false;
    }

    private InputStream i(URL url, int i10, URL url2, Map map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c10 = c(url, map);
            this.f39141d = c10;
            try {
                c10.connect();
                this.f39142e = this.f39141d.getInputStream();
                if (this.f39143f) {
                    return null;
                }
                int e10 = e(this.f39141d);
                if (g(e10)) {
                    return f(this.f39141d);
                }
                if (h(e10)) {
                    String headerField = this.f39141d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return i(url3, i10 + 1, url, map);
                        } catch (MalformedURLException e11) {
                            throw new e("Bad redirect url: " + headerField, e10, e11);
                        }
                    } else {
                        throw new e("Received empty or null redirect url", e10);
                    }
                } else if (e10 == -1) {
                    throw new e(e10);
                } else {
                    try {
                        throw new e(this.f39141d.getResponseMessage(), e10);
                    } catch (IOException e12) {
                        throw new e("Failed to get a response message", e10, e12);
                    }
                }
            } catch (IOException e13) {
                throw new e("Failed to connect or obtain data", e(this.f39141d), e13);
            }
        } else {
            throw new e("Too many (> 5) redirects!", -1);
        }
    }

    public Class a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f39142e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f39141d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f39141d = null;
    }

    public void cancel() {
        this.f39143f = true;
    }

    public void d(com.bumptech.glide.h hVar, d.a aVar) {
        StringBuilder sb2;
        long b10 = g.b();
        try {
            aVar.e(i(this.f39138a.i(), 0, (URL) null, this.f39138a.e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(g.a(b10));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + g.a(b10));
            }
            throw th2;
        }
    }

    public T4.a getDataSource() {
        return T4.a.REMOTE;
    }

    j(h hVar, int i10, b bVar) {
        this.f39138a = hVar;
        this.f39139b = i10;
        this.f39140c = bVar;
    }
}
