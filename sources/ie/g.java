package Ie;

import Fe.C3016e;
import Fe.C3023l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f32096a;

    /* renamed from: b  reason: collision with root package name */
    private String f32097b;

    /* renamed from: c  reason: collision with root package name */
    private String f32098c;

    /* renamed from: d  reason: collision with root package name */
    private String f32099d;

    /* renamed from: e  reason: collision with root package name */
    private int f32100e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f32101f;

    /* renamed from: g  reason: collision with root package name */
    private String f32102g;

    /* renamed from: h  reason: collision with root package name */
    private String f32103h;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel, (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static g i() {
        C3016e X10 = C3016e.X();
        g gVar = null;
        if (X10 == null || X10.Z() == null) {
            return null;
        }
        JSONObject Z10 = X10.Z();
        try {
            if (!Z10.has("+clicked_branch_link") || !Z10.getBoolean("+clicked_branch_link")) {
                return null;
            }
            g gVar2 = new g();
            try {
                if (Z10.has("~channel")) {
                    gVar2.o(Z10.getString("~channel"));
                }
                if (Z10.has("~feature")) {
                    gVar2.q(Z10.getString("~feature"));
                }
                if (Z10.has("~stage")) {
                    gVar2.s(Z10.getString("~stage"));
                }
                if (Z10.has("~campaign")) {
                    gVar2.n(Z10.getString("~campaign"));
                }
                if (Z10.has("~duration")) {
                    gVar2.p(Z10.getInt("~duration"));
                }
                if (Z10.has("$match_duration")) {
                    gVar2.p(Z10.getInt("$match_duration"));
                }
                if (Z10.has("~tags")) {
                    JSONArray jSONArray = Z10.getJSONArray("~tags");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        gVar2.b(jSONArray.getString(i10));
                    }
                }
                Iterator<String> keys = Z10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("$")) {
                        gVar2.a(next, Z10.getString(next));
                    }
                }
                return gVar2;
            } catch (Exception e10) {
                e = e10;
                gVar = gVar2;
                C3023l.a(e.getMessage());
                return gVar;
            }
        } catch (Exception e11) {
            e = e11;
            C3023l.a(e.getMessage());
            return gVar;
        }
    }

    public g a(String str, String str2) {
        this.f32101f.put(str, str2);
        return this;
    }

    public g b(String str) {
        this.f32096a.add(str);
        return this;
    }

    public String c() {
        return this.f32098c;
    }

    public String d() {
        return this.f32103h;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f32102g;
    }

    public HashMap f() {
        return this.f32101f;
    }

    public String g() {
        return this.f32097b;
    }

    public int h() {
        return this.f32100e;
    }

    public String j() {
        return this.f32099d;
    }

    public ArrayList k() {
        return this.f32096a;
    }

    public g l(String str) {
        this.f32098c = str;
        return this;
    }

    public g n(String str) {
        this.f32103h = str;
        return this;
    }

    public g o(String str) {
        this.f32102g = str;
        return this;
    }

    public g p(int i10) {
        this.f32100e = i10;
        return this;
    }

    public g q(String str) {
        this.f32097b = str;
        return this;
    }

    public g s(String str) {
        this.f32099d = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f32097b);
        parcel.writeString(this.f32098c);
        parcel.writeString(this.f32099d);
        parcel.writeString(this.f32102g);
        parcel.writeString(this.f32103h);
        parcel.writeInt(this.f32100e);
        parcel.writeSerializable(this.f32096a);
        parcel.writeInt(this.f32101f.size());
        for (Map.Entry entry : this.f32101f.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public g() {
        this.f32096a = new ArrayList();
        this.f32097b = "Share";
        this.f32101f = new HashMap();
        this.f32098c = "";
        this.f32099d = "";
        this.f32100e = 0;
        this.f32102g = "";
        this.f32103h = "";
    }

    private g(Parcel parcel) {
        this();
        this.f32097b = parcel.readString();
        this.f32098c = parcel.readString();
        this.f32099d = parcel.readString();
        this.f32102g = parcel.readString();
        this.f32103h = parcel.readString();
        this.f32100e = parcel.readInt();
        this.f32096a.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f32101f.put(parcel.readString(), parcel.readString());
        }
    }
}
