package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import e8.C3500a;

public class LinearGradientManager extends SimpleViewManager<b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    public String getName() {
        return REACT_CLASS;
    }

    @C3500a(defaultFloat = 45.0f, name = "angle")
    public void setAngle(b bVar, float f10) {
        bVar.setAngle(f10);
    }

    @C3500a(name = "angleCenter")
    public void setAngleCenter(b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @C3500a(name = "borderRadii")
    public void setBorderRadii(b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @C3500a(name = "colors")
    public void setColors(b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @C3500a(name = "endPoint")
    public void setEndPoint(b bVar, ReadableArray readableArray) {
        bVar.setEndPoint(readableArray);
    }

    @C3500a(name = "locations")
    public void setLocations(b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @C3500a(name = "startPoint")
    public void setStartPoint(b bVar, ReadableArray readableArray) {
        bVar.setStartPoint(readableArray);
    }

    @C3500a(defaultBoolean = false, name = "useAngle")
    public void setUseAngle(b bVar, boolean z10) {
        bVar.setUseAngle(z10);
    }

    /* access modifiers changed from: protected */
    public b createViewInstance(C3415h0 h0Var) {
        return new b(h0Var);
    }
}
