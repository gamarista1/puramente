package o7;

import android.content.Intent;
import com.facebook.C3324n;
import com.facebook.I;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o7.e  reason: case insensitive filesystem */
public final class C3889e implements C3324n {

    /* renamed from: b  reason: collision with root package name */
    public static final b f47232b = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map f47233c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f47234a = new HashMap();

    /* renamed from: o7.e$a */
    public interface a {
        boolean a(int i10, Intent intent);
    }

    /* renamed from: o7.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized a b(int i10) {
            return (a) C3889e.f47233c.get(Integer.valueOf(i10));
        }

        /* access modifiers changed from: private */
        public final boolean d(int i10, int i11, Intent intent) {
            a b10 = b(i10);
            if (b10 != null) {
                return b10.a(i11, intent);
            }
            return false;
        }

        public final synchronized void c(int i10, a aVar) {
            C6496s.h(aVar, "callback");
            if (!C3889e.f47233c.containsKey(Integer.valueOf(i10))) {
                C3889e.f47233c.put(Integer.valueOf(i10), aVar);
            }
        }

        private b() {
        }
    }

    /* renamed from: o7.e$c */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f47253a;

        private c(int i10) {
            this.f47253a = i10;
        }

        public final int b() {
            return I.q() + this.f47253a;
        }
    }

    public boolean a(int i10, int i11, Intent intent) {
        a aVar = (a) this.f47234a.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar.a(i11, intent);
        }
        return f47232b.d(i10, i11, intent);
    }

    public final void c(int i10, a aVar) {
        C6496s.h(aVar, "callback");
        this.f47234a.put(Integer.valueOf(i10), aVar);
    }
}
