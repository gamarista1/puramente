package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f15967k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f15968a;

    /* renamed from: b  reason: collision with root package name */
    Object f15969b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f15970c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f15971d;

    /* renamed from: e  reason: collision with root package name */
    public int f15972e;

    /* renamed from: f  reason: collision with root package name */
    public int f15973f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f15974g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f15975h;

    /* renamed from: i  reason: collision with root package name */
    public String f15976i;

    /* renamed from: j  reason: collision with root package name */
    public String f15977j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f15968a) {
                case -1:
                    return (Icon) iconCompat.f15969b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f15969b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.h(), iconCompat.f15972e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f15969b, iconCompat.f15972e, iconCompat.f15973f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f15969b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f15969b, false));
                        break;
                    } else {
                        icon = b.a((Bitmap) iconCompat.f15969b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        icon = d.a(iconCompat.j());
                        break;
                    } else if (context != null) {
                        InputStream k10 = iconCompat.k(context);
                        if (k10 != null) {
                            if (i10 < 26) {
                                icon = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(k10), false));
                                break;
                            } else {
                                icon = b.a(BitmapFactory.decodeStream(k10));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f15974g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f15975h;
            if (mode != IconCompat.f15967k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f15968a = -1;
        this.f15970c = null;
        this.f15971d = null;
        this.f15972e = 0;
        this.f15973f = 0;
        this.f15974g = null;
        this.f15975h = f15967k;
        this.f15976i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        x1.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f15969b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Bitmap bitmap) {
        x1.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f15969b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Context context, int i10) {
        x1.c.c(context);
        return e(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat e(Resources resources, String str, int i10) {
        x1.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f15972e = i10;
            if (resources != null) {
                try {
                    iconCompat.f15969b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f15969b = str;
            }
            iconCompat.f15977j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String q(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap f() {
        int i10 = this.f15968a;
        if (i10 == -1) {
            Object obj = this.f15969b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f15969b;
        } else {
            if (i10 == 5) {
                return a((Bitmap) this.f15969b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int g() {
        int i10 = this.f15968a;
        if (i10 == -1) {
            return a.a(this.f15969b);
        }
        if (i10 == 2) {
            return this.f15972e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String h() {
        int i10 = this.f15968a;
        if (i10 == -1) {
            return a.b(this.f15969b);
        }
        if (i10 == 2) {
            String str = this.f15977j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f15969b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
            }
            return this.f15977j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i10 = this.f15968a;
        if (i10 == -1) {
            return a.c(this.f15969b);
        }
        return i10;
    }

    public Uri j() {
        int i10 = this.f15968a;
        if (i10 == -1) {
            return a.d(this.f15969b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f15969b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        Uri j10 = j();
        String scheme = j10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(j10);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + j10, e10);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f15969b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + j10, e11);
                return null;
            }
        }
    }

    public void l() {
        this.f15975h = PorterDuff.Mode.valueOf(this.f15976i);
        switch (this.f15968a) {
            case -1:
                Parcelable parcelable = this.f15971d;
                if (parcelable != null) {
                    this.f15969b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f15971d;
                if (parcelable2 != null) {
                    this.f15969b = parcelable2;
                    return;
                }
                byte[] bArr = this.f15970c;
                this.f15969b = bArr;
                this.f15968a = 3;
                this.f15972e = 0;
                this.f15973f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f15970c, Charset.forName("UTF-16"));
                this.f15969b = str;
                if (this.f15968a == 2 && this.f15977j == null) {
                    this.f15977j = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f15969b = this.f15970c;
                return;
            default:
                return;
        }
    }

    public void m(boolean z10) {
        this.f15976i = this.f15975h.name();
        switch (this.f15968a) {
            case -1:
                if (!z10) {
                    this.f15971d = (Parcelable) this.f15969b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f15969b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f15970c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f15971d = (Parcelable) this.f15969b;
                return;
            case 2:
                this.f15970c = ((String) this.f15969b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f15970c = (byte[]) this.f15969b;
                return;
            case 4:
            case 6:
                this.f15970c = this.f15969b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        switch (this.f15968a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f15969b);
                break;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f15969b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f15969b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f15969b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f15968a);
        bundle.putInt("int1", this.f15972e);
        bundle.putInt("int2", this.f15973f);
        bundle.putString("string1", this.f15977j);
        ColorStateList colorStateList = this.f15974g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f15975h;
        if (mode != f15967k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public Icon o() {
        return p((Context) null);
    }

    public Icon p(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f15968a == -1) {
            return String.valueOf(this.f15969b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(q(this.f15968a));
        switch (this.f15968a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f15969b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f15969b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f15977j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(g())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f15972e);
                if (this.f15973f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f15973f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f15969b);
                break;
        }
        if (this.f15974g != null) {
            sb2.append(" tint=");
            sb2.append(this.f15974g);
        }
        if (this.f15975h != f15967k) {
            sb2.append(" mode=");
            sb2.append(this.f15975h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f15970c = null;
        this.f15971d = null;
        this.f15972e = 0;
        this.f15973f = 0;
        this.f15974g = null;
        this.f15975h = f15967k;
        this.f15976i = null;
        this.f15968a = i10;
    }
}
