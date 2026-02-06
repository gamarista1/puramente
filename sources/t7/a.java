package T7;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageStoreManager f34199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f34200b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callback f34201c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Callback f34202d;

    public /* synthetic */ a(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        this.f34199a = imageStoreManager;
        this.f34200b = str;
        this.f34201c = callback;
        this.f34202d = callback2;
    }

    public final void run() {
        ImageStoreManager.getBase64ForTag$lambda$0(this.f34199a, this.f34200b, this.f34201c, this.f34202d);
    }
}
