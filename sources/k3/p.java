package K3;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final WebSettingsBoundaryInterface f4027a;

    public p(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f4027a = webSettingsBoundaryInterface;
    }

    public void a(int i10) {
        this.f4027a.setForceDark(i10);
    }

    public void b(int i10) {
        this.f4027a.setForceDarkBehavior(i10);
    }

    public void c(boolean z10) {
        this.f4027a.setPaymentRequestEnabled(z10);
    }
}
