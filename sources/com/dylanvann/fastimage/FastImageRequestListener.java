package com.dylanvann.fastimage;

import T4.a;
import V4.q;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.g;
import com.dylanvann.fastimage.events.FastImageErrorEvent;
import com.dylanvann.fastimage.events.FastImageLoadEndEvent;
import com.dylanvann.fastimage.events.FastImageLoadEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.branch.rnbranch.RNBranchModule;
import l5.f;
import l5.j;

public class FastImageRequestListener<T extends Drawable> implements g {
    static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    private final String key;

    FastImageRequestListener(String str) {
        this.key = str;
    }

    private static WritableMap mapFromResource(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, drawable.getIntrinsicWidth());
        writableNativeMap.putInt(Snapshot.HEIGHT, drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    public boolean onLoadFailed(q qVar, Object obj, j jVar, boolean z10) {
        String str;
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (!(jVar instanceof f)) {
            return false;
        }
        e eVar = (e) ((f) jVar).j();
        EventDispatcher c10 = n0.c((C3415h0) eVar.getContext(), eVar.getId());
        int f10 = n0.f(eVar);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (qVar != null) {
            str = qVar.getMessage();
        } else {
            str = "Load Failed";
        }
        writableNativeMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, str);
        if (c10 != null) {
            c10.h(new FastImageErrorEvent(f10, eVar.getId(), writableNativeMap));
            c10.h(new FastImageLoadEndEvent(f10, eVar.getId()));
        }
        return false;
    }

    public boolean onResourceReady(T t10, Object obj, j jVar, a aVar, boolean z10) {
        if (!(jVar instanceof f)) {
            return false;
        }
        e eVar = (e) ((f) jVar).j();
        EventDispatcher c10 = n0.c((C3415h0) eVar.getContext(), eVar.getId());
        int f10 = n0.f(eVar);
        if (c10 != null) {
            c10.h(new FastImageLoadEvent(f10, eVar.getId(), t10.getIntrinsicWidth(), t10.getIntrinsicHeight()));
            c10.h(new FastImageLoadEndEvent(f10, eVar.getId()));
        }
        return false;
    }
}
