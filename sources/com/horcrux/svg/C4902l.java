package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.horcrux.svg.l  reason: case insensitive filesystem */
class C4902l extends C4906p {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f58973e = Pattern.compile("[0-9.-]+");

    /* renamed from: c  reason: collision with root package name */
    public ReadableArray f58974c;

    /* renamed from: d  reason: collision with root package name */
    public float f58975d = 1.0f;

    public C4902l(ReactContext reactContext) {
        super(reactContext);
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        double d10;
        int i10;
        if (readableArray.getInt(0) == 0) {
            if (readableArray.size() == 2) {
                if (readableArray.getType(1) == ReadableType.Map) {
                    i10 = ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue();
                } else {
                    i10 = readableArray.getInt(1);
                }
                paint.setColor((Math.round(((float) (i10 >>> 24)) * f10) << 24) | (i10 & 16777215));
                return;
            }
            if (readableArray.size() > 4) {
                d10 = readableArray.getDouble(4) * ((double) f10) * 255.0d;
            } else {
                d10 = (double) (f10 * 255.0f);
            }
            paint.setARGB((int) d10, (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        }
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f58975d, this.f58974c);
        canvas.drawPaint(paint);
        return createBitmap;
    }

    public void t(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f58974c = null;
            invalidate();
        } else if (dynamic.getType().equals(ReadableType.Map)) {
            u(dynamic.asMap());
        } else {
            ReadableType type = dynamic.getType();
            int i10 = 0;
            if (type.equals(ReadableType.Number)) {
                this.f58974c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
            } else if (type.equals(ReadableType.Array)) {
                this.f58974c = dynamic.asArray();
            } else {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                javaOnlyArray.pushInt(0);
                Matcher matcher = f58973e.matcher(dynamic.asString());
                while (matcher.find()) {
                    double parseDouble = Double.parseDouble(matcher.group());
                    int i11 = i10 + 1;
                    if (i10 < 3) {
                        parseDouble /= 255.0d;
                    }
                    javaOnlyArray.pushDouble(parseDouble);
                    i10 = i11;
                }
                this.f58974c = javaOnlyArray;
            }
            invalidate();
        }
    }

    public void u(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f58974c = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f58974c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f58974c = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.f58974c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f58974c = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void v(float f10) {
        this.f58975d = f10;
        invalidate();
    }
}
