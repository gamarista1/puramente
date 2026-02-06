package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TypeDeserializerBase extends TypeDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected JsonDeserializer<Object> _defaultImplDeserializer;
    protected final Map<String, JsonDeserializer<Object>> _deserializers;
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    protected TypeDeserializerBase(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z10, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = typeIdResolver;
        this._typePropertyName = str == null ? "" : str;
        this._typeIdVisible = z10;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.getTypeId());
    }

    /* access modifiers changed from: protected */
    public final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return NullifyingDeserializer.instance;
            }
            return null;
        } else if (ClassUtil.isBogusClass(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        } else {
            synchronized (this._defaultImpl) {
                try {
                    if (this._defaultImplDeserializer == null) {
                        this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
                    }
                    jsonDeserializer = this._defaultImplDeserializer;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return jsonDeserializer;
        }
    }

    /* access modifiers changed from: protected */
    public final JsonDeserializer<Object> _findDeserializer(DeserializationContext deserializationContext, String str) {
        JsonDeserializer<Object> findContextualValueDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._deserializers.get(str);
        if (jsonDeserializer == null) {
            JavaType typeFromId = this._idResolver.typeFromId(deserializationContext, str);
            if (typeFromId == null) {
                jsonDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (jsonDeserializer == null) {
                    JavaType _handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str, this._idResolver, this._baseType);
                    if (_handleUnknownTypeId == null) {
                        return null;
                    }
                    findContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, jsonDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == typeFromId.getClass() && !typeFromId.hasGenericTypes()) {
                    typeFromId = deserializationContext.getTypeFactory().constructSpecializedType(this._baseType, typeFromId.getRawClass());
                }
                findContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(typeFromId, this._property);
            }
            jsonDeserializer = findContextualValueDeserializer;
            this._deserializers.put(str, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str, TypeIdResolver typeIdResolver, JavaType javaType) {
        String str2;
        String descForKnownTypeIds = typeIdResolver.getDescForKnownTypeIds();
        if (descForKnownTypeIds == null) {
            str2 = "known type ids are not statically known";
        } else {
            str2 = "known type ids = " + descForKnownTypeIds;
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, typeIdResolver, str2);
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    public abstract TypeDeserializer forProperty(BeanProperty beanProperty);

    public Class<?> getDefaultImpl() {
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public final String getPropertyName() {
        return this._typePropertyName;
    }

    public TypeIdResolver getTypeIdResolver() {
        return this._idResolver;
    }

    public abstract JsonTypeInfo.As getTypeInclusion();

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + ']';
    }

    /* access modifiers changed from: protected */
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        JsonDeserializer<Object> jsonDeserializer;
        if (obj == null) {
            jsonDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (jsonDeserializer == null) {
                deserializationContext.reportMappingException("No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
                return null;
            }
        } else {
            jsonDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return jsonDeserializer.deserialize(jsonParser, deserializationContext);
    }

    protected TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
