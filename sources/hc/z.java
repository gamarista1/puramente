package Hc;

import kotlin.jvm.internal.C6496s;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final String f51081a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51082b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51083c;

    /* renamed from: d  reason: collision with root package name */
    private final long f51084d;

    public z(String str, String str2, int i10, long j10) {
        C6496s.h(str, "sessionId");
        C6496s.h(str2, "firstSessionId");
        this.f51081a = str;
        this.f51082b = str2;
        this.f51083c = i10;
        this.f51084d = j10;
    }

    public final String a() {
        return this.f51082b;
    }

    public final String b() {
        return this.f51081a;
    }

    public final int c() {
        return this.f51083c;
    }

    public final long d() {
        return this.f51084d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (C6496s.c(this.f51081a, zVar.f51081a) && C6496s.c(this.f51082b, zVar.f51082b) && this.f51083c == zVar.f51083c && this.f51084d == zVar.f51084d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f51081a.hashCode() * 31) + this.f51082b.hashCode()) * 31) + Integer.hashCode(this.f51083c)) * 31) + Long.hashCode(this.f51084d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f51081a + ", firstSessionId=" + this.f51082b + ", sessionIndex=" + this.f51083c + ", sessionStartTimestampUs=" + this.f51084d + ')';
    }
}
