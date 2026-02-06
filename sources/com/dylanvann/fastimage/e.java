package com.dylanvann.fastimage;

import Z4.h;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.bumptech.glide.request.d;
import com.dylanvann.fastimage.events.FastImageErrorEvent;
import com.dylanvann.fastimage.events.FastImageLoadStartEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class e extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39252a = false;

    /* renamed from: b  reason: collision with root package name */
    private ReadableMap f39253b = null;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f39254c = null;

    /* renamed from: d  reason: collision with root package name */
    public h f39255d;

    public e(Context context) {
        super(context);
    }

    private boolean d(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public void c(m mVar) {
        if (mVar != null && getTag() != null && (getTag() instanceof d)) {
            mVar.clear((View) this);
        }
    }

    public void e(FastImageViewManager fastImageViewManager, m mVar, Map map) {
        h hVar;
        String str;
        String str2;
        if (this.f39252a) {
            ReadableMap readableMap = this.f39253b;
            Object obj = null;
            if ((readableMap == null || !readableMap.hasKey("uri") || d(this.f39253b.getString("uri"))) && this.f39254c == null) {
                c(mVar);
                h hVar2 = this.f39255d;
                if (hVar2 != null) {
                    FastImageOkHttpProgressGlideModule.forget(hVar2.h());
                }
                setImageDrawable((Drawable) null);
                EventDispatcher c10 = n0.c((C3415h0) getContext(), getId());
                FastImageErrorEvent fastImageErrorEvent = new FastImageErrorEvent(n0.f(this), getId(), this.f39253b);
                if (c10 != null) {
                    c10.h(fastImageErrorEvent);
                    return;
                }
                return;
            }
            FastImageSource c11 = b.c(getContext(), this.f39253b);
            if (c11 == null || c11.getUri().toString().length() != 0) {
                if (c11 == null) {
                    hVar = null;
                } else {
                    hVar = c11.getGlideUrl();
                }
                this.f39255d = hVar;
                c(mVar);
                if (hVar == null) {
                    str = null;
                } else {
                    str = hVar.h();
                }
                if (hVar != null) {
                    FastImageOkHttpProgressGlideModule.expect(str, fastImageViewManager);
                    List list = (List) map.get(str);
                    if (list != null && !list.contains(this)) {
                        list.add(this);
                    } else if (list == null) {
                        map.put(str, new ArrayList(Collections.singletonList(this)));
                    }
                }
                C3415h0 h0Var = (C3415h0) getContext();
                if (c11 != null) {
                    EventDispatcher c12 = n0.c(h0Var, getId());
                    FastImageLoadStartEvent fastImageLoadStartEvent = new FastImageLoadStartEvent(n0.f(this), getId());
                    if (c12 != null) {
                        c12.h(fastImageLoadStartEvent);
                    }
                }
                if (mVar != null) {
                    if (c11 != null) {
                        try {
                            obj = c11.getSourceForLoad();
                        } catch (Exception e10) {
                            if (c11 != null) {
                                str2 = c11.getUri().toString();
                            } else {
                                str2 = "null";
                            }
                            Log.e("FastImageViewWithUrl", String.format("Error detecting image type for URI: %s. Exception: %s", new Object[]{str2, e10.getMessage()}), e10);
                            return;
                        }
                    }
                    l apply = mVar.load(obj).apply(((com.bumptech.glide.request.h) b.d(h0Var, c11, this.f39253b).placeholder(this.f39254c)).fallback(this.f39254c));
                    if (str != null) {
                        apply.listener(new FastImageRequestListener(str));
                    }
                    apply.into((ImageView) this);
                    return;
                }
                return;
            }
            EventDispatcher c13 = n0.c((C3415h0) getContext(), getId());
            FastImageErrorEvent fastImageErrorEvent2 = new FastImageErrorEvent(n0.f(this), getId(), this.f39253b);
            if (c13 != null) {
                c13.h(fastImageErrorEvent2);
            }
            c(mVar);
            h hVar3 = this.f39255d;
            if (hVar3 != null) {
                FastImageOkHttpProgressGlideModule.forget(hVar3.h());
            }
            setImageDrawable((Drawable) null);
        }
    }

    public void f(Drawable drawable) {
        this.f39252a = true;
        this.f39254c = drawable;
    }

    public void g(ReadableMap readableMap) {
        this.f39252a = true;
        this.f39253b = readableMap;
    }
}
