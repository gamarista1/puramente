package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", "", "<init>", "()V", "componentNames", "", "", "getFabricComponentName", "componentName", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabricNameComponentMapping {
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();
    private static final Map<String, String> componentNames = O.l(C6502A.a("View", ReactViewManager.REACT_CLASS), C6502A.a("Image", ReactImageManager.REACT_CLASS), C6502A.a("ScrollView", ReactScrollViewManager.REACT_CLASS), C6502A.a("Slider", "RCTSlider"), C6502A.a("ModalHostView", ReactModalHostManager.REACT_CLASS), C6502A.a("Paragraph", ReactTextViewManager.REACT_CLASS), C6502A.a("Text", ReactTextViewManager.REACT_CLASS), C6502A.a("RawText", ReactRawTextManager.REACT_CLASS), C6502A.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), C6502A.a("ShimmeringView", "RKShimmeringView"), C6502A.a("TemplateView", "RCTTemplateView"), C6502A.a("AxialGradientView", "RCTAxialGradientView"), C6502A.a("Video", "RCTVideo"), C6502A.a("Map", "RCTMap"), C6502A.a("WebView", "RCTWebView"), C6502A.a("Keyframes", "RCTKeyframes"), C6502A.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private FabricNameComponentMapping() {
    }

    public static final String getFabricComponentName(String str) {
        C6496s.h(str, "componentName");
        String str2 = componentNames.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
