package n5;

import T4.f;
import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o5.l;

/* renamed from: n5.a  reason: case insensitive filesystem */
public final class C3858a implements f {

    /* renamed from: b  reason: collision with root package name */
    private final int f46859b;

    /* renamed from: c  reason: collision with root package name */
    private final f f46860c;

    private C3858a(int i10, f fVar) {
        this.f46859b = i10;
        this.f46860c = fVar;
    }

    public static f c(Context context) {
        return new C3858a(context.getResources().getConfiguration().uiMode & 48, C3859b.c(context));
    }

    public void b(MessageDigest messageDigest) {
        this.f46860c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f46859b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3858a)) {
            return false;
        }
        C3858a aVar = (C3858a) obj;
        if (this.f46859b != aVar.f46859b || !this.f46860c.equals(aVar.f46860c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return l.p(this.f46860c, this.f46859b);
    }
}
