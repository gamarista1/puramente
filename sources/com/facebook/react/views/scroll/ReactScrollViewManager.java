package com.facebook.react.views.scroll;

import C7.d;
import Q7.a;
import android.view.View;
import androidx.core.view.C1680b0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.views.scroll.b;
import com.facebook.react.views.scroll.h;
import e8.C3500a;
import e8.C3501b;
import j8.f;
import j8.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@a(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager<f> implements h.b {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactScrollViewManager() {
        this((a) null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return d.a().b(k.b(k.SCROLL), d.d("registrationName", "onScroll")).b(k.b(k.BEGIN_DRAG), d.d("registrationName", "onScrollBeginDrag")).b(k.b(k.END_DRAG), d.d("registrationName", "onScrollEndDrag")).b(k.b(k.MOMENTUM_BEGIN), d.d("registrationName", "onMomentumScrollBegin")).b(k.b(k.MOMENTUM_END), d.d("registrationName", "onMomentumScrollEnd")).a();
    }

    public Map<String, Integer> getCommandsMap() {
        return h.a();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3501b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(f fVar, int i10, Integer num) {
        C3400a.q(fVar, m.f44918b, num);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(f fVar, int i10, float f10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(fVar, j8.d.values()[i10], xVar);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(f fVar, String str) {
        f fVar2;
        if (str == null) {
            fVar2 = null;
        } else {
            fVar2 = f.b(str);
        }
        C3400a.s(fVar, fVar2);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(f fVar, int i10, float f10) {
        C3400a.t(fVar, m.values()[i10], Float.valueOf(f10));
    }

    @C3500a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(f fVar, int i10) {
        fVar.setEndFillColor(i10);
    }

    @C3500a(customType = "Point", name = "contentOffset")
    public void setContentOffset(f fVar, ReadableMap readableMap) {
        fVar.setContentOffset(readableMap);
    }

    @C3500a(name = "decelerationRate")
    public void setDecelerationRate(f fVar, float f10) {
        fVar.setDecelerationRate(f10);
    }

    @C3500a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(f fVar, boolean z10) {
        fVar.setDisableIntervalMomentum(z10);
    }

    @C3500a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(f fVar, int i10) {
        if (i10 > 0) {
            fVar.setVerticalFadingEdgeEnabled(true);
            fVar.setFadingEdgeLength(i10);
            return;
        }
        fVar.setVerticalFadingEdgeEnabled(false);
        fVar.setFadingEdgeLength(0);
    }

    @C3500a(name = "horizontal")
    public void setHorizontal(f fVar, boolean z10) {
    }

    @C3500a(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(f fVar, boolean z10) {
        if (z10) {
            fVar.setVerticalScrollbarPosition(1);
        } else {
            fVar.setVerticalScrollbarPosition(0);
        }
    }

    @C3500a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(f fVar, ReadableMap readableMap) {
        if (readableMap != null) {
            fVar.setMaintainVisibleContentPosition(b.C0649b.a(readableMap));
        } else {
            fVar.setMaintainVisibleContentPosition((b.C0649b) null);
        }
    }

    @C3500a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(f fVar, boolean z10) {
        C1680b0.B0(fVar, z10);
    }

    @C3500a(name = "overScrollMode")
    public void setOverScrollMode(f fVar, String str) {
        fVar.setOverScrollMode(i.n(str));
    }

    @C3500a(name = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @C3500a(name = "pagingEnabled")
    public void setPagingEnabled(f fVar, boolean z10) {
        fVar.setPagingEnabled(z10);
    }

    @C3500a(name = "persistentScrollbar")
    public void setPersistentScrollbar(f fVar, boolean z10) {
        fVar.setScrollbarFadingEnabled(!z10);
    }

    @C3500a(name = "pointerEvents")
    public void setPointerEvents(f fVar, String str) {
        fVar.setPointerEvents(H.e(str));
    }

    @C3500a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(f fVar, boolean z10) {
        fVar.setRemoveClippedSubviews(z10);
    }

    @C3500a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(f fVar, boolean z10) {
        fVar.setScrollEnabled(z10);
        fVar.setFocusable(z10);
    }

    @C3500a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(f fVar, int i10) {
        fVar.setScrollEventThrottle(i10);
    }

    @C3500a(name = "scrollPerfTag")
    public void setScrollPerfTag(f fVar, String str) {
        fVar.setScrollPerfTag(str);
    }

    @C3500a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(f fVar, boolean z10) {
        fVar.setSendMomentumEvents(z10);
    }

    @C3500a(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(f fVar, boolean z10) {
        fVar.setVerticalScrollBarEnabled(z10);
    }

    @C3500a(name = "snapToAlignment")
    public void setSnapToAlignment(f fVar, String str) {
        fVar.setSnapToAlignment(i.o(str));
    }

    @C3500a(name = "snapToEnd")
    public void setSnapToEnd(f fVar, boolean z10) {
        fVar.setSnapToEnd(z10);
    }

    @C3500a(name = "snapToInterval")
    public void setSnapToInterval(f fVar, float f10) {
        fVar.setSnapInterval((int) (f10 * G.c()));
    }

    @C3500a(name = "snapToOffsets")
    public void setSnapToOffsets(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            fVar.setSnapOffsets((List<Integer>) null);
            return;
        }
        float c10 = G.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * ((double) c10))));
        }
        fVar.setSnapOffsets(arrayList);
    }

    @C3500a(name = "snapToStart")
    public void setSnapToStart(f fVar, boolean z10) {
        fVar.setSnapToStart(z10);
    }

    public ReactScrollViewManager(a aVar) {
    }

    public f createViewInstance(C3415h0 h0Var) {
        return new f(h0Var, (a) null);
    }

    public void flashScrollIndicators(f fVar) {
        fVar.p();
    }

    public void scrollTo(f fVar, h.c cVar) {
        fVar.k();
        if (cVar.f42035c) {
            fVar.b(cVar.f42033a, cVar.f42034b);
        } else {
            fVar.scrollTo(cVar.f42033a, cVar.f42034b);
        }
    }

    public void scrollToEnd(f fVar, h.d dVar) {
        View childAt = fVar.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + fVar.getPaddingBottom();
            fVar.k();
            if (dVar.f42036a) {
                fVar.b(fVar.getScrollX(), height);
            } else {
                fVar.scrollTo(fVar.getScrollX(), height);
            }
        } else {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
    }

    public Object updateState(f fVar, W w10, C3413g0 g0Var) {
        fVar.setStateWrapper(g0Var);
        return null;
    }

    public void receiveCommand(f fVar, int i10, ReadableArray readableArray) {
        h.b(this, fVar, i10, readableArray);
    }

    public void receiveCommand(f fVar, String str, ReadableArray readableArray) {
        h.c(this, fVar, str, readableArray);
    }
}
