package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class W implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13683a;

    public W(Context context) {
        this.f13683a = context;
    }

    public void a(String str) {
        try {
            this.f13683a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
