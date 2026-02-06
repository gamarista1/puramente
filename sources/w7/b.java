package W7;

import com.facebook.react.modules.devloading.DevLoadingModule;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DevLoadingModule f34914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f34915b;

    public /* synthetic */ b(DevLoadingModule devLoadingModule, String str) {
        this.f34914a = devLoadingModule;
        this.f34915b = str;
    }

    public final void run() {
        DevLoadingModule.showMessage$lambda$0(this.f34914a, this.f34915b);
    }
}
