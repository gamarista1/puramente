package ya;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ya.a  reason: case insensitive filesystem */
public class C5284a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    boolean f62268a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f62269b = new LinkedBlockingQueue();

    public IBinder a() {
        C4536s.k("BlockingServiceConnection.getService() called on main thread");
        if (!this.f62268a) {
            this.f62268a = true;
            return (IBinder) this.f62269b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public IBinder b(long j10, TimeUnit timeUnit) {
        C4536s.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f62268a) {
            this.f62268a = true;
            IBinder iBinder = (IBinder) this.f62269b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f62269b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
