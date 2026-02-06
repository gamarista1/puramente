package T3;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import app.puramente.app.DailyPhraseWidget;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RemoteViews f6173b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f6174c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6175d;

    public /* synthetic */ d(String str, RemoteViews remoteViews, AppWidgetManager appWidgetManager, int i10) {
        this.f6172a = str;
        this.f6173b = remoteViews;
        this.f6174c = appWidgetManager;
        this.f6175d = i10;
    }

    public final void run() {
        DailyPhraseWidget.h(this.f6172a, this.f6173b, this.f6174c, this.f6175d);
    }
}
