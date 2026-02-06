package com.facebook.react.uimanager;

import C7.d;
import android.widget.ImageView;
import com.facebook.react.uimanager.events.q;
import java.util.HashMap;
import java.util.Map;

abstract class p0 {
    static Map a() {
        return d.a().b("topChange", d.d("phasedRegistrationNames", d.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", d.d("phasedRegistrationNames", d.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(q.b(q.START), d.d("phasedRegistrationNames", d.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(q.b(q.MOVE), d.d("phasedRegistrationNames", d.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(q.b(q.END), d.d("phasedRegistrationNames", d.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(q.b(q.CANCEL), d.d("phasedRegistrationNames", d.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map b() {
        HashMap b10 = d.b();
        b10.put("UIView", d.d("ContentMode", d.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b10.put("StyleConstants", d.d("PointerEventsValues", d.g("none", Integer.valueOf(H.NONE.ordinal()), "boxNone", Integer.valueOf(H.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(H.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(H.AUTO.ordinal()))));
        b10.put("AccessibilityEventTypes", d.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b10;
    }

    static Map c() {
        return d.a().b("topContentSizeChange", d.d("registrationName", "onContentSizeChange")).b("topLayout", d.d("registrationName", "onLayout")).b("topLoadingError", d.d("registrationName", "onLoadingError")).b("topLoadingFinish", d.d("registrationName", "onLoadingFinish")).b("topLoadingStart", d.d("registrationName", "onLoadingStart")).b("topSelectionChange", d.d("registrationName", "onSelectionChange")).b("topMessage", d.d("registrationName", "onMessage")).b("topScrollBeginDrag", d.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", d.d("registrationName", "onScrollEndDrag")).b("topScroll", d.d("registrationName", "onScroll")).b("topMomentumScrollBegin", d.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", d.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
