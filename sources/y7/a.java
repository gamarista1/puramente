package Y7;

import com.facebook.react.modules.toast.ToastModule;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToastModule f35683a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f35684b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f35685c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f35686d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f35687e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f35688f;

    public /* synthetic */ a(ToastModule toastModule, String str, int i10, int i11, int i12, int i13) {
        this.f35683a = toastModule;
        this.f35684b = str;
        this.f35685c = i10;
        this.f35686d = i11;
        this.f35687e = i12;
        this.f35688f = i13;
    }

    public final void run() {
        ToastModule.showWithGravityAndOffset$lambda$2(this.f35683a, this.f35684b, this.f35685c, this.f35686d, this.f35687e, this.f35688f);
    }
}
