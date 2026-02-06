package A4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f29366c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List f29367a;

    /* renamed from: b  reason: collision with root package name */
    private f f29368b;

    public e(String... strArr) {
        this.f29367a = Arrays.asList(strArr);
    }

    private boolean b() {
        List list = this.f29367a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f29367a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        boolean z10;
        boolean z11;
        if (i10 >= this.f29367a.size()) {
            return false;
        }
        if (i10 == this.f29367a.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = (String) this.f29367a.get(i10);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((z10 || (i10 == this.f29367a.size() - 2 && b())) && z11) {
                return true;
            }
            return false;
        } else if (z10 || !((String) this.f29367a.get(i10 + 1)).equals(str)) {
            if (z10) {
                return true;
            }
            int i11 = i10 + 1;
            if (i11 < this.f29367a.size() - 1) {
                return false;
            }
            return ((String) this.f29367a.get(i11)).equals(str);
        } else if (i10 == this.f29367a.size() - 2 || (i10 == this.f29367a.size() - 3 && b())) {
            return true;
        } else {
            return false;
        }
    }

    public f d() {
        return this.f29368b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (!((String) this.f29367a.get(i10)).equals("**")) {
            return 1;
        }
        if (i10 != this.f29367a.size() - 1 && ((String) this.f29367a.get(i10 + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f29367a.equals(eVar.f29367a)) {
            return false;
        }
        f fVar = this.f29368b;
        f fVar2 = eVar.f29368b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f29367a.size()) {
            return false;
        }
        if (((String) this.f29367a.get(i10)).equals(str) || ((String) this.f29367a.get(i10)).equals("**") || ((String) this.f29367a.get(i10)).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean h(String str, int i10) {
        if (!"__container".equals(str) && i10 >= this.f29367a.size() - 1 && !((String) this.f29367a.get(i10)).equals("**")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f29367a.hashCode() * 31;
        f fVar = this.f29368b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f29368b = fVar;
        return eVar;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f29367a);
        sb2.append(",resolved=");
        if (this.f29368b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f29367a = new ArrayList(eVar.f29367a);
        this.f29368b = eVar.f29368b;
    }
}
