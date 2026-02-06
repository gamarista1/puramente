package com.facebook.react.modules.network;

import Gh.C5405f;
import Gh.C5407h;
import Gh.H;
import Gh.W;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import rh.D;
import rh.y;

abstract class o {

    class a extends D {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f41105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f41106b;

        a(y yVar, InputStream inputStream) {
            this.f41105a = yVar;
            this.f41106b = inputStream;
        }

        public long contentLength() {
            try {
                return (long) this.f41106b.available();
            } catch (IOException unused) {
                return 0;
            }
        }

        public y contentType() {
            return this.f41105a;
        }

        public void writeTo(C5405f fVar) {
            W w10 = null;
            try {
                w10 = H.l(this.f41106b);
                fVar.K(w10);
            } finally {
                o.b(w10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(W w10) {
        try {
            w10.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static D c(y yVar, InputStream inputStream) {
        return new a(yVar, inputStream);
    }

    public static D d(y yVar, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return D.create(yVar, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static k e(D d10, j jVar) {
        return new k(d10, jVar);
    }

    private static InputStream f(Context context, Uri uri) {
        InputStream openStream;
        ReadableByteChannel newChannel;
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            openStream = FirebasePerfUrlConnection.openStream(url);
            newChannel = Channels.newChannel(openStream);
            fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
            FileInputStream fileInputStream = new FileInputStream(createTempFile);
            if (newChannel != null) {
                newChannel.close();
            }
            if (openStream != null) {
                openStream.close();
            }
            fileOutputStream.close();
            return fileInputStream;
            throw th;
            throw th;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static D g(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return D.create((y) null, C5407h.f63296e);
        }
        return null;
    }

    public static InputStream h(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return f(context, parse);
            }
            if (str.startsWith("data:")) {
                return new ByteArrayInputStream(Base64.decode(str.split(f.f37529a)[1], 0));
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e10) {
            U5.a.n("ReactNative", "Could not retrieve file for contentUri " + str, e10);
            return null;
        }
    }

    public static boolean i(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
