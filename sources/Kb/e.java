package kb;

import android.app.PendingIntent;

final class e extends C5062b {

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f60902a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f60903b;

    e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f60902a = pendingIntent;
            this.f60903b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a() {
        return this.f60902a;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f60903b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5062b) {
            C5062b bVar = (C5062b) obj;
            if (!this.f60902a.equals(bVar.a()) || this.f60903b != bVar.b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f60902a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f60903b) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String obj = this.f60902a.toString();
        boolean z10 = this.f60903b;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z10 + "}";
    }
}
