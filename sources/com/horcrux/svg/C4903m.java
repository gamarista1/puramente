package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.m  reason: case insensitive filesystem */
class C4903m extends C4906p {

    /* renamed from: c  reason: collision with root package name */
    String f58979c;

    /* renamed from: d  reason: collision with root package name */
    float f58980d;

    /* renamed from: e  reason: collision with root package name */
    float f58981e;

    /* renamed from: f  reason: collision with root package name */
    C4907q f58982f;

    public C4903m(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap t(Context context, Bitmap bitmap) {
        float max = Math.max(this.f58980d, this.f58981e) * 2.0f;
        if (max <= 0.0f) {
            return bitmap;
        }
        float min = Math.min(max, 25.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(min);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap.destroy();
        createFromBitmap2.destroy();
        create.destroy();
        return Bitmap.createScaledBitmap(createBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        return t(getContext(), C4906p.n(hashMap, bitmap, this.f58979c));
    }

    public void u(String str) {
        this.f58982f = C4907q.b(str);
        invalidate();
    }

    public void v(String str) {
        this.f58979c = str;
        invalidate();
    }

    public void w(float f10) {
        this.f58980d = f10;
        invalidate();
    }

    public void x(float f10) {
        this.f58981e = f10;
        invalidate();
    }
}
