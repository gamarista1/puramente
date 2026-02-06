package ff;

import java.util.UUID;
import p003if.f;
import p003if.m;
import p003if.p;

/* renamed from: ff.v  reason: case insensitive filesystem */
public final class C5868v {

    /* renamed from: b  reason: collision with root package name */
    public static final C5868v f67577b = new C5868v("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* renamed from: a  reason: collision with root package name */
    private final f f67578a;

    public C5868v() {
        this((UUID) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String d(UUID uuid) {
        return e(p.c(uuid));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public String e(String str) {
        return m.b(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5868v.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f67578a.a()).equals(((C5868v) obj).f67578a.a());
    }

    public int hashCode() {
        return ((String) this.f67578a.a()).hashCode();
    }

    public String toString() {
        return (String) this.f67578a.a();
    }

    public C5868v(UUID uuid) {
        if (uuid != null) {
            this.f67578a = new f(new C5864r(this, uuid));
        } else {
            this.f67578a = new f(new C5865s());
        }
    }

    public C5868v(String str) {
        String b10 = m.b(str);
        if (b10.length() != 32 && b10.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        } else if (b10.length() == 36) {
            this.f67578a = new f(new C5866t(this, b10));
        } else {
            this.f67578a = new f(new C5867u(b10));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String f(String str) {
        return str;
    }
}
