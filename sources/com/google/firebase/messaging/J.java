package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class J implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f57424a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Future f57425b;

    /* renamed from: c  reason: collision with root package name */
    private Task f57426c;

    private J(URL url) {
        this.f57424a = url;
    }

    private byte[] f() {
        URLConnection openConnection = this.f57424a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = C4821b.d(C4821b.b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f57424a);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static J n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new J(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f57424a);
        }
        byte[] f10 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, f10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f57424a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f57424a);
    }

    public void close() {
        this.f57425b.cancel(true);
    }

    public Task o() {
        return (Task) C4536s.l(this.f57426c);
    }

    public void t(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f57425b = executorService.submit(new I(this, taskCompletionSource));
        this.f57426c = taskCompletionSource.getTask();
    }
}
