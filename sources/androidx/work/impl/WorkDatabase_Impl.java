package androidx.work.impl;

import P3.A;
import P3.C1299b;
import P3.c;
import P3.e;
import P3.f;
import P3.g;
import P3.j;
import P3.k;
import P3.o;
import P3.p;
import P3.r;
import P3.s;
import P3.v;
import P3.w;
import P3.z;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u3.C2714f;
import u3.u;
import u3.w;
import v3.C2756b;
import w3.C2833b;
import w3.C2835d;
import y3.h;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q  reason: collision with root package name */
    private volatile v f18820q;

    /* renamed from: r  reason: collision with root package name */
    private volatile C1299b f18821r;

    /* renamed from: s  reason: collision with root package name */
    private volatile z f18822s;

    /* renamed from: t  reason: collision with root package name */
    private volatile j f18823t;

    /* renamed from: u  reason: collision with root package name */
    private volatile o f18824u;

    /* renamed from: v  reason: collision with root package name */
    private volatile r f18825v;

    /* renamed from: w  reason: collision with root package name */
    private volatile e f18826w;

    public C1299b C() {
        C1299b bVar;
        if (this.f18821r != null) {
            return this.f18821r;
        }
        synchronized (this) {
            try {
                if (this.f18821r == null) {
                    this.f18821r = new c(this);
                }
                bVar = this.f18821r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public e D() {
        e eVar;
        if (this.f18826w != null) {
            return this.f18826w;
        }
        synchronized (this) {
            try {
                if (this.f18826w == null) {
                    this.f18826w = new f(this);
                }
                eVar = this.f18826w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public j E() {
        j jVar;
        if (this.f18823t != null) {
            return this.f18823t;
        }
        synchronized (this) {
            try {
                if (this.f18823t == null) {
                    this.f18823t = new k(this);
                }
                jVar = this.f18823t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public o F() {
        o oVar;
        if (this.f18824u != null) {
            return this.f18824u;
        }
        synchronized (this) {
            try {
                if (this.f18824u == null) {
                    this.f18824u = new p(this);
                }
                oVar = this.f18824u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public r G() {
        r rVar;
        if (this.f18825v != null) {
            return this.f18825v;
        }
        synchronized (this) {
            try {
                if (this.f18825v == null) {
                    this.f18825v = new s(this);
                }
                rVar = this.f18825v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public v H() {
        v vVar;
        if (this.f18820q != null) {
            return this.f18820q;
        }
        synchronized (this) {
            try {
                if (this.f18820q == null) {
                    this.f18820q = new w(this);
                }
                vVar = this.f18820q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public z I() {
        z zVar;
        if (this.f18822s != null) {
            return this.f18822s;
        }
        synchronized (this) {
            try {
                if (this.f18822s == null) {
                    this.f18822s = new A(this);
                }
                zVar = this.f18822s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public u3.o g() {
        return new u3.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public h h(C2714f fVar) {
        return fVar.f26637c.a(h.b.a(fVar.f26635a).d(fVar.f26636b).c(new u3.w(fVar, new a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).b());
    }

    public List j(Map map) {
        return Arrays.asList(new C2756b[]{new H(), new I(), new J(), new K(), new L(), new M()});
    }

    public Set o() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, w.A());
        hashMap.put(C1299b.class, c.e());
        hashMap.put(z.class, A.e());
        hashMap.put(j.class, k.j());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.d());
        hashMap.put(e.class, f.c());
        hashMap.put(g.class, P3.h.a());
        return hashMap;
    }

    class a extends w.b {
        a(int i10) {
            super(i10);
        }

        public void a(y3.g gVar) {
            gVar.z("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        public void b(y3.g gVar) {
            gVar.z("DROP TABLE IF EXISTS `Dependency`");
            gVar.z("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.z("DROP TABLE IF EXISTS `WorkTag`");
            gVar.z("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.z("DROP TABLE IF EXISTS `WorkName`");
            gVar.z("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.z("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f26719h != null) {
                int size = WorkDatabase_Impl.this.f26719h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f26719h.get(i10)).b(gVar);
                }
            }
        }

        public void c(y3.g gVar) {
            if (WorkDatabase_Impl.this.f26719h != null) {
                int size = WorkDatabase_Impl.this.f26719h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f26719h.get(i10)).a(gVar);
                }
            }
        }

        public void d(y3.g gVar) {
            y3.g unused = WorkDatabase_Impl.this.f26712a = gVar;
            gVar.z("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (WorkDatabase_Impl.this.f26719h != null) {
                int size = WorkDatabase_Impl.this.f26719h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f26719h.get(i10)).c(gVar);
                }
            }
        }

        public void f(y3.g gVar) {
            C2833b.a(gVar);
        }

        public w.c g(y3.g gVar) {
            y3.g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C2835d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C2835d.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C2835d.e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new C2835d.e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            C2835d dVar = new C2835d("Dependency", hashMap, hashSet, hashSet2);
            C2835d a10 = C2835d.a(gVar2, "Dependency");
            if (!dVar.equals(a10)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new C2835d.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C2835d.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C2835d.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C2835d.a("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put(MetricTracker.Object.INPUT, new C2835d.a(MetricTracker.Object.INPUT, "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C2835d.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C2835d.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C2835d.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C2835d.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C2835d.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C2835d.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C2835d.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new C2835d.a("last_enqueue_time", "INTEGER", true, 0, CreateTicketViewModelKt.EmailId, 1));
            hashMap2.put("minimum_retention_duration", new C2835d.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C2835d.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C2835d.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C2835d.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new C2835d.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new C2835d.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new C2835d.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new C2835d.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new C2835d.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("required_network_type", new C2835d.a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C2835d.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C2835d.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C2835d.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C2835d.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C2835d.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C2835d.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C2835d.a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C2835d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new C2835d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            C2835d dVar2 = new C2835d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C2835d a11 = C2835d.a(gVar2, "WorkSpec");
            if (!dVar2.equals(a11)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C2835d.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C2835d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C2835d.e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C2835d dVar3 = new C2835d("WorkTag", hashMap3, hashSet5, hashSet6);
            C2835d a12 = C2835d.a(gVar2, "WorkTag");
            if (!dVar3.equals(a12)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new C2835d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new C2835d.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new C2835d.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C2835d dVar4 = new C2835d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C2835d a13 = C2835d.a(gVar2, "SystemIdInfo");
            if (!dVar4.equals(a13)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C2835d.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C2835d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C2835d.e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            C2835d dVar5 = new C2835d("WorkName", hashMap5, hashSet8, hashSet9);
            C2835d a14 = C2835d.a(gVar2, "WorkName");
            if (!dVar5.equals(a14)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C2835d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new C2835d.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C2835d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C2835d dVar6 = new C2835d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C2835d a15 = C2835d.a(gVar2, "WorkProgress");
            if (!dVar6.equals(a15)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(SubscriberAttributeKt.JSON_NAME_KEY, new C2835d.a(SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C2835d.a("long_value", "INTEGER", false, 0, (String) null, 1));
            C2835d dVar7 = new C2835d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C2835d a16 = C2835d.a(gVar2, "Preference");
            if (dVar7.equals(a16)) {
                return new w.c(true, (String) null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a16);
        }

        public void e(y3.g gVar) {
        }
    }
}
