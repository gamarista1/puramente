package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.C1862b;

/* renamed from: s.e  reason: case insensitive filesystem */
public abstract class C2577e implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private Context f25773a;

    /* renamed from: s.e$a */
    class a extends C2575c {
        a(C1862b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, C2575c cVar);

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        this.f25773a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f25773a != null) {
            a(componentName, new a(C1862b.a.a(iBinder), componentName, this.f25773a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
