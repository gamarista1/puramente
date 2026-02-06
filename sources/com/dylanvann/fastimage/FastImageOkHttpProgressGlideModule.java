package com.dylanvann.fastimage;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5414o;
import Gh.H;
import Gh.W;
import Z4.h;
import android.content.Context;
import com.bumptech.glide.integration.okhttp3.b;
import com.bumptech.glide.j;
import j5.C3639c;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import rh.C;
import rh.E;
import rh.F;
import rh.w;
import rh.y;

public class FastImageOkHttpProgressGlideModule extends C3639c {
    private static final b progressListener = new b();

    class a implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f39231a;

        a(d dVar) {
            this.f39231a = dVar;
        }

        public E intercept(w.a aVar) {
            C request = aVar.request();
            E a10 = aVar.a(request);
            return a10.T().b(new c(request.l().toString(), a10.a(), this.f39231a)).c();
        }
    }

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Map f39232a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f39233b;

        private boolean d(String str, long j10, long j11, float f10) {
            if (!(f10 == 0.0f || j10 == 0 || j11 == j10)) {
                long j12 = (long) (((((float) j10) * 100.0f) / ((float) j11)) / f10);
                Long l10 = (Long) this.f39233b.get(str);
                if (l10 != null && j12 == l10.longValue()) {
                    return false;
                }
                this.f39233b.put(str, Long.valueOf(j12));
            }
            return true;
        }

        public void a(String str, long j10, long j11) {
            FastImageProgressListener fastImageProgressListener = (FastImageProgressListener) this.f39232a.get(str);
            if (fastImageProgressListener != null) {
                if (j11 <= j10) {
                    c(str);
                }
                if (d(str, j10, j11, fastImageProgressListener.getGranularityPercentage())) {
                    fastImageProgressListener.onProgress(str, j10, j11);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String str, FastImageProgressListener fastImageProgressListener) {
            this.f39232a.put(str, fastImageProgressListener);
        }

        /* access modifiers changed from: package-private */
        public void c(String str) {
            this.f39232a.remove(str);
            this.f39233b.remove(str);
        }

        private b() {
            this.f39232a = new WeakHashMap();
            this.f39233b = new HashMap();
        }
    }

    private static class c extends F {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final String f39234c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final F f39235d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final d f39236e;

        /* renamed from: f  reason: collision with root package name */
        private C5406g f39237f;

        class a extends C5414o {

            /* renamed from: b  reason: collision with root package name */
            long f39238b = 0;

            a(W w10) {
                super(w10);
            }

            public long y1(C5404e eVar, long j10) {
                long y12 = super.y1(eVar, j10);
                long o10 = c.this.f39235d.o();
                if (y12 == -1) {
                    this.f39238b = o10;
                } else {
                    this.f39238b += y12;
                }
                c.this.f39236e.a(c.this.f39234c, this.f39238b, o10);
                return y12;
            }
        }

        c(String str, F f10, d dVar) {
            this.f39234c = str;
            this.f39235d = f10;
            this.f39236e = dVar;
        }

        private W Q(W w10) {
            return new a(w10);
        }

        public long o() {
            return this.f39235d.o();
        }

        public y q() {
            return this.f39235d.q();
        }

        public C5406g y() {
            if (this.f39237f == null) {
                this.f39237f = H.d(Q(this.f39235d.y()));
            }
            return this.f39237f;
        }
    }

    private interface d {
        void a(String str, long j10, long j11);
    }

    private static w createInterceptor(d dVar) {
        return new a(dVar);
    }

    static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.b(str, fastImageProgressListener);
    }

    static void forget(String str) {
        progressListener.c(str);
    }

    public void registerComponents(Context context, com.bumptech.glide.c cVar, j jVar) {
        jVar.u(h.class, InputStream.class, new b.a(com.facebook.react.modules.network.h.f().B().a(createInterceptor(progressListener)).c()));
    }
}
