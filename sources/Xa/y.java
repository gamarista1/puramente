package xa;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f62199a;

    /* renamed from: b  reason: collision with root package name */
    private final l f62200b;

    y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f62199a = new Messenger(iBinder);
            this.f62200b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f62200b = new l(iBinder);
            this.f62199a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f62199a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f62200b;
        if (lVar != null) {
            lVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
