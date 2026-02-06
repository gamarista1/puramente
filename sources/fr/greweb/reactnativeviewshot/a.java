package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.l0;
import com.google.android.gms.common.api.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

public class a implements l0, UIBlock {
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String f60561o = "a";
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static byte[] f60562p = new byte[65536];

    /* renamed from: q  reason: collision with root package name */
    private static final Object f60563q = new Object();

    /* renamed from: r  reason: collision with root package name */
    private static final Set f60564r = Collections.newSetFromMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f60565a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60566b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f60567c;

    /* renamed from: d  reason: collision with root package name */
    private final double f60568d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f60569e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f60570f;

    /* renamed from: g  reason: collision with root package name */
    private final File f60571g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f60572h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Promise f60573i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f60574j;

    /* renamed from: k  reason: collision with root package name */
    private final ReactApplicationContext f60575k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f60576l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Activity f60577m;

    /* renamed from: n  reason: collision with root package name */
    private final Executor f60578n;

    /* renamed from: fr.greweb.reactnativeviewshot.a$a  reason: collision with other inner class name */
    class C0890a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UIBlockViewResolver f60579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f60580b;

        C0890a(UIBlockViewResolver uIBlockViewResolver, C c10) {
            this.f60579a = uIBlockViewResolver;
            this.f60580b = c10;
        }

        public void run() {
            View view;
            try {
                if (a.this.f60565a == -1) {
                    view = a.this.f60577m.getWindow().getDecorView().findViewById(16908290);
                } else {
                    UIBlockViewResolver uIBlockViewResolver = this.f60579a;
                    if (uIBlockViewResolver != null) {
                        view = uIBlockViewResolver.resolveView(a.this.f60565a);
                    } else {
                        view = this.f60580b.resolveView(a.this.f60565a);
                    }
                }
                if (view == null) {
                    String l10 = a.f60561o;
                    Log.e(l10, "No view found with reactTag: " + a.this.f60565a, new AssertionError());
                    Promise d10 = a.this.f60573i;
                    d10.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + a.this.f60565a);
                    return;
                }
                d dVar = new d(a.f60562p);
                dVar.o(a.y(view));
                a.f60562p = dVar.n();
                if ("tmpfile".equals(a.this.f60572h) && -1 == a.this.f60567c) {
                    a.this.C(view);
                } else if (!"tmpfile".equals(a.this.f60572h) || -1 == a.this.f60567c) {
                    if (!"base64".equals(a.this.f60572h)) {
                        if (!"zip-base64".equals(a.this.f60572h)) {
                            if ("data-uri".equals(a.this.f60572h)) {
                                a.this.B(view);
                                return;
                            }
                            return;
                        }
                    }
                    a.this.A(view);
                } else {
                    a.this.D(view);
                }
            } catch (Throwable th2) {
                Log.e(a.f60561o, "Failed to capture view snapshot", th2);
                a.this.f60573i.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
            }
        }
    }

    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Canvas f60582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f60583b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f60584c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bitmap f60585d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Paint f60586e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f60587f;

        b(Canvas canvas, View view, View view2, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
            this.f60582a = canvas;
            this.f60583b = view;
            this.f60584c = view2;
            this.f60585d = bitmap;
            this.f60586e = paint;
            this.f60587f = countDownLatch;
        }

        public void onPixelCopyFinished(int i10) {
            int save = this.f60582a.save();
            Matrix unused = a.this.q(this.f60582a, this.f60583b, this.f60584c);
            this.f60582a.drawBitmap(this.f60585d, 0.0f, 0.0f, this.f60586e);
            this.f60582a.restoreToCount(save);
            a.z(this.f60585d);
            this.f60587f.countDown();
        }
    }

    public @interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f60589a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public static class d extends ByteArrayOutputStream {
        public d(byte[] bArr) {
            super(0);
            this.buf = bArr;
        }

        protected static int f(int i10) {
            if (i10 < 0) {
                throw new OutOfMemoryError();
            } else if (i10 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            } else {
                return 2147483639;
            }
        }

        public ByteBuffer a(int i10) {
            if (this.buf.length < i10) {
                b(i10);
            }
            return ByteBuffer.wrap(this.buf);
        }

        /* access modifiers changed from: protected */
        public void b(int i10) {
            int length = this.buf.length << 1;
            if (length - i10 < 0) {
                length = i10;
            }
            if (length - 2147483639 > 0) {
                length = f(i10);
            }
            this.buf = Arrays.copyOf(this.buf, length);
        }

        public byte[] n() {
            return this.buf;
        }

        public void o(int i10) {
            this.count = i10;
        }
    }

    public a(int i10, String str, int i11, double d10, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, boolean z10, Promise promise, Executor executor) {
        this.f60565a = i10;
        this.f60566b = str;
        this.f60567c = i11;
        this.f60568d = d10;
        this.f60569e = num;
        this.f60570f = num2;
        this.f60571g = file;
        this.f60572h = str2;
        this.f60574j = bool;
        this.f60575k = reactApplicationContext;
        this.f60577m = activity;
        this.f60576l = z10;
        this.f60573i = promise;
        this.f60578n = executor;
    }

    /* access modifiers changed from: private */
    public void A(View view) {
        boolean z10;
        String str;
        if (-1 == this.f60567c) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean equals = "zip-base64".equals(this.f60572h);
        d dVar = new d(f60562p);
        Point r10 = r(view, dVar);
        f60562p = dVar.n();
        int size = dVar.size();
        String format = String.format(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(r10.x), Integer.valueOf(r10.y)});
        if (!z10) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f60562p, 0, size);
            deflater.finish();
            d dVar2 = new d(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                dVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(dVar2.n(), 0, dVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(f60562p, 0, size, 2);
        }
        this.f60573i.resolve(str);
    }

    /* access modifiers changed from: private */
    public void B(View view) {
        String str;
        d dVar = new d(f60562p);
        r(view, dVar);
        f60562p = dVar.n();
        String encodeToString = Base64.encodeToString(f60562p, 0, dVar.size(), 2);
        if ("jpg".equals(this.f60566b)) {
            str = "jpeg";
        } else {
            str = this.f60566b;
        }
        Promise promise = this.f60573i;
        promise.resolve("data:image/" + str + ";base64," + encodeToString);
    }

    /* access modifiers changed from: private */
    public void C(View view) {
        String uri = Uri.fromFile(this.f60571g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f60571g);
        d dVar = new d(f60562p);
        Point r10 = r(view, dVar);
        f60562p = dVar.n();
        int size = dVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(r10.x), Integer.valueOf(r10.y)}).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f60562p, 0, size);
        fileOutputStream.close();
        this.f60573i.resolve(uri);
    }

    /* access modifiers changed from: private */
    public void D(View view) {
        r(view, new FileOutputStream(this.f60571g));
        this.f60573i.resolve(Uri.fromFile(this.f60571g).toString());
    }

    /* access modifiers changed from: private */
    public Matrix q(Canvas canvas, View view, View view2) {
        int i10;
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int left = view4.getLeft();
            int i11 = 0;
            if (view4 != view2) {
                i10 = view4.getPaddingLeft();
            } else {
                i10 = 0;
            }
            float translationX = ((float) (left + i10)) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i11 = view4.getPaddingTop();
            }
            float translationY = ((float) (top + i11)) + view4.getTranslationY();
            canvas.translate(translationX, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point r(View view, OutputStream outputStream) {
        try {
            return s(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point s(View view, OutputStream outputStream) {
        int i10;
        Bitmap bitmap;
        Point point;
        Paint paint;
        Canvas canvas;
        Bitmap bitmap2;
        boolean z10;
        SurfaceView surfaceView;
        View view2 = view;
        OutputStream outputStream2 = outputStream;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z11 = false;
        if (this.f60574j.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int i11 = 0;
            for (int i12 = 0; i12 < scrollView.getChildCount(); i12++) {
                i11 += scrollView.getChildAt(i12).getHeight();
            }
            i10 = i11;
        } else {
            i10 = height;
        }
        Point point2 = new Point(width, i10);
        Bitmap w10 = w(width, i10);
        Paint paint2 = new Paint();
        boolean z12 = true;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
        Canvas canvas2 = new Canvas(w10);
        view2.draw(canvas2);
        for (View view3 : v(view)) {
            if (view3 instanceof TextureView) {
                if (view3.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view3;
                    textureView.setOpaque(z11);
                    Bitmap bitmap3 = textureView.getBitmap(x(view3.getWidth(), view3.getHeight()));
                    int save = canvas2.save();
                    q(canvas2, view2, view3);
                    canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, paint2);
                    canvas2.restoreToCount(save);
                    z(bitmap3);
                }
            } else if ((view3 instanceof SurfaceView) && this.f60576l) {
                SurfaceView surfaceView2 = (SurfaceView) view3;
                CountDownLatch countDownLatch = new CountDownLatch(z12 ? 1 : 0);
                try {
                    Bitmap x10 = x(view3.getWidth(), view3.getHeight());
                    CountDownLatch countDownLatch2 = countDownLatch;
                    surfaceView = surfaceView2;
                    canvas = canvas2;
                    z10 = z12;
                    paint = paint2;
                    point = point2;
                    bitmap2 = w10;
                    try {
                        b bVar = new b(canvas2, view, view3, x10, paint2, countDownLatch2);
                        PixelCopy.request(surfaceView, x10, r17, new Handler(Looper.getMainLooper()));
                        countDownLatch2.await(5, TimeUnit.SECONDS);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Exception e11) {
                    e = e11;
                    surfaceView = surfaceView2;
                    canvas = canvas2;
                    z10 = z12;
                    paint = paint2;
                    point = point2;
                    bitmap2 = w10;
                    Log.e(f60561o, "Cannot PixelCopy for " + surfaceView, e);
                    z12 = z10;
                    w10 = bitmap2;
                    canvas2 = canvas;
                    paint2 = paint;
                    point2 = point;
                    z11 = false;
                    view2 = view;
                }
                z12 = z10;
                w10 = bitmap2;
                canvas2 = canvas;
                paint2 = paint;
                point2 = point;
                z11 = false;
                view2 = view;
            }
            canvas = canvas2;
            z10 = z12;
            paint = paint2;
            point = point2;
            bitmap2 = w10;
            z12 = z10;
            w10 = bitmap2;
            canvas2 = canvas;
            paint2 = paint;
            point2 = point;
            z11 = false;
            view2 = view;
        }
        boolean z13 = z12;
        Point point3 = point2;
        Bitmap bitmap4 = w10;
        Integer num = this.f60569e;
        if (num == null || this.f60570f == null || (num.intValue() == width && this.f60570f.intValue() == i10)) {
            bitmap = bitmap4;
        } else {
            bitmap = Bitmap.createScaledBitmap(bitmap4, this.f60569e.intValue(), this.f60570f.intValue(), z13);
            z(bitmap4);
        }
        int i13 = this.f60567c;
        if (-1 != i13 || !(outputStream2 instanceof d)) {
            bitmap.compress(c.f60589a[i13], (int) (this.f60568d * 100.0d), outputStream2);
        } else {
            int i14 = width * i10 * 4;
            d dVar = (d) t(outputStream);
            bitmap.copyPixelsToBuffer(dVar.a(i14));
            dVar.o(i14);
        }
        z(bitmap);
        return point3;
    }

    private static Object t(Object obj) {
        return obj;
    }

    private void u(C c10, UIBlockViewResolver uIBlockViewResolver) {
        this.f60578n.execute(new C0890a(uIBlockViewResolver, c10));
    }

    private List v(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            arrayList2.addAll(v(viewGroup.getChildAt(i10)));
        }
        return arrayList2;
    }

    private static Bitmap w(int i10, int i11) {
        synchronized (f60563q) {
            try {
                for (Bitmap bitmap : f60564r) {
                    if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                        f60564r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private static Bitmap x(int i10, int i11) {
        synchronized (f60563q) {
            try {
                for (Bitmap bitmap : f60564r) {
                    if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
                        f60564r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static int y(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    /* access modifiers changed from: private */
    public static void z(Bitmap bitmap) {
        synchronized (f60563q) {
            f60564r.add(bitmap);
        }
    }

    public void a(C c10) {
        u(c10, (UIBlockViewResolver) null);
    }

    public void execute(UIBlockViewResolver uIBlockViewResolver) {
        u((C) null, uIBlockViewResolver);
    }
}
