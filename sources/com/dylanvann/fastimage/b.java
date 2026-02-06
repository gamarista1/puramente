package com.dylanvann.fastimage;

import V4.j;
import Z4.i;
import Z4.k;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.adjust.sdk.Constants;
import com.bumptech.glide.h;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.Map;
import n5.C3859b;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f39240a = new ColorDrawable(0);

    /* renamed from: b  reason: collision with root package name */
    private static final Map f39241b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f39242c = new C0622b();

    /* renamed from: d  reason: collision with root package name */
    private static final Map f39243d = new c();

    class a extends HashMap {
        a() {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put("web", FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    }

    /* renamed from: com.dylanvann.fastimage.b$b  reason: collision with other inner class name */
    class C0622b extends HashMap {
        C0622b() {
            put(Constants.LOW, h.LOW);
            put(Constants.NORMAL, h.NORMAL);
            put(Constants.HIGH, h.HIGH);
        }
    }

    class c extends HashMap {
        c() {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39244a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.dylanvann.fastimage.FastImageCacheControl[] r0 = com.dylanvann.fastimage.FastImageCacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39244a = r0
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.WEB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39244a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.CACHE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39244a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dylanvann.fastimage.FastImageCacheControl r1 = com.dylanvann.fastimage.FastImageCacheControl.IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dylanvann.fastimage.b.d.<clinit>():void");
        }
    }

    private static FastImageCacheControl a(ReadableMap readableMap) {
        return (FastImageCacheControl) h("cache", "immutable", f39241b, readableMap);
    }

    static i b(ReadableMap readableMap) {
        String str;
        i iVar = i.f35882b;
        if (!readableMap.hasKey("headers")) {
            return iVar;
        }
        if (readableMap.getType("headers") == ReadableType.Map) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            k.a aVar = new k.a();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                String string = map.getString(nextKey);
                if (string != null) {
                    aVar.b(nextKey, string);
                }
            }
            return aVar.c();
        }
        ReadableArray array = readableMap.getArray("headers");
        if (array == null || array.size() == 0) {
            return iVar;
        }
        k.a aVar2 = new k.a();
        for (int i10 = 0; i10 < array.size(); i10++) {
            ReadableMap map2 = array.getMap(i10);
            String str2 = null;
            if (map2.hasKey("name")) {
                str = map2.getString("name");
            } else {
                str = null;
            }
            if (map2.hasKey("value")) {
                str2 = map2.getString("value");
            }
            if (!(str == null || str2 == null)) {
                aVar2.b(str, str2);
            }
        }
        return aVar2.c();
    }

    static FastImageSource c(Context context, ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new FastImageSource(context, readableMap.getString("uri"), b(readableMap));
    }

    static com.bumptech.glide.request.h d(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        h e10 = e(readableMap);
        FastImageCacheControl a10 = a(readableMap);
        j jVar = j.f34542e;
        int i10 = d.f39244a[a10.ordinal()];
        boolean z10 = true;
        boolean z11 = false;
        if (i10 == 1) {
            jVar = j.f34539b;
            z11 = true;
            z10 = false;
        } else if (i10 != 2) {
            z10 = false;
        }
        com.bumptech.glide.request.h hVar = (com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) new com.bumptech.glide.request.h().diskCacheStrategy(jVar)).onlyRetrieveFromCache(z10)).skipMemoryCache(z11)).priority(e10)).placeholder(f39240a);
        if (fastImageSource.isResource()) {
            return (com.bumptech.glide.request.h) hVar.apply(com.bumptech.glide.request.h.signatureOf(C3859b.c(context)));
        }
        return hVar;
    }

    private static h e(ReadableMap readableMap) {
        return (h) h("priority", Constants.NORMAL, f39242c, readableMap);
    }

    static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g("resizeMode", "cover", f39243d, str);
    }

    private static Object g(String str, String str2, Map map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    private static Object h(String str, String str2, Map map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return g(str, str2, map, str3);
    }
}
