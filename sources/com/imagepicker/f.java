package com.imagepicker;

import R1.a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.c;
import androidx.core.content.d;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f59124a = "rn_image_picker_lib_temp_";

    /* renamed from: b  reason: collision with root package name */
    public static String f59125b = "camera_unavailable";

    /* renamed from: c  reason: collision with root package name */
    public static String f59126c = "permission";

    /* renamed from: d  reason: collision with root package name */
    public static String f59127d = "others";

    /* renamed from: e  reason: collision with root package name */
    public static String f59128e = "photo";

    /* renamed from: f  reason: collision with root package name */
    public static String f59129f = "video";

    /* renamed from: g  reason: collision with root package name */
    public static String f59130g = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    static boolean A(Uri uri, Context context) {
        return x("video/", uri, context);
    }

    public static Uri B(Uri uri, Context context, e eVar) {
        try {
            int[] n10 = n(uri, context);
            if (!F(n10[0], n10[1], eVar)) {
                return uri;
            }
            int[] m10 = m(n10[0], n10[1], eVar);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String q10 = q(uri);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(openInputStream), m10[0], m10[1], true);
            String r10 = r(uri, context);
            File c10 = c(context, l(q10));
            createScaledBitmap.compress(h(q10), eVar.f59117e, context.getContentResolver().openOutputStream(Uri.fromFile(c10)));
            E(c10, r10, context);
            e(uri);
            return Uri.fromFile(c10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return uri;
        }
    }

    public static void C(Uri uri, Context context, String str) {
        Uri uri2;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (str.equals("video")) {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        b(uri, uri2, contentResolver);
    }

    public static void D(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    static void E(File file, String str, Context context) {
        if (!str.equals(String.valueOf(1)) && !str.equals(String.valueOf(0))) {
            a aVar = new a(file);
            aVar.b0("Orientation", str);
            aVar.X();
        }
    }

    static boolean F(int i10, int i11, e eVar) {
        int i12 = eVar.f59118f;
        if ((i12 == 0 || eVar.f59119g == 0) && eVar.f59117e == 100) {
            return false;
        }
        if (i12 < i10 || eVar.f59119g < i11 || eVar.f59117e != 100) {
            return true;
        }
        return false;
    }

    static List a(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            arrayList.add(clipData.getItemAt(i10).getUri());
        }
        return arrayList;
    }

    public static void b(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
            InputStream openInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    openOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static File c(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), f59124a + UUID.randomUUID() + "." + str);
            file.createNewFile();
            return file;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Uri d(File file, Context context) {
        return d.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    static void e(Uri uri) {
        new File(uri.getPath()).delete();
    }

    public static Uri f(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri fromFile = Uri.fromFile(c(context, l(contentResolver.getType(uri))));
        b(uri, fromFile, contentResolver);
        return fromFile;
    }

    static String g(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = openInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    static Bitmap.CompressFormat h(String str) {
        str.hashCode();
        if (str.equals(ClipboardModule.MIMETYPE_JPEG)) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (!str.equals(ClipboardModule.MIMETYPE_PNG)) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    static ReadableMap i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("didCancel", true);
        return createMap;
    }

    static ReadableMap j(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorCode", str);
        if (str2 != null) {
            createMap.putString(b.f37483f, str2);
        }
        return createMap;
    }

    static double k(Uri uri, Context context) {
        try {
            return (double) context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    static String l(String str) {
        if (str == null) {
            return "jpg";
        }
        if (str.equals("image/gif")) {
            return "gif";
        }
        if (!str.equals(ClipboardModule.MIMETYPE_PNG)) {
            return "jpg";
        }
        return "png";
    }

    static int[] m(int i10, int i11, e eVar) {
        int i12;
        int i13 = eVar.f59118f;
        if (i13 == 0 || (i12 = eVar.f59119g) == 0) {
            return new int[]{i10, i11};
        }
        if (i13 < i10) {
            i11 = (int) ((((float) i13) / ((float) i10)) * ((float) i11));
            i10 = i13;
        }
        if (i12 < i11) {
            i10 = (int) ((((float) i12) / ((float) i11)) * ((float) i10));
        } else {
            i12 = i11;
        }
        return new int[]{i10, i12};
    }

    public static int[] n(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return new int[]{0, 0};
        }
    }

    static ReadableMap o(Uri uri, e eVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        a aVar = new a(uri, context);
        int[] n10 = n(uri, context);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", k(uri, context));
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", q(uri));
        createMap.putInt(Snapshot.WIDTH, n10[0]);
        createMap.putInt(Snapshot.HEIGHT, n10[1]);
        createMap.putString("type", p(uri, context));
        if (eVar.f59114b.booleanValue()) {
            createMap.putString("base64", g(uri, context));
        }
        if (eVar.f59115c.booleanValue()) {
            createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, aVar.b());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    static String p(Uri uri, Context context) {
        if (uri.getScheme().equals("file")) {
            return q(uri);
        }
        return context.getContentResolver().getType(uri);
    }

    static String q(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    static String r(Uri uri, Context context) {
        return new a(context.getContentResolver().openInputStream(uri)).h("Orientation");
    }

    static ReadableMap s(List list, e eVar, Context context) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = (Uri) list.get(i10);
            if (y(uri, context)) {
                if (uri.getScheme().contains("content")) {
                    uri = f(uri, context);
                }
                createArray.pushMap(o(B(uri, context, eVar), eVar, context));
            } else if (A(uri, context)) {
                createArray.pushMap(t(uri, eVar, context));
            } else {
                throw new RuntimeException("Unsupported file type");
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("assets", createArray);
        return createMap;
    }

    static ReadableMap t(Uri uri, e eVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        WritableMap createMap = Arguments.createMap();
        g gVar = new g(uri, context);
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", k(uri, context));
        createMap.putInt("duration", gVar.e());
        createMap.putInt("bitrate", gVar.c());
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", p(uri, context));
        createMap.putInt(Snapshot.WIDTH, gVar.g());
        createMap.putInt(Snapshot.HEIGHT, gVar.f());
        if (eVar.f59115c.booleanValue()) {
            createMap.putString(DiagnosticsEntry.TIMESTAMP_KEY, gVar.d());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    static boolean u(Activity activity) {
        if (c.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static boolean v(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            return true;
        }
        return false;
    }

    public static boolean w(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null || !Arrays.asList(strArr).contains("android.permission.CAMERA") || c.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    static boolean x(String str, Uri uri, Context context) {
        String p10 = p(uri, context);
        if (p10 != null) {
            return p10.contains(str);
        }
        return false;
    }

    static boolean y(Uri uri, Context context) {
        return x("image/", uri, context);
    }

    static boolean z(int i10) {
        switch (i10) {
            case ImagePickerModule.REQUEST_LAUNCH_IMAGE_CAPTURE:
            case ImagePickerModule.REQUEST_LAUNCH_VIDEO_CAPTURE:
            case ImagePickerModule.REQUEST_LAUNCH_LIBRARY:
                return true;
            default:
                return false;
        }
    }
}
