package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.f;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import u1.o;

public class EmojiCompatInitializer implements B3.a {

    class a implements DefaultLifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1790m f16578a;

        a(C1790m mVar) {
            this.f16578a = mVar;
        }

        public void onResume(C1798v vVar) {
            EmojiCompatInitializer.this.e();
            this.f16578a.d(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a  reason: collision with root package name */
        private final Context f16580a;

        class a extends f.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.i f16581a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f16582b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f16581a = iVar;
                this.f16582b = threadPoolExecutor;
            }

            public void a(Throwable th2) {
                try {
                    this.f16581a.a(th2);
                } finally {
                    this.f16582b.shutdown();
                }
            }

            public void b(n nVar) {
                try {
                    this.f16581a.b(nVar);
                } finally {
                    this.f16582b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f16580a = context.getApplicationContext();
        }

        public void a(f.i iVar) {
            ThreadPoolExecutor b10 = c.b("EmojiCompatInitializer");
            b10.execute(new g(this, iVar, b10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a10 = d.a(this.f16580a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(iVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.k()) {
                    f.c().n();
                }
            } finally {
                o.b();
            }
        }
    }

    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        f.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        C1790m lifecycle = ((C1798v) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c.d().postDelayed(new d(), 500);
    }
}
