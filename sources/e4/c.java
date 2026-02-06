package E4;

public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f30631a;

    private c(String str) {
        this.f30631a = str;
    }

    public String b() {
        return ".temp" + this.f30631a;
    }

    public String toString() {
        return this.f30631a;
    }
}
