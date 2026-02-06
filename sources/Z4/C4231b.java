package z4;

import H4.f;
import H4.l;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import u4.C4063c;
import u4.O;

/* renamed from: z4.b  reason: case insensitive filesystem */
public class C4231b {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f50072d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f50073a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50074b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f50075c;

    public C4231b(Drawable.Callback callback, String str, C4063c cVar, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f50074b = str;
        } else {
            this.f50074b = str + '/';
        }
        this.f50075c = map;
        d(cVar);
        if (!(callback instanceof View)) {
            this.f50073a = null;
        } else {
            this.f50073a = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f50072d) {
            ((O) this.f50075c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        O o10 = (O) this.f50075c.get(str);
        if (o10 == null) {
            return null;
        }
        Bitmap b10 = o10.b();
        if (b10 != null) {
            return b10;
        }
        Context context = this.f50073a;
        if (context == null) {
            return null;
        }
        String c10 = o10.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!c10.startsWith("data:") || c10.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f50074b)) {
                    AssetManager assets = context.getAssets();
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f50074b + c10), (Rect) null, options);
                        if (decodeStream != null) {
                            return c(str, l.m(decodeStream, o10.f(), o10.d()));
                        }
                        f.c("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e10) {
                        f.d("Unable to decode image `" + str + "`.", e10);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e11) {
                f.d("Unable to open asset.", e11);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                return c(str, l.m(BitmapFactory.decodeByteArray(decode, 0, decode.length, options), o10.f(), o10.d()));
            } catch (IllegalArgumentException e12) {
                f.d("data URL did not have correct base64 format.", e12);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        if (context != null) {
            if (this.f50073a instanceof Application) {
                context = context.getApplicationContext();
            }
            if (context == this.f50073a) {
                return true;
            }
            return false;
        } else if (this.f50073a == null) {
            return true;
        } else {
            return false;
        }
    }

    public void d(C4063c cVar) {
    }
}
