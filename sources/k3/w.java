package K3;

import Th.a;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f4106a;

    public w(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f4106a = webkitToCompatConverterBoundaryInterface;
    }

    public p a(WebSettings webSettings) {
        return new p((WebSettingsBoundaryInterface) a.a(WebSettingsBoundaryInterface.class, this.f4106a.convertSettings(webSettings)));
    }
}
