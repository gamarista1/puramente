package com.facebook.react.views.scroll;

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
import j8.d;
import j8.f;
import j8.m;
import java.util.ArrayList;
import java.util.List;

@a(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<e> implements h.b {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this((a) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @C3501b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(e eVar, int i10, Integer num) {
        C3400a.q(eVar, m.f44918b, num);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(e eVar, int i10, float f10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(f10, C3431y.POINT);
        }
        C3400a.r(eVar, d.values()[i10], xVar);
    }

    @C3500a(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(eVar, fVar);
    }

    @C3501b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(e eVar, int i10, float f10) {
        C3400a.t(eVar, m.values()[i10], Float.valueOf(f10));
    }

    @C3500a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i10) {
        eVar.setEndFillColor(i10);
    }

    @C3500a(name = "contentOffset")
    public void setContentOffset(e eVar, ReadableMap readableMap) {
        double d10;
        if (readableMap != null) {
            double d11 = 0.0d;
            if (readableMap.hasKey("x")) {
                d10 = readableMap.getDouble("x");
            } else {
                d10 = 0.0d;
            }
            if (readableMap.hasKey("y")) {
                d11 = readableMap.getDouble("y");
            }
            eVar.scrollTo((int) G.g(d10), (int) G.g(d11));
            return;
        }
        eVar.scrollTo(0, 0);
    }

    @C3500a(name = "decelerationRate")
    public void setDecelerationRate(e eVar, float f10) {
        eVar.setDecelerationRate(f10);
    }

    @C3500a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(e eVar, boolean z10) {
        eVar.setDisableIntervalMomentum(z10);
    }

    @C3500a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(e eVar, int i10) {
        if (i10 > 0) {
            eVar.setHorizontalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i10);
            return;
        }
        eVar.setHorizontalFadingEdgeEnabled(false);
        eVar.setFadingEdgeLength(0);
    }

    @C3500a(name = "horizontal")
    public void setHorizontal(e eVar, boolean z10) {
    }

    @C3500a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(e eVar, ReadableMap readableMap) {
        if (readableMap != null) {
            eVar.setMaintainVisibleContentPosition(b.C0649b.a(readableMap));
        } else {
            eVar.setMaintainVisibleContentPosition((b.C0649b) null);
        }
    }

    @C3500a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z10) {
        C1680b0.B0(eVar, z10);
    }

    @C3500a(name = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(i.n(str));
    }

    @C3500a(name = "overflow")
    public void setOverflow(e eVar, String str) {
        eVar.setOverflow(str);
    }

    @C3500a(name = "pagingEnabled")
    public void setPagingEnabled(e eVar, boolean z10) {
        eVar.setPagingEnabled(z10);
    }

    @C3500a(name = "persistentScrollbar")
    public void setPersistentScrollbar(e eVar, boolean z10) {
        eVar.setScrollbarFadingEnabled(!z10);
    }

    @C3500a(name = "pointerEvents")
    public void setPointerEvents(e eVar, String str) {
        eVar.setPointerEvents(H.e(str));
    }

    @C3500a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z10) {
        eVar.setRemoveClippedSubviews(z10);
    }

    @C3500a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z10) {
        eVar.setScrollEnabled(z10);
    }

    @C3500a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(e eVar, int i10) {
        eVar.setScrollEventThrottle(i10);
    }

    @C3500a(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @C3500a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z10) {
        eVar.setSendMomentumEvents(z10);
    }

    @C3500a(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(e eVar, boolean z10) {
        eVar.setHorizontalScrollBarEnabled(z10);
    }

    @C3500a(name = "snapToAlignment")
    public void setSnapToAlignment(e eVar, String str) {
        eVar.setSnapToAlignment(i.o(str));
    }

    @C3500a(name = "snapToEnd")
    public void setSnapToEnd(e eVar, boolean z10) {
        eVar.setSnapToEnd(z10);
    }

    @C3500a(name = "snapToInterval")
    public void setSnapToInterval(e eVar, float f10) {
        eVar.setSnapInterval((int) (f10 * G.c()));
    }

    @C3500a(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            eVar.setSnapOffsets((List<Integer>) null);
            return;
        }
        float c10 = G.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i10) * ((double) c10))));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @C3500a(name = "snapToStart")
    public void setSnapToStart(e eVar, boolean z10) {
        eVar.setSnapToStart(z10);
    }

    public ReactHorizontalScrollViewManager(a aVar) {
    }

    public e createViewInstance(C3415h0 h0Var) {
        return new e(h0Var, (a) null);
    }

    public void flashScrollIndicators(e eVar) {
        eVar.r();
    }

    public void scrollTo(e eVar, h.c cVar) {
        eVar.k();
        if (cVar.f42035c) {
            eVar.b(cVar.f42033a, cVar.f42034b);
        } else {
            eVar.scrollTo(cVar.f42033a, cVar.f42034b);
        }
    }

    public void scrollToEnd(e eVar, h.d dVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt != null) {
            int width = childAt.getWidth() + eVar.getPaddingRight();
            eVar.k();
            if (dVar.f42036a) {
                eVar.b(width, eVar.getScrollY());
            } else {
                eVar.scrollTo(width, eVar.getScrollY());
            }
        } else {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
    }

    public Object updateState(e eVar, W w10, C3413g0 g0Var) {
        eVar.setStateWrapper(g0Var);
        return null;
    }

    public void receiveCommand(e eVar, int i10, ReadableArray readableArray) {
        h.b(this, eVar, i10, readableArray);
    }

    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        h.c(this, eVar, str, readableArray);
    }
}
