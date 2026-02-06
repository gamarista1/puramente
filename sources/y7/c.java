package Y7;

import com.facebook.react.modules.toast.ToastModule;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToastModule f35693a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f35694b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f35695c;

    public /* synthetic */ c(ToastModule toastModule, String str, int i10) {
        this.f35693a = toastModule;
        this.f35694b = str;
        this.f35695c = i10;
    }

    public final void run() {
        ToastModule.show$lambda$0(this.f35693a, this.f35694b, this.f35695c);
    }
}
