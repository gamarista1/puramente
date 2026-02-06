package app.puramente.app;

import T3.c;
import T3.d;
import T3.e;
import T3.f;
import T3.g;
import T3.h;
import T3.i;
import T3.j;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DailyPhraseWidget extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f19048a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f19049b = new Handler(Looper.getMainLooper());

    private static RemoteViews d(Context context, g gVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), j.f6191a);
        j(remoteViews, gVar);
        return remoteViews;
    }

    private static Bitmap e(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(RemoteViews remoteViews, Bitmap bitmap, AppWidgetManager appWidgetManager, int i10) {
        remoteViews.setImageViewBitmap(i.f6188b, bitmap);
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(String str, RemoteViews remoteViews, AppWidgetManager appWidgetManager, int i10) {
        try {
            f19049b.post(new e(remoteViews, e(str), appWidgetManager, i10));
        } catch (Exception e10) {
            e10.printStackTrace();
            f19049b.post(new f(appWidgetManager, i10, remoteViews));
        }
    }

    private static void i(AppWidgetManager appWidgetManager, int i10, RemoteViews remoteViews, String str) {
        if (str.isEmpty()) {
            l(appWidgetManager, i10, remoteViews);
        } else {
            f19048a.execute(new d(str, remoteViews, appWidgetManager, i10));
        }
    }

    private static void j(RemoteViews remoteViews, g gVar) {
        int i10 = i.f6190d;
        remoteViews.setTextViewText(i10, "“" + gVar.c() + "”");
        int i11 = i.f6187a;
        remoteViews.setTextViewText(i11, "- " + gVar.a());
    }

    private static void k(Context context, RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(i.f6189c, PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW").setData(Uri.parse("app.puramente.app://widget_opened?size=small&widgetName=DailyPhraseWidget")).setFlags(268468224), 201326592));
    }

    /* access modifiers changed from: private */
    public static void l(AppWidgetManager appWidgetManager, int i10, RemoteViews remoteViews) {
        remoteViews.setImageViewResource(i.f6188b, h.f6186a);
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    private boolean m(Intent intent) {
        if (intent.getAction() == null) {
            return false;
        }
        boolean equals = "android.intent.action.DATE_CHANGED".equals(intent.getAction());
        boolean equals2 = "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
        boolean equals3 = "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
        if (equals || equals2 || equals3) {
            return true;
        }
        return false;
    }

    private void n(Context context) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        for (int o10 : instance.getAppWidgetIds(new ComponentName(context, DailyPhraseWidget.class))) {
            o(context, instance, o10);
        }
    }

    public static void o(Context context, AppWidgetManager appWidgetManager, int i10) {
        try {
            g f10 = new c(context).f();
            RemoteViews d10 = d(context, f10);
            k(context, d10);
            appWidgetManager.updateAppWidget(i10, d10);
            i(appWidgetManager, i10, d10, f10.b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (m(intent)) {
            n(context);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int o10 : iArr) {
            o(context, appWidgetManager, o10);
        }
    }
}
