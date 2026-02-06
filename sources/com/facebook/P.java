package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import io.branch.rnbranch.RNBranchModule;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import o7.W;
import t7.C4049a;

public class P extends AsyncTask {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39342d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f39343e = P.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f39344a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f39345b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f39346c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public P(HttpURLConnection httpURLConnection, Q q10) {
        C6496s.h(q10, "requests");
        this.f39344a = httpURLConnection;
        this.f39345b = q10;
    }

    public List a(Void... voidArr) {
        List o10;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            C6496s.h(voidArr, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            HttpURLConnection httpURLConnection = this.f39344a;
            if (httpURLConnection == null) {
                o10 = this.f39345b.h();
            } else {
                o10 = M.f39311n.o(httpURLConnection, this.f39345b);
            }
            return o10;
        } catch (Exception e10) {
            this.f39346c = e10;
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void b(List list) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(list, "result");
                super.onPostExecute(list);
                Exception exc = this.f39346c;
                if (exc != null) {
                    String str = f39343e;
                    U u10 = U.f71764a;
                    String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    C6496s.g(format, "format(format, *args)");
                    W.l0(str, format);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C4049a.d(this)) {
            try {
                b((List) obj);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onPreExecute() {
        Handler handler;
        if (!C4049a.d(this)) {
            try {
                super.onPreExecute();
                if (I.D()) {
                    String str = f39343e;
                    U u10 = U.f71764a;
                    String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    C6496s.g(format, "format(format, *args)");
                    W.l0(str, format);
                }
                if (this.f39345b.v() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.f39345b.R(handler);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask: " + " connection: " + this.f39344a + ", requests: " + this.f39345b + "}";
        C6496s.g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public P(Q q10) {
        this((HttpURLConnection) null, q10);
        C6496s.h(q10, "requests");
    }
}
