package F5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.I;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n {

    /* renamed from: g  reason: collision with root package name */
    public static final a f30784g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f30785a;

    /* renamed from: b  reason: collision with root package name */
    private Long f30786b;

    /* renamed from: c  reason: collision with root package name */
    private UUID f30787c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f30788d;

    /* renamed from: e  reason: collision with root package name */
    private Long f30789e;

    /* renamed from: f  reason: collision with root package name */
    private p f30790f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(I.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            p.f30794c.a();
        }

        public final n b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(I.l());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String) null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            n nVar = new n(Long.valueOf(j10), Long.valueOf(j11), (UUID) null, 4, (DefaultConstructorMarker) null);
            nVar.f30788d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            nVar.l(p.f30794c.b());
            nVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            C6496s.g(fromString, "fromString(sessionIDStr)");
            nVar.j(fromString);
            return nVar;
        }

        private a() {
        }
    }

    public n(Long l10, Long l11, UUID uuid) {
        C6496s.h(uuid, "sessionId");
        this.f30785a = l10;
        this.f30786b = l11;
        this.f30787c = uuid;
    }

    public final Long b() {
        Long l10 = this.f30789e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int c() {
        return this.f30788d;
    }

    public final UUID d() {
        return this.f30787c;
    }

    public final Long e() {
        return this.f30786b;
    }

    public final long f() {
        Long l10;
        if (this.f30785a == null || (l10 = this.f30786b) == null) {
            return 0;
        }
        if (l10 != null) {
            return l10.longValue() - this.f30785a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final p g() {
        return this.f30790f;
    }

    public final void h() {
        this.f30788d++;
    }

    public final void i(Long l10) {
        this.f30789e = l10;
    }

    public final void j(UUID uuid) {
        C6496s.h(uuid, "<set-?>");
        this.f30787c = uuid;
    }

    public final void k(Long l10) {
        this.f30786b = l10;
    }

    public final void l(p pVar) {
        this.f30790f = pVar;
    }

    public final void m() {
        long j10;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(I.l()).edit();
        Long l10 = this.f30785a;
        long j11 = 0;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", j10);
        Long l11 = this.f30786b;
        if (l11 != null) {
            j11 = l11.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j11);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f30788d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f30787c.toString());
        edit.apply();
        p pVar = this.f30790f;
        if (pVar != null && pVar != null) {
            pVar.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.C6496s.g(r3, r4)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.n.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
