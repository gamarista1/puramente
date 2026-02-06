package R4;

import T4.e;
import Z4.h;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import o5.c;
import o5.k;
import rh.C;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;

public class a implements d, C6709f {

    /* renamed from: a  reason: collision with root package name */
    private final C6708e.a f33683a;

    /* renamed from: b  reason: collision with root package name */
    private final h f33684b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f33685c;

    /* renamed from: d  reason: collision with root package name */
    private F f33686d;

    /* renamed from: e  reason: collision with root package name */
    private d.a f33687e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C6708e f33688f;

    public a(C6708e.a aVar, h hVar) {
        this.f33683a = aVar;
        this.f33684b = hVar;
    }

    public Class a() {
        return InputStream.class;
    }

    public void b() {
        try {
            InputStream inputStream = this.f33685c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        F f10 = this.f33686d;
        if (f10 != null) {
            f10.close();
        }
        this.f33687e = null;
    }

    public void cancel() {
        C6708e eVar = this.f33688f;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public void d(com.bumptech.glide.h hVar, d.a aVar) {
        C.a l10 = new C.a().l(this.f33684b.h());
        for (Map.Entry entry : this.f33684b.e().entrySet()) {
            l10.a((String) entry.getKey(), (String) entry.getValue());
        }
        C b10 = l10.b();
        this.f33687e = aVar;
        this.f33688f = this.f33683a.a(b10);
        FirebasePerfOkHttpClient.enqueue(this.f33688f, this);
    }

    public T4.a getDataSource() {
        return T4.a.REMOTE;
    }

    public void onFailure(C6708e eVar, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f33687e.c(iOException);
    }

    public void onResponse(C6708e eVar, E e10) {
        this.f33686d = e10.a();
        if (e10.m0()) {
            InputStream b10 = c.b(this.f33686d.a(), ((F) k.d(this.f33686d)).o());
            this.f33685c = b10;
            this.f33687e.e(b10);
            return;
        }
        this.f33687e.c(new e(e10.M(), e10.o()));
    }
}
