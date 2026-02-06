package J5;

import org.json.JSONObject;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f32188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32189b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f32190c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f32191d;

    public /* synthetic */ h(JSONObject jSONObject, String str, j jVar, String str2) {
        this.f32188a = jSONObject;
        this.f32189b = str;
        this.f32190c = jVar;
        this.f32191d = str2;
    }

    public final void run() {
        j.d(this.f32188a, this.f32189b, this.f32190c, this.f32191d);
    }
}
