package com.swmansion.reanimated.layoutReanimation;

import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C;
import com.facebook.yoga.h;

public abstract class ReanimatedNativeHierarchyManagerBase extends C {
    public ReanimatedNativeHierarchyManagerBase(B0 b02) {
        super(b02);
    }

    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, h hVar) {
        super.updateLayout(i10, i11, i12, i13, i14, i15, hVar);
        updateLayoutCommon(i10, i11, i12, i13, i14, i15);
    }

    public abstract void updateLayoutCommon(int i10, int i11, int i12, int i13, int i14, int i15);
}
