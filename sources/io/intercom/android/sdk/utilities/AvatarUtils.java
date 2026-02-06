package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.coil.AvatarShapeTransformation;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;
import j4.C3619f;
import j4.C3622i;
import j4.C3631r;

public class AvatarUtils {
    public static void createAvatar(Avatar avatar, ImageView imageView, int i10, AppConfig appConfig) {
        Context context = imageView.getContext();
        IntercomCoilKt.loadIntercomImage(context, getAvatarImageRequestBuilder(context, avatar, appConfig).B(imageView).a());
    }

    public static C3622i.a getAvatarImageRequestBuilder(Context context, Avatar avatar, AppConfig appConfig) {
        Drawable placeHolderDrawable = getPlaceHolderDrawable(context, avatar, appConfig);
        return new C3622i.a(context).d(avatar.getImageUrl()).n(placeHolderDrawable).i(placeHolderDrawable).c(true).E(new AvatarShapeTransformation(avatar.getShape()));
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static Drawable getPlaceHolderDrawable(Context context, Avatar avatar, AppConfig appConfig) {
        if (avatar.getInitials().isEmpty()) {
            return getDefaultDrawable(context, appConfig);
        }
        return getInitialsDrawable(avatar.getInitials(), appConfig);
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig) {
        createAvatar(avatar, imageView, 0, appConfig);
    }

    public static void preloadAvatar(Avatar avatar, final Runnable runnable, Activity activity) {
        if (avatar.getImageUrl().isEmpty()) {
            runnable.run();
        } else {
            IntercomCoilKt.loadIntercomImage(activity, new C3622i.a(activity).d(avatar.getImageUrl()).j(new C3622i.b() {
                public void onError(C3622i iVar, C3619f fVar) {
                    runnable.run();
                }

                public void onSuccess(C3622i iVar, C3631r rVar) {
                    runnable.run();
                }

                public void onCancel(C3622i iVar) {
                }

                public void onStart(C3622i iVar) {
                }
            }).a());
        }
    }
}
