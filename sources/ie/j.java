package Ie;

import Ee.a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.adjust.sdk.network.ErrorCodes;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.C6496s;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f32146a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static String f32147b = "";

    private j() {
    }

    public static final void a(String str, String str2, String str3, Activity activity) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(activity, "activity");
        f32147b = str;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.putExtra("android.intent.extra.SUBJECT", str3);
        activity.startActivityForResult(Intent.createChooser(intent, str2, PendingIntent.getBroadcast(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), a.class), 134217728 | 33554432).getIntentSender()), ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
    }
}
