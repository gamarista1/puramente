package io.intercom.android.sdk.utilities.coil;

import I.f;
import android.graphics.Bitmap;
import c1.d;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import k4.C3667i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import m4.e;
import q0.C2428n;
import qf.C6658d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/AvatarShapeTransformation;", "Lm4/e;", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "avatarShape", "<init>", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;)V", "Landroid/graphics/Bitmap;", "input", "Lk4/i;", "size", "transform", "(Landroid/graphics/Bitmap;Lk4/i;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvatarShapeTransformation implements e {
    public static final int $stable = 0;
    private final AvatarShape avatarShape;

    public AvatarShapeTransformation(AvatarShape avatarShape2) {
        C6496s.h(avatarShape2, "avatarShape");
        this.avatarShape = avatarShape2;
    }

    public String getCacheKey() {
        return this.avatarShape.name() + AvatarShapeTransformation.class.getName();
    }

    public Object transform(Bitmap bitmap, C3667i iVar, C6658d<? super Bitmap> dVar) {
        f composeShape = AvatarIconKt.getComposeShape(this.avatarShape);
        long a10 = C2428n.a((float) bitmap.getWidth(), (float) bitmap.getHeight());
        d b10 = c1.f.b(1.0f, 0.0f, 2, (Object) null);
        return new m4.d(composeShape.g().a(a10, b10), composeShape.f().a(a10, b10), composeShape.e().a(a10, b10), composeShape.d().a(a10, b10)).transform(bitmap, iVar, dVar);
    }
}
