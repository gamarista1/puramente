package Fa;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* renamed from: Fa.a  reason: case insensitive filesystem */
public class C4286a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f50773a;

    public C4286a(Looper looper) {
        this.f50773a = new zzi(looper);
    }

    public final void execute(Runnable runnable) {
        this.f50773a.post(runnable);
    }
}
