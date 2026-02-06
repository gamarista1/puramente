package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f42097a = new b();

    private b() {
    }

    public static final WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        float f10;
        CharSequence charSequence2 = charSequence;
        Layout layout2 = layout;
        TextPaint textPaint2 = textPaint;
        C6496s.h(charSequence2, AttributeType.TEXT);
        C6496s.h(layout2, "layout");
        C6496s.h(textPaint2, "paint");
        C6496s.h(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        TextPaint textPaint3 = new TextPaint(textPaint2);
        textPaint3.setTextSize(textPaint3.getTextSize() * 100.0f);
        Rect rect = new Rect();
        int i10 = 0;
        int i11 = 1;
        textPaint3.getTextBounds("T", 0, 1, rect);
        float height = (((float) rect.height()) / 100.0f) / displayMetrics.density;
        Rect rect2 = new Rect();
        textPaint3.getTextBounds("x", 0, 1, rect2);
        float height2 = (((float) rect2.height()) / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i10 < lineCount) {
            if (charSequence.length() <= 0 || charSequence2.charAt(layout2.getLineEnd(i10) - i11) != 10) {
                f10 = layout2.getLineWidth(i10);
            } else {
                f10 = layout2.getLineMax(i10);
            }
            Rect rect3 = new Rect();
            layout2.getLineBounds(i10, rect3);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", (double) (layout2.getLineLeft(i10) / displayMetrics.density));
            createMap.putDouble("y", (double) (((float) rect3.top) / displayMetrics.density));
            createMap.putDouble(Snapshot.WIDTH, (double) (f10 / displayMetrics.density));
            createMap.putDouble(Snapshot.HEIGHT, (double) (((float) rect3.height()) / displayMetrics.density));
            createMap.putDouble("descender", (double) (((float) layout2.getLineDescent(i10)) / displayMetrics.density));
            createMap.putDouble("ascender", (double) (((float) (-layout2.getLineAscent(i10))) / displayMetrics.density));
            createMap.putDouble("baseline", (double) (((float) layout2.getLineBaseline(i10)) / displayMetrics.density));
            createMap.putDouble("capHeight", (double) height);
            createMap.putDouble("xHeight", (double) height2);
            createMap.putString(AttributeType.TEXT, charSequence2.subSequence(layout2.getLineStart(i10), layout2.getLineEnd(i10)).toString());
            createArray.pushMap(createMap);
            i10++;
            i11 = 1;
        }
        C6496s.e(createArray);
        return createArray;
    }
}
