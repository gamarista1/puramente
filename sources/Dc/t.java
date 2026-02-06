package Dc;

import com.google.firebase.remoteconfig.internal.m;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final long f50601a;

    /* renamed from: b  reason: collision with root package name */
    private final long f50602b;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f50603a = 60;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f50604b = m.f57861j;

        public t c() {
            return new t(this);
        }

        public b d(long j10) {
            if (j10 >= 0) {
                this.f50603a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j10)}));
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f50604b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f50601a;
    }

    public long b() {
        return this.f50602b;
    }

    private t(b bVar) {
        this.f50601a = bVar.f50603a;
        this.f50602b = bVar.f50604b;
    }
}
