package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    protected static final VisibilityChecker<?> STD_VISIBILITY_CHECKER;
    private static final long serialVersionUID = 1;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected ConfigOverrides _propertyOverrides;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping[] r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping = r0
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.AnonymousClass3.<clinit>():void");
        }
    }

    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping _appliesFor;

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this._appliesFor = defaultTyping;
        }

        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean useForType(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i10 = AnonymousClass3.$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[this._appliesFor.ordinal()];
            Class<TreeNode> cls = TreeNode.class;
            if (i10 == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return javaType.isJavaLangObject();
                }
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                while (javaType.isReferenceType()) {
                    javaType = javaType.getReferencedType();
                }
                if (javaType.isFinal() || cls.isAssignableFrom(javaType.getRawClass())) {
                    return false;
                }
                return true;
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            if (javaType.isJavaLangObject() || (!javaType.isConcrete() && !cls.isAssignableFrom(javaType.getRawClass()))) {
                return true;
            }
            return false;
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        VisibilityChecker.Std defaultInstance = VisibilityChecker.Std.defaultInstance();
        STD_VISIBILITY_CHECKER = defaultInstance;
        DEFAULT_BASE = new BaseSettings((ClassIntrospector) null, jacksonAnnotationIntrospector, defaultInstance, (PropertyNamingStrategy) null, TypeFactory.defaultInstance(), (TypeResolverBuilder<?>) null, StdDateFormat.instance, (HandlerInstantiator) null, Locale.getDefault(), (TimeZone) null, Base64Variants.getDefaultVariant());
    }

    public ObjectMapper() {
        this((JsonFactory) null, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    private final void _configAndWriteCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e10) {
                e = e10;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIAE(jsonGenerator, closeable, e);
            }
        } catch (Exception e11) {
            e = e11;
            ClassUtil.closeOnFailAndThrowAsIAE(jsonGenerator, closeable, e);
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            ClassUtil.closeOnFailAndThrowAsIAE((JsonGenerator) null, closeable, e10);
        }
    }

    public static List<Module> findModules() {
        return findModules((ClassLoader) null);
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        if (System.getSecurityManager() != null) {
            return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() {
                public ServiceLoader<T> run() {
                    ClassLoader classLoader = classLoader;
                    return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
                }
            });
        }
        if (classLoader == null) {
            return ServiceLoader.load(cls);
        }
        return ServiceLoader.load(cls, classLoader);
    }

    /* access modifiers changed from: protected */
    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    /* access modifiers changed from: protected */
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        serializationConfig.initialize(jsonGenerator);
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e10) {
                ClassUtil.closeOnFailAndThrowAsIAE(jsonGenerator, e10);
            }
        } else {
            _configAndWriteCloseable(jsonGenerator, obj, serializationConfig);
        }
    }

    /* access modifiers changed from: protected */
    public Object _convert(Object obj, JavaType javaType) {
        Object obj2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != Object.class && !javaType.hasGenericTypes() && rawClass.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(asParser);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(asParser, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(asParser, deserializationConfig);
                        obj2 = _findRootDeserializer(createDeserializationContext2, javaType).deserialize(asParser, createDeserializationContext2);
                    }
                }
                obj2 = null;
            }
            asParser.close();
            return obj2;
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer != null) {
            this._rootDeserializers.put(javaType, findRootValueDeserializer);
            return findRootValueDeserializer;
        }
        throw JsonMappingException.from(deserializationContext, "Can not find a deserializer for type " + javaType);
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(JsonParser jsonParser) {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        throw JsonMappingException.from(jsonParser, "No content to map due to end-of-input");
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* access modifiers changed from: protected */
    public Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) {
        Object obj;
        try {
            JsonToken _initForReading = _initForReading(jsonParser);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
                obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DeserializationConfig deserializationConfig = getDeserializationConfig();
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(jsonParser, deserializationConfig);
                        JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext2, javaType);
                        if (deserializationConfig.useRootWrapping()) {
                            obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext2, deserializationConfig, javaType, _findRootDeserializer);
                        } else {
                            obj = _findRootDeserializer.deserialize(jsonParser, createDeserializationContext2);
                        }
                        createDeserializationContext2.checkUnresolvedObjectId();
                    }
                }
                obj = null;
            }
            jsonParser.clearCurrentToken();
            jsonParser.close();
            return obj;
        } catch (Throwable th2) {
            if (jsonParser != null) {
                try {
                    jsonParser.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(jsonParser, deserializationConfig);
            JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createDeserializationContext2, javaType);
            if (deserializationConfig.useRootWrapping()) {
                obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext2, deserializationConfig, javaType, _findRootDeserializer);
            } else {
                obj = _findRootDeserializer.deserialize(jsonParser, createDeserializationContext2);
            }
        }
        jsonParser.clearCurrentToken();
        return obj;
    }

    /* access modifiers changed from: protected */
    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        String simpleName = deserializationConfig.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (nextToken != jsonToken2) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '" + simpleName + "'), but " + jsonParser.getCurrentToken(), new Object[0]);
        }
        String currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportMappingException("Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(jsonParser, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        return deserialize;
    }

    /* access modifiers changed from: protected */
    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema != null && !this._jsonFactory.canUseSchema(formatSchema)) {
            throw new IllegalArgumentException("Can not use FormatSchema of type " + formatSchema.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        acceptJsonFormatVisitor(this._typeFactory.constructType((Type) cls), jsonFormatVisitorWrapper);
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._deserializationConfig = this._deserializationConfig.withHandler(deserializationProblemHandler);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, (AtomicReference<Throwable>) null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, (AtomicReference<Throwable>) null);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._propertyOverrides.findOrCreateOverride(cls);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z10) {
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature[] mapperFeatureArr = {mapperFeature};
        this._serializationConfig = z10 ? serializationConfig.with(mapperFeatureArr) : serializationConfig.without(mapperFeatureArr);
        this._deserializationConfig = z10 ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    public JavaType constructType(Type type) {
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        return _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    /* access modifiers changed from: protected */
    public ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping((TypeResolverBuilder<?>) null);
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    public ObjectMapper enableDefaultTyping() {
        return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(new DefaultTypeResolverBuilder(defaultTyping).init(JsonTypeInfo.Id.CLASS, (TypeIdResolver) null).inclusion(JsonTypeInfo.As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules((Iterable<Module>) findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public SerializerFactory getSerializerFactory() {
        return this._serializerFactory;
    }

    public SerializerProvider getSerializerProvider() {
        return this._serializerProvider;
    }

    public SerializerProvider getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        T t10 = (JsonNode) _readValue(deserializationConfig, jsonParser, JSON_NODE_TYPE);
        return t10 == null ? getNodeFactory().nullNode() : t10;
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) obj.getClass()), obj, (FormatSchema) null, this._injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(Module module) {
        Object typeId;
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = module.getTypeId()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(typeId)) {
                return this;
            }
        }
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (module.version() != null) {
            module.setupModule(new Module.SetupContext() {
                public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
                    DeserializerFactory withAbstractTypeResolver = this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAbstractTypeResolver);
                }

                public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
                    DeserializerFactory withDeserializerModifier = this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withDeserializerModifier);
                }

                public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                    ObjectMapper objectMapper = this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
                }

                public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
                    this.addHandler(deserializationProblemHandler);
                }

                public void addDeserializers(Deserializers deserializers) {
                    DeserializerFactory withAdditionalDeserializers = this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalDeserializers);
                }

                public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
                    DeserializerFactory withAdditionalKeyDeserializers = this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalKeyDeserializers);
                }

                public void addKeySerializers(Serializers serializers) {
                    ObjectMapper objectMapper = this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
                }

                public void addSerializers(Serializers serializers) {
                    ObjectMapper objectMapper = this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
                }

                public void addTypeModifier(TypeModifier typeModifier) {
                    this.setTypeFactory(this._typeFactory.withModifier(typeModifier));
                }

                public void addValueInstantiators(ValueInstantiators valueInstantiators) {
                    DeserializerFactory withValueInstantiators = this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withValueInstantiators);
                }

                public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationConfig = objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                    ObjectMapper objectMapper2 = this;
                    objectMapper2._serializationConfig = objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                }

                public MutableConfigOverride configOverride(Class<?> cls) {
                    return this.configOverride(cls);
                }

                public Version getMapperVersion() {
                    return ObjectMapper.this.version();
                }

                public <C extends ObjectCodec> C getOwner() {
                    return this;
                }

                public TypeFactory getTypeFactory() {
                    return ObjectMapper.this._typeFactory;
                }

                public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationConfig = objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                    ObjectMapper objectMapper2 = this;
                    objectMapper2._serializationConfig = objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                }

                public boolean isEnabled(MapperFeature mapperFeature) {
                    return this.isEnabled(mapperFeature);
                }

                public void registerSubtypes(Class<?>... clsArr) {
                    this.registerSubtypes(clsArr);
                }

                public void setClassIntrospector(ClassIntrospector classIntrospector) {
                    ObjectMapper objectMapper = this;
                    objectMapper._deserializationConfig = objectMapper._deserializationConfig.with(classIntrospector);
                    ObjectMapper objectMapper2 = this;
                    objectMapper2._serializationConfig = objectMapper2._serializationConfig.with(classIntrospector);
                }

                public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
                    this.addMixIn(cls, cls2);
                }

                public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
                    this.setPropertyNamingStrategy(propertyNamingStrategy);
                }

                public boolean isEnabled(DeserializationFeature deserializationFeature) {
                    return this.isEnabled(deserializationFeature);
                }

                public void registerSubtypes(NamedType... namedTypeArr) {
                    this.registerSubtypes(namedTypeArr);
                }

                public boolean isEnabled(SerializationFeature serializationFeature) {
                    return this.isEnabled(serializationFeature);
                }

                public boolean isEnabled(JsonFactory.Feature feature) {
                    return this.isEnabled(feature);
                }

                public boolean isEnabled(JsonParser.Feature feature) {
                    return this.isEnabled(feature);
                }

                public boolean isEnabled(JsonGenerator.Feature feature) {
                    return this.isEnabled(feature);
                }
            });
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper registerModules(Module... moduleArr) {
        for (Module registerModule : moduleArr) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(prettyPrinter);
        return this;
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._deserializationConfig = this._deserializationConfig.with(typeResolverBuilder);
        this._serializationConfig = this._serializationConfig.with(typeResolverBuilder);
        return this;
    }

    public ObjectMapper setFilterProvider(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
        return this;
    }

    @Deprecated
    public void setFilters(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._deserializationConfig = this._deserializationConfig.with(handlerInstantiator);
        this._serializationConfig = this._serializationConfig.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public ObjectMapper setMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        SimpleMixInResolver withOverrides = this._mixIns.withOverrides(mixInResolver);
        if (withOverrides != this._mixIns) {
            this._mixIns = withOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, withOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, withOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        this._serializationConfig = this._serializationConfig.withPropertyInclusion(value);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, JsonInclude.Include.USE_DEFAULTS));
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerFactory) {
        this._serializerFactory = serializerFactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtypeResolver) {
        this._subtypeResolver = subtypeResolver;
        this._deserializationConfig = this._deserializationConfig.with(subtypeResolver);
        this._serializationConfig = this._serializationConfig.with(subtypeResolver);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._deserializationConfig = this._deserializationConfig.with(visibilityChecker);
        this._serializationConfig = this._serializationConfig.with(visibilityChecker);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        T pojo;
        if (cls != Object.class) {
            try {
                if (cls.isAssignableFrom(treeNode.getClass())) {
                    return treeNode;
                }
            } catch (JsonProcessingException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        if (treeNode.asToken() != JsonToken.VALUE_EMBEDDED_OBJECT || !(treeNode instanceof POJONode) || ((pojo = ((POJONode) treeNode).getPojo()) != null && !cls.isInstance(pojo))) {
            return readValue(treeAsTokens(treeNode), cls);
        }
        return pojo;
    }

    public <T extends JsonNode> T valueToTree(Object obj) {
        if (obj == null) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            writeValue((JsonGenerator) tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            T t10 = (JsonNode) readTree(asParser);
            asParser.close();
            return t10;
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, treeNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        _writeCloseableValue(jsonGenerator, obj, serializationConfig);
    }

    public byte[] writeValueAsBytes(Object obj) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator((OutputStream) byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] byteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return byteArray;
        } catch (JsonProcessingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public String writeValueAsString(Object obj) {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator((Writer) segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType((Type) cls), (PrettyPrinter) null);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, (JavaType) null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType((Type) cls), (PrettyPrinter) null);
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator<Module> it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig, FormatSchema formatSchema) {
        return new ObjectWriter(this, serializationConfig, formatSchema);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        if (javaType != null) {
            _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext((JsonParser) null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public <T> T convertValue(Object obj, TypeReference<?> typeReference) {
        return convertValue(obj, this._typeFactory.constructType(typeReference));
    }

    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public <T> T readValue(JsonParser jsonParser, TypeReference<?> typeReference) {
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(typeReference));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectWriter writerFor(TypeReference<?> typeReference) {
        return _newWriter(getSerializationConfig(), typeReference == null ? null : this._typeFactory.constructType(typeReference), (PrettyPrinter) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(TypeReference<?> typeReference) {
        return _newWriter(getSerializationConfig(), typeReference == null ? null : this._typeFactory.constructType(typeReference), (PrettyPrinter) null);
    }

    protected ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver;
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        this._propertyOverrides = objectMapper._propertyOverrides.copy();
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._mixIns, rootNameLookup, this._propertyOverrides);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._mixIns, rootNameLookup, this._propertyOverrides);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z10) {
        this._serializationConfig = z10 ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public <T> T convertValue(Object obj, JavaType javaType) {
        if (obj == null) {
            return null;
        }
        return _convert(obj, javaType);
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        if (as != JsonTypeInfo.As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(new DefaultTypeResolverBuilder(defaultTyping).init(JsonTypeInfo.Id.CLASS, (TypeIdResolver) null).inclusion(as));
        }
        throw new IllegalArgumentException("Can not use includeAs of " + as);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public final <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) {
        return _readValue(getDeserializationConfig(), jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public ObjectMapper registerModules(Iterable<Module> iterable) {
        for (Module registerModule : iterable) {
            registerModule(registerModule);
        }
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._deserializationConfig = this._deserializationConfig.withVisibility(propertyAccessor, visibility);
        this._serializationConfig = this._serializationConfig.withVisibility(propertyAccessor, visibility);
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (PrettyPrinter) null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, (PrettyPrinter) null);
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z10) {
        this._deserializationConfig = z10 ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) {
        return _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z10) {
        this._jsonFactory.configure(feature, z10);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> T readValue(File file, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, JavaType javaType) {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new MappingIterator(javaType, jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, (Object) null);
    }

    public ObjectReader reader(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, formatSchema, this._injectableValues);
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) {
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectWriter writer(PrettyPrinter prettyPrinter) {
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), (JavaType) null, prettyPrinter);
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z10) {
        this._jsonFactory.configure(feature, z10);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public JsonNode readTree(InputStream inputStream) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(inputStream), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(File file, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public <T> T readValue(File file, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), (JavaType) null, (Object) null, (FormatSchema) null, injectableValues);
    }

    public ObjectWriter writer(FilterProvider filterProvider) {
        return _newWriter(getSerializationConfig().withFilters(filterProvider));
    }

    public JsonNode readTree(Reader reader) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(reader), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(URL url, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newWriter(getSerializationConfig(), formatSchema);
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public <T> T readValue(URL url, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, Class<T> cls) {
        return readValues(jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public JsonNode readTree(String str) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(str), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(URL url, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, TypeReference<?> typeReference) {
        return readValues(jsonParser, this._typeFactory.constructType(typeReference));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void writeValue(File file, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().with(base64Variant));
    }

    public <T> T readValue(String str, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType((Type) cls));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void writeValue(OutputStream outputStream, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    public JsonNode readTree(byte[] bArr) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(bArr), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(String str, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    @Deprecated
    public ObjectReader reader(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), (Object) null, (FormatSchema) null, this._injectableValues);
    }

    public void writeValue(DataOutput dataOutput, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(dataOutput, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public <T> T readValue(String str, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
    }

    public void writeValue(Writer writer, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(writer), obj);
    }

    public JsonNode readTree(File file) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(file), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(Reader reader, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(Reader reader, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public JsonNode readTree(URL url) {
        JsonNode jsonNode = (JsonNode) _readMapAndClose(this._jsonFactory.createParser(url), JSON_NODE_TYPE);
        return jsonNode == null ? NullNode.instance : jsonNode;
    }

    public <T> T readValue(Reader reader, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(InputStream inputStream, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._propertyOverrides = configOverrides;
        BaseSettings baseSettings = withClassIntrospector;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        ConfigOverrides configOverrides2 = configOverrides;
        this._serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this._deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ requiresPropertyOrdering) {
            configure(mapperFeature, requiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl((DeserializerFactory) BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i10, i11), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i10, i11), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i10, i11), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
