package xa;

import android.os.IBinder;
import android.os.RemoteException;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f62185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f62186b;

    public /* synthetic */ q(x xVar, IBinder iBinder) {
        this.f62185a = xVar;
        this.f62186b = iBinder;
    }

    public final void run() {
        x xVar = this.f62185a;
        IBinder iBinder = this.f62186b;
        synchronized (xVar) {
            if (iBinder == null) {
                xVar.a(0, "Null service connection");
                return;
            }
            try {
                xVar.f62195c = new y(iBinder);
                xVar.f62193a = 2;
                xVar.c();
            } catch (RemoteException e10) {
                xVar.a(0, e10.getMessage());
            }
        }
    }
}
