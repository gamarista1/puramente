package V4;

import V4.f;
import Z4.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.List;

class z implements f, f.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f34659a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f34660b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f34661c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f34662d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f34663e;

    /* renamed from: f  reason: collision with root package name */
    private volatile n.a f34664f;

    /* renamed from: g  reason: collision with root package name */
    private volatile d f34665g;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n.a f34666a;

        a(n.a aVar) {
            this.f34666a = aVar;
        }

        public void c(Exception exc) {
            if (z.this.g(this.f34666a)) {
                z.this.i(this.f34666a, exc);
            }
        }

        public void e(Object obj) {
            if (z.this.g(this.f34666a)) {
                z.this.h(this.f34666a, obj);
            }
        }
    }

    z(g gVar, f.a aVar) {
        this.f34659a = gVar;
        this.f34660b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = o5.g.b()
            r3 = 0
            V4.g r4 = r11.f34659a     // Catch:{ all -> 0x0072 }
            com.bumptech.glide.load.data.e r4 = r4.o(r12)     // Catch:{ all -> 0x0072 }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x0072 }
            V4.g r6 = r11.f34659a     // Catch:{ all -> 0x0072 }
            T4.d r6 = r6.q(r5)     // Catch:{ all -> 0x0072 }
            V4.e r7 = new V4.e     // Catch:{ all -> 0x0072 }
            V4.g r8 = r11.f34659a     // Catch:{ all -> 0x0072 }
            T4.i r8 = r8.k()     // Catch:{ all -> 0x0072 }
            r7.<init>(r6, r5, r8)     // Catch:{ all -> 0x0072 }
            V4.d r5 = new V4.d     // Catch:{ all -> 0x0072 }
            Z4.n$a r8 = r11.f34664f     // Catch:{ all -> 0x0072 }
            T4.f r8 = r8.f35902a     // Catch:{ all -> 0x0072 }
            V4.g r9 = r11.f34659a     // Catch:{ all -> 0x0072 }
            T4.f r9 = r9.p()     // Catch:{ all -> 0x0072 }
            r5.<init>(r8, r9)     // Catch:{ all -> 0x0072 }
            V4.g r8 = r11.f34659a     // Catch:{ all -> 0x0072 }
            X4.a r8 = r8.d()     // Catch:{ all -> 0x0072 }
            r8.a(r5, r7)     // Catch:{ all -> 0x0072 }
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x0072 }
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            r7.append(r5)     // Catch:{ all -> 0x0072 }
            r7.append(r9)     // Catch:{ all -> 0x0072 }
            r7.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            r7.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch:{ all -> 0x0072 }
            double r1 = o5.g.a(r1)     // Catch:{ all -> 0x0072 }
            r7.append(r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0072 }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0072 }
            goto L_0x0074
        L_0x0072:
            r12 = move-exception
            goto L_0x00df
        L_0x0074:
            java.io.File r1 = r8.b(r5)     // Catch:{ all -> 0x0072 }
            r2 = 1
            if (r1 == 0) goto L_0x0096
            r11.f34665g = r5     // Catch:{ all -> 0x0072 }
            V4.c r12 = new V4.c     // Catch:{ all -> 0x0072 }
            Z4.n$a r0 = r11.f34664f     // Catch:{ all -> 0x0072 }
            T4.f r0 = r0.f35902a     // Catch:{ all -> 0x0072 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0072 }
            V4.g r1 = r11.f34659a     // Catch:{ all -> 0x0072 }
            r12.<init>(r0, r1, r11)     // Catch:{ all -> 0x0072 }
            r11.f34662d = r12     // Catch:{ all -> 0x0072 }
            Z4.n$a r12 = r11.f34664f
            com.bumptech.glide.load.data.d r12 = r12.f35904c
            r12.b()
            return r2
        L_0x0096:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "Attempt to write: "
            r1.append(r5)     // Catch:{ all -> 0x0072 }
            V4.d r5 = r11.f34665g     // Catch:{ all -> 0x0072 }
            r1.append(r5)     // Catch:{ all -> 0x0072 }
            r1.append(r9)     // Catch:{ all -> 0x0072 }
            r1.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0072 }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x0072 }
        L_0x00be:
            V4.f$a r12 = r11.f34660b     // Catch:{ all -> 0x00dd }
            Z4.n$a r0 = r11.f34664f     // Catch:{ all -> 0x00dd }
            T4.f r5 = r0.f35902a     // Catch:{ all -> 0x00dd }
            java.lang.Object r6 = r4.a()     // Catch:{ all -> 0x00dd }
            Z4.n$a r0 = r11.f34664f     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.data.d r7 = r0.f35904c     // Catch:{ all -> 0x00dd }
            Z4.n$a r0 = r11.f34664f     // Catch:{ all -> 0x00dd }
            com.bumptech.glide.load.data.d r0 = r0.f35904c     // Catch:{ all -> 0x00dd }
            T4.a r8 = r0.getDataSource()     // Catch:{ all -> 0x00dd }
            Z4.n$a r0 = r11.f34664f     // Catch:{ all -> 0x00dd }
            T4.f r9 = r0.f35902a     // Catch:{ all -> 0x00dd }
            r4 = r12
            r4.c(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            return r3
        L_0x00dd:
            r12 = move-exception
            r3 = r2
        L_0x00df:
            if (r3 != 0) goto L_0x00e8
            Z4.n$a r0 = r11.f34664f
            com.bumptech.glide.load.data.d r0 = r0.f35904c
            r0.b()
        L_0x00e8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.z.d(java.lang.Object):boolean");
    }

    private boolean f() {
        if (this.f34661c < this.f34659a.g().size()) {
            return true;
        }
        return false;
    }

    private void j(n.a aVar) {
        this.f34664f.f35904c.d(this.f34659a.l(), new a(aVar));
    }

    public void a(T4.f fVar, Exception exc, d dVar, T4.a aVar) {
        this.f34660b.a(fVar, exc, dVar, this.f34664f.f35904c.getDataSource());
    }

    public boolean b() {
        if (this.f34663e != null) {
            Object obj = this.f34663e;
            this.f34663e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f34662d != null && this.f34662d.b()) {
            return true;
        }
        this.f34662d = null;
        this.f34664f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List g10 = this.f34659a.g();
            int i10 = this.f34661c;
            this.f34661c = i10 + 1;
            this.f34664f = (n.a) g10.get(i10);
            if (this.f34664f != null && (this.f34659a.e().c(this.f34664f.f35904c.getDataSource()) || this.f34659a.u(this.f34664f.f35904c.a()))) {
                j(this.f34664f);
                z10 = true;
            }
        }
        return z10;
    }

    public void c(T4.f fVar, Object obj, d dVar, T4.a aVar, T4.f fVar2) {
        this.f34660b.c(fVar, obj, dVar, this.f34664f.f35904c.getDataSource(), fVar);
    }

    public void cancel() {
        n.a aVar = this.f34664f;
        if (aVar != null) {
            aVar.f35904c.cancel();
        }
    }

    public void e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean g(n.a aVar) {
        n.a aVar2 = this.f34664f;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(n.a aVar, Object obj) {
        j e10 = this.f34659a.e();
        if (obj == null || !e10.c(aVar.f35904c.getDataSource())) {
            f.a aVar2 = this.f34660b;
            T4.f fVar = aVar.f35902a;
            d dVar = aVar.f35904c;
            aVar2.c(fVar, obj, dVar, dVar.getDataSource(), this.f34665g);
            return;
        }
        this.f34663e = obj;
        this.f34660b.e();
    }

    /* access modifiers changed from: package-private */
    public void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f34660b;
        d dVar = this.f34665g;
        d dVar2 = aVar.f35904c;
        aVar2.a(dVar, exc, dVar2, dVar2.getDataSource());
    }
}
