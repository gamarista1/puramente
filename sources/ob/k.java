package Ob;

import java.util.HashMap;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public Map f52125a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Object f52126b;

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + "<value>: " + this.f52126b + "\n";
        if (this.f52125a.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry entry : this.f52125a.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(entry.getKey());
            sb2.append(":\n");
            sb2.append(((k) entry.getValue()).a(str + "\t"));
            sb2.append("\n");
            str2 = sb2.toString();
        }
        return str2;
    }
}
