package M4;

import com.bugsnag.android.ndk.NativeBridge;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NativeBridge f32572a;

    public /* synthetic */ a(NativeBridge nativeBridge) {
        this.f32572a = nativeBridge;
    }

    public final void run() {
        this.f32572a.refreshSymbolTable();
    }
}
