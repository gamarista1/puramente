package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import u3.j;
import u3.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Lu3/j;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Lu3/k$a;", "Lu3/k$a;", "binder", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private int f18376a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18377b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final RemoteCallbackList f18378c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private final k.a f18379d = new a(this);

    public static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f18380a;

        a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f18380a = multiInstanceInvalidationService;
        }

        public int a1(j jVar, String str) {
            C6496s.h(jVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a10 = this.f18380a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18380a;
            synchronized (a10) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c10 = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(jVar, Integer.valueOf(c10))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c10), str);
                        i10 = c10;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public void g(j jVar, int i10) {
            C6496s.h(jVar, "callback");
            RemoteCallbackList a10 = this.f18380a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18380a;
            synchronized (a10) {
                multiInstanceInvalidationService.a().unregister(jVar);
                String str = (String) multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }

        public void j0(int i10, String[] strArr) {
            C6496s.h(strArr, "tables");
            RemoteCallbackList a10 = this.f18380a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f18380a;
            synchronized (a10) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                int i11 = 0;
                while (i11 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                        C6496s.f(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(num);
                        if (i10 != intValue && C6496s.c(str, str2)) {
                            try {
                                ((j) multiInstanceInvalidationService.a().getBroadcastItem(i11)).i(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                        i11++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                C6514M m10 = C6514M.f71813a;
            }
        }
    }

    public static final class b extends RemoteCallbackList {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f18381a;

        b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f18381a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(j jVar, Object obj) {
            C6496s.h(jVar, "callback");
            C6496s.h(obj, "cookie");
            this.f18381a.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f18378c;
    }

    public final Map b() {
        return this.f18377b;
    }

    public final int c() {
        return this.f18376a;
    }

    public final void d(int i10) {
        this.f18376a = i10;
    }

    public IBinder onBind(Intent intent) {
        C6496s.h(intent, "intent");
        return this.f18379d;
    }
}
