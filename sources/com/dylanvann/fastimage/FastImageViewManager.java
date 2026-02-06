package com.dylanvann.fastimage;

import C7.d;
import Z4.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import com.dylanvann.fastimage.events.FastImageProgressEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import e8.C3500a;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m8.C3813k;
import m8.C3815l;

class FastImageViewManager extends SimpleViewManager<e> implements FastImageProgressListener, C3815l {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<e>> VIEWS_FOR_URLS = new WeakHashMap();
    private final w0 mDelegate = new C3813k(this);
    private m requestManager = null;

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof C3415h0)) {
            return null;
        }
        Context baseContext = ((C3415h0) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return d.a().b(REACT_ON_LOAD_START_EVENT, d.d("registrationName", REACT_ON_LOAD_START_EVENT)).b(REACT_ON_PROGRESS_EVENT, d.d("registrationName", REACT_ON_PROGRESS_EVENT)).b("onFastImageLoad", d.d("registrationName", "onFastImageLoad")).b("onFastImageError", d.d("registrationName", "onFastImageError")).b("onFastImageLoadEnd", d.d("registrationName", "onFastImageLoadEnd")).a();
    }

    public float getGranularityPercentage() {
        return 0.5f;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void onProgress(String str, long j10, long j11) {
        List<e> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (e eVar : list) {
                C3415h0 h0Var = (C3415h0) eVar.getContext();
                EventDispatcher c10 = n0.c(h0Var, eVar.getId());
                FastImageProgressEvent fastImageProgressEvent = new FastImageProgressEvent(n0.e(h0Var), eVar.getId(), (int) j10, (int) j11);
                if (c10 != null) {
                    c10.h(fastImageProgressEvent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public e createViewInstance(C3415h0 h0Var) {
        if (isValidContextForGlide(h0Var)) {
            this.requestManager = c.D(h0Var);
        }
        return new e(h0Var);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(e eVar) {
        super.onAfterUpdateTransaction(eVar);
        eVar.e(this, this.requestManager, VIEWS_FOR_URLS);
    }

    public void onDropViewInstance(e eVar) {
        eVar.c(this.requestManager);
        h hVar = eVar.f39255d;
        if (hVar != null) {
            String hVar2 = hVar.toString();
            FastImageOkHttpProgressGlideModule.forget(hVar2);
            Map<String, List<e>> map = VIEWS_FOR_URLS;
            List list = map.get(hVar2);
            if (list != null) {
                list.remove(eVar);
                if (list.size() == 0) {
                    map.remove(hVar2);
                }
            }
        }
        super.onDropViewInstance(eVar);
    }

    @C3500a(name = "defaultSource")
    public void setDefaultSource(e eVar, String str) {
        eVar.f(q8.c.d().e(eVar.getContext(), str));
    }

    @C3500a(name = "resizeMode")
    public void setResizeMode(e eVar, String str) {
        eVar.setScaleType(b.f(str));
    }

    @C3500a(name = "source")
    public void setSource(e eVar, ReadableMap readableMap) {
        eVar.g(readableMap);
    }

    @C3500a(customType = "Color", name = "tintColor")
    public void setTintColor(e eVar, Integer num) {
        if (num == null) {
            eVar.clearColorFilter();
        } else {
            eVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }
}
