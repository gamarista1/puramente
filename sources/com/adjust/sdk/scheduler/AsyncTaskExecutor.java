package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

public abstract class AsyncTaskExecutor<Params, Result> {

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f36979a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f36980b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a  reason: collision with other inner class name */
        public class C0604a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f36982a;

            public C0604a(Object obj) {
                this.f36982a = obj;
            }

            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.f36982a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.f36979a = objArr;
            this.f36980b = handler;
        }

        public final void run() {
            this.f36980b.post(new C0604a(AsyncTaskExecutor.this.doInBackground(this.f36979a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
