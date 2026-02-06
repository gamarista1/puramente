package androidx.media3.exoplayer;

import i2.C2076a;
import nb.k;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final long f17543a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17544b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17545c;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f17546a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f17547b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f17548c;

        public U d() {
            return new U(this);
        }

        public b e(long j10) {
            boolean z10;
            if (j10 >= 0 || j10 == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            this.f17548c = j10;
            return this;
        }

        public b f(long j10) {
            this.f17546a = j10;
            return this;
        }

        public b g(float f10) {
            boolean z10;
            if (f10 > 0.0f || f10 == -3.4028235E38f) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            this.f17547b = f10;
            return this;
        }

        public b() {
            this.f17546a = -9223372036854775807L;
            this.f17547b = -3.4028235E38f;
            this.f17548c = -9223372036854775807L;
        }

        private b(U u10) {
            this.f17546a = u10.f17543a;
            this.f17547b = u10.f17544b;
            this.f17548c = u10.f17545c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (this.f17543a == u10.f17543a && this.f17544b == u10.f17544b && this.f17545c == u10.f17545c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Long.valueOf(this.f17543a), Float.valueOf(this.f17544b), Long.valueOf(this.f17545c));
    }

    private U(b bVar) {
        this.f17543a = bVar.f17546a;
        this.f17544b = bVar.f17547b;
        this.f17545c = bVar.f17548c;
    }
}
