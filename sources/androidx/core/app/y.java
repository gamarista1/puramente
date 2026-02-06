package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class y implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f15961a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Context f15962b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private y(Context context) {
        this.f15962b = context;
    }

    public static y h(Context context) {
        return new y(context);
    }

    public y a(Intent intent) {
        this.f15961a.add(intent);
        return this;
    }

    public y b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f15962b.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        a(intent);
        return this;
    }

    public y d(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = l.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f15962b.getPackageManager());
            }
            g(component);
            a(intent);
        }
        return this;
    }

    public y g(ComponentName componentName) {
        int size = this.f15961a.size();
        try {
            Intent b10 = l.b(this.f15962b, componentName);
            while (b10 != null) {
                this.f15961a.add(size, b10);
                b10 = l.b(this.f15962b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public Iterator iterator() {
        return this.f15961a.iterator();
    }

    public Intent k(int i10) {
        return (Intent) this.f15961a.get(i10);
    }

    public int m() {
        return this.f15961a.size();
    }

    public PendingIntent n(int i10, int i11) {
        return r(i10, i11, (Bundle) null);
    }

    public PendingIntent r(int i10, int i11, Bundle bundle) {
        if (!this.f15961a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f15961a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(this.f15962b, i10, intentArr, i11, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void t() {
        v((Bundle) null);
    }

    public void v(Bundle bundle) {
        if (!this.f15961a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f15961a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!c.startActivities(this.f15962b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f15962b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
