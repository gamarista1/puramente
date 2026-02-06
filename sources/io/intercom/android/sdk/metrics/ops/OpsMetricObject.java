package io.intercom.android.sdk.metrics.ops;

public class OpsMetricObject {

    /* renamed from: id  reason: collision with root package name */
    private final String f70027id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j10, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j10;
        this.f70027id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
            return this.f70027id.equals(opsMetricObject.f70027id);
        }
        return false;
    }

    public String getId() {
        return this.f70027id;
    }

    public int hashCode() {
        long j10 = this.value;
        return (((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f70027id.hashCode();
    }

    public String toString() {
        return "OpsMetricObject{type='" + this.type + '\'' + ", name='" + this.name + '\'' + ", value=" + this.value + ", id='" + this.f70027id + '\'' + '}';
    }
}
