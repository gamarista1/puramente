package Y7;

import com.facebook.react.modules.toast.ToastModule;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToastModule f35689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f35690b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f35691c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f35692d;

    public /* synthetic */ b(ToastModule toastModule, String str, int i10, int i11) {
        this.f35689a = toastModule;
        this.f35690b = str;
        this.f35691c = i10;
        this.f35692d = i11;
    }

    public final void run() {
        ToastModule.showWithGravity$lambda$1(this.f35689a, this.f35690b, this.f35691c, this.f35692d);
    }
}
