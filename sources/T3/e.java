package T3;

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import app.puramente.app.DailyPhraseWidget;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteViews f6176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f6177b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f6178c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6179d;

    public /* synthetic */ e(RemoteViews remoteViews, Bitmap bitmap, AppWidgetManager appWidgetManager, int i10) {
        this.f6176a = remoteViews;
        this.f6177b = bitmap;
        this.f6178c = appWidgetManager;
        this.f6179d = i10;
    }

    public final void run() {
        DailyPhraseWidget.f(this.f6176a, this.f6177b, this.f6178c, this.f6179d);
    }
}
