package Kc;

import Cb.b;
import Db.C4253b;
import Ea.e;
import Ea.h;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import java.util.Random;

public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final Random f51469f = new Random();

    /* renamed from: g  reason: collision with root package name */
    static e f51470g = new f();

    /* renamed from: h  reason: collision with root package name */
    static e f51471h = h.c();

    /* renamed from: a  reason: collision with root package name */
    private final Context f51472a;

    /* renamed from: b  reason: collision with root package name */
    private final C4253b f51473b;

    /* renamed from: c  reason: collision with root package name */
    private final b f51474c;

    /* renamed from: d  reason: collision with root package name */
    private long f51475d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f51476e;

    public c(Context context, C4253b bVar, b bVar2, long j10) {
        this.f51472a = context;
        this.f51473b = bVar;
        this.f51474c = bVar2;
        this.f51475d = j10;
    }

    public void a() {
        this.f51476e = true;
    }

    public boolean b(int i10) {
        if ((i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f51476e = false;
    }

    public void d(Lc.e eVar) {
        e(eVar, true);
    }

    public void e(Lc.e eVar, boolean z10) {
        C4536s.l(eVar);
        long a10 = f51471h.a() + this.f51475d;
        if (z10) {
            eVar.B(i.c(this.f51473b), i.b(this.f51474c), this.f51472a);
        } else {
            eVar.D(i.c(this.f51473b), i.b(this.f51474c));
        }
        int i10 = 1000;
        while (f51471h.a() + ((long) i10) <= a10 && !eVar.v() && b(eVar.o())) {
            try {
                f51470g.a(f51469f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (eVar.o() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (!this.f51476e) {
                    eVar.F();
                    if (z10) {
                        eVar.B(i.c(this.f51473b), i.b(this.f51474c), this.f51472a);
                    } else {
                        eVar.D(i.c(this.f51473b), i.b(this.f51474c));
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
