package E3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1909a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f1910b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f1911c = new ArrayList();

    public s(View view) {
        this.f1910b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f1910b != sVar.f1910b || !this.f1909a.equals(sVar.f1909a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f1910b.hashCode() * 31) + this.f1909a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1910b + "\n") + "    values:";
        for (String str2 : this.f1909a.keySet()) {
            str = str + "    " + str2 + ": " + this.f1909a.get(str2) + "\n";
        }
        return str;
    }
}
