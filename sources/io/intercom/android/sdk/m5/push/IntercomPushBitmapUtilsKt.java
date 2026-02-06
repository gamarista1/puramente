package io.intercom.android.sdk.m5.push;

import Sg.p;
import Ug.C5585o0;
import Ug.C5600w0;
import Ug.M;
import Ug.Z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import j.C2115a;
import j4.C3622i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import m4.C3773b;
import qf.C6658d;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aS\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroid/content/Context;", "context", "", "contentImageUrl", "avatarImageUrl", "authorName", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Llf/M;", "onComplete", "loadBitmaps", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyf/p;)V", "loadContentBitmapBlocking", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;", "imageUrl", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "loadAvatarBitmapBlocking", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;)Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "getBitmapUri", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;", "", "LARGE_ICON_SIZE_DP", "F", "BIG_PICTURE_WIDTH_DP", "BIG_PICTURE_HEIGHT_DP", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomPushBitmapUtilsKt {
    private static final float BIG_PICTURE_HEIGHT_DP = 256.0f;
    private static final float BIG_PICTURE_WIDTH_DP = 512.0f;
    private static final float LARGE_ICON_SIZE_DP = 48.0f;

    public static final Uri getBitmapUri(Context context, Bitmap bitmap) {
        C6496s.h(context, "context");
        C6496s.h(bitmap, "bitmap");
        try {
            File file = new File(context.getCacheDir(), "images");
            file.mkdirs();
            String uuid = UUID.randomUUID().toString();
            C6496s.g(uuid, "toString(...)");
            File file2 = new File(file, uuid + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return d.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final Bitmap loadAvatarBitmapBlocking(Context context, String str, String str2, AppConfig appConfig) {
        Drawable drawable;
        if (p.d0(str) && p.d0(str2)) {
            return null;
        }
        int dpToPx = ScreenUtils.dpToPx(LARGE_ICON_SIZE_DP, context);
        if (!p.d0(str) || p.d0(str2)) {
            AvatarDefaultDrawable defaultDrawable = AvatarUtils.getDefaultDrawable(context, appConfig);
            drawable = IntercomCoilKt.loadIntercomImageBlocking(context, new C3622i.a(context).i(defaultDrawable).E(new C3773b()).d(str).g(Z.b()).y(dpToPx, dpToPx).a());
            if (drawable == null) {
                drawable = defaultDrawable;
            }
        } else {
            drawable = AvatarUtils.getInitialsDrawable(NameUtils.getInitial(str2), appConfig);
        }
        C6496s.e(drawable);
        return BitmapUtilsKt.drawableToBitmap(drawable, dpToPx, dpToPx);
    }

    public static final void loadBitmaps(Context context, String str, String str2, String str3, yf.p pVar) {
        Context context2 = context;
        C6496s.h(context2, "context");
        String str4 = str;
        C6496s.h(str4, "contentImageUrl");
        String str5 = str2;
        C6496s.h(str5, "avatarImageUrl");
        String str6 = str3;
        C6496s.h(str6, "authorName");
        yf.p pVar2 = pVar;
        C6496s.h(pVar2, "onComplete");
        N n10 = new N();
        N n11 = new N();
        C5600w0 unused = C5576k.d(C5585o0.f65402a, Z.b(), (M) null, new IntercomPushBitmapUtilsKt$loadBitmaps$1(pVar2, n10, n11, context2, str4, str5, str6, Injector.get().getAppConfigProvider().get(), (C6658d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ void loadBitmaps$default(Context context, String str, String str2, String str3, yf.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        loadBitmaps(context, str, str2, str3, pVar);
    }

    /* access modifiers changed from: private */
    public static final Bitmap loadContentBitmapBlocking(Context context, String str) {
        if (p.d0(str)) {
            return null;
        }
        int dpToPx = ScreenUtils.dpToPx(BIG_PICTURE_WIDTH_DP, context);
        int dpToPx2 = ScreenUtils.dpToPx(BIG_PICTURE_HEIGHT_DP, context);
        Drawable b10 = C2115a.b(context, R.drawable.intercom_push_image_load_failes);
        Drawable loadIntercomImageBlocking = IntercomCoilKt.loadIntercomImageBlocking(context, new C3622i.a(context).g(Z.b()).d(str).i(b10).a());
        if (loadIntercomImageBlocking != null) {
            b10 = loadIntercomImageBlocking;
        }
        if (b10 != null) {
            return BitmapUtilsKt.drawableToBitmap(b10, dpToPx, dpToPx2);
        }
        return null;
    }
}
